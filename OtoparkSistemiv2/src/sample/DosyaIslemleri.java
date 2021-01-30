package sample;

import Tasitlar.Deniz.DenizAraci;
import Tasitlar.Hava.HavaAraci;
import Tasitlar.Kara.KaraAraci;
import Tasitlar.Uzay.UzayAraci;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class DosyaIslemleri {
    Scanner dosya;

    public LinkedList<KaraAraci> karaoku(LinkedList<KaraAraci> liste, String url) {

        try {
            File f = new File(url);
            dosya = new Scanner(f);
            while (dosya.hasNext()) {
                KaraAraci k = new KaraAraci();
                k.setIsim(dosya.next());
                k.setSoyisim(dosya.next());
                k.setModel(dosya.next());
                k.setPlaka(dosya.next());
                k.setRenk(dosya.next());
                k.setId((Integer.parseInt(dosya.next())));
                liste.add(k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        dosya.close();
        return liste;
    }

    public void karayaz(LinkedList<KaraAraci> liste,String url) {

        File file = new File(url);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        try {
            for (int i = 0; i <liste.size() ; i++) {
                bWriter.write(liste.get(i).getIsim()+" "+liste.get(i).getSoyisim()+" "+liste.get(i).getModel()+" "+liste.get(i).getPlaka()+" "+liste.get(i).getRenk()+" "+liste.get(i).getId());
                if(i!=liste.size()-1)
                    bWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    ////////////deniz
    public LinkedList<DenizAraci> denizoku(LinkedList<DenizAraci> liste, String url) {

        try {
            File f = new File(url);
            dosya = new Scanner(f);
            while (dosya.hasNext()) {
                DenizAraci k=new DenizAraci();
                k.setIsim(dosya.next());
                k.setSoyisim(dosya.next());
                k.setRenk(dosya.next());
                k.setBaglamaKutugu(dosya.next());
                k.setBaglamaKutuguNumarasi(dosya.next());
                k.setId(Integer.parseInt(dosya.next()));
                liste.add(k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        dosya.close();
        return liste;
    }

    public void denizyaz(LinkedList<DenizAraci> liste,String url) {

        File file = new File(url);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        try {
            for (int i = 0; i <liste.size() ; i++) {
                bWriter.write(liste.get(i).getIsim()+" "+liste.get(i).getSoyisim()+" "+liste.get(i).getRenk()+" "+liste.get(i).getBaglamaKutugu()+" "+liste.get(i).getBaglamaKutuguNumarasi()+" "+liste.get(i).getId());
                if(i!=liste.size()-1)
                    bWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /////////////hava
    public LinkedList<HavaAraci> havaoku(LinkedList<HavaAraci> liste, String url) {

        try {
            File f = new File(url);
            dosya = new Scanner(f);
            while (dosya.hasNext()) {
                HavaAraci k = new HavaAraci();
                k.setIsim(dosya.next());
                k.setSoyisim(dosya.next());
                k.setModel(dosya.next());
                k.setSeriNo(dosya.next());
                k.setRenk(dosya.next());
                k.setId((Integer.parseInt(dosya.next())));
                liste.add(k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        dosya.close();
        return liste;
    }

    public void havayaz(LinkedList<HavaAraci> liste,String url) {

        File file = new File(url);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        try {
            for (int i = 0; i <liste.size() ; i++) {
                bWriter.write(liste.get(i).getIsim()+" "+liste.get(i).getSoyisim()+" "+liste.get(i).getModel()+" "+liste.get(i).getSeriNo()+" "+liste.get(i).getRenk()+" "+liste.get(i).getId());
                if(i!=liste.size()-1)
                    bWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /////////////uzay
    public LinkedList<UzayAraci> uzayoku(LinkedList<UzayAraci> liste, String url) {

        try {
            File f = new File(url);
            dosya = new Scanner(f);
            while (dosya.hasNext()) {
                UzayAraci k = new UzayAraci();
                k.setIsim(dosya.next());
                k.setRenk(dosya.next());
                k.setGezegen(dosya.next());
                k.setAracElementi(dosya.next());
                k.setEvrenselUzaylıKimlikNumarasi(dosya.next());
                k.setId((Integer.parseInt(dosya.next())));
                liste.add(k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        dosya.close();
        return liste;
    }

    public void uzayyaz(LinkedList<UzayAraci> liste,String url) {

        File file = new File(url);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        try {
            for (int i = 0; i <liste.size() ; i++) {
                bWriter.write(liste.get(i).getIsim()+" "+liste.get(i).getRenk()+" "+liste.get(i).getGezegen()+" "+liste.get(i).getAracElementi()+" "+liste.get(i).getEvrenselUzaylıKimlikNumarasi()+" "+liste.get(i).getId());
                if(i!=liste.size()-1)
                    bWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

