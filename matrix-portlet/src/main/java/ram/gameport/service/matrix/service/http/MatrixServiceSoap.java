package ram.gameport.service.matrix.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import ram.gameport.service.matrix.service.MatrixServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link ram.gameport.service.matrix.service.MatrixServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link ram.gameport.service.matrix.model.MatrixSoap}.
 * If the method in the service utility returns a
 * {@link ram.gameport.service.matrix.model.Matrix}, that is translated to a
 * {@link ram.gameport.service.matrix.model.MatrixSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author gameport
 * @see MatrixServiceHttp
 * @see ram.gameport.service.matrix.model.MatrixSoap
 * @see ram.gameport.service.matrix.service.MatrixServiceUtil
 * @generated
 */
public class MatrixServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(MatrixServiceSoap.class);

    public static ram.gameport.service.matrix.model.MatrixSoap create(
        java.lang.String matrixName, int posX, int posY,
        java.lang.String dayaType, java.lang.String dataValue)
        throws RemoteException {
        try {
            ram.gameport.service.matrix.model.Matrix returnValue = MatrixServiceUtil.create(matrixName,
                    posX, posY, dayaType, dataValue);

            return ram.gameport.service.matrix.model.MatrixSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static ram.gameport.service.matrix.model.MatrixSoap update(
        ram.gameport.service.matrix.model.MatrixSoap matrix)
        throws RemoteException {
        try {
            ram.gameport.service.matrix.model.Matrix returnValue = MatrixServiceUtil.update(ram.gameport.service.matrix.model.impl.MatrixModelImpl.toModel(
                        matrix));

            return ram.gameport.service.matrix.model.MatrixSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static ram.gameport.service.matrix.model.MatrixSoap findByMatrixName(
        java.lang.String matrixName) throws RemoteException {
        try {
            ram.gameport.service.matrix.model.Matrix returnValue = MatrixServiceUtil.findByMatrixName(matrixName);

            return ram.gameport.service.matrix.model.MatrixSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static ram.gameport.service.matrix.model.MatrixSoap remove(
        long matrixId) throws RemoteException {
        try {
            ram.gameport.service.matrix.model.Matrix returnValue = MatrixServiceUtil.remove(matrixId);

            return ram.gameport.service.matrix.model.MatrixSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
