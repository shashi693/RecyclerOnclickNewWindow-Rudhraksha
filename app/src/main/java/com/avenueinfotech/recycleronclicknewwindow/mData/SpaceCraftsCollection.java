package com.avenueinfotech.recycleronclicknewwindow.mData;

import com.avenueinfotech.recycleronclicknewwindow.R;

import java.util.ArrayList;

/**
 * Created by shashikant on 20-04-2017.
 */

public class SpaceCraftsCollection {

    public static ArrayList<SpaceCraft> getSpaceCrafts()
    {
        ArrayList<SpaceCraft> spaceCrafts=new ArrayList<>();
        SpaceCraft spaceCraft=null;

        //ADD DATA TO COLLECTION
        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Pioneer");
        spaceCraft.setImage(R.drawable.one);
        spaceCrafts.add(spaceCraft);


        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Enterprise");
        spaceCraft.setImage(R.drawable.two);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Hubble");
        spaceCraft.setImage(R.drawable.three);
        spaceCrafts.add(spaceCraft);


        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Voyager");
        spaceCraft.setImage(R.drawable.four);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Spitzer");
        spaceCraft.setImage(R.drawable.five);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Opportunity");
        spaceCraft.setImage(R.drawable.six);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Apollo");
        spaceCraft.setImage(R.drawable.seven);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Kepler");
        spaceCraft.setImage(R.drawable.eight);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Columbia");
        spaceCraft.setImage(R.drawable.nine);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Challenger");
        spaceCraft.setImage(R.drawable.ten);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("Rosetta");
        spaceCraft.setImage(R.drawable.twevle);
        spaceCrafts.add(spaceCraft);

        spaceCraft=new SpaceCraft();
        spaceCraft.setName("WMAP");
        spaceCraft.setImage(R.drawable.thirteen);
        spaceCrafts.add(spaceCraft);


        //RETURN COLLECTION
        return spaceCrafts;
    }
}
