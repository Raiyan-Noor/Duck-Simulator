public class WoodDuck implements Quackable{
    Listenable listenable;
    public WoodDuck(){
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
        return "Wood Duck";
    }
}
