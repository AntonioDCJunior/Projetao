package br.unipe.cc.gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaCadastro extends TelaMenu {

	public static void main(String[] args) {		
		launch(args);
	}
	
	public void start(final Stage stage) throws Exception {	
		
		Label label1 = new Label("Numero da conta: ");
		Label label2 = new Label("Nome: ");
		
		TextField textfield1 = new TextField(); 
		TextField textfield2 = new TextField();
		
		Button comfirmar = new Button("Comfirmar");
		Button voltar = new Button("Voltar");
		comfirmar.setMinWidth(120);
		voltar.setMinWidth(120);		
			
		
		HBox hb = new HBox();
		hb.setAlignment(Pos.CENTER);
		hb.getChildren().addAll(label1,textfield1,label2,textfield2);
			
		VBox vb = new VBox();
		vb.setStyle("-fx-background-color: white");
		vb.setAlignment(Pos.CENTER);		
		vb.getChildren().addAll(hb,comfirmar,voltar);
		
		//comfirmar
		
		//voltar
		    voltar.setOnAction(new EventHandler<ActionEvent>() {
	        	public void handle(ActionEvent event){
	        		TelaMenu tm = new TelaMenu();
	        		try {
						tm.start(stage);
					} catch (Exception e) {
						e.printStackTrace();
					}
	        	}
	    	});
	    	
		    
		
		Scene sc = new Scene(vb,500,200);
		stage.setTitle("Cadastrar Conta");	
		stage.getIcons().add(new Image("/imagem/LogoBancoIconeJava.jpg"));
		stage.setScene(sc);
	    stage.show();		
		}	
			
}
