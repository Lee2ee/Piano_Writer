package com.gimal.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

public class PianoCheckBox extends JFrame {
	private static final long serialVersionUID = 1L;
	// 각종 배열
	public static JCheckBox select_sound[][] = new JCheckBox[14][80];
	public static JCheckBox note_check[][] = new JCheckBox[14][80];
	JMenuItem menuItem[] = new JMenuItem[4];
	JButton note_button[] = new JButton[14];
	JButton control_button[] = new JButton[3];
	
	JScrollPane checkScroll , northScroll;

	public PianoCheckBox() {
		Container ct = getContentPane();

		JPanel northP, north_1, north_2, centerP, southP;
		String note_str[] = { "도", "레", "미", "파", "솔", "라", "시", "도+", "레+", "미+", "파+", "솔+", "라+", "시+" };
		String mi_str[] = { "Save", "Open", "Reset", "Logout" };
		String control_str[] = { "STOP", "PLAY", "PAUSE" };

		// 메뉴바
		JMenuBar menu = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		for (int i = 0; i < menuItem.length; i++) {
			menuItem[i] = new JMenuItem(mi_str[i]);
			menuItem[i].addActionListener(new Menu_Event());
			fileMenu.add(menuItem[i]);
		}
		menu.add(fileMenu);
		setJMenuBar(menu);

		northP = new JPanel();
		northP.setLayout(new BorderLayout(10, 10));
		northP.setPreferredSize(new Dimension(1400, 750));

		// 메인 (버튼)생성
		north_1 = new JPanel();
		north_1.setLayout(new GridLayout(14, 1, 10, 10));
		for (int i = 0; i < note_button.length; i++) {
			note_button[i] = new JButton(note_str[i]);
			note_button[i].setPreferredSize(new Dimension(300, 50));
			note_button[i].addKeyListener(new Key_ButtonEvent());
			north_1.add(note_button[i]);
		}

		// 메인 (체크박스)생성
		north_2 = new JPanel();
		north_2.setLayout(new GridLayout(14, 1, 10, 10));
		
		for (int i = 0; i < note_button.length; i++) {
			for (int j = 0; j < 80; j++) {
				note_check[i][j] = new JCheckBox(note_str[i], false);
				note_check[i][j].setBorderPainted(true);
				note_check[i][j].addItemListener(new Note_CheckEvent());
				north_2.add(note_check[i][j]);
			}
		}
		checkScroll = new JScrollPane(north_2, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);		
		checkScroll.getHorizontalScrollBar().setUnitIncrement(100);
		
		// 상단 패널에 부착
		northP.add(north_1, BorderLayout.WEST);
		northP.add(checkScroll, BorderLayout.CENTER);
		
		northScroll = new JScrollPane(northP, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		northScroll.setPreferredSize(new Dimension(1400, 500));
		northScroll.getVerticalScrollBar().setUnitIncrement(15);

		// 프로그레스 바
		centerP = new JPanel();
		centerP.setLayout(new GridLayout(1, 1, 10, 10));
		JProgressBar pb = new JProgressBar();
		pb.setValue(0);
		pb.setStringPainted(true);
		Border pbborder = BorderFactory.createTitledBorder("진행률...");
		pb.setBorder(pbborder);
		centerP.add(pb);

		// 정지 시작 일시정지 버튼
		southP = new JPanel();
		southP.setLayout(new GridLayout(1, 3, 100, 10));
		for (int i = 0; i < control_button.length; i++) {
			control_button[i] = new JButton(control_str[i]);
			control_button[i].setPreferredSize(new Dimension(10, 80));
			control_button[i].addActionListener(new Control_ButtonEvent());
			southP.add(control_button[i]);
		}

		// 버튼컬러
		note_button[0].setBackground(new Color(255, 0, 0)); // 빨
		note_button[1].setBackground(new Color(255, 100, 0)); // 주
		note_button[2].setBackground(new Color(255, 255, 0)); // 노
		note_button[3].setBackground(new Color(0, 255, 0)); // 초
		note_button[4].setBackground(new Color(0, 100, 255)); // 파
		note_button[5].setBackground(new Color(0, 0, 255)); // 남
		note_button[6].setBackground(new Color(100, 0, 255)); // 보
		note_button[7].setBackground(new Color(255, 0, 0)); // 빨
		note_button[8].setBackground(new Color(255, 100, 0)); // 주
		note_button[9].setBackground(new Color(255, 255, 0)); // 노
		note_button[10].setBackground(new Color(0, 255, 0)); // 초
		note_button[11].setBackground(new Color(0, 100, 255)); // 파
		note_button[12].setBackground(new Color(0, 0, 255)); // 남
		note_button[13].setBackground(new Color(100, 0, 255)); // 보

		// 글꼴컬러
		note_button[0].setForeground(new Color(0, 255, 0));
		note_button[1].setForeground(new Color(0, 0, 255));
		note_button[2].setForeground(new Color(100, 0, 255));
		note_button[3].setForeground(new Color(255, 0, 0));
		note_button[4].setForeground(new Color(255, 100, 0));
		note_button[5].setForeground(new Color(255, 50, 0));
		note_button[6].setForeground(new Color(255, 255, 0));
		note_button[7].setForeground(new Color(0, 255, 0));
		note_button[8].setForeground(new Color(0, 0, 255));
		note_button[9].setForeground(new Color(100, 0, 255));
		note_button[10].setForeground(new Color(255, 0, 0));
		note_button[11].setForeground(new Color(255, 100, 0));
		note_button[12].setForeground(new Color(255, 50, 0));
		note_button[13].setForeground(new Color(255, 255, 0));

		// 글꼴
		for (int i = 0; i < note_button.length; i++) {
			note_button[i].setFont(new Font("MapleStory Bold", Font.BOLD, 40));
		}

		// 컨테이너에 붙이기
		ct.add(northScroll, BorderLayout.NORTH);
		ct.add(centerP, BorderLayout.CENTER);
		ct.add(southP, BorderLayout.SOUTH);

		// 여백
		north_1.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));
		northScroll.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		centerP.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		southP.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		// 기본설정
		setTitle("Piano");
		setSize(1400, 750);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PianoCheckBox();
	}
}