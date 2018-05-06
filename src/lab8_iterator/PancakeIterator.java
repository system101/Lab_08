/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_iterator;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author monradajuycharoen
 */
public class PancakeIterator implements Iterator{
    
    ArrayList menuItems;
    int current = 0;
    public PancakeIterator(ArrayList arrayList){
        this.menuItems = arrayList;
    }

    @Override
    public boolean hasNext() {
        return current < menuItems.size();
    }

    @Override
    public Object next() {
        return menuItems.get(current++);
    }
    
}
