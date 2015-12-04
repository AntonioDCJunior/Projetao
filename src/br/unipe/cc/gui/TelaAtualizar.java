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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaAtualizar extends TelaMenu{

	public static void main(String[] args) {		
		launch(args);
	}

public void start(final Stage stage) throws Exception {	
			
		Label label1 = new Label("Debitar: ");
		Label label2 = new Label("Creditar: ");
		Label label3 = new Label("'Opção de busca ou selecionar conta no banco de dados'");
		
		TextField textfield1 = new TextField(); 
		TextField textfield2 = new TextField();
		
		Button comfirmar = new Button("Comfirmar");
		Button voltar = new Button("Voltar");
		comfirmar.setMinWidth(120);
		voltar.setMinWidth(120);		
			
		
		HBox hb1 = new HBox();
		hb1.setAlignment(Pos.CENTER);
		hb1.getChildren().addAll(label1,textfield1);
		
		HBox hb2 = new HBox();
		hb2.setAlignment(Pos.CENTER);
		hb2.getChildren().addAll(label2,textfield2);
		
		VBox vb = new VBox();
		vb.setStyle("-fx-background-color: white");
		vb.setAlignment(Pos.CENTER);		
		vb.getChildren().addAll(label3,hb1,hb2,comfirmar,voltar);
		
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
		stage.setTitle("Atualizar Conta");	
		stage.getIcons().add(new Image("/imagem/LogoBancoIconeJava.jpg"));
		stage.setScene(sc);
	    stage.show();		
		}	
			
}

