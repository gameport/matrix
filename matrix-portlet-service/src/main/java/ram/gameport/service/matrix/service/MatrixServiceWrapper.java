package ram.gameport.service.matrix.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MatrixService}.
 *
 * @author gameport
 * @see MatrixService
 * @generated
 */
public class MatrixServiceWrapper implements MatrixService,
    ServiceWrapper<MatrixService> {
    private MatrixService _matrixService;

    public MatrixServiceWrapper(MatrixService matrixService) {
        _matrixService = matrixService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _matrixService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _matrixService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _matrixService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public ram.gameport.service.matrix.model.Matrix create(
        java.lang.String matrixName, int posX, int posY,
        java.lang.String dayaType, java.lang.String dataValue)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixService.create(matrixName, posX, posY, dayaType, dataValue);
    }

    @Override
    public ram.gameport.service.matrix.model.Matrix update(
        ram.gameport.service.matrix.model.Matrix matrix)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _matrixService.update(matrix);
    }

    @Override
    public ram.gameport.service.matrix.model.Matrix findByMatrixName(
        java.lang.String matrixName) {
        return _matrixService.findByMatrixName(matrixName);
    }

    @Override
    public ram.gameport.service.matrix.model.Matrix remove(long matrixId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _matrixService.remove(matrixId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public MatrixService getWrappedMatrixService() {
        return _matrixService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedMatrixService(MatrixService matrixService) {
        _matrixService = matrixService;
    }

    @Override
    public MatrixService getWrappedService() {
        return _matrixService;
    }

    @Override
    public void setWrappedService(MatrixService matrixService) {
        _matrixService = matrixService;
    }
}
