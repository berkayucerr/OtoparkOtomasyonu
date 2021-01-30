package sample.arayuzler;

import Otoparklar.DenizOtaparki;
import Otoparklar.HavaTasitiOtaparki;
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
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;

public class HavaOtoparkiController implements Initializable {

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
    public TextField seri_no;
    @FXML
    public Button kaydet;
    @FXML
    public Button geri;
    @FXML
    public Button havasorgu;
    @FXML
    public TextArea Tx;
    @FXML
    private Button kayitsil;
    @FXML
    int id;
    @FXML
    private TextField kayitno;

    private String silmekontrolu,i, s, c, m, r,sn;

    public HavaOtoparkiController() {
        hv.okulisteyekle();
    }

    HavaTasitiOtaparki hv = new HavaTasitiOtaparki();
    @FXML
    public void HavaAraciKaydet(ActionEvent e) throws IOException {

       i= isim.getText();
       r= renk.getText();
       s= soyisim.getText();
       c= cins.getText();
       m= model.getText();
       sn= seri_no.getText();
       hv.ekle(i,r,s,c,m,sn,Tx);

    }
    @FXML
    public void havaAraciSorgula(ActionEvent e)throws IOException{
        hv.yazdirma(Tx);
    }
    @FXML
    public void gerial (ActionEvent e) throws IOException {
        hv.listedendosyayayaz();
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
            hv.sil(id, Tx);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
