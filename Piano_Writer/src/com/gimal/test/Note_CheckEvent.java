package com.gimal.test;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Note_CheckEvent implements ItemListener {
	Sounds sound = new Sounds();
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		for (int j = 0; j < 80; j++) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[0][j]) {
					PianoCheckBox.note_check[0][j].setBackground(new Color(255, 0, 0));
					PianoCheckBox.note_check[0][j].setForeground(new Color(0, 0, 255));
				}
			} else {
				if (e.getSource() == PianoCheckBox.note_check[0][j]) {
					PianoCheckBox.note_check[0][j].setBackground(new Color(238, 238, 238));
					PianoCheckBox.note_check[0][j].setForeground(new Color(0, 0, 0));
				}
			}
			PianoCheckBox.select_sound[0][j] = PianoCheckBox.note_check[0][j];
		}

		for (int j = 0; j < 80; j++) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[1][j]) {
					PianoCheckBox.note_check[1][j].setBackground(new Color(255, 100, 0));
					PianoCheckBox.note_check[1][j].setForeground(new Color(0, 255, 0));
				}
			} else if (e.getStateChange() == ItemEvent.DESELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[1][j]) {
					PianoCheckBox.note_check[1][j].setBackground(new Color(238, 238, 238));
					PianoCheckBox.note_check[1][j].setForeground(new Color(0, 0, 0));
				}
			}
			PianoCheckBox.select_sound[1][j] = PianoCheckBox.note_check[1][j];
		}

		for (int j = 0; j < 80; j++) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[2][j]) {
					PianoCheckBox.note_check[2][j].setBackground(new Color(255, 255, 0));
					PianoCheckBox.note_check[2][j].setForeground(new Color(100, 0, 255));
				}
			} else if (e.getStateChange() == ItemEvent.DESELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[2][j]) {
					PianoCheckBox.note_check[2][j].setBackground(new Color(238, 238, 238));
					PianoCheckBox.note_check[2][j].setForeground(new Color(0, 0, 0));
				}
			}
			PianoCheckBox.select_sound[2][j] = PianoCheckBox.note_check[2][j];
		}

		for (int j = 0; j < 80; j++) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[3][j]) {
					PianoCheckBox.note_check[3][j].setBackground(new Color(0, 255, 0));
					PianoCheckBox.note_check[3][j].setForeground(new Color(255, 0, 0));
				}
			} else if (e.getStateChange() == ItemEvent.DESELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[3][j]) {
					PianoCheckBox.note_check[3][j].setBackground(new Color(238, 238, 238));
					PianoCheckBox.note_check[3][j].setForeground(new Color(0, 0, 0));
				}
			}
			PianoCheckBox.select_sound[3][j] = PianoCheckBox.note_check[3][j];
		}

		for (int j = 0; j < 80; j++) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[4][j]) {
					PianoCheckBox.note_check[4][j].setBackground(new Color(0, 100, 255));
					PianoCheckBox.note_check[4][j].setForeground(new Color(255, 100, 0));
				}
			} else if (e.getStateChange() == ItemEvent.DESELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[4][j]) {
					PianoCheckBox.note_check[4][j].setBackground(new Color(238, 238, 238));
					PianoCheckBox.note_check[4][j].setForeground(new Color(0, 0, 0));
				}
			}
			PianoCheckBox.select_sound[4][j] = PianoCheckBox.note_check[4][j];
		}

		for (int j = 0; j < 80; j++) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[5][j]) {
					PianoCheckBox.note_check[5][j].setBackground(new Color(0, 0, 255));
					PianoCheckBox.note_check[5][j].setForeground(new Color(255, 50, 0));
				}
			} else if (e.getStateChange() == ItemEvent.DESELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[5][j]) {
					PianoCheckBox.note_check[5][j].setBackground(new Color(238, 238, 238));
					PianoCheckBox.note_check[5][j].setForeground(new Color(0, 0, 0));
				}
			}
			PianoCheckBox.select_sound[5][j] = PianoCheckBox.note_check[5][j];
		}

		for (int j = 0; j < 80; j++) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[6][j]) {
					PianoCheckBox.note_check[6][j].setBackground(new Color(100, 0, 255));
					PianoCheckBox.note_check[6][j].setForeground(new Color(255, 255, 0));
				}
			} else if (e.getStateChange() == ItemEvent.DESELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[6][j]) {
					PianoCheckBox.note_check[6][j].setBackground(new Color(238, 238, 238));
					PianoCheckBox.note_check[6][j].setForeground(new Color(0, 0, 0));
				}
			}
			PianoCheckBox.select_sound[6][j] = PianoCheckBox.note_check[6][j];
		}
		
		for (int j = 0; j < 80; j++) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[7][j]) {
					PianoCheckBox.note_check[7][j].setBackground(new Color(255, 0, 0));
					PianoCheckBox.note_check[7][j].setForeground(new Color(0, 0, 255));
				}
			} else {
				if (e.getSource() == PianoCheckBox.note_check[7][j]) {
					PianoCheckBox.note_check[7][j].setBackground(new Color(238, 238, 238));
					PianoCheckBox.note_check[7][j].setForeground(new Color(0, 0, 0));
				}
			}
			PianoCheckBox.select_sound[7][j] = PianoCheckBox.note_check[7][j];
		}
		
		for (int j = 0; j < 80; j++) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[8][j]) {
					PianoCheckBox.note_check[8][j].setBackground(new Color(255, 100, 0));
					PianoCheckBox.note_check[8][j].setForeground(new Color(0, 255, 0));
				}
			} else if (e.getStateChange() == ItemEvent.DESELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[7][j]) {
					PianoCheckBox.note_check[8][j].setBackground(new Color(238, 238, 238));
					PianoCheckBox.note_check[8][j].setForeground(new Color(0, 0, 0));
				}
			}
			PianoCheckBox.select_sound[8][j] = PianoCheckBox.note_check[8][j];
		}
		
		for (int j = 0; j < 80; j++) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[9][j]) {
					PianoCheckBox.note_check[9][j].setBackground(new Color(255, 255, 0));
					PianoCheckBox.note_check[9][j].setForeground(new Color(100, 0, 255));
				}
			} else if (e.getStateChange() == ItemEvent.DESELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[2][j]) {
					PianoCheckBox.note_check[9][j].setBackground(new Color(238, 238, 238));
					PianoCheckBox.note_check[9][j].setForeground(new Color(0, 0, 0));
				}
			}
			PianoCheckBox.select_sound[9][j] = PianoCheckBox.note_check[9][j];
		}
		
		for (int j = 0; j < 80; j++) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[10][j]) {
					PianoCheckBox.note_check[10][j].setBackground(new Color(0, 255, 0));
					PianoCheckBox.note_check[10][j].setForeground(new Color(255, 0, 0));
				}
			} else if (e.getStateChange() == ItemEvent.DESELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[3][j]) {
					PianoCheckBox.note_check[10][j].setBackground(new Color(238, 238, 238));
					PianoCheckBox.note_check[10][j].setForeground(new Color(0, 0, 0));
				}
			}
			PianoCheckBox.select_sound[10][j] = PianoCheckBox.note_check[10][j];
		}
		
		for (int j = 0; j < 80; j++) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[11][j]) {
					PianoCheckBox.note_check[11][j].setBackground(new Color(0, 100, 255));
					PianoCheckBox.note_check[11][j].setForeground(new Color(255, 100, 0));
				}
			} else if (e.getStateChange() == ItemEvent.DESELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[4][j]) {
					PianoCheckBox.note_check[11][j].setBackground(new Color(238, 238, 238));
					PianoCheckBox.note_check[11][j].setForeground(new Color(0, 0, 0));
				}
			}
			PianoCheckBox.select_sound[11][j] = PianoCheckBox.note_check[11][j];
		}
		
		for (int j = 0; j < 80; j++) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[12][j]) {
					PianoCheckBox.note_check[12][j].setBackground(new Color(0, 0, 255));
					PianoCheckBox.note_check[12][j].setForeground(new Color(255, 50, 0));
				}
			} else if (e.getStateChange() == ItemEvent.DESELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[5][j]) {
					PianoCheckBox.note_check[12][j].setBackground(new Color(238, 238, 238));
					PianoCheckBox.note_check[12][j].setForeground(new Color(0, 0, 0));
				}
			}
			PianoCheckBox.select_sound[12][j] = PianoCheckBox.note_check[12][j];
		}
		
		for (int j = 0; j < 80; j++) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[13][j]) {
					PianoCheckBox.note_check[13][j].setBackground(new Color(100, 0, 255));
					PianoCheckBox.note_check[13][j].setForeground(new Color(255, 255, 0));
				}
			} else if (e.getStateChange() == ItemEvent.DESELECTED) {
				if (e.getSource() == PianoCheckBox.note_check[13][j]) {
					PianoCheckBox.note_check[13][j].setBackground(new Color(238, 238, 238));
					PianoCheckBox.note_check[13][j].setForeground(new Color(0, 0, 0));
				}
			}
			PianoCheckBox.select_sound[13][j] = PianoCheckBox.note_check[13][j];
		}
	}

}
