package processing.core;

import processing.sound.*;

public class PAppletImpl implements PApplet {

	@Override
	public void registerMethod(String name, Delay delay) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, Amplitude amplitude) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, AudioIn audioIn) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, SoundFile soundFile) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, BandPass bandPass) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, BrownNoise brownNoise) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, Env env) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, FFT fft) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, HighPass highPass) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, LowPass lowPass) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, Mix mix) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, PinkNoise pinkNoise) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, Pulse pulse) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, Reverb reverb) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, SawOsc sawOsc) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, SinOsc sinOsc) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, SqrOsc sqrOsc) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, TriOsc triOsc) {
		log("registered " + name);
	}

	@Override
	public void registerMethod(String name, WhiteNoise whiteNoise) {
		log("registered " + name);
	}

	@Override
	public String dataPath(String path) {
		throw new IllegalStateException("???");
	}

	private void log(String msg) {
		System.out.println(msg);
	}

}
