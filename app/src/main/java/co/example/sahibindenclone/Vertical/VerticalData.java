package co.example.sahibindenclone.Vertical;

import java.io.Serializable;
import java.util.ArrayList;

import co.example.sahibindenclone.ConstantsAnaSayfa;
import co.example.sahibindenclone.R;

public class VerticalData {

    private String kategori;
    private String altKategori;
    private int imageKategori;

    public VerticalData(String kategori, String altKategori, int imageKategori){
        this.kategori=kategori;
        this.altKategori=altKategori;
        this.imageKategori=imageKategori;

    }

    public String getKategori(){return kategori;}
    public String getAltKategori(){return altKategori;}
    public int getImageKategori(){return imageKategori;}



    public static ArrayList< VerticalData > getData() {

        ArrayList< VerticalData > anaSayfaData = new ArrayList<>();

        anaSayfaData.add(new VerticalData(ConstantsAnaSayfa.EMLAK,ConstantsAnaSayfa.EMLAK_ALT, R.drawable.emlak));
        anaSayfaData.add(new VerticalData(ConstantsAnaSayfa.VASITA,ConstantsAnaSayfa.VASITA_ALT,R.drawable.vasita));
        anaSayfaData.add(new VerticalData(ConstantsAnaSayfa.MARKET,ConstantsAnaSayfa.MARKET_ALT,R.drawable.market));

        return anaSayfaData;
    }




}
