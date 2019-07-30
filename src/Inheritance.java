public class Inheritance {

    public static void main(String[] args) {
//        Car car=new Car(4,4,2);
//
//        car.startEngine();
//        System.out.println("Air Bag:"+car.getAirbag());
//        System.out.println("Doors:"+car.getDoors());
//        System.out.println("Tyres:"+car.getTyres());
//        car.stopEngine();

        Vehicle vehicle=new Car(4,4,3);

        vehicle.startEngine();
//        System.out.println("Air Bag:"+vehicle.getAirbag());
        System.out.println("Doors:"+vehicle.getDoors());
        System.out.println("Tyres:"+vehicle.getTyres());
        vehicle.stopEngine();

    }
}
