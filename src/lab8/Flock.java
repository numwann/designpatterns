package lab8;

import java.util.ArrayList;
import java.util.List;

public class Flock implements quackeable {
    quackeable quackeable,floaks;
    ArrayList<quackeable> floak = new ArrayList<quackeable>();

    public  Flock(quackeable floaks){
        this.floaks=floaks;
    }

    public void addDuck(quackeable quackeable){
        this.quackeable = quackeable;
        floak.add(this.quackeable);

    }
    @Override
    public void quake() {
        floakQuake();
        quackeable.quake();
    }public String toString(){
        return "Floak:"+getFloaks()+" /Duck:"+getQuackeable();
    }

    public lab8.quackeable getQuackeable() {
        return quackeable;
    }

    public lab8.quackeable getFloaks() {
        return floaks;
    }
    public void floakQuake(){
        System.out.println("Floak: Quacke Quacke Quacke!");

    }
}
