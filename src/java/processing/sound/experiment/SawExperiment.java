package processing.sound.experiment;

import processing.core.*;
import processing.sound.SawOsc;

public class SawExperiment {

	public static void main(String[] args) {
		PApplet parent = new PAppletImpl();
		SawOsc saw = new SawOsc(parent);
		float freq = 200;
		saw.set(freq, 1.0f, 0f, 0f);
		saw.play();
		
		for (int i=0; i< 10; i++) {
			freq += 10;
			saw.set(freq, 0.1f, 0f, 0f);
			pause(100);
		}
		
		saw.stop();
		saw.dispose();
	}

	private static void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// Nothing to do here
		}
	}

}
