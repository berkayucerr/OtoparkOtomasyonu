package Otoparklar;

import Tasitlar.Deniz.*;
import com.sun.jnlp.ApiDialog;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import sample.DosyaIslemleri;

import java.util.LinkedList;
import java.util.Random;

public class DenizOtaparki extends yazdirma {
    DenizAraci referansArac;
    private Boolean var_mi,arackontrol;
    DosyaIslemleri d = new DosyaIslemleri();
    protected LinkedList<DenizAraci> denizAracOtoparkListesi;

    public DenizOtaparki() {
        denizAracOtoparkListesi = new LinkedList<DenizAraci>();
    }

    public void ekle(String isim, String renk, String soyisim, String cinsi, String baglamaKutugu, String baglamaKutuguNumarasi,TextArea Tx) {
        if (cinsi.equals("gemi") || cinsi.equals("Gemi")) {
            referansArac = new Gemi(isim, renk, soyisim, baglamaKutugu, baglamaKutuguNumarasi);
        } else if (cinsi.equals("kano") || cinsi.equals("Kano")) {
            referansArac = new Kano(isim, renk, soyisim, baglamaKutugu, baglamaKutuguNumarasi);
        } else if (cinsi.equals("katamaran") || cinsi.equals("Katamaran")) {
            referansArac = new Katamaran(isim, renk, soyisim, baglamaKutugu, baglamaKutuguNumarasi);
        } else if (cinsi.equals("tekne") || cinsi.equals("Tekne")) {
            referansArac = new Tekne(isim, renk, soyisim, baglamaKutugu, baglamaKutuguNumarasi);
        } else if (cinsi.equals("yat") || cinsi.equals("Yat")) {
            referansArac = new Yat(isim, renk, soyisim, baglamaKutugu, baglamaKutuguNumarasi);
        } else if (cinsi.equals("yelkenli") | cinsi.equals("Yelkenli")) {
            referansArac = new Yelkenli(isim, renk, soyisim, baglamaKutugu, baglamaKutuguNumarasi);
        }
        else{
            Tx.setText("Bu cinste bir araç giremezsiniz !");
            return;
        }
        Tx.setText("Arac Eklendi");
        referansArac.setId(idSetter());
        denizAracOtoparkListesi.add(referansArac);
    }

    public void yazdirma(TextArea Tx) {
        if (denizAracOtoparkListesi.size() == 0) {
            Tx.setText("Otopark Boş");
        } else {
            yazdirma(denizAracOtoparkListesi, Tx);
        }
    }



    public void okulisteyekle() {

        d.denizoku(denizAracOtoparkListesi, "dosyalar/deniz.txt");
    }

    public void listedendosyayayaz() {
        d.denizyaz(denizAracOtoparkListesi, "dosyalar/deniz.txt");
    }

    private int idSetter() {
        int id = new Random().nextInt(987654);
        var_mi = id_sorgu(id);
        if (var_mi == true) {
            id = idSetter();
        }
        return id;
    }

    private Boolean id_sorgu(int id) {
        Boolean sorgu_id = false;
        for (int i = 0; i < denizAracOtoparkListesi.size(); i++) {
            if (denizAracOtoparkListesi.get(i).getId() == id) {
                sorgu_id = true;
            }
        }
        return sorgu_id;
    }

    public void sil(int id, TextArea Ta) {
        arackontrol=false;
        if (denizAracOtoparkListesi.size() != 0) {
            for (int i = 0; i < denizAracOtoparkListesi.size(); i++) {
                if (denizAracOtoparkListesi.get(i).getId() == id) {
                    denizAracOtoparkListesi.remove(i);
                    arackontrol=true;
                    i = denizAracOtoparkListesi.size();
                }
            }
            if(arackontrol==true){
                Ta.setText("Araç Silindi.");
            }else{
                Ta.setText("Bu İdye Sahip Araç Otoparkta Bulunmamaktadır !");
            }

        }
        else{
            Ta.setText("Otopark Boş");
        }
    }
}
