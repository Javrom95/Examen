package View;

import java.io.IOException;
import Model.Methods;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 * 
 * @author Javier
 *
 */


public class FirstInterfaceController {

	
	/**
	 * Initialize the Form window.
	 */
	public void Button (){
		try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Methods.class.getResource("View/Form.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

        } catch (IOException e) {
            e.printStackTrace();
        }	
	}
	
	
	
	
}
