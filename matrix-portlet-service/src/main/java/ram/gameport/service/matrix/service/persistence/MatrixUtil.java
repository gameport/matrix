package ram.gameport.service.matrix.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ram.gameport.service.matrix.model.Matrix;

import java.util.List;

/**
 * The persistence utility for the matrix service. This utility wraps {@link MatrixPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author gameport
 * @see MatrixPersistence
 * @see MatrixPersistenceImpl
 * @generated
 */
public class MatrixUtil {
    private static MatrixPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Matrix matrix) {
        getPersistence().clearCache(matrix);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Matrix> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Matrix> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Matrix> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Matrix update(Matrix matrix) throws SystemException {
        return getPersistence().update(matrix);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Matrix update(Matrix matrix, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(matrix, serviceContext);
    }

    /**
    * Returns the matrix where matrixName = &#63; or throws a {@link ram.gameport.service.matrix.NoSuchMatrixException} if it could not be found.
    *
    * @param matrixName the matrix name
    * @return the matching matrix
    * @throws ram.gameport.service.matrix.NoSuchMatrixException if a matching matrix could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ram.gameport.service.matrix.model.Matrix findBymatrixName(
        java.lang.String matrixName)
        throws com.liferay.portal.kernel.exception.SystemException,
            ram.gameport.service.matrix.NoSuchMatrixException {
        return getPersistence().findBymatrixName(matrixName);
    }

    /**
    * Returns the matrix where matrixName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param matrixName the matrix name
    * @return the matching matrix, or <code>null</code> if a matching matrix could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ram.gameport.service.matrix.model.Matrix fetchBymatrixName(
        java.lang.String matrixName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBymatrixName(matrixName);
    }

    /**
    * Returns the matrix where matrixName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param matrixName the matrix name
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching matrix, or <code>null</code> if a matching matrix could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ram.gameport.service.matrix.model.Matrix fetchBymatrixName(
        java.lang.String matrixName, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBymatrixName(matrixName, retrieveFromCache);
    }

    /**
    * Removes the matrix where matrixName = &#63; from the database.
    *
    * @param matrixName the matrix name
    * @return the matrix that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ram.gameport.service.matrix.model.Matrix removeBymatrixName(
        java.lang.String matrixName)
        throws com.liferay.portal.kernel.exception.SystemException,
            ram.gameport.service.matrix.NoSuchMatrixException {
        return getPersistence().removeBymatrixName(matrixName);
    }

    /**
    * Returns the number of matrixs where matrixName = &#63;.
    *
    * @param matrixName the matrix name
    * @return the number of matching matrixs
    * @throws SystemException if a system exception occurred
    */
    public static int countBymatrixName(java.lang.String matrixName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBymatrixName(matrixName);
    }

    /**
    * Caches the matrix in the entity cache if it is enabled.
    *
    * @param matrix the matrix
    */
    public static void cacheResult(
        ram.gameport.service.matrix.model.Matrix matrix) {
        getPersistence().cacheResult(matrix);
    }

    /**
    * Caches the matrixs in the entity cache if it is enabled.
    *
    * @param matrixs the matrixs
    */
    public static void cacheResult(
        java.util.List<ram.gameport.service.matrix.model.Matrix> matrixs) {
        getPersistence().cacheResult(matrixs);
    }

    /**
    * Creates a new matrix with the primary key. Does not add the matrix to the database.
    *
    * @param matrixId the primary key for the new matrix
    * @return the new matrix
    */
    public static ram.gameport.service.matrix.model.Matrix create(long matrixId) {
        return getPersistence().create(matrixId);
    }

    /**
    * Removes the matrix with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param matrixId the primary key of the matrix
    * @return the matrix that was removed
    * @throws ram.gameport.service.matrix.NoSuchMatrixException if a matrix with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ram.gameport.service.matrix.model.Matrix remove(long matrixId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ram.gameport.service.matrix.NoSuchMatrixException {
        return getPersistence().remove(matrixId);
    }

    public static ram.gameport.service.matrix.model.Matrix updateImpl(
        ram.gameport.service.matrix.model.Matrix matrix)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(matrix);
    }

    /**
    * Returns the matrix with the primary key or throws a {@link ram.gameport.service.matrix.NoSuchMatrixException} if it could not be found.
    *
    * @param matrixId the primary key of the matrix
    * @return the matrix
    * @throws ram.gameport.service.matrix.NoSuchMatrixException if a matrix with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ram.gameport.service.matrix.model.Matrix findByPrimaryKey(
        long matrixId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ram.gameport.service.matrix.NoSuchMatrixException {
        return getPersistence().findByPrimaryKey(matrixId);
    }

    /**
    * Returns the matrix with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param matrixId the primary key of the matrix
    * @return the matrix, or <code>null</code> if a matrix with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ram.gameport.service.matrix.model.Matrix fetchByPrimaryKey(
        long matrixId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(matrixId);
    }

    /**
    * Returns all the matrixs.
    *
    * @return the matrixs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ram.gameport.service.matrix.model.Matrix> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<ram.gameport.service.matrix.model.Matrix> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<ram.gameport.service.matrix.model.Matrix> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the matrixs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of matrixs.
    *
    * @return the number of matrixs
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static MatrixPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (MatrixPersistence) PortletBeanLocatorUtil.locate(ram.gameport.service.matrix.service.ClpSerializer.getServletContextName(),
                    MatrixPersistence.class.getName());

            ReferenceRegistry.registerReference(MatrixUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(MatrixPersistence persistence) {
    }
}
