public class MallardDuck implements Quackable{
    Listenable listenable;
    public MallardDuck(){
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
        System.out.println("hi");

    }

    public String toString(){
        return "Mallard Duck";
    }
}
