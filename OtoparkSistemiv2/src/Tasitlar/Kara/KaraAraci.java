package Tasitlar.Kara;

import sample.OrtakOzellik.AracOrtakOzellik;


public class KaraAraci extends AracOrtakOzellik {
    private String soyisim,plaka,model;
    private int id;
    public KaraAraci( String isim, String renk, String soyisim, String plaka, String model) {
        super(isim,renk);
        this.soyisim = soyisim;
        this.plaka = plaka;
        this.model = model;
    }

    public KaraAraci() {

    }

    public void KaraAraci() {

    }


    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}