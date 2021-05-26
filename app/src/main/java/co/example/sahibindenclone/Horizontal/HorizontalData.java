package co.example.sahibindenclone.Horizontal;
import java.util.ArrayList;

import co.example.sahibindenclone.R;

public class HorizontalData {

    private int imageID;

    public HorizontalData(int imageID ){
        this.imageID=imageID;
    }

    public int getImageID(){return imageID;}

    public static ArrayList<HorizontalData> getDataHorizontal(){

        ArrayList<HorizontalData> dataHor=new ArrayList<>();

        dataHor.add(new HorizontalData(R.drawable.car));
        dataHor.add(new HorizontalData(R.drawable.earth));
        dataHor.add(new HorizontalData(R.drawable.motorbike));
        dataHor.add(new HorizontalData(R.drawable.car));
        dataHor.add(new HorizontalData(R.drawable.earth));
        dataHor.add(new HorizontalData(R.drawable.motorbike));
        dataHor.add(new HorizontalData(R.drawable.car));
        dataHor.add(new HorizontalData(R.drawable.earth));
        dataHor.add(new HorizontalData(R.drawable.motorbike));
        dataHor.add(new HorizontalData(R.drawable.car));
        dataHor.add(new HorizontalData(R.drawable.earth));
        dataHor.add(new HorizontalData(R.drawable.motorbike));

        return dataHor;
    }
}
