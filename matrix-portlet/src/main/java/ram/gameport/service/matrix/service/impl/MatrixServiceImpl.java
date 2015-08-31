package ram.gameport.service.matrix.service.impl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import ram.gameport.service.matrix.NoSuchMatrixException;
import ram.gameport.service.matrix.model.Matrix;
import ram.gameport.service.matrix.service.MatrixLocalServiceUtil;
import ram.gameport.service.matrix.service.base.MatrixServiceBaseImpl;
import ram.gameport.service.matrix.service.persistence.MatrixUtil;

/**
 * The implementation of the matrix remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ram.gameport.service.matrix.service.MatrixService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author gameport
 * @see ram.gameport.service.matrix.service.base.MatrixServiceBaseImpl
 * @see ram.gameport.service.matrix.service.MatrixServiceUtil
 */
public class MatrixServiceImpl extends MatrixServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link ram.gameport.service.matrix.service.MatrixServiceUtil} to access the matrix remote service.
     */

    private Log _log = LogFactoryUtil.getLog(MatrixServiceImpl.class);

    public Matrix create(final String matrixName, final int posX, final int posY, final String dayaType,
                         final String dataValue) throws SystemException {
        return MatrixLocalServiceUtil.create(matrixName, posX, posY, dayaType, dataValue);
    }

    public Matrix update(final Matrix matrix) throws SystemException {
        return MatrixLocalServiceUtil.update(matrix);
    }

    public Matrix findByMatrixName(final String matrixName) {
        return MatrixLocalServiceUtil.findByMatrixName(matrixName);
    }

    public Matrix remove(final long matrixId) throws PortalException, SystemException {
        return MatrixLocalServiceUtil.remove(matrixId);
    }
}
