package lab8;

public class QuackCounter implements quackeable {
    quackeable quackeable;
    static int numOfQuack;

    public QuackCounter(quackeable quackeable){
        this.quackeable = quackeable;
    }

    @Override
    public void quake() {
        quackeable.quake();
        numOfQuack++;
    }
    public static int getNumOfQuack() {
        return numOfQuack;
    }
}
