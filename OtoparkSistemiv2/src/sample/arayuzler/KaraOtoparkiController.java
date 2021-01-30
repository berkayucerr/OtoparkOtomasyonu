package sample.arayuzler;


import Otoparklar.DenizOtaparki;
import Otoparklar.KaraOtaparki;
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

public class KaraOtoparkiController implements Initializable {

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
            public TextField plaka;
    @FXML
            public Button kaydet;
    @FXML
            public Button geri;
    @FXML
            public Button karasorgubutonu;
    @FXML
            public TextArea Tx;
    @FXML
    private Button kayitsil;

    @FXML
    int id;
    @FXML
    private TextField kayitno;

    private String silmekontrolu,i, s, c, m, r,pk;

    public KaraOtoparkiController() {
        kr.okulisteyekle();
    }

    KaraOtaparki kr = new KaraOtaparki();
    @FXML
    public void KaraAraciKaydet(ActionEvent e) throws IOException {
        i= isim.getText();
        r= renk.getText();
        c= cins.getText();
        s= soyisim.getText();
        pk= plaka.getText();
        m= model.getText();
        kr.ekle(i,r,c,s,pk,m,Tx);


    }
    @FXML
    public void KaraAraciSorgula(ActionEvent e)throws IOException{
        kr.yazdirma(Tx);
    }
    public void gerial (ActionEvent e) throws IOException {
        kr.listedendosyayayaz();
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
            kr.sil(id, Tx);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}

