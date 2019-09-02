package FX;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class layout_test extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane root = new BorderPane();
		
		HBox bottom = new HBox();
		
		Button exitButton = new Button("exit");
		
		//VBox root = new VBox();
		
		//for (int i = 0; i < 10; i++) {
		
		//Label text = new Label("sug min röv HåRT");
		
		//root.getChildren().addAll(text);
		
		//}
		
		Scene scene = new Scene(root, 500, 500);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}

	public static void main(String[] args) {
		launch();
	}
	
}
