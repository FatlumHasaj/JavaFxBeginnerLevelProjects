package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class logincon {

	@FXML
	private Button login;
	
	@FXML
	private TextField name;

	@FXML
	private PasswordField pass;

	@FXML
	public void changeS() {
		
		String name1 = name.getText();
		String pass1 = pass.getText();
		
		if (name1.equals("admin") && pass1.equals("12345")) {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/afterLogin1244.fxml"));
				Parent root = loader.load();

				kontroller k = loader.getController();
				k.label(name1);
				
				if (root == null) {
					System.out.println("Failed to load FXML");
				}

				Stage stage = (Stage) login.getScene().getWindow();
				Scene scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Error loading FXML: " + e.getMessage());
			} 
		}else {
			System.out.println("User dont exist.");
			Alert a = new Alert(AlertType.ERROR);
			a.setContentText("Wrong details.");
			a.show();
		}
	}
}
