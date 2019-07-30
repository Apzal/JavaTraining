public class Vehicle {

    private int tyres;
    private int doors;


    public Vehicle(int tyres, int doors) {
        this.tyres = tyres;
        this.doors = doors;
    }

    public void startEngine(){
        System.out.println("Vehicle-Start engine");
    }

    public void stopEngine(){
        System.out.println("Vehicle-Stop engine");
    }

    public int getTyres() {
        return tyres;
    }

    public int getDoors() {
        return doors;
    }
}
