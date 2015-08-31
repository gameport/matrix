package ram.gameport.service.matrix.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ram.gameport.service.matrix.service.ClpSerializer;
import ram.gameport.service.matrix.service.MatrixLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class MatrixClp extends BaseModelImpl<Matrix> implements Matrix {
    private long _matrixId;
    private String _matrixName;
    private int _positionX;
    private int _positionY;
    private String _dataType;
    private String _dataValue;
    private BaseModel<?> _matrixRemoteModel;

    public MatrixClp() {
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
    public long getPrimaryKey() {
        return _matrixId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setMatrixId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _matrixId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getMatrixId() {
        return _matrixId;
    }

    @Override
    public void setMatrixId(long matrixId) {
        _matrixId = matrixId;

        if (_matrixRemoteModel != null) {
            try {
                Class<?> clazz = _matrixRemoteModel.getClass();

                Method method = clazz.getMethod("setMatrixId", long.class);

                method.invoke(_matrixRemoteModel, matrixId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMatrixName() {
        return _matrixName;
    }

    @Override
    public void setMatrixName(String matrixName) {
        _matrixName = matrixName;

        if (_matrixRemoteModel != null) {
            try {
                Class<?> clazz = _matrixRemoteModel.getClass();

                Method method = clazz.getMethod("setMatrixName", String.class);

                method.invoke(_matrixRemoteModel, matrixName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPositionX() {
        return _positionX;
    }

    @Override
    public void setPositionX(int positionX) {
        _positionX = positionX;

        if (_matrixRemoteModel != null) {
            try {
                Class<?> clazz = _matrixRemoteModel.getClass();

                Method method = clazz.getMethod("setPositionX", int.class);

                method.invoke(_matrixRemoteModel, positionX);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPositionY() {
        return _positionY;
    }

    @Override
    public void setPositionY(int positionY) {
        _positionY = positionY;

        if (_matrixRemoteModel != null) {
            try {
                Class<?> clazz = _matrixRemoteModel.getClass();

                Method method = clazz.getMethod("setPositionY", int.class);

                method.invoke(_matrixRemoteModel, positionY);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDataType() {
        return _dataType;
    }

    @Override
    public void setDataType(String dataType) {
        _dataType = dataType;

        if (_matrixRemoteModel != null) {
            try {
                Class<?> clazz = _matrixRemoteModel.getClass();

                Method method = clazz.getMethod("setDataType", String.class);

                method.invoke(_matrixRemoteModel, dataType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDataValue() {
        return _dataValue;
    }

    @Override
    public void setDataValue(String dataValue) {
        _dataValue = dataValue;

        if (_matrixRemoteModel != null) {
            try {
                Class<?> clazz = _matrixRemoteModel.getClass();

                Method method = clazz.getMethod("setDataValue", String.class);

                method.invoke(_matrixRemoteModel, dataValue);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getMatrixRemoteModel() {
        return _matrixRemoteModel;
    }

    public void setMatrixRemoteModel(BaseModel<?> matrixRemoteModel) {
        _matrixRemoteModel = matrixRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _matrixRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_matrixRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            MatrixLocalServiceUtil.addMatrix(this);
        } else {
            MatrixLocalServiceUtil.updateMatrix(this);
        }
    }

    @Override
    public Matrix toEscapedModel() {
        return (Matrix) ProxyUtil.newProxyInstance(Matrix.class.getClassLoader(),
            new Class[] { Matrix.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        MatrixClp clone = new MatrixClp();

        clone.setMatrixId(getMatrixId());
        clone.setMatrixName(getMatrixName());
        clone.setPositionX(getPositionX());
        clone.setPositionY(getPositionY());
        clone.setDataType(getDataType());
        clone.setDataValue(getDataValue());

        return clone;
    }

    @Override
    public int compareTo(Matrix matrix) {
        int value = 0;

        value = getMatrixName().compareTo(matrix.getMatrixName());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MatrixClp)) {
            return false;
        }

        MatrixClp matrix = (MatrixClp) obj;

        long primaryKey = matrix.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{matrixId=");
        sb.append(getMatrixId());
        sb.append(", matrixName=");
        sb.append(getMatrixName());
        sb.append(", positionX=");
        sb.append(getPositionX());
        sb.append(", positionY=");
        sb.append(getPositionY());
        sb.append(", dataType=");
        sb.append(getDataType());
        sb.append(", dataValue=");
        sb.append(getDataValue());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("ram.gameport.service.matrix.model.Matrix");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>matrixId</column-name><column-value><![CDATA[");
        sb.append(getMatrixId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>matrixName</column-name><column-value><![CDATA[");
        sb.append(getMatrixName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>positionX</column-name><column-value><![CDATA[");
        sb.append(getPositionX());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>positionY</column-name><column-value><![CDATA[");
        sb.append(getPositionY());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataType</column-name><column-value><![CDATA[");
        sb.append(getDataType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataValue</column-name><column-value><![CDATA[");
        sb.append(getDataValue());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
