
import java.util.ArrayList;
import java.util.Iterator;

public class Sphere extends Prim {

    private float radius;

    public Sphere(float r) {
        this.radius = r;
    }

    public void render() {
        System.out.println("Sphere R:" + radius);
    }

    public ArrayList volume() {
        ArrayList v = new ArrayList();
        v.add((float) (4 / 3 * Math.PI * radius * radius * radius));
        return v;
    }

    public Iterator createIterator() {
        return new NullIterator();
    }

}
