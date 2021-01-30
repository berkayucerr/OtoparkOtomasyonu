package sample.arayuzler;


import Otoparklar.DenizOtaparki;
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

public class DenizOtoparkiController implements Initializable {

    @FXML
    public TextField isim;
    @FXML
    public TextField soyisim;
    @FXML
    public TextField cins;
    @FXML
    public TextField model;
    @FXML
    public TextField renk;
    @FXML
    public TextField baglamakutugu;
    @FXML
    public Button kaydet;
    @FXML
    public Button geri;
    @FXML
    public Button denizsorgubutonu;
    @FXML
    public TextArea TA;
    @FXML
    private Button kayitsil;
    @FXML
    int id;
    @FXML
    private TextField kayitno;

    private String silmekontrolu,i, s, c, m, r,bk;


    public DenizOtoparkiController() {
        dn.okulisteyekle();
    }

    DenizOtaparki dn = new DenizOtaparki();

    @FXML
    public void DenizAraciKaydet(ActionEvent e) throws IOException {
        i= isim.getText();
        s= soyisim.getText();
        c= cins.getText();
        m= model.getText();
        r= renk.getText();
        bk= baglamakutugu.getText();
        dn.ekle(i,r,s,c,m,bk,TA);
    }
    @FXML
    public void denizsorgula(ActionEvent e)throws IOException{
        dn.yazdirma(TA);
    }

    @FXML
    public void gerial (ActionEvent e) throws IOException {
        dn.listedendosyayayaz();
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
            this.TA.setText("Lutfen İD girin !");
        }
        else{
            id = Integer.parseInt(silmekontrolu);
            dn.sil(id, TA);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

}



