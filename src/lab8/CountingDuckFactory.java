package lab8;

public class CountingDuckFactory extends AbstractDuckFactory {
    quackeable quackeable;
    EchoDuckFactory echoDuckFactory;

    public CountingDuckFactory(){

    }

    public CountingDuckFactory(EchoDuckFactory echoDuckFactory){
        this.echoDuckFactory = echoDuckFactory;

    }
    @Override
    public quackeable createMullardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public quackeable createReadHeadDuck() {
        return new QuackCounter(new ReadHeadDuck());
    }

    @Override
    public quackeable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public quackeable createPegeon() {
        return new QuackCounter(new PigeonAapter(new Pigeon()));
    }
}
