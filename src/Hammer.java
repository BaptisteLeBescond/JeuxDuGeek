
public class Hammer extends Weapon{

	public Hammer(int d) {
		super(d);
	}

	@Override
	public void attack(Monster m) {
		double dmg = Damage*1.4;
		m.LooseLife(dmg);
	}
	
	@Override
	public void attack(Obstacle o) {
		double dmg = Damage*0.7;
		o.LooseLife(dmg);
	}

	@Override
	public void attack(Destructible d) {
		if(d instanceof Monster){
			double dmg = Damage*1.4;
			d.LooseLife(dmg);
		}
		else if(d instanceof Obstacle){
			double dmg = Damage*0.7;
			d.LooseLife(dmg);
		}
		else
			return;
	}

}
