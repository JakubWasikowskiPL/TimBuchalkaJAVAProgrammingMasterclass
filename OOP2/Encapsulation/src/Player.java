public class Player {
    //example of not protected class, variables are public instead of private
    //incorrect approach:
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health-=damage;
        if (this.health<=0){
            System.out.println("Player knocked out");
            //Reduce number of lives remaining ofr player

        }
    }
    public int healthRemaining(){
        return this.health;
    }
}
