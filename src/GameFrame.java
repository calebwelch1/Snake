import javax.swing.JFrame;

public class GameFrame extends JFrame{
	
	GameFrame() {
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		// pack takes frame and sets it around all components added to frame
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
