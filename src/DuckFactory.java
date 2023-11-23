public class DuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createMandarinDuck() {
        return new MandarinDuck();
    }

    @Override
    public Quackable createWoodDuck() {
        return new WoodDuck();
    }

    @Override
    public Quackable createGooseAdapter() {
        return new GooseAdapter(new Goose());
    }
}
