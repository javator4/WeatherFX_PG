package pl.sda.weather;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class App extends Application {
    public static void main( String[] args )
    {
    launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/root.fxml"));
        //wersja przejrzysta
        //Scene scene = new Scene(root);
        //primaryStage.setScene(scene);

        //wersja skrócona
        primaryStage.setScene(new Scene(root, 600, 300));
      //  primaryStage.setResizable(false);
//        primaryStage.close();
//        primaryStage.getStyle()
       //primaryStage.getTitle();
//        primaryStage.initStyle();
        //  primaryStage.getModality();
      // primaryStage.setFullScreen(true);
       // primaryStage.initStyle(StageStyle.UNDECORATED);
       // primaryStage.centerOnScreen();
       // primaryStage.setOpacity(0.7);
//        primaryStage.getClass();
        primaryStage.show();


    }
}
