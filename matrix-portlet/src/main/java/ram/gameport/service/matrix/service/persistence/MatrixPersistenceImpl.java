package ram.gameport.service.matrix.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import ram.gameport.service.matrix.NoSuchMatrixException;
import ram.gameport.service.matrix.model.Matrix;
import ram.gameport.service.matrix.model.impl.MatrixImpl;
import ram.gameport.service.matrix.model.impl.MatrixModelImpl;
import ram.gameport.service.matrix.service.persistence.MatrixPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the matrix service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gameport
 * @see MatrixPersistence
 * @see MatrixUtil
 * @generated
 */
public class MatrixPersistenceImpl extends BasePersistenceImpl<Matrix>
    implements MatrixPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link MatrixUtil} to access the matrix persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = MatrixImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MatrixModelImpl.ENTITY_CACHE_ENABLED,
            MatrixModelImpl.FINDER_CACHE_ENABLED, MatrixImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MatrixModelImpl.ENTITY_CACHE_ENABLED,
            MatrixModelImpl.FINDER_CACHE_ENABLED, MatrixImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MatrixModelImpl.ENTITY_CACHE_ENABLED,
            MatrixModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_MATRIXNAME = new FinderPath(MatrixModelImpl.ENTITY_CACHE_ENABLED,
            MatrixModelImpl.FINDER_CACHE_ENABLED, MatrixImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchBymatrixName",
            new String[] { String.class.getName() },
            MatrixModelImpl.MATRIXNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_MATRIXNAME = new FinderPath(MatrixModelImpl.ENTITY_CACHE_ENABLED,
            MatrixModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBymatrixName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_MATRIXNAME_MATRIXNAME_1 = "matrix.matrixName IS NULL";
    private static final String _FINDER_COLUMN_MATRIXNAME_MATRIXNAME_2 = "matrix.matrixName = ?";
    private static final String _FINDER_COLUMN_MATRIXNAME_MATRIXNAME_3 = "(matrix.matrixName IS NULL OR matrix.matrixName = '')";
    private static final String _SQL_SELECT_MATRIX = "SELECT matrix FROM Matrix matrix";
    private static final String _SQL_SELECT_MATRIX_WHERE = "SELECT matrix FROM Matrix matrix WHERE ";
    private static final String _SQL_COUNT_MATRIX = "SELECT COUNT(matrix) FROM Matrix matrix";
    private static final String _SQL_COUNT_MATRIX_WHERE = "SELECT COUNT(matrix) FROM Matrix matrix WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "matrix.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Matrix exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Matrix exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(MatrixPersistenceImpl.class);
    private static Matrix _nullMatrix = new MatrixImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Matrix> toCacheModel() {
                return _nullMatrixCacheModel;
            }
        };

    private static CacheModel<Matrix> _nullMatrixCacheModel = new CacheModel<Matrix>() {
            @Override
            public Matrix toEntityModel() {
                return _nullMatrix;
            }
        };

    public MatrixPersistenceImpl() {
        setModelClass(Matrix.class);
    }

    /**
     * Returns the matrix where matrixName = &#63; or throws a {@link ram.gameport.service.matrix.NoSuchMatrixException} if it could not be found.
     *
     * @param matrixName the matrix name
     * @return the matching matrix
     * @throws ram.gameport.service.matrix.NoSuchMatrixException if a matching matrix could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Matrix findBymatrixName(String matrixName)
        throws NoSuchMatrixException, SystemException {
        Matrix matrix = fetchBymatrixName(matrixName);

        if (matrix == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("matrixName=");
            msg.append(matrixName);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchMatrixException(msg.toString());
        }

        return matrix;
    }

    /**
     * Returns the matrix where matrixName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param matrixName the matrix name
     * @return the matching matrix, or <code>null</code> if a matching matrix could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Matrix fetchBymatrixName(String matrixName)
        throws SystemException {
        return fetchBymatrixName(matrixName, true);
    }

    /**
     * Returns the matrix where matrixName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param matrixName the matrix name
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching matrix, or <code>null</code> if a matching matrix could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Matrix fetchBymatrixName(String matrixName, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { matrixName };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MATRIXNAME,
                    finderArgs, this);
        }

        if (result instanceof Matrix) {
            Matrix matrix = (Matrix) result;

            if (!Validator.equals(matrixName, matrix.getMatrixName())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_MATRIX_WHERE);

            boolean bindMatrixName = false;

            if (matrixName == null) {
                query.append(_FINDER_COLUMN_MATRIXNAME_MATRIXNAME_1);
            } else if (matrixName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_MATRIXNAME_MATRIXNAME_3);
            } else {
                bindMatrixName = true;

                query.append(_FINDER_COLUMN_MATRIXNAME_MATRIXNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindMatrixName) {
                    qPos.add(matrixName);
                }

                List<Matrix> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRIXNAME,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "MatrixPersistenceImpl.fetchBymatrixName(String, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    Matrix matrix = list.get(0);

                    result = matrix;

                    cacheResult(matrix);

                    if ((matrix.getMatrixName() == null) ||
                            !matrix.getMatrixName().equals(matrixName)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRIXNAME,
                            finderArgs, matrix);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATRIXNAME,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Matrix) result;
        }
    }

    /**
     * Removes the matrix where matrixName = &#63; from the database.
     *
     * @param matrixName the matrix name
     * @return the matrix that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Matrix removeBymatrixName(String matrixName)
        throws NoSuchMatrixException, SystemException {
        Matrix matrix = findBymatrixName(matrixName);

        return remove(matrix);
    }

    /**
     * Returns the number of matrixs where matrixName = &#63;.
     *
     * @param matrixName the matrix name
     * @return the number of matching matrixs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBymatrixName(String matrixName) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_MATRIXNAME;

        Object[] finderArgs = new Object[] { matrixName };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_MATRIX_WHERE);

            boolean bindMatrixName = false;

            if (matrixName == null) {
                query.append(_FINDER_COLUMN_MATRIXNAME_MATRIXNAME_1);
            } else if (matrixName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_MATRIXNAME_MATRIXNAME_3);
            } else {
                bindMatrixName = true;

                query.append(_FINDER_COLUMN_MATRIXNAME_MATRIXNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindMatrixName) {
                    qPos.add(matrixName);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the matrix in the entity cache if it is enabled.
     *
     * @param matrix the matrix
     */
    @Override
    public void cacheResult(Matrix matrix) {
        EntityCacheUtil.putResult(MatrixModelImpl.ENTITY_CACHE_ENABLED,
            MatrixImpl.class, matrix.getPrimaryKey(), matrix);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRIXNAME,
            new Object[] { matrix.getMatrixName() }, matrix);

        matrix.resetOriginalValues();
    }

    /**
     * Caches the matrixs in the entity cache if it is enabled.
     *
     * @param matrixs the matrixs
     */
    @Override
    public void cacheResult(List<Matrix> matrixs) {
        for (Matrix matrix : matrixs) {
            if (EntityCacheUtil.getResult(
                        MatrixModelImpl.ENTITY_CACHE_ENABLED, MatrixImpl.class,
                        matrix.getPrimaryKey()) == null) {
                cacheResult(matrix);
            } else {
                matrix.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all matrixs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(MatrixImpl.class.getName());
        }

        EntityCacheUtil.clearCache(MatrixImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the matrix.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Matrix matrix) {
        EntityCacheUtil.removeResult(MatrixModelImpl.ENTITY_CACHE_ENABLED,
            MatrixImpl.class, matrix.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(matrix);
    }

    @Override
    public void clearCache(List<Matrix> matrixs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Matrix matrix : matrixs) {
            EntityCacheUtil.removeResult(MatrixModelImpl.ENTITY_CACHE_ENABLED,
                MatrixImpl.class, matrix.getPrimaryKey());

            clearUniqueFindersCache(matrix);
        }
    }

    protected void cacheUniqueFindersCache(Matrix matrix) {
        if (matrix.isNew()) {
            Object[] args = new Object[] { matrix.getMatrixName() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATRIXNAME, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRIXNAME, args,
                matrix);
        } else {
            MatrixModelImpl matrixModelImpl = (MatrixModelImpl) matrix;

            if ((matrixModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_MATRIXNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { matrix.getMatrixName() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATRIXNAME,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRIXNAME,
                    args, matrix);
            }
        }
    }

    protected void clearUniqueFindersCache(Matrix matrix) {
        MatrixModelImpl matrixModelImpl = (MatrixModelImpl) matrix;

        Object[] args = new Object[] { matrix.getMatrixName() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATRIXNAME, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATRIXNAME, args);

        if ((matrixModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_MATRIXNAME.getColumnBitmask()) != 0) {
            args = new Object[] { matrixModelImpl.getOriginalMatrixName() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATRIXNAME, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATRIXNAME, args);
        }
    }

    /**
     * Creates a new matrix with the primary key. Does not add the matrix to the database.
     *
     * @param matrixId the primary key for the new matrix
     * @return the new matrix
     */
    @Override
    public Matrix create(long matrixId) {
        Matrix matrix = new MatrixImpl();

        matrix.setNew(true);
        matrix.setPrimaryKey(matrixId);

        return matrix;
    }

    /**
     * Removes the matrix with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param matrixId the primary key of the matrix
     * @return the matrix that was removed
     * @throws ram.gameport.service.matrix.NoSuchMatrixException if a matrix with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Matrix remove(long matrixId)
        throws NoSuchMatrixException, SystemException {
        return remove((Serializable) matrixId);
    }

    /**
     * Removes the matrix with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the matrix
     * @return the matrix that was removed
     * @throws ram.gameport.service.matrix.NoSuchMatrixException if a matrix with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Matrix remove(Serializable primaryKey)
        throws NoSuchMatrixException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Matrix matrix = (Matrix) session.get(MatrixImpl.class, primaryKey);

            if (matrix == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchMatrixException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(matrix);
        } catch (NoSuchMatrixException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Matrix removeImpl(Matrix matrix) throws SystemException {
        matrix = toUnwrappedModel(matrix);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(matrix)) {
                matrix = (Matrix) session.get(MatrixImpl.class,
                        matrix.getPrimaryKeyObj());
            }

            if (matrix != null) {
                session.delete(matrix);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (matrix != null) {
            clearCache(matrix);
        }

        return matrix;
    }

    @Override
    public Matrix updateImpl(ram.gameport.service.matrix.model.Matrix matrix)
        throws SystemException {
        matrix = toUnwrappedModel(matrix);

        boolean isNew = matrix.isNew();

        Session session = null;

        try {
            session = openSession();

            if (matrix.isNew()) {
                session.save(matrix);

                matrix.setNew(false);
            } else {
                session.merge(matrix);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !MatrixModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(MatrixModelImpl.ENTITY_CACHE_ENABLED,
            MatrixImpl.class, matrix.getPrimaryKey(), matrix);

        clearUniqueFindersCache(matrix);
        cacheUniqueFindersCache(matrix);

        return matrix;
    }

    protected Matrix toUnwrappedModel(Matrix matrix) {
        if (matrix instanceof MatrixImpl) {
            return matrix;
        }

        MatrixImpl matrixImpl = new MatrixImpl();

        matrixImpl.setNew(matrix.isNew());
        matrixImpl.setPrimaryKey(matrix.getPrimaryKey());

        matrixImpl.setMatrixId(matrix.getMatrixId());
        matrixImpl.setMatrixName(matrix.getMatrixName());
        matrixImpl.setPositionX(matrix.getPositionX());
        matrixImpl.setPositionY(matrix.getPositionY());
        matrixImpl.setDataType(matrix.getDataType());
        matrixImpl.setDataValue(matrix.getDataValue());

        return matrixImpl;
    }

    /**
     * Returns the matrix with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the matrix
     * @return the matrix
     * @throws ram.gameport.service.matrix.NoSuchMatrixException if a matrix with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Matrix findByPrimaryKey(Serializable primaryKey)
        throws NoSuchMatrixException, SystemException {
        Matrix matrix = fetchByPrimaryKey(primaryKey);

        if (matrix == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchMatrixException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return matrix;
    }

    /**
     * Returns the matrix with the primary key or throws a {@link ram.gameport.service.matrix.NoSuchMatrixException} if it could not be found.
     *
     * @param matrixId the primary key of the matrix
     * @return the matrix
     * @throws ram.gameport.service.matrix.NoSuchMatrixException if a matrix with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Matrix findByPrimaryKey(long matrixId)
        throws NoSuchMatrixException, SystemException {
        return findByPrimaryKey((Serializable) matrixId);
    }

    /**
     * Returns the matrix with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the matrix
     * @return the matrix, or <code>null</code> if a matrix with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Matrix fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Matrix matrix = (Matrix) EntityCacheUtil.getResult(MatrixModelImpl.ENTITY_CACHE_ENABLED,
                MatrixImpl.class, primaryKey);

        if (matrix == _nullMatrix) {
            return null;
        }

        if (matrix == null) {
            Session session = null;

            try {
                session = openSession();

                matrix = (Matrix) session.get(MatrixImpl.class, primaryKey);

                if (matrix != null) {
                    cacheResult(matrix);
                } else {
                    EntityCacheUtil.putResult(MatrixModelImpl.ENTITY_CACHE_ENABLED,
                        MatrixImpl.class, primaryKey, _nullMatrix);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(MatrixModelImpl.ENTITY_CACHE_ENABLED,
                    MatrixImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return matrix;
    }

    /**
     * Returns the matrix with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param matrixId the primary key of the matrix
     * @return the matrix, or <code>null</code> if a matrix with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Matrix fetchByPrimaryKey(long matrixId) throws SystemException {
        return fetchByPrimaryKey((Serializable) matrixId);
    }

    /**
     * Returns all the matrixs.
     *
     * @return the matrixs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Matrix> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the matrixs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ram.gameport.service.matrix.model.impl.MatrixModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of matrixs
     * @param end the upper bound of the range of matrixs (not inclusive)
     * @return the range of matrixs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Matrix> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the matrixs.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ram.gameport.service.matrix.model.impl.MatrixModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of matrixs
     * @param end the upper bound of the range of matrixs (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matrixs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Matrix> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Matrix> list = (List<Matrix>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_MATRIX);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_MATRIX;

                if (pagination) {
                    sql = sql.concat(MatrixModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Matrix>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Matrix>(list);
                } else {
                    list = (List<Matrix>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the matrixs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Matrix matrix : findAll()) {
            remove(matrix);
        }
    }

    /**
     * Returns the number of matrixs.
     *
     * @return the number of matrixs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_MATRIX);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the matrix persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ram.gameport.service.matrix.model.Matrix")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Matrix>> listenersList = new ArrayList<ModelListener<Matrix>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Matrix>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(MatrixImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
