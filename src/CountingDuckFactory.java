public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createMandarinDuck() {
        return new QuackCounter(new MandarinDuck());
    }

    @Override
    public Quackable createWoodDuck() {
        return new QuackCounter(new WoodDuck());
    }

    @Override
    public Quackable createGooseAdapter() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }
}
