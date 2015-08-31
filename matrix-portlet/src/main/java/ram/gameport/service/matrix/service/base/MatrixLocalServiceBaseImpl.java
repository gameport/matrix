package ram.gameport.service.matrix.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import ram.gameport.service.matrix.model.Matrix;
import ram.gameport.service.matrix.service.MatrixLocalService;
import ram.gameport.service.matrix.service.persistence.MatrixPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the matrix local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link ram.gameport.service.matrix.service.impl.MatrixLocalServiceImpl}.
 * </p>
 *
 * @author gameport
 * @see ram.gameport.service.matrix.service.impl.MatrixLocalServiceImpl
 * @see ram.gameport.service.matrix.service.MatrixLocalServiceUtil
 * @generated
 */
public abstract class MatrixLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements MatrixLocalService, IdentifiableBean {
    @BeanReference(type = ram.gameport.service.matrix.service.MatrixLocalService.class)
    protected ram.gameport.service.matrix.service.MatrixLocalService matrixLocalService;
    @BeanReference(type = ram.gameport.service.matrix.service.MatrixService.class)
    protected ram.gameport.service.matrix.service.MatrixService matrixService;
    @BeanReference(type = MatrixPersistence.class)
    protected MatrixPersistence matrixPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private MatrixLocalServiceClpInvoker _clpInvoker = new MatrixLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ram.gameport.service.matrix.service.MatrixLocalServiceUtil} to access the matrix local service.
     */

    /**
     * Adds the matrix to the database. Also notifies the appropriate model listeners.
     *
     * @param matrix the matrix
     * @return the matrix that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Matrix addMatrix(Matrix matrix) throws SystemException {
        matrix.setNew(true);

        return matrixPersistence.update(matrix);
    }

    /**
     * Creates a new matrix with the primary key. Does not add the matrix to the database.
     *
     * @param matrixId the primary key for the new matrix
     * @return the new matrix
     */
    @Override
    public Matrix createMatrix(long matrixId) {
        return matrixPersistence.create(matrixId);
    }

    /**
     * Deletes the matrix with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param matrixId the primary key of the matrix
     * @return the matrix that was removed
     * @throws PortalException if a matrix with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Matrix deleteMatrix(long matrixId)
        throws PortalException, SystemException {
        return matrixPersistence.remove(matrixId);
    }

    /**
     * Deletes the matrix from the database. Also notifies the appropriate model listeners.
     *
     * @param matrix the matrix
     * @return the matrix that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Matrix deleteMatrix(Matrix matrix) throws SystemException {
        return matrixPersistence.remove(matrix);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Matrix.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return matrixPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ram.gameport.service.matrix.model.impl.MatrixModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return matrixPersistence.findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ram.gameport.service.matrix.model.impl.MatrixModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return matrixPersistence.findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return matrixPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return matrixPersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Matrix fetchMatrix(long matrixId) throws SystemException {
        return matrixPersistence.fetchByPrimaryKey(matrixId);
    }

    /**
     * Returns the matrix with the primary key.
     *
     * @param matrixId the primary key of the matrix
     * @return the matrix
     * @throws PortalException if a matrix with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Matrix getMatrix(long matrixId)
        throws PortalException, SystemException {
        return matrixPersistence.findByPrimaryKey(matrixId);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return matrixPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<Matrix> getMatrixs(int start, int end)
        throws SystemException {
        return matrixPersistence.findAll(start, end);
    }

    /**
     * Returns the number of matrixs.
     *
     * @return the number of matrixs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getMatrixsCount() throws SystemException {
        return matrixPersistence.countAll();
    }

    /**
     * Updates the matrix in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param matrix the matrix
     * @return the matrix that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Matrix updateMatrix(Matrix matrix) throws SystemException {
        return matrixPersistence.update(matrix);
    }

    /**
     * Returns the matrix local service.
     *
     * @return the matrix local service
     */
    public ram.gameport.service.matrix.service.MatrixLocalService getMatrixLocalService() {
        return matrixLocalService;
    }

    /**
     * Sets the matrix local service.
     *
     * @param matrixLocalService the matrix local service
     */
    public void setMatrixLocalService(
        ram.gameport.service.matrix.service.MatrixLocalService matrixLocalService) {
        this.matrixLocalService = matrixLocalService;
    }

    /**
     * Returns the matrix remote service.
     *
     * @return the matrix remote service
     */
    public ram.gameport.service.matrix.service.MatrixService getMatrixService() {
        return matrixService;
    }

    /**
     * Sets the matrix remote service.
     *
     * @param matrixService the matrix remote service
     */
    public void setMatrixService(
        ram.gameport.service.matrix.service.MatrixService matrixService) {
        this.matrixService = matrixService;
    }

    /**
     * Returns the matrix persistence.
     *
     * @return the matrix persistence
     */
    public MatrixPersistence getMatrixPersistence() {
        return matrixPersistence;
    }

    /**
     * Sets the matrix persistence.
     *
     * @param matrixPersistence the matrix persistence
     */
    public void setMatrixPersistence(MatrixPersistence matrixPersistence) {
        this.matrixPersistence = matrixPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("ram.gameport.service.matrix.model.Matrix",
            matrixLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "ram.gameport.service.matrix.model.Matrix");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Matrix.class;
    }

    protected String getModelClassName() {
        return Matrix.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = matrixPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}