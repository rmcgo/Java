package main.rmcgo.seven.two;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.*;

/**
 * A modification of the image viewer program that logs various events.
 */
public class LoggingImageViewer {
	public static void main(String[] args) {
		if (System.getProperty("java.util.logging.config.class") == null && System.getProperty("java.util.logging.config.file") == null) {
			try {
				Logger.getLogger("main.rmcgo.seven").setLevel(Level.ALL);
				final int LOG_ROTATION_COUNT = 10;
				var handler = new FileHandler("%h/LoggingImageViewer.log", 0, LOG_ROTATION_COUNT);
				Logger.getLogger("main.rmcgo.seven").addHandler(handler);
			} catch (IOException e) {
				Logger.getLogger("main.rmcgo.seven").log(Level.SEVERE,
						"Can't create log file handler", e);
			}
		}

		EventQueue.invokeLater(() -> {
			var windowHandler = new WindowHandler();
			windowHandler.setLevel(Level.ALL);
			Logger.getLogger("main.rmcgo.seven").addHandler(windowHandler);

			var frame = new ImageViewerFrame();
			frame.setTitle("LOggingImageViewer");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			Logger.getLogger("main.rmcgo.seven").fine("Showing frame");
			frame.setVisible(true);
		});
	}
}

/**
 * The frame that shows the image
 */
class ImageViewerFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 600;
	private static final int DEFAULT_HEIGHT = 800;

	private JLabel label;
	private static Logger logger = Logger.getLogger("main.rmcgo.seven");

	public ImageViewerFrame() {
		logger.entering("ImageViewerFrame", "<init>");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// set up menu bar
		var menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		var menu = new JMenu("File");
		menuBar.add(menu);

		var openItem = new JMenuItem("Open");
		menu.add(openItem);
		openItem.addActionListener(new FileOpenListener());

		var exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		exitItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				logger.fine("Exiting.");
				System.exit(0);
			}
		});

		// use a label to display the images
		label = new JLabel();
		add(label);
		logger.exiting("ImageViewerFrame", "<init>");
	}

	private class FileOpenListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			logger.entering("ImageViewerFrame.FileOpenListener", "actionPerformed", e);

			// set up file chooser
			var chooser = new JFileChooser();
			chooser.setCurrentDirectory(new File("."));

			// accept all files ending with .gif
			chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
				@Override
				public boolean accept(File f) {
					return f.getName().toLowerCase().endsWith(".gif") || f.isDirectory();
				}

				@Override
				public String getDescription() {
					return "GIF Images";
				}
			});

			// show file chooser dialog
			int r = chooser.showOpenDialog(ImageViewerFrame.this);

			// if image file accepted, set it as icon of the label
			if (r == JFileChooser.APPROVE_OPTION) {
				String name = chooser.getSelectedFile().getPath();
				logger.log(Level.FINE, "Reading file {0}", name);
				label.setIcon(new ImageIcon(name));
			} else logger.fine("File open dialog canceled.");
			logger.exiting("ImageViewerFrame,FileOpenListener", "actionPerformed");
		}
	}
}

/**
 * A handler for displaying log records in a window
 */
class WindowHandler extends StreamHandler {
	private JFrame frame;

	public WindowHandler() {
		frame = new JFrame();
		var output = new JTextArea();
		output.setEditable(false);
		frame.setSize(500, 500);
		frame.add(new JScrollPane(output));
		frame.setFocusableWindowState(false);
		frame.setVisible(true);
		setOutputStream(new OutputStream() {
			@Override
			public void write(int b) throws IOException {

			}

			public void write(byte[] b, int off, int len) {
				output.append(new String(b, off, len));
			}
		});
	}

	public void publish(LogRecord record) {
		if (!frame.isVisible()) return;
		super.publish(record);
		flush();
	}
}




















