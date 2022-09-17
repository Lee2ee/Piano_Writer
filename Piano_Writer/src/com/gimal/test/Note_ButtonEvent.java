package com.gimal.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Note_ButtonEvent implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		Sounds sound = new Sounds();
		if (action == "도") {
			sound.stream_do();
		} else if (action == "레") {
			sound.stream_re();
		} else if (action == "미") {
			sound.stream_mi();
		} else if (action == "파") {
			sound.stream_fa();
		} else if (action == "솔") {
			sound.stream_sol();
		} else if (action == "라") {
			sound.stream_la();
		} else if (action == "시") {
			sound.stream_ti();
		} else if (action == "도+") {
			sound.stream_do_plus();
		} else if (action == "레+") {
			sound.stream_re_plus();
		} else if (action == "미+") {
			sound.stream_mi_plus();
		} else if (action == "파+") {
			sound.stream_fa_plus();
		} else if (action == "솔+") {
			sound.stream_sol_plus();
		} else if (action == "라+") {
			sound.stream_la_plus();
		} else if (action == "시+") {
			sound.stream_ti_plus();
		}
	}
}
