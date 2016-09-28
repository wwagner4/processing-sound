/*
  Processing Sound (c) 2013-2015 Wilm Thoben
  Part of the Processing project - http://processing.org

  Copyright (c) 2011-12 Ben Fry and Casey Reas

  This library is free software; you can redistribute it and/or
  modify it under the terms of the GNU Lesser General Public
  License as published by the Free Software Foundation; either
  version 2.1 of the License, or (at your option) any later version.

  This library is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
  Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General
  Public License along with this library; if not, write to the
  Free Software Foundation, Inc., 59 Temple Place, Suite 330,
  Boston, MA  02111-1307  USA
*/

package processing.sound;
import processing.core.PApplet;

/**
* This is a volume analyzer. It calculates the root mean square of the amplitude of each audio block
* and returns that value.
* @webref sound
* @param parent PApplet: typically use "this"
*/

public class Amplitude {
	
	PApplet parent;
	private long ptr;
	
	public Amplitude(PApplet theParent) {
		this.parent = theParent;
		parent.registerMethod("dispose", this);
		Engine.setPreferences(theParent, 512, 44100);
    	Engine.start();
	}

	/**
	* Defines the audio input source of the amplitude analyzer.
    * @webref sound
	* @param input Input sound source
   	**/
	public void input(SoundObject input){
		ptr = Engine.amplitude(input.returnId());
	}
	
	/**
	* Queries a value from the analyzer and returns a float between 0. and 1. 
    * @webref sound	
	* @return amp An amplitude value between 0-1.
	**/

	public float analyze(){
		return Engine.poll_amplitude(ptr);
	}
	
	public void dispose() {
		Engine.destroy_amplitude(ptr);
		//Engine.synthStop(m_nodeId);
	}
}
