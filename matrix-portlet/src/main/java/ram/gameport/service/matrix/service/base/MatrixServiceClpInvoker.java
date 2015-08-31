package ram.gameport.service.matrix.service.base;

import ram.gameport.service.matrix.service.MatrixServiceUtil;

import java.util.Arrays;

/**
 * @author gameport
 * @generated
 */
public class MatrixServiceClpInvoker {
    private String _methodName18;
    private String[] _methodParameterTypes18;
    private String _methodName19;
    private String[] _methodParameterTypes19;
    private String _methodName24;
    private String[] _methodParameterTypes24;
    private String _methodName25;
    private String[] _methodParameterTypes25;
    private String _methodName26;
    private String[] _methodParameterTypes26;
    private String _methodName27;
    private String[] _methodParameterTypes27;

    public MatrixServiceClpInvoker() {
        _methodName18 = "getBeanIdentifier";

        _methodParameterTypes18 = new String[] {  };

        _methodName19 = "setBeanIdentifier";

        _methodParameterTypes19 = new String[] { "java.lang.String" };

        _methodName24 = "create";

        _methodParameterTypes24 = new String[] {
                "java.lang.String", "int", "int", "java.lang.String",
                "java.lang.String"
            };

        _methodName25 = "update";

        _methodParameterTypes25 = new String[] {
                "ram.gameport.service.matrix.model.Matrix"
            };

        _methodName26 = "findByMatrixName";

        _methodParameterTypes26 = new String[] { "java.lang.String" };

        _methodName27 = "remove";

        _methodParameterTypes27 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName18.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
            return MatrixServiceUtil.getBeanIdentifier();
        }

        if (_methodName19.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
            MatrixServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName24.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
            return MatrixServiceUtil.create((java.lang.String) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (java.lang.String) arguments[3], (java.lang.String) arguments[4]);
        }

        if (_methodName25.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
            return MatrixServiceUtil.update((ram.gameport.service.matrix.model.Matrix) arguments[0]);
        }

        if (_methodName26.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
            return MatrixServiceUtil.findByMatrixName((java.lang.String) arguments[0]);
        }

        if (_methodName27.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
            return MatrixServiceUtil.remove(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
