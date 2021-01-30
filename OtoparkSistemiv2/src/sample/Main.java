package sample;
import Otoparklar.DenizOtaparki;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("arayuzler/UI.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("Otopark Yonetim Sistemi");
        primaryStage.setScene(new Scene(root, 550, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}


