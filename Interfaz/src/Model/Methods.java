package Model;

import java.io.IOException;

import View.FirstInterfaceController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Methods {

	FirstInterfaceController controller = new FirstInterfaceController();

    private BorderPane rootLayout;
    private Stage primaryStage;
    
    public void intialiceApp(){
    	try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Methods.class
                    .getResource("View/FirstInterface.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);

            // Give the controller access to the main app.    

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public static void main (String [] args){
		Methods methods = new Methods();
		methods.intialiceApp();
	}
	
	
	
	
	
	
}
