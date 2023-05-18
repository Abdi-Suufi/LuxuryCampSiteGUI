/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luxurycampsitegui;

/**
 *
 * @author abdis
 */


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.image.Image;

public class campsiteGUIMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(campsiteGUIMain.class.getResource("campsiteGUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1237, 825);
        stage.setTitle("Luxury Camp Site System");
        
        Image bgimg = new Image("LuxuryCampSiteGUI/gui_image.png");
        stage.getIcons().add(bgimg);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}