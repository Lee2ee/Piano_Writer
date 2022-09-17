package thread.zip.many;

import javax.swing.JOptionPane;

import com.gimal.test.PianoCheckBox;
import com.gimal.test.Sounds;

public class LaPlusThread implements Runnable {
	Sounds sound = new Sounds();

	public void run() {
		try {
			// 라 출력
			for (int i = 0; i < 80; i++) {
				if (!PianoCheckBox.select_sound[12][i].isSelected()) {
					Thread.sleep(500);
				} else if (PianoCheckBox.select_sound[12][i].isSelected()) {
					sound.stream_la();
					Thread.sleep(500);
				}
			}
		} catch (Exception ae) {
			JOptionPane.showMessageDialog(null, "실행중 오류 발생");
		}
	}
}
