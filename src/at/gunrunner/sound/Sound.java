package at.gunrunner.sound;
/**
 * This is a class for sounds of the gameplay
 */
import javax.sound.sampled.AudioInputStream;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	AudioInputStream audioInputStream;
	public Sound() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("/gunsound.wav"));
		}catch(Exception ex) {
	        System.out.println("Error with playing sound in Constructor! Maybe no Soundfiles!");
	        ex.printStackTrace();
	    }
	}
	
	public void playSound() {
		try {
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
		}catch(Exception ex) {
	        System.out.println("Error with playing sound in playSound() !");
	        ex.printStackTrace();
	    }
	}
}
