import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	FootballPlayer joe=new FootballPlayer("Joe");
	BaseballPlayer pat=new BaseballPlayer("Pat");
	SoccerPlayer beckham=new SoccerPlayer("Beckham");

	Team<FootballPlayer> adelideCrows=new Team<>("Adelide Crows");
	adelideCrows.addPlayer(joe);
//	adelideCrows.addPlayer(pat);
//	adelideCrows.addPlayer(beckham);

        System.out.println(adelideCrows.numPlayers());
        Team<BaseballPlayer>baseballTeam=new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer>brokenTeam=new Team<>("Real");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer>melbourne =new Team<>("Melbourne");
        FootballPlayer banks=new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer>hawthorn=new Team<>("Hawthorn");
		Team<FootballPlayer>fremantle=new Team<>("Fremantle");

		hawthorn.matchResult(fremantle,1,0);
		hawthorn.matchResult(adelideCrows,3,8);

		adelideCrows.matchResult(fremantle,2,1);
//		adelideCrows.matchResult(baseballTeam,1,1);
        System.out.println("Rankings");
        System.out.println(adelideCrows.getName()+": "+adelideCrows.ranking());
        System.out.println(melbourne.getName()+": "+melbourne.ranking());
        System.out.println(fremantle.getName()+": "+fremantle.ranking());
        System.out.println(hawthorn.getName()+": "+hawthorn.ranking());

        System.out.println(adelideCrows.compareTo(melbourne));
        System.out.println(adelideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelideCrows));
        System.out.println(melbourne.compareTo(fremantle));

    }

}
