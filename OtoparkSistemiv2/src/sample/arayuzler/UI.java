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
import java.util.ResourceBundle;

public class UI implements Initializable {

    @FXML
    public Button girenarac;
    @FXML
    public Button cikis;

    @FXML
    public void entergirenarac (ActionEvent e) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("OtoparkSecimi.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

}
    @FXML
    private void kapat(ActionEvent a) {
        Node source = (Node) a.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
