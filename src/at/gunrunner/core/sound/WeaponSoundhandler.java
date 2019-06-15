package at.gunrunner.core.sound;

import javax.sound.sampled.AudioInputStream;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class WeaponSoundhandler {
	public static Clip clip;
	public AudioInputStream audioInputStream;
	
	public WeaponSoundhandler() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("/sound/glockus.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
		}catch(Exception ex) {
	        System.out.println("Error with playing sound in Constructor! Maybe no Soundfiles!");
	        ex.printStackTrace();
	    }
	}
	
	public static void playSound() {
		try {
			clip.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
