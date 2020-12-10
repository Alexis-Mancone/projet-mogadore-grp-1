package com.company;
import java.util.ArrayList;
import java.util.List;

public class place extends text  {

    List<text> place = new ArrayList<text>();

    public place(String textPlace) {
        super(textPlace);
        place.add(text1);
        place.add(text2);
        place.add(text3);
        place.add(text4);
        place.add(text5);
        place.add(text6);
    }

}
