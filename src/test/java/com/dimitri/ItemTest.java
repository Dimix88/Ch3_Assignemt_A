package com.dimitri;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ItemTest {

    public Object obj;

    @Test
    public void assertIdentity() {
        Item item1 = new Item("Milk", 110);
        Item result = item1;            //cast item1 into the result
        assertSame(result,item1);       //make use of the assert method to see if result references to item1
                                        //see if the identity of result is the reference as where item1 is stored in memory
    }

    @Test(timeout = 1000)//testing with a timeoout
    public void assertEquality() {
        Item item1 = new Item("Beer", 155);
        Item item2 = new Item("Beer", 155);
        assertEquals(item1.getItemName(),item2.getItemName());  //use the assert method to see if the getItemName values
                                                                //in item1 and item2 have the same values
    }


    @Test
    public void assertFail() {
        obj = new Object();
        if(obj == null){

            fail("Object should not have a null value");
        }
    }

    @Ignore
    @Test
    public void itemArr() {
        List<Item> t = new ArrayList<>();

        Item item1 = new Item("Flashlight", 100);
        Item item2 = new Item("Calcutalor", 111);
        Item item3 = new Item("Lotion", 112);
        Item item4 = new Item("Toy_Car", 113);

        t.add(item1);
        t.add(item2);
        t.add(item3);
        t.add(item4);
        assertEquals("The Item were added to the list", 4, t.size());

    }
}