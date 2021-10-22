/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.masters.test;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Mortadha
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("dev/masters/gui/gestionMoyenTransport.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    /*
      @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    
    }
    
}
