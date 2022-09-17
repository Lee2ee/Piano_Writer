package com.gimal.test;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Sounds {
	// 음원파일 절대경로로 가져오기
	File sound_do = new File("do.wav");
	File sound_re = new File("re.wav");
	File sound_mi = new File("mi.wav");
	File sound_fa = new File("fa.wav");
	File sound_sol = new File("sol.wav");
	File sound_la = new File("la.wav");
	File sound_ti = new File("ti.wav");
	File sound_do_plus = new File("do+.wav");
	File sound_re_plus = new File("re+.wav");
	File sound_mi_plus = new File("mi+.wav");
	File sound_fa_plus = new File("fa+.wav");
	File sound_sol_plus = new File("sol+.wav");
	File sound_la_plus = new File("la+.wav");
	File sound_ti_plus = new File("ti+.wav");

	public void stream_do() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(sound_do);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(도) 음원이 존재하지 않습니다.");
		}
	}

	public void stream_re() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(sound_re);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(레) 음원이 존재하지 않습니다.");
		}
	}

	public void stream_mi() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(sound_mi);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(미) 음원이 존재하지 않습니다.");
		}
	}

	public void stream_fa() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(sound_fa);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(파) 음원이 존재하지 않습니다.");
		}
	}

	public void stream_sol() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(sound_sol);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(솔) 음원이 존재하지 않습니다.");
		}
	}

	public void stream_la() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(sound_la);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(라) 음원이 존재하지 않습니다.");
		}
	}

	public void stream_do_plus() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(sound_do_plus);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(도+) 음원이 존재하지 않습니다.");
		}
	}
	public void stream_re_plus() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(sound_re_plus);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(레+) 음원이 존재하지 않습니다.");
		}
	}
	public void stream_mi_plus() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(sound_mi_plus);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(미+) 음원이 존재하지 않습니다.");
		}
	}
	public void stream_fa_plus() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(sound_fa_plus);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(파+) 음원이 존재하지 않습니다.");
		}
	}
	public void stream_sol_plus() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(sound_sol_plus);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(솔+) 음원이 존재하지 않습니다.");
		}
	}
	public void stream_la_plus() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(sound_la_plus);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(라+) 음원이 존재하지 않습니다.");
		}
	}
	public void stream_ti_plus() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(sound_ti_plus);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(시+) 음원이 존재하지 않습니다.");
		}
	}
	public void stream_ti() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(sound_ti);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "(시) 음원이 존재하지 않습니다.");
		}
	}
}
