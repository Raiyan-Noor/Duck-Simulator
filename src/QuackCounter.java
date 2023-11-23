public class QuackCounter implements Quackable{
    Quackable duck;
    static int quackCount;
    Listenable listenable;

    public QuackCounter (Quackable duck) {
        this.duck = duck;
        listenable = new Listenable(this);
    }

    @Override
    public void quack() {
        quackCount++;
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
    public static int getQuackCount() {
        return quackCount;
    }

    public String toString(){
        return duck.toString();
    }


}

