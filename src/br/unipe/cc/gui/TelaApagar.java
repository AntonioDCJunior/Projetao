package br.unipe.cc.gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaApagar extends TelaMenu{
	
	public static void main(String[] args) {		
		launch(args);
	}
	
	public void start(final Stage stage) throws Exception {
        Label label1 = new Label("Tabela com as contas cadastradas e a opcao deletar");
		
		Button voltar = new Button("voltar");
		
		voltar.setMinWidth(120);
		
		Pane root = new Pane();
		
		root.setPrefSize(500,200);		
		
		HBox hb = new HBox();
		hb.setAlignment(Pos.CENTER);
		
		VBox vb = new VBox();
		vb.setAlignment(Pos.CENTER);
		vb.getChildren().addAll(label1,hb,voltar);
		
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
	    	
		    root.getChildren().addAll(vb,hb);  
		
		Scene sc = new Scene(root,500,200);
		stage.setTitle("Apagar Conta");	
		stage.getIcons().add(new Image("/imagem/LogoBancoIconeJava.jpg"));
		stage.setScene(sc);
	    stage.show();		
		}	
		
	

}
