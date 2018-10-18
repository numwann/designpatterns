package lab8;

public class QuackEcho implements quackeable {
    quackeable quackeable;
    public QuackEcho(quackeable quackeable){
        this.quackeable = quackeable;
    }
    @Override
    public void quake() {
        quackeable.quake();
        System.out.print("Echo  ");
        quackeable.quake();
    }
}
