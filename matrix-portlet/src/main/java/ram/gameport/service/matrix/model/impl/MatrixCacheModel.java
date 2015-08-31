package ram.gameport.service.matrix.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ram.gameport.service.matrix.model.Matrix;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Matrix in entity cache.
 *
 * @author gameport
 * @see Matrix
 * @generated
 */
public class MatrixCacheModel implements CacheModel<Matrix>, Externalizable {
    public long matrixId;
    public String matrixName;
    public int positionX;
    public int positionY;
    public String dataType;
    public String dataValue;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{matrixId=");
        sb.append(matrixId);
        sb.append(", matrixName=");
        sb.append(matrixName);
        sb.append(", positionX=");
        sb.append(positionX);
        sb.append(", positionY=");
        sb.append(positionY);
        sb.append(", dataType=");
        sb.append(dataType);
        sb.append(", dataValue=");
        sb.append(dataValue);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Matrix toEntityModel() {
        MatrixImpl matrixImpl = new MatrixImpl();

        matrixImpl.setMatrixId(matrixId);

        if (matrixName == null) {
            matrixImpl.setMatrixName(StringPool.BLANK);
        } else {
            matrixImpl.setMatrixName(matrixName);
        }

        matrixImpl.setPositionX(positionX);
        matrixImpl.setPositionY(positionY);

        if (dataType == null) {
            matrixImpl.setDataType(StringPool.BLANK);
        } else {
            matrixImpl.setDataType(dataType);
        }

        if (dataValue == null) {
            matrixImpl.setDataValue(StringPool.BLANK);
        } else {
            matrixImpl.setDataValue(dataValue);
        }

        matrixImpl.resetOriginalValues();

        return matrixImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        matrixId = objectInput.readLong();
        matrixName = objectInput.readUTF();
        positionX = objectInput.readInt();
        positionY = objectInput.readInt();
        dataType = objectInput.readUTF();
        dataValue = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(matrixId);

        if (matrixName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(matrixName);
        }

        objectOutput.writeInt(positionX);
        objectOutput.writeInt(positionY);

        if (dataType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dataType);
        }

        if (dataValue == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dataValue);
        }
    }
}
