package Miniraknare;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class NumberPad extends Application implements EventHandler<ActionEvent>{
	static Button ett;
	static Button tva;
	static Button tre;
	static Button fyra;
	static Button fem;
	static Button sex;
	static Button sju;
	static Button atta;
	static Button nio;
	static Button noll;
	
	public void k() {
		ett = new Button("1");
		ett.setMinHeight(30);
		ett.setMinWidth(30);
		
		tva = new Button("2");
		tva.setMinHeight(30);
		tva.setMinWidth(30);
		
		tre = new Button("3");
		tre.setMinHeight(30);
		tre.setMinWidth(30);
		
		fyra = new Button("4");
		fyra.setMinHeight(30);
		fyra.setMinWidth(30);
		
		fem = new Button("5");
		fem.setMinHeight(30);
		fem.setMinWidth(30);
		
		sex = new Button("6");
		sex.setMinHeight(30);
		sex.setMinWidth(30);
		
		sju = new Button("7");
		sju.setMinHeight(30);
		sju.setMinWidth(30);
		
		atta = new Button("8");
		atta.setMinHeight(30);
		atta.setMinWidth(30);
		
		nio = new Button("9");
		nio.setMinHeight(30);
		nio.setMinWidth(30);
		
		noll = new Button("0");
		noll.setMinHeight(30);
		noll.setMinWidth(30);
		
				
	}
	
	



	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void handle(ActionEvent Event) {
		// TODO Auto-generated method stub
		if(Event.getSource() == ett) {
			System.out.println("1");
		}
		if(Event.getSource() == tva) {
			System.out.println("2");
		}
		if(Event.getSource() == tre) {
			System.out.println("3");
		}
		if(Event.getSource() == fyra) {
			System.out.println("4");
		}
		if(Event.getSource() == fem) {
			System.out.println("5");
		}
		if(Event.getSource() == sex) {
			System.out.println("6");
		}
		if(Event.getSource() == sju) {
			System.out.println("7");
		}
		if(Event.getSource() == atta) {
			System.out.println("8");
		}
		if(Event.getSource() == nio) {
			System.out.println("9");
		}
		if(Event.getSource() == noll) {
			System.out.println("0");
		}
	}

}
