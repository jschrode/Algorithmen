package hm.edu.cs.algdat.maze.vis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import hm.edu.cs.algdat.maze.Maze;
import hm.edu.cs.algdat.maze.MazeCreator;

/**
 * Demo-Anwendung zur Visualisierung der Erstellung eines Labyrinths.
 * 
 * @author katz.bastian
 */
public class MazeApplication extends JFrame {

	private static final long serialVersionUID = 1L;
	private MazeCreator creator;
	private MazePanel comp;

	void reset(int rows, int col) {
		Maze maze = new Maze(rows, col);
		creator = new MazeCreator(maze);
		comp.setMaze(maze);
	}

	public MazeApplication(String string) {
		super(string);
		JPanel panel = new JPanel();
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		comp = new MazePanel(new Maze(1, 1));
		reset(20, 20);

		panel.add(comp);

		this.setLocationRelativeTo(null);
		this.setVisible(true);
		// Erzeuge Kodier-Button, binde Action, f�ge zum Panel hinzu
		JButton step = new JButton("Step");
		JButton step2 = new JButton("Complete");
		step.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creator.step();
				if (!creator.hasMoreSteps()) {
					step.setEnabled(false);
					step2.setEnabled(false);
				}
				repaint();
			}
		});
		panel.add(step);

		step2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				while (creator.hasMoreSteps()) {
					creator.step();
				}
				if (!creator.hasMoreSteps()) {
					step.setEnabled(false);
					step2.setEnabled(false);
				}
				repaint();

			}
		});
		panel.add(step2);

		JButton reset10 = new JButton("Reset 10x10");
		reset10.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				reset(10, 10);
				step.setEnabled(true);
				step2.setEnabled(true);
				repaint();

			}
		});
		panel.add(reset10);

		JButton reset20 = new JButton("Reset 20x20");
		reset20.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				reset(20, 20);
				step.setEnabled(true);
				step2.setEnabled(true);
				repaint();
			}
		});
		panel.add(reset20);

		// Layout
		GroupLayout layout = new GroupLayout(panel);
		panel.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createSequentialGroup().addComponent(comp).addGroup(layout.createParallelGroup(Alignment.CENTER)
						.addComponent(step).addComponent(step2).addComponent(reset10).addComponent(reset20)));
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.CENTER).addComponent(comp).addGroup(layout.createSequentialGroup()
						.addComponent(step).addComponent(step2).addComponent(reset10).addComponent(reset20)));

		// Optimiere Frame und mache sichtbar
		this.pack();
		this.setVisible(true);
	}

	/**
	 * Main-Methode.
	 * 
	 * @param args
	 *            Parameter. Werden ignoriert.
	 */
	public static void main(String[] args) {
		// Erzeuge Fenster
		new MazeApplication("A-maze-ing");
	}
}
