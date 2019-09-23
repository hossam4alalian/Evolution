import javax.swing.JFrame;

public class main extends JFrame {
	gui g= new gui();
	public main() {
		setSize(1200,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(g);
		setVisible(true);
	}

	public static void main(String[] args) {
		new main();
	}

}
