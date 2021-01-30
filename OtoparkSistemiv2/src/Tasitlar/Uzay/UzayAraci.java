package Tasitlar.Uzay;

import sample.OrtakOzellik.AracOrtakOzellik;

public class UzayAraci extends AracOrtakOzellik {
    private String gezegen,aracElementi,evrenselUzaylıKimlikNumarasi;
    private int id;
    public UzayAraci( String isim, String renk, String gezegen, String aracElementi, String evrenselUzaylıKimlikNumarasi) {
        super(isim,renk);
        this.gezegen = gezegen;
        this.aracElementi = aracElementi;
        this.evrenselUzaylıKimlikNumarasi = evrenselUzaylıKimlikNumarasi;
    }

    public UzayAraci() {

    }

    public String getGezegen() {
        return gezegen;
    }

    public void setGezegen(String gezegen) {
        this.gezegen = gezegen;
    }

    public String getAracElementi() {
        return aracElementi;
    }

    public void setAracElementi(String aracElementi) {
        this.aracElementi = aracElementi;
    }

    public String getEvrenselUzaylıKimlikNumarasi() {
        return evrenselUzaylıKimlikNumarasi;
    }

    public void setEvrenselUzaylıKimlikNumarasi(String evrenselUzaylıKimlikNumarasi) {
        this.evrenselUzaylıKimlikNumarasi = evrenselUzaylıKimlikNumarasi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
