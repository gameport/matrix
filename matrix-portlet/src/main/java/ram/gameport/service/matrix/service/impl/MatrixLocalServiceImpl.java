package ram.gameport.service.matrix.service.impl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import ram.gameport.service.matrix.NoSuchMatrixException;
import ram.gameport.service.matrix.model.Matrix;
import ram.gameport.service.matrix.service.MatrixLocalServiceUtil;
import ram.gameport.service.matrix.service.base.MatrixLocalServiceBaseImpl;
import ram.gameport.service.matrix.service.persistence.MatrixPersistence;
import ram.gameport.service.matrix.service.persistence.MatrixUtil;

/**
 * The implementation of the matrix local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ram.gameport.service.matrix.service.MatrixLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author gameport
 * @see ram.gameport.service.matrix.service.base.MatrixLocalServiceBaseImpl
 * @see ram.gameport.service.matrix.service.MatrixLocalServiceUtil
 */
public class MatrixLocalServiceImpl extends MatrixLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link ram.gameport.service.matrix.service.MatrixLocalServiceUtil} to access the matrix local service.
     */

    private Log _log = LogFactoryUtil.getLog(MatrixLocalServiceImpl.class);

    public Matrix create(final String matrixName, final int posX, final int posY, final String dayaType,
                         final String dataValue) throws  SystemException {

        long matrixId = CounterLocalServiceUtil.increment(Matrix.class.getName());
        Matrix newMatrix = MatrixUtil.create(matrixId);

        newMatrix.setMatrixName(matrixName);
        newMatrix.setPositionX(posX);
        newMatrix.setPositionY(posY);
        newMatrix.setDataType(dayaType);
        newMatrix.setDataValue(dataValue);

        newMatrix.setNew(true);

        MatrixUtil.update(newMatrix);

        return newMatrix;
    }

    public Matrix update(final Matrix matrix) throws SystemException {
        Matrix newMatrix = null;
        try {
            newMatrix = MatrixUtil.findBymatrixName(matrix.getMatrixName());

            newMatrix.setMatrixName(matrix.getMatrixName());
            newMatrix.setPositionX(matrix.getPositionX());
            newMatrix.setPositionY(matrix.getPositionY());
            newMatrix.setDataType(matrix.getDataType());
            newMatrix.setDataValue(matrix.getDataValue());

            MatrixUtil.update(newMatrix);
        } catch (NoSuchMatrixException e) {
            _log.error(e.getLocalizedMessage());
        }

        return newMatrix;
    }

    @Override
    public Matrix findByMatrixName(final String matrixName) {
        Matrix matrix = null;

        try {
            matrix = MatrixUtil.findBymatrixName(matrixName);
        } catch (SystemException e) {
            _log.error(e.getLocalizedMessage());
        } catch (NoSuchMatrixException e) {
            _log.error(e.getLocalizedMessage());
        }

        return matrix;
    }

    public Matrix remove(final long matrixId) throws PortalException, SystemException {
        return MatrixUtil.remove(matrixId);
    }
}
