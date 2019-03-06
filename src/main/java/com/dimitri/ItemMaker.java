package com.dimitri;

import java.util.ArrayList;
import java.util.List;

public class ItemMaker {

        public List<Item> itemArr () {
            List<Item> t = new ArrayList<>();

            Item item1 = new Item("Flashlight", 100);
            Item item2 = new Item("Calcutalor", 111);
            Item item3 = new Item("Lotion", 112);
            Item item4 = new Item("Toy_Car", 113);

            t.add(item1);
            t.add(item2);
            t.add(item3);
            t.add(item4);

            return t;
        }


}
