package Tasitlar.Hava;
import sample.OrtakOzellik.AracOrtakOzellik;

public class HavaAraci extends AracOrtakOzellik {
    private String soyisim,model,seriNo;
    private int id;
    public HavaAraci( String isim,String renk,String soyisim,String model, String seriNo) {
        super(isim,renk);
        this.soyisim = soyisim;
        this.model = model;
        this.seriNo = seriNo;
    }

    public HavaAraci() {

    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {this.model = model; }

    public String getSeriNo() {
        return seriNo;
    }

    public void setSeriNo(String seriNo) {
        this.seriNo = seriNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
