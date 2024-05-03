package com.example.flashcardmobile.repositories;

import com.example.flashcardmobile.R;
import com.example.flashcardmobile.model.CardSet;

import java.util.ArrayList;

public class CardSetRepository {
    public static ArrayList<CardSet> getAllCardSet(){
        ArrayList<CardSet> list = new ArrayList<>();
        list.add(new CardSet("Từ vựng DuoLingo", 21, "Koro-sensei", R.drawable.man_avatar));
        list.add(new CardSet("Hospital", 14, "Koro-sensei", R.drawable.man_avatar));
        list.add(new CardSet("Airport", 40, "Bitch-sensei", R.drawable.man_avatar));
        list.add(new CardSet("3000 từ vựng thông dụng", 3000, "Bino", R.drawable.man_avatar));
        list.add(new CardSet("Prep's recomended vocabulary", 150, "Prep", R.drawable.man_avatar));
        return list;
    }
}
