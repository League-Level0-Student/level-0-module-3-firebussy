import javax.swing.JOptionPane;

public class pro {
	public static void main(String[] args) {
		String u = JOptionPane.showInputDialog("Write A Word");
		String i = JOptionPane.showInputDialog("Write A Number");
		int r = Integer.parseInt(i);
		for (int q = 0; q < r; q++) {
			System.out.println(u);
		}

	}
}