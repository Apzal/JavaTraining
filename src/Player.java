public class Player {
    public int strength;

    public void reduceEnergy(int damage){

        if(damage>0 && damage<100){
            this.strength=this.strength-damage;
        }

        if(strength<=0){
            System.out.println("Player Out");
        }
    }

    public int getStrength() {
        return strength;
    }
}
