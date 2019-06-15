package at.gunrunner.core.abilitys;

public enum Weapon {
	MP7 (26,85,75,75,200,1.25f,"/gunsound.wav"), PISTOLE (3,97,43,43,600, 1f,"/glocksound.wav");

	public int shotXstart, shotYstart,shotXstartInv, shotYstartInv;
	public int cooldowntime;
	public float speedshot;
	public String path;
	
	private Weapon(int shotXstart,int shotXstartInv, int shotYstart,int shotYstartInv, int cooldowntime, float speedshot, String path) {
		this.shotXstart = shotXstart;
		this.shotXstartInv = shotXstartInv;
		this.shotYstart = shotYstart;
		this.shotYstartInv = shotYstartInv;
		this.cooldowntime = cooldowntime;
		this.speedshot = speedshot;
		this.path = path;
	}

	public int getShotXstart() {
		return shotXstart;
	}

	public int getShotYstart() {
		return shotYstart;
	}

	public int getShotXstartInv() {
		return shotXstartInv;
	}

	public int getShotYstartInv() {
		return shotYstartInv;
	}

	public int getCooldowntime() {
		return cooldowntime;
	}

	public float getSpeedshot() {
		return speedshot;
	}

	public String getPath() {
		return path;
	}
	
}
