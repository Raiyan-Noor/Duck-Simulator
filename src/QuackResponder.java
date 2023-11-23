public class QuackResponder implements Listener{
    public void update(QuackListenable duck) {
        System.out.println("QuackResponder: " + duck + " just quacked.");
    }

    public String toString() {
        return "QuackResponder";
    }
}
