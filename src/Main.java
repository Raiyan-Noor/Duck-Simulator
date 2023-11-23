public class Main {
    public static void main(String[] args) {
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable goose = duckFactory.createGooseAdapter();
        Quackable woodDuck = duckFactory.createWoodDuck();
        Quackable mandarinDuck = duckFactory.createMandarinDuck();

        FlockOfDucks flock = new FlockOfDucks();

        flock.addDuck(mallardDuck);
        flock.addDuck(goose);
        flock.addDuck(woodDuck);
        flock.addDuck(mandarinDuck);

        System.out.println();
        QuackResponder quackResponder = new QuackResponder();
        flock.registerListener(quackResponder);

        flock.quack();

        System.out.println();
        System.out.println("Total quacks till now: " + QuackCounter.getQuackCount());

        System.out.println();
        flock.removeDuck(goose);

        System.out.println();
        flock.quack();

        System.out.println();
        System.out.println("Total quacks till now: " + QuackCounter.getQuackCount());

        System.out.println();



    }
}