package ram.gameport.service.matrix.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import ram.gameport.service.matrix.service.ClpSerializer;
import ram.gameport.service.matrix.service.MatrixLocalServiceUtil;
import ram.gameport.service.matrix.service.MatrixServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            MatrixLocalServiceUtil.clearService();

            MatrixServiceUtil.clearService();
        }
    }
}
