package Miniraknare;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class skarm extends Application implements EventHandler<ActionEvent>{

	public static void main(String[] args) {
		launch();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Group root = new Group();
		
		root.getChildren().addAll();
		
		Scene scene = new Scene(root, 300, 300);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}	
	
}
