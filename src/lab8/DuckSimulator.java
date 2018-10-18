package lab8;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
        simulator.simulate(new PigeonAapter(new Pigeon()));

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

        quackeable.quake();
    }
}
