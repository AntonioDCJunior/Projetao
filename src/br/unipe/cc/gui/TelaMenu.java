package br.unipe.cc.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaMenu extends Application{		
		
	public static void main(String[] args) {		
		launch(args);
	}
	
	public void start(final Stage stage) throws Exception {
		
		Image img = new Image(getClass().getResourceAsStream("/imagem/LogoBancoJava.jpg"),650,325,true,true);
		ImageView imgView = new ImageView(img);			

		Button cadastro = new Button("Cadastrar");
		Button atualizar = new Button("Atualizar");
		Button contascadastradas = new Button("Contas Cadastradas");
		Button apagar = new Button("Apagar");	
		Button sair = new Button("Sair");
		
		cadastro.setMinWidth(120);
		atualizar.setMinWidth(120);
		contascadastradas.setMinWidth(120);
		apagar.setMinWidth(120);	
		sair.setMinWidth(120);
		
		Pane root = new Pane();
		root.setPrefSize(650, 325);		
		
		HBox hbox1 = new HBox();		
		hbox1.setAlignment(Pos.CENTER);	
		hbox1.getChildren().addAll(cadastro,atualizar,contascadastradas,apagar,sair);
		
		VBox vbox1 = new VBox();		
		vbox1.setStyle("-fx-background-color: white");
		vbox1.setAlignment(Pos.CENTER);	
		vbox1.getChildren().addAll(hbox1);	
		
		//Atualizar
		
		    atualizar.setOnAction(new EventHandler<ActionEvent>() {            	 
				public void handle(ActionEvent event) {
					 TelaAtualizar ta = new TelaAtualizar();  
					  try {
						ta.start(stage);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
		    });
	
		    
		// Cadastrar
              cadastro.setOnAction(new EventHandler<ActionEvent>() {            	 
				public void handle(ActionEvent event) {
					 TelaCadastro tc = new TelaCadastro();
           		     try {
						tc.start(stage);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		
		// Contas Cadastradas
		        contascadastradas.setOnAction(new EventHandler<ActionEvent>() {
		        	public void handle(ActionEvent event){
		        		TelaContasCadastradas cc = new TelaContasCadastradas();	  
		        		try {
							cc.start(stage);
						} catch (Exception e) {
							e.printStackTrace();
						}
		        	}
				});
		        
		//Apagar
		        apagar.setOnAction(new EventHandler<ActionEvent>() {
		        	public void handle(ActionEvent event){
		        		TelaApagar ta = new TelaApagar();
		        		try {
							ta.start(stage);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		        	}
				});
		        
		
		// Sair
				sair.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event){
						 System.exit(0);	
					}			
				});
		
	    root.getChildren().addAll(imgView,vbox1,hbox1);    
	    
		
	Scene sc = new Scene(root,605,325);
	stage.setTitle("Menu");	
	stage.getIcons().add(new Image("/imagem/LogoBancoIconeJava.jpg"));
	stage.setScene(sc);
    stage.show();		
	}	
  
}
