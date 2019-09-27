package antackningar;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class knappar extends Application implements EventHandler<ActionEvent>{
	
	
	Button knappen;
	/*
	 * Nu kan den nås i HELA documentet
	 */
	
	public static void main(String[] args) {
		launch();
	}
	
		@Override
		public void start(Stage primaryStage) throws Exception {
			
			knappen = new Button("Ok!");
			knappen.setMinHeight(30);
			knappen.setMinWidth(30);
			knappen.setOnAction(this);
			/*knappen.setText("hoho");
			* båda lägger till en text på knappen
			* storleken på knappen knappen.setMinWidth(30)
			*/
			
			Group root = new Group();
			
			root.getChildren().addAll(knappen);
			/*
			 * lägger till objekt i gruppen
			 */
			
			Scene scene = new Scene(root, 300, 300);
			
			/*
			 * lägger till gruppen i scenen
			 * 300 300 är storleken horisontelt och vertikalt
			 */
			
			primaryStage.setScene(scene);
			
			primaryStage.show();
			
			
		}

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			if(event.getSource() == knappen ) {
				System.out.println("naaajs");
			}
			
		}

	
}
