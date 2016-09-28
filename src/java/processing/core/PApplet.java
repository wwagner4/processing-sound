package processing.core;

import processing.sound.*;

public interface PApplet {

	void registerMethod(String name, Delay delay);

	void registerMethod(String name, Amplitude amplitude);

	void registerMethod(String name, AudioIn audioIn);

	void registerMethod(String name, SoundFile soundFile);

	void registerMethod(String name, BandPass bandPass);

	void registerMethod(String name, BrownNoise brownNoise);

	void registerMethod(String name, Env env);

	void registerMethod(String name, FFT fft);

	void registerMethod(String name, HighPass highPass);

	void registerMethod(String name, LowPass lowPass);

	void registerMethod(String name, Mix mix);

	void registerMethod(String name, PinkNoise pinkNoise);

	void registerMethod(String name, Pulse pulse);

	void registerMethod(String name, Reverb reverb);

	void registerMethod(String name, SawOsc sawOsc);

	void registerMethod(String name, SinOsc sinOsc);

	void registerMethod(String name, SqrOsc sqrOsc);

	void registerMethod(String name, TriOsc triOsc);

	void registerMethod(String name, WhiteNoise whiteNoise);

	String dataPath(String path);

}
