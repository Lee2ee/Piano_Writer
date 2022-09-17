package com.gimal.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Menu_Event implements ActionListener {


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		// 메뉴바 이벤트
		if (action == "Save") {
			JOptionPane.showMessageDialog(null, "Save Test");
		} else if (action == "Open") {
			JOptionPane.showMessageDialog(null, "Open Test");
		} else if (action == "Reset") {
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 20; j++) {
					PianoCheckBox.note_check[i][j].setSelected(false);
				}
			}

		} else if (action == "Logout") {
			
		}
	}

}
