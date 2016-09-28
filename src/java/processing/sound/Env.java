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
* This is an ASR (Attack Sustain Release) Envelope Generator
* @webref sound
* @param parent PApplet: typically use "this"
**/

public class Env {
	
	PApplet parent;
	int[] m_nodeId = {-1, -1};
	private int[] m_busses;
		
	public Env (PApplet theParent) {	
		this.parent = theParent;
		parent.registerMethod("dispose", this);
		Engine.setPreferences(theParent, 512, 44100);
    	Engine.start();
    	m_busses = Engine.busConstructStereo();
	}

	/**
	* Triggers the envelope
	* @webref sound
	* @param input Input sound source
	* @param attackTime Attack time value as a float.
	* @param sustainTime Sustain time value as a float. 
	* @param sustain Sustain level value as a float.
	* @param releaseTime Release time value as a float.
	**/
	
	public void play(SoundObject input, float attackTime, float sustainTime, float sustainLevel, float releaseTime){
		m_nodeId = Engine.envelopePlay(input.returnId(), attackTime, sustainTime, sustainLevel, releaseTime, m_busses);
	}

	public int[] returnId(){
		return m_nodeId;
	}
	
	public void dispose(){
		Engine.synthStop(m_nodeId);
	}
};
