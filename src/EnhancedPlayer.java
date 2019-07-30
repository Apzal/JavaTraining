public class EnhancedPlayer {
    private int energy =100;

    public void reduceEnergy(int loss){

        if(energy >0){
            this.energy =this.energy -loss;
        }

        if(energy <=0){
            System.out.println("Player Out");
        }
    }

    public int getStrength() {
        return energy;
    }
}
