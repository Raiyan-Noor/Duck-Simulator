import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listenable implements QuackListenable{
    List<Listener> listeners = new ArrayList<Listener>();
    QuackListenable duck;
    public Listenable(QuackListenable duck){
        this.duck = duck;
    }
    @Override
    public void registerListener(Listener listener) {
        listeners.add(listener);

    }

    @Override
    public void notifyListener() {

        for (Listener value : listeners) {
            value.update(duck);
        }

    }

}
