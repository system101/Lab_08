

import java.util.ArrayList;
import java.util.Iterator;

public class Cube extends Prim {

    private float height;
    private float width;
    private float length;

    public Cube(float h, float w, float l) {
        this.height = h;
        this.width = w;
        this.length = l;
    }

    public void render() {
        System.out.println("Cube:" + height + ":" + width + ":" + length);
    }

    public ArrayList volume() {
        ArrayList v = new ArrayList();
        v.add((float) (height * width * length));
        return v;
    }

    public Iterator createIterator() {
        return new NullIterator();
    }

}
