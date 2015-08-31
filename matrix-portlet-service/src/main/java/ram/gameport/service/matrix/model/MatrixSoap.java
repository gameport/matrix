package ram.gameport.service.matrix.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ram.gameport.service.matrix.service.http.MatrixServiceSoap}.
 *
 * @author gameport
 * @see ram.gameport.service.matrix.service.http.MatrixServiceSoap
 * @generated
 */
public class MatrixSoap implements Serializable {
    private long _matrixId;
    private String _matrixName;
    private int _positionX;
    private int _positionY;
    private String _dataType;
    private String _dataValue;

    public MatrixSoap() {
    }

    public static MatrixSoap toSoapModel(Matrix model) {
        MatrixSoap soapModel = new MatrixSoap();

        soapModel.setMatrixId(model.getMatrixId());
        soapModel.setMatrixName(model.getMatrixName());
        soapModel.setPositionX(model.getPositionX());
        soapModel.setPositionY(model.getPositionY());
        soapModel.setDataType(model.getDataType());
        soapModel.setDataValue(model.getDataValue());

        return soapModel;
    }

    public static MatrixSoap[] toSoapModels(Matrix[] models) {
        MatrixSoap[] soapModels = new MatrixSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static MatrixSoap[][] toSoapModels(Matrix[][] models) {
        MatrixSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new MatrixSoap[models.length][models[0].length];
        } else {
            soapModels = new MatrixSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static MatrixSoap[] toSoapModels(List<Matrix> models) {
        List<MatrixSoap> soapModels = new ArrayList<MatrixSoap>(models.size());

        for (Matrix model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new MatrixSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _matrixId;
    }

    public void setPrimaryKey(long pk) {
        setMatrixId(pk);
    }

    public long getMatrixId() {
        return _matrixId;
    }

    public void setMatrixId(long matrixId) {
        _matrixId = matrixId;
    }

    public String getMatrixName() {
        return _matrixName;
    }

    public void setMatrixName(String matrixName) {
        _matrixName = matrixName;
    }

    public int getPositionX() {
        return _positionX;
    }

    public void setPositionX(int positionX) {
        _positionX = positionX;
    }

    public int getPositionY() {
        return _positionY;
    }

    public void setPositionY(int positionY) {
        _positionY = positionY;
    }

    public String getDataType() {
        return _dataType;
    }

    public void setDataType(String dataType) {
        _dataType = dataType;
    }

    public String getDataValue() {
        return _dataValue;
    }

    public void setDataValue(String dataValue) {
        _dataValue = dataValue;
    }
}
