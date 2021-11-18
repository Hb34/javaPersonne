package dp.strategie;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Canard> canards = init();
		for(Canard c : canards) {
			c.afficheToi();
			c.envoleToi();
		}
		
		//c'est noel, le ceb recoit des ailes mecaniques
		System.out.println("NOEL");
		canards.get(2).setMaFaconDeVoler(new VolAvecAiles());
		for(Canard c : canards) {
			c.afficheToi();
			c.envoleToi();
		}
	}
	
	public static List<Canard> init(){
		List<Canard> cs = new ArrayList<>();
		cs.add(new Colvert(new VolAvecAiles()));
		cs.add(new Morillon(new VolAvecAiles()));
		cs.add(new CanardEnBois(new NoVol()));
		return cs;
	}

}