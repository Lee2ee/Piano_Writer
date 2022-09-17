package com.gimal.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import thread.zip.many.*;


public class Control_ButtonEvent implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		Runnable dothread = new DoThread();
		Runnable rethread = new ReThread();
		Runnable mithread = new MiThread();
		Runnable fathread = new FaThread();
		Runnable solthread = new SolThread();
		Runnable lathread = new LaThread();
		Runnable tithread = new TiThread();
		Runnable doPthread = new DoPlusThread();
		Runnable rePthread = new RePlusThread();
		Runnable miPthread = new MiPlusThread();
		Runnable faPthread = new FaPlusThread();
		Runnable solPthread = new SolPlusThread();
		Runnable laPthread = new LaPlusThread();
		Runnable tiPthread = new TiPlusThread();

		Thread t1 = new Thread(dothread);
		Thread t2 = new Thread(rethread);
		Thread t3 = new Thread(mithread);
		Thread t4 = new Thread(fathread);
		Thread t5 = new Thread(solthread);
		Thread t6 = new Thread(lathread);
		Thread t7 = new Thread(tithread);
		Thread t8 = new Thread(doPthread);
		Thread t9 = new Thread(rePthread);
		Thread t10 = new Thread(miPthread);
		Thread t11 = new Thread(faPthread);
		Thread t12 = new Thread(solPthread);
		Thread t13 = new Thread(laPthread);
		Thread t14 = new Thread(tiPthread);

		if (action == "PLAY") {
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			t6.start();
			t7.start();
			t8.start();
			t9.start();
			t10.start();
			t11.start();
			t12.start();
			t13.start();
			t14.start();
		} else if (action == "STOP") {
			JOptionPane.showMessageDialog(null, "기능 미구현", "정지가 안됩니다", 1);
			
		} else if (action == "PAUSE") {
			JOptionPane.showMessageDialog(null, "기능 미구현", "정지가 안됩니다", 1);
		}
	}

}
