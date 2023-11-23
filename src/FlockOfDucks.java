import java.util.ArrayList;
import java.util.Iterator;

public class FlockOfDucks implements Quackable{
    ArrayList<Quackable> ducks = new ArrayList<Quackable>();

    Listenable listenable;
    public FlockOfDucks(){
        listenable = new Listenable(this);
    }

    public void addDuck(Quackable duck) {
        ducks.add(duck);
        System.out.println(duck.toString() + " added to the flock");
    }
    public void removeDuck(Quackable duck){
        ducks.remove(duck);
        System.out.println(duck.toString() + " removed from the flock");

    }
    @Override
    public void quack() {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = iterator.next();
            duck.quack();
            notifyListener();
        }
    }

    @Override
    public void registerListener(Listener listener) {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)iterator.next();
            duck.registerListener(listener);
        }

    }

    @Override
    public void notifyListener() {
        //listenable.notifyListener();

    }
}
