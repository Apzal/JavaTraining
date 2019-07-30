public class Encapsulation {

    public static void main(String[] args) {


//        Player player=new Player();
//        player.strength=100;
//        player.reduceEnergy(50);
//        player.reduceEnergy(50);
//        player.strength=200;
//        System.out.println("Current Strength:"+player.getStrength());

        EnhancedPlayer enhancedPlayer=new EnhancedPlayer();
        enhancedPlayer.reduceEnergy(50);
        System.out.println(enhancedPlayer.getStrength());
        enhancedPlayer.reduceEnergy(50);
        System.out.println(enhancedPlayer.getStrength());
        enhancedPlayer.reduceEnergy(60);
        System.out.println(enhancedPlayer.getStrength());

    }
}
