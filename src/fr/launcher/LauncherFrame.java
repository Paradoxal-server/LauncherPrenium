package fr.launcher;

import static fr.theshark34.swinger.Swinger.getResource;
import static fr.theshark34.swinger.Swinger.setResourcePath;
import static fr.theshark34.swinger.Swinger.setSystemLookNFeel;

import javax.swing.JFrame;

import fr.theshark34.openlauncherlib.launcher.util.WindowMover;

@SuppressWarnings("serial")
public class LauncherFrame extends JFrame{

	private static LauncherFrame instance;

	public LauncherFrame() {
		this.setTitle("Paradoxal Launcher");
		this.setSize(975, 625);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setIconImage(getResource("icon.png"));
		
		WindowMover mover = new WindowMover(this);
		this.addMouseListener(mover);
		this.addMouseMotionListener(mover);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		setSystemLookNFeel();
		setResourcePath("/fr/launcher/resources/");
		
		instance = new LauncherFrame();
	}
	
	public static LauncherFrame getinstance() {
		return instance;
	}

}
