package ram.gameport.portlet.controller;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.ReleaseInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import ram.gameport.service.matrix.model.Matrix;
import ram.gameport.service.matrix.service.MatrixLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * Created by gamport.
 */

@RequestMapping("VIEW")
@Controller
public class FeedTheMatrixController {

	private Log _log = LogFactoryUtil.getLog(FeedTheMatrixController.class);

	@RenderMapping
	public String viewTheFeeder(Model model) {
		model.addAttribute("releaseInfo", ReleaseInfo.getReleaseInfo());

		return "view";
	}

	@ActionMapping("feedMatrix")
	public void feedTheMatrix(ActionRequest actionRequest, ActionResponse actionResponse){

		String matrixName = null;
		String dataType = null;
		String dataValue = null;
		int posX;
		int posY;
		try {
			long matrixId = CounterLocalServiceUtil.increment(Matrix.class.getName());

			matrixName = ParamUtil.getString(actionRequest, "matrixName");
			dataType = ParamUtil.getString(actionRequest, "dataType");
			dataValue = ParamUtil.getString(actionRequest, "dataValue");
			posX = ParamUtil.getInteger(actionRequest, "positionX");
			posY = ParamUtil.getInteger(actionRequest, "positionY");

			Matrix matrix = null;

			matrix = MatrixLocalServiceUtil.findByMatrixName(matrixName);

			if( matrix != null ) {

				_log.info("Got a matrix. So updating");

				matrix.setPositionX(posX);
				matrix.setPositionY(posY);
				matrix.setDataType(dataType);
				matrix.setDataValue(dataValue);

				MatrixLocalServiceUtil.update(matrix);

			} else {
				_log.info("No matrix. So creating");

				MatrixLocalServiceUtil.create(matrixName, posX, posY, dataType, dataValue);
			}
		} catch (SystemException e) {
			_log.error(e.getLocalizedMessage());
		}
	}

}
