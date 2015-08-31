package ram.gameport.service.matrix.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Matrix}.
 * </p>
 *
 * @author gameport
 * @see Matrix
 * @generated
 */
public class MatrixWrapper implements Matrix, ModelWrapper<Matrix> {
    private Matrix _matrix;

    public MatrixWrapper(Matrix matrix) {
        _matrix = matrix;
    }

    @Override
    public Class<?> getModelClass() {
        return Matrix.class;
    }

    @Override
    public String getModelClassName() {
        return Matrix.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("matrixId", getMatrixId());
        attributes.put("matrixName", getMatrixName());
        attributes.put("positionX", getPositionX());
        attributes.put("positionY", getPositionY());
        attributes.put("dataType", getDataType());
        attributes.put("dataValue", getDataValue());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long matrixId = (Long) attributes.get("matrixId");

        if (matrixId != null) {
            setMatrixId(matrixId);
        }

        String matrixName = (String) attributes.get("matrixName");

        if (matrixName != null) {
            setMatrixName(matrixName);
        }

        Integer positionX = (Integer) attributes.get("positionX");

        if (positionX != null) {
            setPositionX(positionX);
        }

        Integer positionY = (Integer) attributes.get("positionY");

        if (positionY != null) {
            setPositionY(positionY);
        }

        String dataType = (String) attributes.get("dataType");

        if (dataType != null) {
            setDataType(dataType);
        }

        String dataValue = (String) attributes.get("dataValue");

        if (dataValue != null) {
            setDataValue(dataValue);
        }
    }

    /**
    * Returns the primary key of this matrix.
    *
    * @return the primary key of this matrix
    */
    @Override
    public long getPrimaryKey() {
        return _matrix.getPrimaryKey();
    }

    /**
    * Sets the primary key of this matrix.
    *
    * @param primaryKey the primary key of this matrix
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _matrix.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the matrix ID of this matrix.
    *
    * @return the matrix ID of this matrix
    */
    @Override
    public long getMatrixId() {
        return _matrix.getMatrixId();
    }

    /**
    * Sets the matrix ID of this matrix.
    *
    * @param matrixId the matrix ID of this matrix
    */
    @Override
    public void setMatrixId(long matrixId) {
        _matrix.setMatrixId(matrixId);
    }

    /**
    * Returns the matrix name of this matrix.
    *
    * @return the matrix name of this matrix
    */
    @Override
    public java.lang.String getMatrixName() {
        return _matrix.getMatrixName();
    }

    /**
    * Sets the matrix name of this matrix.
    *
    * @param matrixName the matrix name of this matrix
    */
    @Override
    public void setMatrixName(java.lang.String matrixName) {
        _matrix.setMatrixName(matrixName);
    }

    /**
    * Returns the position x of this matrix.
    *
    * @return the position x of this matrix
    */
    @Override
    public int getPositionX() {
        return _matrix.getPositionX();
    }

    /**
    * Sets the position x of this matrix.
    *
    * @param positionX the position x of this matrix
    */
    @Override
    public void setPositionX(int positionX) {
        _matrix.setPositionX(positionX);
    }

    /**
    * Returns the position y of this matrix.
    *
    * @return the position y of this matrix
    */
    @Override
    public int getPositionY() {
        return _matrix.getPositionY();
    }

    /**
    * Sets the position y of this matrix.
    *
    * @param positionY the position y of this matrix
    */
    @Override
    public void setPositionY(int positionY) {
        _matrix.setPositionY(positionY);
    }

    /**
    * Returns the data type of this matrix.
    *
    * @return the data type of this matrix
    */
    @Override
    public java.lang.String getDataType() {
        return _matrix.getDataType();
    }

    /**
    * Sets the data type of this matrix.
    *
    * @param dataType the data type of this matrix
    */
    @Override
    public void setDataType(java.lang.String dataType) {
        _matrix.setDataType(dataType);
    }

    /**
    * Returns the data value of this matrix.
    *
    * @return the data value of this matrix
    */
    @Override
    public java.lang.String getDataValue() {
        return _matrix.getDataValue();
    }

    /**
    * Sets the data value of this matrix.
    *
    * @param dataValue the data value of this matrix
    */
    @Override
    public void setDataValue(java.lang.String dataValue) {
        _matrix.setDataValue(dataValue);
    }

    @Override
    public boolean isNew() {
        return _matrix.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _matrix.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _matrix.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _matrix.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _matrix.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _matrix.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _matrix.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _matrix.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _matrix.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _matrix.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _matrix.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new MatrixWrapper((Matrix) _matrix.clone());
    }

    @Override
    public int compareTo(Matrix matrix) {
        return _matrix.compareTo(matrix);
    }

    @Override
    public int hashCode() {
        return _matrix.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Matrix> toCacheModel() {
        return _matrix.toCacheModel();
    }

    @Override
    public Matrix toEscapedModel() {
        return new MatrixWrapper(_matrix.toEscapedModel());
    }

    @Override
    public Matrix toUnescapedModel() {
        return new MatrixWrapper(_matrix.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _matrix.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _matrix.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _matrix.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MatrixWrapper)) {
            return false;
        }

        MatrixWrapper matrixWrapper = (MatrixWrapper) obj;

        if (Validator.equals(_matrix, matrixWrapper._matrix)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Matrix getWrappedMatrix() {
        return _matrix;
    }

    @Override
    public Matrix getWrappedModel() {
        return _matrix;
    }

    @Override
    public void resetOriginalValues() {
        _matrix.resetOriginalValues();
    }
}
