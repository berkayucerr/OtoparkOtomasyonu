package sample.arayuzler;

import Otoparklar.DenizOtaparki;
import Otoparklar.VIPUzayOtoparki;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;

public class UzayOtoparkiController implements Initializable {

    @FXML
    public TextField isim;
    @FXML
    public TextField renk;
    @FXML
    public TextField cins;
    @FXML
    public TextField gezegen;
    @FXML
    public TextField aracelement;
    @FXML
    public TextField uzaylikimlikno;
    @FXML
    public Button kaydet;
    @FXML
    public Button geri;
    @FXML
            public Button uzaysorgu;
    @FXML
    public TextArea Tx;
    @FXML
    private Button kayitsil;
    @FXML
    int id;
    @FXML
    private TextField kayitno;

    private String silmekontrolu,i, r, c, g, a,uk;

    VIPUzayOtoparki vu = new VIPUzayOtoparki();

    public UzayOtoparkiController() {
        vu.okulisteyekle();
    }

    @FXML
    public void UzayAraciKaydet(ActionEvent e) throws IOException {
        i= isim.getText();
        r= renk.getText();
        c= cins.getText();
        g= gezegen.getText();
        a= aracelement.getText();
        uk= uzaylikimlikno.getText();
        vu.ekle(i,r,c,g,a,uk,Tx);


    }
    @FXML
    public void uzayAraciSorgula(ActionEvent e)throws IOException{
        vu.yazdirma(Tx);
    }
    @FXML
    public void gerial (ActionEvent e) throws IOException {
        vu.listedendosyayayaz();
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("OtoparkSecimi.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((javafx.scene.Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    @FXML
    public  void Kaydisil(ActionEvent e) throws IOException{
        silmekontrolu=kayitno.getText();
        if(silmekontrolu.equals("")) {
            this.Tx.setText("Lutfen İD girin !");
        }
        else{
            id = Integer.parseInt(silmekontrolu);
            vu.sil(id, Tx);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

}



