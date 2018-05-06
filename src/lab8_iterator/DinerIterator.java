/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_iterator;
import java.util.Iterator;
/**
 *
 * @author monradajuycharoen
 */
public class DinerIterator implements Iterator{
    
    public MenuItem[] menuItems;
    int current = 0;
    public DinerIterator (MenuItem[] menuItem){
        this.menuItems = menuItem;
    }

    @Override
    public boolean hasNext() {
        return current < menuItems.length;
    }

    @Override
    public MenuItem next() {
        return menuItems[current++];
    }


    
    
}
