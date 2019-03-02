package at.gunrunner.sound;

import javax.sound.sampled.AudioInputStream;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	public static Clip clip;
	public AudioInputStream audioInputStream;
	
	public Sound() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("/gunsound.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
		}catch(Exception ex) {
	        System.out.println("Error with playing sound in Constructor! Maybe no Soundfiles!");
	        ex.printStackTrace();
	    }
	}
	
	public static void playSound() {
        clip.start();
	}
}
