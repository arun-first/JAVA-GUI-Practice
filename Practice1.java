import javax.swing.*;

public class Practice1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Practice");
		JButton btn = new JButton("Biwi");
		frame.setVisible(true);
		frame.setSize(400, 500);
		frame.add(btn);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
