package com.dimitri;

public class Item {

    String itemName;
    int itemNumber;

    public Item(String itemNm, int itemNr){

        itemName = itemNm;
        itemNumber = itemNr;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemNr() {
        return itemNumber;
    }

    public void setItemNr(int itemNr) {
        this.itemNumber = itemNr;
    }

    @Override
    public String toString() {
        return "The item number is: "+getItemNr()+" The item name is: "+getItemName();
    }
}
