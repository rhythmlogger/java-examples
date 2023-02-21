import java.awt.BorderLayout;

import javax.swing.JFrame;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Main extends JFrame {
	public Main() {
		JFXPanel fxPanel = new JFXPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1600, 900);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		add(fxPanel, BorderLayout.CENTER);
		fxPanel.setSize(1600,900);
		Platform.runLater(new Runnable() { // this will run initFX as JavaFX-Thread
			@Override
			public void run() {
				initFX(fxPanel);
			}
		});
		setVisible(true);
	}

	private static void initFX(final JFXPanel fxPanel) {
		Group group = new Group();
		Scene scene = new Scene(group);
		fxPanel.setScene(scene);

		WebView webView = new WebView();

		group.getChildren().add(webView);
		webView.setMinSize(1600, 900);
		webView.setMaxSize(1600, 900);

		// Obtain the webEngine to navigate
		WebEngine webEngine = webView.getEngine();
		webEngine.load("http://www.google.com/");
	}

	public static void main(String[] args) {
		new Main();
	}
}
