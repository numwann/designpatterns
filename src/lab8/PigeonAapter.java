package lab8;

public class PigeonAapter implements quackeable{
    Pigeon pigeon;

    public PigeonAapter(Pigeon pigeon){
        this.pigeon=pigeon;
    }


    @Override
    public void quake() {
        pigeon.coo();
    }
}
