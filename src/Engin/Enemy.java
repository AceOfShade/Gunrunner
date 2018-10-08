package Engin;

public class Enemy {
	public int eX, eY, hp;
	
	public Enemy(int eX, int eY, int hp) {
		this.eX = eX;
		this.eY = eY;
		this.hp = hp;
	}
	public Enemy() { //Marco war hier 2015
		this.eX = 675;
		this.eY = 400;
		this.hp = 3;
	}
}
