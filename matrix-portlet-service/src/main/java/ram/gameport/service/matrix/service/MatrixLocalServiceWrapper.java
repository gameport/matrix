package ram.gameport.service.matrix.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MatrixLocalService}.
 *
 * @author gameport
 * @see MatrixLocalService
 * @generated
 */
public class MatrixLocalServiceWrapper implements MatrixLocalService,
    ServiceWrapper<MatrixLocalService> {
    private MatrixLocalService _matrixLocalService;

    public MatrixLocalServiceWrapper(MatrixLocalService matrixLocalService) {
        _matrixLocalService = matrixLocalService;
    }

    /**
    * Adds the matrix to the database. Also notifies the appropriate model listeners.
    *
    * @param matrix the matrix
    * @return the matrix that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ram.gameport.service.matrix.model.Matrix addMatrix(
        ram.gameport.service.matrix.model.Matrix matrix)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.addMatrix(matrix);
    }

    /**
    * Creates a new matrix with the primary key. Does not add the matrix to the database.
    *
    * @param matrixId the primary key for the new matrix
    * @return the new matrix
    */
    @Override
    public ram.gameport.service.matrix.model.Matrix createMatrix(long matrixId) {
        return _matrixLocalService.createMatrix(matrixId);
    }

    /**
    * Deletes the matrix with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param matrixId the primary key of the matrix
    * @return the matrix that was removed
    * @throws PortalException if a matrix with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ram.gameport.service.matrix.model.Matrix deleteMatrix(long matrixId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.deleteMatrix(matrixId);
    }

    /**
    * Deletes the matrix from the database. Also notifies the appropriate model listeners.
    *
    * @param matrix the matrix
    * @return the matrix that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ram.gameport.service.matrix.model.Matrix deleteMatrix(
        ram.gameport.service.matrix.model.Matrix matrix)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.deleteMatrix(matrix);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _matrixLocalService.dynamicQuery();
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.dynamicQuery(dynamicQuery);
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.dynamicQuery(dynamicQuery, start, end);
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.dynamicQuery(dynamicQuery, start, end,
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
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.dynamicQueryCount(dynamicQuery);
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
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public ram.gameport.service.matrix.model.Matrix fetchMatrix(long matrixId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.fetchMatrix(matrixId);
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
    public ram.gameport.service.matrix.model.Matrix getMatrix(long matrixId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.getMatrix(matrixId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.getPersistedModel(primaryKeyObj);
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
    public java.util.List<ram.gameport.service.matrix.model.Matrix> getMatrixs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.getMatrixs(start, end);
    }

    /**
    * Returns the number of matrixs.
    *
    * @return the number of matrixs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getMatrixsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.getMatrixsCount();
    }

    /**
    * Updates the matrix in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param matrix the matrix
    * @return the matrix that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ram.gameport.service.matrix.model.Matrix updateMatrix(
        ram.gameport.service.matrix.model.Matrix matrix)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.updateMatrix(matrix);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _matrixLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _matrixLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _matrixLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public ram.gameport.service.matrix.model.Matrix create(
        java.lang.String matrixName, int posX, int posY,
        java.lang.String dayaType, java.lang.String dataValue)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.create(matrixName, posX, posY, dayaType,
            dataValue);
    }

    @Override
    public ram.gameport.service.matrix.model.Matrix update(
        ram.gameport.service.matrix.model.Matrix matrix)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.update(matrix);
    }

    @Override
    public ram.gameport.service.matrix.model.Matrix findByMatrixName(
        java.lang.String matrixName) {
        return _matrixLocalService.findByMatrixName(matrixName);
    }

    @Override
    public ram.gameport.service.matrix.model.Matrix remove(long matrixId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _matrixLocalService.remove(matrixId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public MatrixLocalService getWrappedMatrixLocalService() {
        return _matrixLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedMatrixLocalService(
        MatrixLocalService matrixLocalService) {
        _matrixLocalService = matrixLocalService;
    }

    @Override
    public MatrixLocalService getWrappedService() {
        return _matrixLocalService;
    }

    @Override
    public void setWrappedService(MatrixLocalService matrixLocalService) {
        _matrixLocalService = matrixLocalService;
    }
}
