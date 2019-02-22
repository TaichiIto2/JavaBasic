package practice13.common;

public class SuperHero extends Hero  {

	Item equipment;

	public int attack() {
		return super.attack() + equipment.additionalDamage;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}
	public Item getEquipment() {
		return this.equipment;
	}

}
