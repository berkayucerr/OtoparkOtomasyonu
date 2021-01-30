package Otoparklar;

import Tasitlar.Deniz.DenizAraci;
import Tasitlar.Uzay.*;
import javafx.scene.control.TextArea;
import sample.DosyaIslemleri;

import java.util.LinkedList;
import java.util.Random;

public class VIPUzayOtoparki extends yazdirma{
    UzayAraci referansArac;
    private Boolean var_mi,arackontrol;

    DosyaIslemleri d = new DosyaIslemleri();
    protected LinkedList<UzayAraci> uzayAracOtoparkListesi;

    public VIPUzayOtoparki() {
        uzayAracOtoparkListesi = new LinkedList<UzayAraci>();
    }

    public void ekle(String isim, String renk, String cinsi, String gezegen, String aracElementi, String evrenselUzaylıKimlikNumarasi,TextArea Tx) {
        if(cinsi.equals("falcon")||cinsi.equals("Falcon")){
             referansArac = new Falcon(isim, renk, gezegen, aracElementi, evrenselUzaylıKimlikNumarasi);
        }else if(cinsi.equals("ufo")||cinsi.equals("Ufo")){
             referansArac = new Ufo(isim, renk, gezegen, aracElementi, evrenselUzaylıKimlikNumarasi);
        }else if(cinsi.equals("uzaymekiği")||cinsi.equals("Uzaymekiği")){
             referansArac = new UzayMekigi(isim, renk, gezegen, aracElementi, evrenselUzaylıKimlikNumarasi);
        }else{
            Tx.setText("Bu cinste bir araç giremezsiniz !");
            return;
        }
        Tx.setText("Arac Eklendi");
        referansArac.setId(idSetter());
        uzayAracOtoparkListesi.add(referansArac);
    }
    public void okulisteyekle(){

        d.uzayoku(uzayAracOtoparkListesi, "dosyalar/uzay.txt");
    }
    public void listedendosyayayaz(){
        d.uzayyaz(uzayAracOtoparkListesi, "dosyalar/uzay.txt");
    }

    private int idSetter(){
        int id = new Random().nextInt(987654);
        var_mi=id_sorgu(id);
        if(var_mi==true){
            id=idSetter();
        }
        return id;
    }
    private Boolean id_sorgu(int id){
        Boolean sorgu_id=false;
        for (int i = 0; i <uzayAracOtoparkListesi.size() ; i++) {
            if(uzayAracOtoparkListesi.get(i).getId()==id){
                sorgu_id=true;
            }
        }
        return sorgu_id;
    }
    public void yazdirma(TextArea Tx){
        if(uzayAracOtoparkListesi.size()==0){
            Tx.setText("Otopark Boş");
        }else {
            yazdirma(new LinkedList<DenizAraci>(), Tx);
        }
    }
    @Override
    public void yazdirma(LinkedList<DenizAraci> d, TextArea Tx) {
        Tx.setText("");
        for(int i=0;i<uzayAracOtoparkListesi.size();i++){
            Tx.appendText("\n--------------------------------");
            Tx.appendText("\nisim = "+uzayAracOtoparkListesi.get(i).getIsim());
            Tx.appendText("\nrenk = "+uzayAracOtoparkListesi.get(i).getRenk());
            Tx.appendText("\nid = "+uzayAracOtoparkListesi.get(i).getId());
            Tx.appendText("\ngezegen = "+uzayAracOtoparkListesi.get(i).getGezegen());
            Tx.appendText("\nEvrensel uzaylı kimik numarası = "+uzayAracOtoparkListesi.get(i).getEvrenselUzaylıKimlikNumarasi());
            Tx.appendText("\narac elementi = "+uzayAracOtoparkListesi.get(i).getAracElementi());
            Tx.appendText("\n300 UP");
        }
    }
    
    public void sil(int id,TextArea Ta) {
        arackontrol=false;
        if (uzayAracOtoparkListesi.size() != 0) {
            for (int i = 0; i < uzayAracOtoparkListesi.size(); i++) {
                if (uzayAracOtoparkListesi.get(i).getId() == id) {
                    uzayAracOtoparkListesi.remove(i);
                    arackontrol=true;
                    i = uzayAracOtoparkListesi.size();
                }
            }
            if(arackontrol==true){
                Ta.setText("Araç Silindi.");
            }else{
                Ta.setText("Bu İdye Sahip Araç Otoparkta Bulunmamaktadır !");
            }
        } else {
            Ta.setText("Otopark Boş");
        }
    }
}