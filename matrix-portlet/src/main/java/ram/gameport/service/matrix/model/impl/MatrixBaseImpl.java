package ram.gameport.service.matrix.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import ram.gameport.service.matrix.model.Matrix;
import ram.gameport.service.matrix.service.MatrixLocalServiceUtil;

/**
 * The extended model base implementation for the Matrix service. Represents a row in the &quot;matrixService_Matrix&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MatrixImpl}.
 * </p>
 *
 * @author gameport
 * @see MatrixImpl
 * @see ram.gameport.service.matrix.model.Matrix
 * @generated
 */
public abstract class MatrixBaseImpl extends MatrixModelImpl implements Matrix {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a matrix model instance should use the {@link Matrix} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            MatrixLocalServiceUtil.addMatrix(this);
        } else {
            MatrixLocalServiceUtil.updateMatrix(this);
        }
    }
}
