import java.sql.SQLOutput;

public class Car extends Vehicle {
    private int airbag;

    public Car(int tyres,int doors,int airbag){
        super(tyres,doors);
        this.airbag=airbag;
    }

    public int getAirbag() {
        return airbag;
    }

    public void startEngine(){
        super.startEngine();
        System.out.println(getClass().toString()+"-Start engine");
        System.out.println("Running at 100 km/h");
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
        System.out.println(getClass().toString()+"-Stop engine");

    }
}
