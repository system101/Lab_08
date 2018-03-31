
import java.util.ArrayList;
import java.util.Iterator;

public class Object extends Object_Component {

    ArrayList<Object_Component> components;

    public Object() {
        this.components = new ArrayList<>();
    }

    @Override
    public void render() {
        for (int numberOfElements = 0; numberOfElements < this.components.size(); numberOfElements++){
            this.components.get(numberOfElements).render();
        }
    }

    @Override
    public ArrayList volume() {
        ArrayList volume = new ArrayList();
        for (int numberOfElements = 0; numberOfElements < this.components.size(); numberOfElements++){
            volume.add(this.components.get(numberOfElements).volume());
        }
        return volume;
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(components.iterator());
    }

    public void add(Object_Component object_component) {
        components.add(object_component);
    }

    

    
    
}
