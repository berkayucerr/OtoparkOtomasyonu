package Otoparklar;

import Tasitlar.Deniz.DenizAraci;
import Tasitlar.Hava.*;
import javafx.scene.control.TextArea;
import sample.DosyaIslemleri;

import java.util.LinkedList;
import java.util.Random;

public class HavaTasitiOtaparki extends yazdirma{
    HavaAraci referansArac;
    private Boolean var_mi,arackontrol;
    DosyaIslemleri d=new DosyaIslemleri();
    protected LinkedList<HavaAraci> havaAracOtoparkListesi ;
    public HavaTasitiOtaparki() {
        havaAracOtoparkListesi = new LinkedList<HavaAraci>();

    }

    public void ekle(String isim, String renk, String soyisim, String cinsi, String model, String seriNo,TextArea Tx) {
        if(cinsi.equals("drone")||cinsi.equals("Drone")){
             referansArac = new Drone(isim, renk, soyisim, model, seriNo);
        }else if(cinsi.equals("helikopter")||cinsi.equals("Helikopter")){
             referansArac = new Helikopter(isim, renk, soyisim, model, seriNo);
        }else if(cinsi.equals("iha")||cinsi.equals("İha")){
             referansArac = new İha(isim, renk, soyisim, model, seriNo);
        }else if(cinsi.equals("ucak")||cinsi.equals("Ucak")){
             referansArac= new Ucak(isim, renk, soyisim, model, seriNo);
        }else{
            Tx.setText("Bu cinste bir araç giremezsiniz !");
            return;
        }
        Tx.setText("Arac Eklendi");
        referansArac.setId(idSetter());
        havaAracOtoparkListesi.add(referansArac);
    }
    public void okulisteyekle(){

        d.havaoku(havaAracOtoparkListesi,"dosyalar/hava.txt");
    }
    public void listedendosyayayaz(){
        d.havayaz(havaAracOtoparkListesi,"dosyalar/hava.txt");
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
        for (int i = 0; i <havaAracOtoparkListesi.size() ; i++) {
            if(havaAracOtoparkListesi.get(i).getId()==id){
                sorgu_id=true;
            }
        }
        return sorgu_id;
    }
    public void yazdirma(TextArea Tx){
        if(havaAracOtoparkListesi.size()==0){
            Tx.setText("Otopark Boş");
        }else {
            yazdirma(new LinkedList<DenizAraci>(), Tx);
        }
    }
    @Override
    public void yazdirma(LinkedList<DenizAraci> d, TextArea Tx) {
        Tx.setText("");
        for(int i=0;i<havaAracOtoparkListesi.size();i++){
            Tx.appendText("\n--------------------------------");
            Tx.appendText("\nisim = "+havaAracOtoparkListesi.get(i).getIsim());
            Tx.appendText("\nsoyisim= "+havaAracOtoparkListesi.get(i).getSoyisim());
            Tx.appendText("\nrenk = "+havaAracOtoparkListesi.get(i).getRenk());
            Tx.appendText("\nmodel = "+havaAracOtoparkListesi.get(i).getModel());
            Tx.appendText("\nseri no = "+havaAracOtoparkListesi.get(i).getSeriNo());
            Tx.appendText("\nid = "+havaAracOtoparkListesi.get(i).getId());
            Tx.appendText("\n15TL");

        }
    }
    public void sil(int id,TextArea Ta){
        arackontrol=false;
        if(havaAracOtoparkListesi.size()!=0) {
            for (int i = 0; i < havaAracOtoparkListesi.size(); i++) {
                if (havaAracOtoparkListesi.get(i).getId() == id) {
                    havaAracOtoparkListesi.remove(i);
                    arackontrol=true;
                    i = havaAracOtoparkListesi.size();
                }
            }
            if(arackontrol==true){
                Ta.setText("Araç Silindi.");
            }else{
                Ta.setText("Bu İdye Sahip Araç Otoparkta Bulunmamaktadır !");
            }

        }else{
            Ta.setText("Otopark Boş");
        }
    }
}

