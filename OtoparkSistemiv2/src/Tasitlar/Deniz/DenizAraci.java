package Tasitlar.Deniz;
import sample.OrtakOzellik.AracOrtakOzellik;

public class DenizAraci extends AracOrtakOzellik {
    private String baglamaKutuguNumarasi,cinsi,baglamaKutugu,soyisim;
    private int id;

    public DenizAraci(String isim, String renk,String soyisim, String baglamaKutugu, String baglamaKutuguNumarasi) {
        super(isim,renk);
        this.soyisim=soyisim;
        this.baglamaKutugu = baglamaKutugu;
        this.baglamaKutuguNumarasi = baglamaKutuguNumarasi;
    }

    public DenizAraci() {

    }



    public String getBaglamaKutugu() {
        return baglamaKutugu;
    }

    public void setBaglamaKutugu(String baglamaKutugu) {
        this.baglamaKutugu = baglamaKutugu;
    }

    public String getBaglamaKutuguNumarasi() {
        return baglamaKutuguNumarasi;
    }

    public void setBaglamaKutuguNumarasi(String baglamaKutuguNumarasi) {
        this.baglamaKutuguNumarasi = baglamaKutuguNumarasi;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
