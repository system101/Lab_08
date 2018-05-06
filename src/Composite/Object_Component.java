/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jimmy Salami
 */
class Object_Component implements Iterator {
    public int count = 0;
    ArrayList arr = new ArrayList();

    Object createIterator() {
        return new CompositeIterator(this);
    }

    void render() {
        for(int i = 0; i < arr.size(); i++){
            Object_Component o = (Object_Component)this.arr.get(i);
            o.render();
        }
    }

    public void add(Object p) {
        this.arr.add(p);
    }

    public float volume() {
        float result = 0;
        
        return result;
    }

    @Override
    public boolean hasNext() {
        if (count < this.arr.size()){
            return true;
        }
        else {
            this.count = 0;
            return false;
        }
    }

    @Override
    public Object next() {
        return this.arr.get(count++);
    }
}
