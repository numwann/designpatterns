package lab8;

public class EchoDuckFactory extends AbstractDuckFactory {
    @Override
    public quackeable createMullardDuck() {
        return new QuackEcho(new MallardDuck());
    }

    @Override
    public quackeable createReadHeadDuck() {
        return new QuackEcho(new ReadHeadDuck());
    }

    @Override
    public quackeable createRubberDuck() {
        return new QuackEcho(new RubberDuck());
    }

    @Override
    public quackeable createPegeon() {
        return new QuackEcho(new PigeonAapter(new Pigeon()));
    }
}
