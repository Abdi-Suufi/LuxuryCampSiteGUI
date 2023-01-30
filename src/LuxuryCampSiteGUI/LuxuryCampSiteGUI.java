/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package luxurycampsitegui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

/**
 *
 * @author abdis
 */
public class LuxuryCampSiteGUI extends Application {

    @Override
    public void start(Stage campsitegui) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LuxuryCampSiteGUI.fxml"));
        campsitegui.getIcons().add(new Image(LuxuryCampSiteGUI.class.getResourceAsStream("campsiteimg.png")));
        campsitegui.setTitle("LuxuryCampSiteSystem");
        Scene scene = new Scene(root);

        campsitegui.setScene(scene);
        campsitegui.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
    }

}