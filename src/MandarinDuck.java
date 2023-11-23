public class MandarinDuck implements Quackable{
    Listenable listenable;
    public MandarinDuck(){
        listenable = new Listenable(this);
    }
    @Override
    public void quack() {
        System.out.println("Quack");
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
    public String toString(){
        return "Mandarin Duck";
    }
}
