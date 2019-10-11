package Miniraknare;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/*
 * när jag trycker på en knapp ska den anropa tangent classen, kolla vilken knapp det var jag tryckte (1, 2,
 * +,- etc) och köra relevant metod och skicka tillbaka informationen tillbaka till skärm och skriva ut
 * i relevant fält.
 */


public class skarm extends Application implements EventHandler<ActionEvent>{
	
	

	public static void main(String[] args) {
		launch();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Group root = new Group();
		
		TextField display = new TextField();
		
		display.setAlignment(Pos.BOTTOM_CENTER);
		
		display.textProperty().set(display.textProperty().get());
		
		
		root.getChildren().addAll(Gridpane(display), display);
		
		Scene scene = new Scene(root, 300, 300);
			
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}

	@Override
	public void handle(ActionEvent event) {
		if(event.getSource()=="1") {
			
		}
		
	}	
	
	public static Pane Gridpane(TextField display) {
		GridPane numpad = new GridPane();
		
		String [] numpadKeys = {"1", "2", "3","+",
								"4", "5", "6","-",
								"7", "8", "9","*",
								"0", "/"
								};
		for (int i = 0; i < numpadKeys.length; i++) {
			
			String keyText = numpadKeys[i];
			
			Button temp = new Button(numpadKeys[i]);
			
			temp.setOnAction( ElidedFormalParameter -> {
				display.textProperty().set(display.textProperty().get() + keyText);
				
			});
			numpad.add(temp, i % 4, (int) Math.ceil(i/4));
			
		}
		return numpad;
	}
	
}
