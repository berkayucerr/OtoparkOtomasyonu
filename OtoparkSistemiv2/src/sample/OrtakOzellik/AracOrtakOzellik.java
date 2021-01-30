package sample.OrtakOzellik;

import java.util.LinkedList;

public class AracOrtakOzellik {
    protected String isim,renk;
    static LinkedList<AracOrtakOzellik> a=new LinkedList<AracOrtakOzellik>();
    public AracOrtakOzellik(String isim, String renk) {
        this.isim = isim;
        this.renk = renk;
    }

    public AracOrtakOzellik() {
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }



}
