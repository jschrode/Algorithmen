package hm.edu.cs.algdat.maze;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import hm.edu.cs.algdat.disjointset.DisjointIntegerSets;
import hm.edu.cs.algdat.disjointset.MyDisjointIntegerSets;

/**
 * Klasse zum Erzeugen von Labyrinthen ({@link Maze}s). Erstellt zunächst alle
 * möglichen Wände und entfernt danach in zufälliger Reihenfolge Wände, die zwei
 * unverbundenen Felder trennen.
 * 
 * @author katz.bastian
 */
public class MazeCreator {

	private Maze maze;
	private Queue<Wall> wallsToCheck;
	private DisjointIntegerSets ds;

	/**
	 * Konstruktor.
	 * 
	 * @param maze
	 */
	public MazeCreator(Maze maze) {
		this.maze = maze;

		// Fülle das Labyrinth vollständig mit Wänden
		createAllWalls();

		// Speichere die Wände des Labyrinths in zufälliger Reihenfolge in eine
		// Queue, um sie in dieser Reihenfolge zu testen.
		LinkedList<Wall> shuffledWalls = new LinkedList<>(maze.getWalls());
		Collections.shuffle(shuffledWalls);
		this.wallsToCheck = shuffledWalls;

		// TODO: Sie sollten eine geeignete Disjoint-Set-Struktur
		// initialisieren.
	}

	/**
	 * Erstellt alle möglichen Wände im Labyrinth.
	 */
	private void createAllWalls() {
		// Erzeuge alle möglichen Wände!
		for (int row = 0; row < maze.getRows(); row++) {
			for (int col = 0; col < maze.getColumns(); col++) {
				if (row < maze.getRows() - 1) {
					maze.build(new Wall(row, col, Orientation.HORIZONTAL));
				}
				if (col < maze.getColumns() - 1) {
					maze.build(new Wall(row, col, Orientation.VERTICAL));
				}
			}
		}
	}

	/**
	 * @return {@code true}, wenn noch mindestens eine Wand nicht daraufhin
	 *         überprüft wurde, ob sie eingerissen werden kann, ohne einen Kreis
	 *         im Labyrinth zu erzeugen.
	 */
	public boolean hasMoreSteps() {
		return !wallsToCheck.isEmpty();
	}

	/**
	 * Überprüft für die nächste Wand, ob sie eingerissen werden kann und
	 * entfernt sie gegebenenfalls.
	 */
	public void step() {
		if (!hasMoreSteps()) {
			throw new RuntimeException("No more walls to tear.");
		}

		// Nächste Wand in der zufälligen Reihenfolge
		Wall wall = wallsToCheck.remove();

		// TODO: An dieser Stelle sollten Sie überprüfen, ob Sie die Wand
		// wirklich löschen müssen/dürfen, um ein Labyrinth zu erzeugen

		// Zu Demo-Zwecken werden alle Wände eingerissen.
		maze.tear(wall);
	}

}
