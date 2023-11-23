public interface QuackListenable {
    public void registerListener(Listener listener);
    public void notifyListener();
}
