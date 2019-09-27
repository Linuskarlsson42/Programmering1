package Miniraknare;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class NumberPad extends Application{
	Button ett;
	Button tva;
	Button tre;
	Button fyra;
	Button fem;
	Button sex;
	Button sju;
	Button atta;
	Button nio;
	Button noll;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		ett = new Button("1");
		tva = new Button("2");
		tre = new Button("3");
		fyra = new Button("4");
		fem = new Button("5");
		sex = new Button("6");
		sju = new Button("7");
		atta = new Button("8");
		nio = new Button("9");
		noll = new Button("0");
		
		
	}

}
