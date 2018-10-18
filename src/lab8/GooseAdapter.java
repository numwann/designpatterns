package lab8;

public class GooseAdapter implements quackeable{
    Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose;
    }

    @Override
    public void quake() {
        goose.honk();
    }
}
