package Otoparklar;

import Tasitlar.Deniz.DenizAraci;
import Tasitlar.Deniz.Gemi;
import javafx.scene.control.TextArea;

import java.util.LinkedList;

public class yazdirma {

    public void yazdirma(LinkedList<DenizAraci> d, TextArea Tx) {
        Tx.setText("");
        for(int i=0;i<d.size();i++){

            Tx.appendText("\n--------------------------------");
            Tx.appendText("\nisim = "+d.get(i).getIsim());
            Tx.appendText("\nsoyisim = "+d.get(i).getSoyisim());
            Tx.appendText("\nrenk = "+d.get(i).getRenk());
            Tx.appendText("\nid = "+d.get(i).getId());
            Tx.appendText("\nbaglama kutugu = "+d.get(i).getBaglamaKutugu());
            Tx.appendText("\nbaglama kutugu numarası = "+d.get(i).getBaglamaKutuguNumarasi());
            Tx.appendText("\n10 TL");
        }
    }

}