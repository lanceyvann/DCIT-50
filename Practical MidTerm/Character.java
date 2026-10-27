public class Character {
	private String name;
	private int health, attackPower;

	public Character(String name, int health, int attackPower) {
		this.name = name;
		this.health = health;
		this.attackPower = attackPower;
	}
  //getters
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getAttackPower() {
		return attackPower;
	}

  //if alive
	public boolean isAlive() {
		return health >0;
	}
  //damageDealt
	public void takeDamage(int amount) {
		if (amount < 0) {
			return;
		}
    
		health -= amount;
    
		if (health < 0) {
			health = 0;
		}
	}
  
	public void attack(Character target) {
		System.out.println(name + " attacks " + target.getName() + " for " + attackPower + " damage!");
        	target.takeDamage(attackPower);
    	}
  
	public String status() {
		return name + " [HP: " + health + "]";
	}
}
