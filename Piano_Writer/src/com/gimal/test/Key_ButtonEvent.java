package com.gimal.test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key_ButtonEvent implements KeyListener{
	Sounds sound = new Sounds();

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int press = e.getKeyCode();
		int count = 0;
		String keyStr[] = new String[14];
		
		if (press == KeyEvent.VK_A) {
			sound.stream_do();
			keyStr[count] = "도";
			count++;
		} else if (press == KeyEvent.VK_S) {
			sound.stream_re();
			keyStr[count] = "레";
			count++;
		} else if (press == KeyEvent.VK_D) {
			sound.stream_mi();
			keyStr[count] = "미";
			count++;
		} else if (press == KeyEvent.VK_F) {
			sound.stream_fa();
			keyStr[count] = "파";
			count++;
		} else if (press == KeyEvent.VK_J) {
			sound.stream_sol();
			keyStr[count] = "솔";
			count++;
		} else if (press == KeyEvent.VK_K) {
			sound.stream_la();
			keyStr[count] = "라";
			count++;
		} else if (press == KeyEvent.VK_L) {
			sound.stream_ti();
			keyStr[count] = "시";
			count++;
		} else if (press == KeyEvent.VK_Q) {
			sound.stream_do_plus();
			keyStr[count] = "도+";
			count++;
		} else if (press == KeyEvent.VK_W) {
			sound.stream_re_plus();
			keyStr[count] = "레+";
			count++;
		} else if (press == KeyEvent.VK_E) {
			sound.stream_mi_plus();
			keyStr[count] = "미+";
			count++;
		} else if (press == KeyEvent.VK_R) {
			sound.stream_fa_plus();
			keyStr[count] = "파+";
			count++;
		} else if (press == KeyEvent.VK_U) {
			sound.stream_sol_plus();
			keyStr[count] = "솔+";
			count++;
		} else if (press == KeyEvent.VK_I) {
			sound.stream_la_plus();
			keyStr[count] = "라+";
			count++;
		} else if (press == KeyEvent.VK_O) {
			sound.stream_ti_plus();
			keyStr[count] = "시+";
			count++;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
