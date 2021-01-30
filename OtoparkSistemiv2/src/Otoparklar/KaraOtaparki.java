package Otoparklar;

import Tasitlar.Deniz.DenizAraci;
import Tasitlar.Kara.*;
import javafx.scene.control.TextArea;
import sample.DosyaIslemleri;

import java.util.LinkedList;
import java.util.Random;

public class KaraOtaparki extends yazdirma{
    KaraAraci referansArac;
    DosyaIslemleri d=new DosyaIslemleri();
    private Boolean var_mi,arackontrol;
    protected LinkedList<KaraAraci> karaAracOtoparkListesi ;

    public KaraOtaparki() {
        karaAracOtoparkListesi = new LinkedList<KaraAraci>();
    }

    public void ekle(String isim, String renk, String cinsi, String soyisim, String plaka, String model,TextArea Tx) {
        if(cinsi.equals("kamyon")||cinsi.equals("Kamyon")){
             referansArac = new Kamyon(isim, renk, soyisim, plaka, model);
        }else if(cinsi.equals("motorsiklet")||cinsi.equals("Motorsiklet")){
             referansArac = new Motorsiklet(isim, renk, soyisim, plaka, model);
        }else if(cinsi.equals("otomobil")||cinsi.equals("Otomobil")){
             referansArac = new Otomobil(isim, renk, soyisim, plaka, model);
        }else if(cinsi.equals("suv")||cinsi.equals("Suv")){
             referansArac = new Suv( isim, renk, soyisim, plaka, model);
        }else{
            Tx.setText("Bu cinste bir araç giremezsiniz !");
            return;
        }
        Tx.setText("Arac Eklendi");
        referansArac.setId(idSetter());
        karaAracOtoparkListesi.add(referansArac);
    }

    public void okulisteyekle(){
       karaAracOtoparkListesi = d.karaoku(karaAracOtoparkListesi,"dosyalar/kara.txt");
    }
    public void listedendosyayayaz(){
        d.karayaz(karaAracOtoparkListesi,"dosyalar/kara.txt");
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
        for (int i = 0; i <karaAracOtoparkListesi.size() ; i++) {
            if(karaAracOtoparkListesi.get(i).getId()==id){
                sorgu_id=true;
            }
        }
        return sorgu_id;
    }
    public void yazdirma(TextArea Tx){
        if(karaAracOtoparkListesi.size()==0){
            Tx.setText("Otopark Boş");
        }else {
        yazdirma(new LinkedList<DenizAraci>(),Tx);}

    }
    @Override
    public void yazdirma(LinkedList<DenizAraci> d,TextArea Tx) {
        Tx.setText("");
        for(int i=0;i<karaAracOtoparkListesi.size();i++){

            Tx.appendText("\n--------------------------------");
            Tx.appendText("\nisim = "+karaAracOtoparkListesi.get(i).getIsim());
            Tx.appendText("\nsoyisim = "+karaAracOtoparkListesi.get(i).getSoyisim());
            Tx.appendText("\nrenk = "+karaAracOtoparkListesi.get(i).getRenk());
            Tx.appendText("\nid = "+karaAracOtoparkListesi.get(i).getId());
            Tx.appendText("\nplaka = "+karaAracOtoparkListesi.get(i).getPlaka());
            Tx.appendText("\nmodeli = "+karaAracOtoparkListesi.get(i).getModel());
            Tx.appendText("\n5TL");
        }
    }
    public int getId(){
       return karaAracOtoparkListesi.get(1).getId();
    }
    public void sil(int id,TextArea Ta){
        arackontrol=false;
        if(karaAracOtoparkListesi.size()!=0){
        for (int i = 0; i <karaAracOtoparkListesi.size() ; i++) {
            if(karaAracOtoparkListesi.get(i).getId()==id){
                karaAracOtoparkListesi.remove(i);
                arackontrol=true;
                i=karaAracOtoparkListesi.size();
            }
        }
            if(arackontrol==true){
                Ta.setText("Araç Silindi.");
            }else{
                Ta.setText("Bu İdye Sahip Araç Otoparkta Bulunmamaktadır !");
            }

    }else {
        Ta.setText("Otopark Boş");
        }
    }


}
