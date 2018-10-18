package lab8;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
        simulator.simulate(new RubberDuck());


    }
    void simulate(){
        quackeable mullardDuck = new MallardDuck();
        quackeable readHeadDuck = new ReadHeadDuck();
        quackeable rubberDuck = new RubberDuck();
        quackeable goose = new GooseAdapter(new Goose());
        quackeable pigeon = new PigeonAapter(new Pigeon());


        System.out.println("Duck Simulate-----------------");
        mullardDuck.quake();
        readHeadDuck.quake();
        rubberDuck.quake();
        goose.quake();
        pigeon.quake();
    }

    void simulate(quackeable quackeable){
        System.out.println("Duck Simulate2-------------------------------");

        quackeable quackcount1 = new QuackCounter(new QuackEcho(quackeable));
        quackeable quck= new QuackEcho(new QuackCounter(quackeable));

        quackcount1.quake();
        quck.quake();

        System.out.println("Num Of Quack(q1) = "+((QuackCounter) quackcount1).getNumOfQuack());
        System.out.println("Num Of Quack(q2) = "+((QuackCounter) quck).getNumOfQuack());

    }
}
