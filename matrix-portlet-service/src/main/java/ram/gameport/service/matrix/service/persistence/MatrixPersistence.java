package ram.gameport.service.matrix.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ram.gameport.service.matrix.model.Matrix;

/**
 * The persistence interface for the matrix service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gameport
 * @see MatrixPersistenceImpl
 * @see MatrixUtil
 * @generated
 */
public interface MatrixPersistence extends BasePersistence<Matrix> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MatrixUtil} to access the matrix persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the matrix where matrixName = &#63; or throws a {@link ram.gameport.service.matrix.NoSuchMatrixException} if it could not be found.
    *
    * @param matrixName the matrix name
    * @return the matching matrix
    * @throws ram.gameport.service.matrix.NoSuchMatrixException if a matching matrix could not be found
    * @throws SystemException if a system exception occurred
    */
    public ram.gameport.service.matrix.model.Matrix findBymatrixName(
        java.lang.String matrixName)
        throws com.liferay.portal.kernel.exception.SystemException,
            ram.gameport.service.matrix.NoSuchMatrixException;

    /**
    * Returns the matrix where matrixName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param matrixName the matrix name
    * @return the matching matrix, or <code>null</code> if a matching matrix could not be found
    * @throws SystemException if a system exception occurred
    */
    public ram.gameport.service.matrix.model.Matrix fetchBymatrixName(
        java.lang.String matrixName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the matrix where matrixName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param matrixName the matrix name
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching matrix, or <code>null</code> if a matching matrix could not be found
    * @throws SystemException if a system exception occurred
    */
    public ram.gameport.service.matrix.model.Matrix fetchBymatrixName(
        java.lang.String matrixName, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the matrix where matrixName = &#63; from the database.
    *
    * @param matrixName the matrix name
    * @return the matrix that was removed
    * @throws SystemException if a system exception occurred
    */
    public ram.gameport.service.matrix.model.Matrix removeBymatrixName(
        java.lang.String matrixName)
        throws com.liferay.portal.kernel.exception.SystemException,
            ram.gameport.service.matrix.NoSuchMatrixException;

    /**
    * Returns the number of matrixs where matrixName = &#63;.
    *
    * @param matrixName the matrix name
    * @return the number of matching matrixs
    * @throws SystemException if a system exception occurred
    */
    public int countBymatrixName(java.lang.String matrixName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the matrix in the entity cache if it is enabled.
    *
    * @param matrix the matrix
    */
    public void cacheResult(ram.gameport.service.matrix.model.Matrix matrix);

    /**
    * Caches the matrixs in the entity cache if it is enabled.
    *
    * @param matrixs the matrixs
    */
    public void cacheResult(
        java.util.List<ram.gameport.service.matrix.model.Matrix> matrixs);

    /**
    * Creates a new matrix with the primary key. Does not add the matrix to the database.
    *
    * @param matrixId the primary key for the new matrix
    * @return the new matrix
    */
    public ram.gameport.service.matrix.model.Matrix create(long matrixId);

    /**
    * Removes the matrix with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param matrixId the primary key of the matrix
    * @return the matrix that was removed
    * @throws ram.gameport.service.matrix.NoSuchMatrixException if a matrix with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ram.gameport.service.matrix.model.Matrix remove(long matrixId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ram.gameport.service.matrix.NoSuchMatrixException;

    public ram.gameport.service.matrix.model.Matrix updateImpl(
        ram.gameport.service.matrix.model.Matrix matrix)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the matrix with the primary key or throws a {@link ram.gameport.service.matrix.NoSuchMatrixException} if it could not be found.
    *
    * @param matrixId the primary key of the matrix
    * @return the matrix
    * @throws ram.gameport.service.matrix.NoSuchMatrixException if a matrix with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ram.gameport.service.matrix.model.Matrix findByPrimaryKey(
        long matrixId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ram.gameport.service.matrix.NoSuchMatrixException;

    /**
    * Returns the matrix with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param matrixId the primary key of the matrix
    * @return the matrix, or <code>null</code> if a matrix with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ram.gameport.service.matrix.model.Matrix fetchByPrimaryKey(
        long matrixId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the matrixs.
    *
    * @return the matrixs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ram.gameport.service.matrix.model.Matrix> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ram.gameport.service.matrix.model.Matrix> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ram.gameport.service.matrix.model.Matrix> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the matrixs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of matrixs.
    *
    * @return the number of matrixs
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
