public class GooseAdapter implements Quackable {
    Goose goose;

    Listenable listenable;
    public GooseAdapter(Goose goose){
        this.goose = goose;
        listenable = new Listenable(this);
    }
    @Override
    public void quack() {
        goose.honk();
        notifyListener();
    }

    @Override
    public void registerListener(Listener listener) {
        listenable.registerListener(listener);

    }

    @Override
    public void notifyListener() {
        listenable.notifyListener();

    }
    public String toString() {
        return "Goose adapted to a Duck";
    }
}