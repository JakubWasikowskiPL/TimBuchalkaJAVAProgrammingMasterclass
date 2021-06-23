public class Main {

    public static void main(String[] args) {
//Incorrect approach ,encapsulation not maintained:

//	Player player=new Player();
//	player.name="Jakub";
//	player.health=20;
//	player.weapon="Sword";
//
//	int damage=10;
//	player.loseHealth(damage);
//        System.out.println("Remaining health= "+player.healthRemaining());
//        damage=11;
//        player.health=200
//		player.loseHealth(damage);
//		System.out.println("Remaining health= "+player.healthRemaining());
	EnhancedPlayer enhancedPlayer=new EnhancedPlayer("Jakub",200,"Sword");
		System.out.println("Initial health is "+enhancedPlayer.getHitPoints());

    }
}
