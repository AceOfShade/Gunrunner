package sound;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import main.Variables;

public class Sound {
	public void playSound() {
		if(Variables.shot)
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(Sound.class.getResourceAsStream("/gunsound.wav"));
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	  }
	}