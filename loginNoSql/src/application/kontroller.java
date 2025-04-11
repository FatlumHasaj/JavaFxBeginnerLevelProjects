package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class kontroller {
	@FXML
	private Label lab;

	@FXML
	private Button leave;

	@FXML
	public void logout() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/login.fxml"));
			Parent root = loader.load();

			if (root == null) {
				System.out.println("Failed to load FXML");
			}

			Stage stage = (Stage) leave.getScene().getWindow();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error loading FXML: " + e.getMessage());
		}

	}
	
	public void label(String name) {
		lab.setText("Welcome "+name + "!");
	}
}
