package thread.zip.many;

import javax.swing.JOptionPane;

import com.gimal.test.PianoCheckBox;
import com.gimal.test.Sounds;

public class SolPlusThread implements Runnable {
	Sounds sound = new Sounds();

	public void run() {
		try {
			// 솔 출력
			for (int i = 0; i < 80; i++) {
				if (!PianoCheckBox.select_sound[11][i].isSelected()) {
					Thread.sleep(500);
				} else if (PianoCheckBox.select_sound[11][i].isSelected()) {
					sound.stream_sol();
					Thread.sleep(500);
				}
			}
		} catch (Exception ae) {
			JOptionPane.showMessageDialog(null, "실행중 오류 발생");
		}
	}
}