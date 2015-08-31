package ram.gameport.service.matrix.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Matrix. This utility wraps
 * {@link ram.gameport.service.matrix.service.impl.MatrixServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author gameport
 * @see MatrixService
 * @see ram.gameport.service.matrix.service.base.MatrixServiceBaseImpl
 * @see ram.gameport.service.matrix.service.impl.MatrixServiceImpl
 * @generated
 */
public class MatrixServiceUtil {
    private static MatrixService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link ram.gameport.service.matrix.service.impl.MatrixServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

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

    public static MatrixService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    MatrixService.class.getName());

            if (invokableService instanceof MatrixService) {
                _service = (MatrixService) invokableService;
            } else {
                _service = new MatrixServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(MatrixServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(MatrixService service) {
    }
}
