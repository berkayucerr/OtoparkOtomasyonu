package sample.arayuzler;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.security.PublicKey;
import java.util.ResourceBundle;

public class OtoparkSecimi  implements Initializable {
    @FXML
    public Button havaotoparki;
    @FXML
    public Button denizotoparki;
    @FXML
    public Button karaotoparki;
    @FXML
    public Button uzayotoparki;
    @FXML
    public Button Geri;


    @FXML
    public void enterhavaotoparki (ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("HavaOtoparki.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }
    @FXML
    public void enterdenizotoparki (ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("DenizOtaparki.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }
    @FXML
    public void enterkaraotoparki (ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("KaraOtoparki.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();



    }
    @FXML
    public void enteruzayotoparki (ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("UzayOtaparki.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();



    }
    @FXML
    public void Gerial (ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("UI.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }



}
