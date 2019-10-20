package Miniraknare;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * n�r jag trycker p� en knapp ska den anropa tangent classen, kolla vilken knapp det var jag tryckte (1, 2,
 * +,- etc) och k�ra relevant metod och skicka tillbaka informationen tillbaka till sk�rm och skriva ut
 * i relevant f�lt.
 */


public class Skarm extends Application implements EventHandler<ActionEvent>{
	
	

	public static void main(String[] args) {
		launch();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		//Group root = new Group();
		
		BorderPane root = new BorderPane();
		
		VBox Dfield = new VBox();
		
		TextField input = new TextField();
		
		TextField output = new TextField();
		
		Dfield.getChildren().addAll(input, output);
		
		input.textProperty().set(input.textProperty().get());
		
		GridPane numpad = new GridPane();
		
		/*
		 * kod f�r numpad, skapar en numpad med sifrorna 0-9 och de fyra vanligaste r�knest�tten
		 * 
		 */
		
		String [] numpadKeys = {"1", "2", "3"," + ",
								"4", "5", "6"," - ",
								"7", "8", "9"," * ",
								"0", " / ", " = ", " c ",
								"."
								};
		for (int i = 0; i < numpadKeys.length; i++) {
			
			String keyText = numpadKeys[i];
			
			Button temp = new Button(numpadKeys[i]);
			
			temp.setPrefSize(50, 50);
			
			temp.setOnAction( ElidedFormalParameter -> {
		
				//kollar om man trycker p� c, clearar input n�r man g�r s�
				
				if (temp.textProperty().get()==" c ") {
					input.clear();
				}
				
				else if(temp.textProperty().get() == " = "){
					Eq.Calc(input);
				}
				
				else {
					input.textProperty().set(input.textProperty().get() + keyText);
				}
			});
			numpad.add(temp, i % 4, (int) Math.ceil(i/4));
			
		}
		
		root.setTop(input);
		root.setBottom(numpad);
		root.setCenter(output);
		
		
		//BP.getChildren().addAll(numpad , display);
		
		Scene scene = new Scene(root, 300, 300);

		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}

	@Override
	public void handle(ActionEvent event) {
		if(event.getSource()=="1") {
			
		}
		
	}	

	
	
	
}
