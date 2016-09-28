package processing.core;

import processing.sound.*;

public interface PApplet {

	void registerMethod(String string, Delay delay);

	void registerMethod(String string, Amplitude amplitude);

	void registerMethod(String string, AudioIn audioIn);

	void registerMethod(String string, SoundFile soundFile);

	void registerMethod(String string, BandPass bandPass);

	void registerMethod(String string, BrownNoise brownNoise);

	void registerMethod(String string, Env env);

	void registerMethod(String string, FFT fft);

	void registerMethod(String string, HighPass highPass);

	void registerMethod(String string, LowPass lowPass);

	void registerMethod(String string, Mix mix);

	void registerMethod(String string, PinkNoise pinkNoise);

	void registerMethod(String string, Pulse pulse);

	void registerMethod(String string, Reverb reverb);

	void registerMethod(String string, SawOsc sawOsc);

	void registerMethod(String string, SinOsc sinOsc);

	void registerMethod(String string, SqrOsc sqrOsc);

	void registerMethod(String string, TriOsc triOsc);

	void registerMethod(String string, WhiteNoise whiteNoise);

	String dataPath(String path);

}
