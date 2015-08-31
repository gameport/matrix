package ram.gameport.service.matrix.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ram.gameport.service.matrix.model.Matrix;
import ram.gameport.service.matrix.service.MatrixLocalServiceUtil;

/**
 * @author gameport
 * @generated
 */
public abstract class MatrixActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MatrixActionableDynamicQuery() throws SystemException {
        setBaseLocalService(MatrixLocalServiceUtil.getService());
        setClass(Matrix.class);

        setClassLoader(ram.gameport.service.matrix.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("matrixId");
    }
}
