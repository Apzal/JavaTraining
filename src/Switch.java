public class Switch {

    public static void main(String[] args) {
        String  a="Orange";

        switch (a){

            case "Orange": case "Apple":
                System.out.println("orange and apple");
                break;
            case "Grape":
                System.out.println("in 2 n 3");
                break;

            case "Pineapple":
                System.out.println("in 5");
                break;
            case "Kiwi":
                System.out.println("in 6");
                break;

            default:
                System.out.println("default");



        }
    }
}
