public class Mage extends Character {
	private int mana;
  
	public Mage(String name) {
		super(name, 80, 8);
	}
	public int getMana() {
        	return mana;
	}
  
	@Override
	public void attack(Character target) {
		if (mana < 20) {
			System.out.println(getName() + " is out of mana...");
			super.attack(target);
			return;
		}
    
		mana -= 20;
		int damage = getAttackPower() * 3;
		System.out.println(getName() + " casts Fireball on " + target.getName() + " for " + damage + " damage!");	
    	}
  
	@Override
    	public String status() {
        	return super.status() + " [Mana: " + mana + "]";
      }
}
