package engine;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	public void playSound() {
		if(Variables.shot) {
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(Sound.class.getResourceAsStream("./gunsound.mp3"));
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	  }
	}
}
