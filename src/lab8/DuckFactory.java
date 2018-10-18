package lab8;

public class DuckFactory extends AbstractDuckFactory{
    @Override
    public quackeable createMullardDuck() {
        return new MallardDuck();
    }

    @Override
    public quackeable createReadHeadDuck() {
        return new ReadHeadDuck();
    }

    @Override
    public quackeable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public quackeable createPegeon() {
        return new PigeonAapter(new Pigeon());
    }
}
