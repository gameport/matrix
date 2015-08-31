package ram.gameport.service.matrix.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Matrix. This utility wraps
 * {@link ram.gameport.service.matrix.service.impl.MatrixLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author gameport
 * @see MatrixLocalService
 * @see ram.gameport.service.matrix.service.base.MatrixLocalServiceBaseImpl
 * @see ram.gameport.service.matrix.service.impl.MatrixLocalServiceImpl
 * @generated
 */
public class MatrixLocalServiceUtil {
    private static MatrixLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link ram.gameport.service.matrix.service.impl.MatrixLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the matrix to the database. Also notifies the appropriate model listeners.
    *
    * @param matrix the matrix
    * @return the matrix that was added
    * @throws SystemException if a system exception occurred
    */
    public static ram.gameport.service.matrix.model.Matrix addMatrix(
        ram.gameport.service.matrix.model.Matrix matrix)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addMatrix(matrix);
    }

    /**
    * Creates a new matrix with the primary key. Does not add the matrix to the database.
    *
    * @param matrixId the primary key for the new matrix
    * @return the new matrix
    */
    public static ram.gameport.service.matrix.model.Matrix createMatrix(
        long matrixId) {
        return getService().createMatrix(matrixId);
    }

    /**
    * Deletes the matrix with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param matrixId the primary key of the matrix
    * @return the matrix that was removed
    * @throws PortalException if a matrix with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ram.gameport.service.matrix.model.Matrix deleteMatrix(
        long matrixId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteMatrix(matrixId);
    }

    /**
    * Deletes the matrix from the database. Also notifies the appropriate model listeners.
    *
    * @param matrix the matrix
    * @return the matrix that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ram.gameport.service.matrix.model.Matrix deleteMatrix(
        ram.gameport.service.matrix.model.Matrix matrix)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteMatrix(matrix);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static ram.gameport.service.matrix.model.Matrix fetchMatrix(
        long matrixId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchMatrix(matrixId);
    }

    /**
    * Returns the matrix with the primary key.
    *
    * @param matrixId the primary key of the matrix
    * @return the matrix
    * @throws PortalException if a matrix with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ram.gameport.service.matrix.model.Matrix getMatrix(
        long matrixId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getMatrix(matrixId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<ram.gameport.service.matrix.model.Matrix> getMatrixs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getMatrixs(start, end);
    }

    /**
    * Returns the number of matrixs.
    *
    * @return the number of matrixs
    * @throws SystemException if a system exception occurred
    */
    public static int getMatrixsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getMatrixsCount();
    }

    /**
    * Updates the matrix in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param matrix the matrix
    * @return the matrix that was updated
    * @throws SystemException if a system exception occurred
    */
    public static ram.gameport.service.matrix.model.Matrix updateMatrix(
        ram.gameport.service.matrix.model.Matrix matrix)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateMatrix(matrix);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static ram.gameport.service.matrix.model.Matrix create(
        java.lang.String matrixName, int posX, int posY,
        java.lang.String dayaType, java.lang.String dataValue)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().create(matrixName, posX, posY, dayaType, dataValue);
    }

    public static ram.gameport.service.matrix.model.Matrix update(
        ram.gameport.service.matrix.model.Matrix matrix)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().update(matrix);
    }

    public static ram.gameport.service.matrix.model.Matrix findByMatrixName(
        java.lang.String matrixName) {
        return getService().findByMatrixName(matrixName);
    }

    public static ram.gameport.service.matrix.model.Matrix remove(long matrixId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().remove(matrixId);
    }

    public static void clearService() {
        _service = null;
    }

    public static MatrixLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    MatrixLocalService.class.getName());

            if (invokableLocalService instanceof MatrixLocalService) {
                _service = (MatrixLocalService) invokableLocalService;
            } else {
                _service = new MatrixLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(MatrixLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(MatrixLocalService service) {
    }
}
