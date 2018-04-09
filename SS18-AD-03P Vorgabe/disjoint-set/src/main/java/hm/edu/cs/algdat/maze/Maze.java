package hm.edu.cs.algdat.maze;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 * Einfache Klasse für ein Labyrinth. Ein Labyrinth hat eine Anzahl Zeilen und
 * Spalten und eine Menge an Wänden. Wände können ergänzt oder eingerissen
 * werden.
 * 
 * @author katz.bastian
 */
public class Maze {

	private int rows;
	private int columns;
	private Collection<Wall> walls;

	/**
	 * Erzeugt ein neues Labyrinth mit allen möglichen Wänden.
	 * 
	 * @param rows
	 *            Anzahl der Felder vertikal
	 * @param columns
	 *            Anzahl der Felder horizontal
	 */
	public Maze(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		this.walls = new HashSet<Wall>();
	}

	/**
	 * @return Anzahl der Felder vertikal
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * @return Anzahl der Felder horizontal
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * Erstellt eine Wand (sofern diese nicht schon existiert).
	 * 
	 * @param wall
	 *            zu ergänzende Wand.
	 */
	public void build(Wall wall) {
		if (!walls.contains(wall)) {
			walls.add(wall);
		}
	}

	/**
	 * Entfernt eine Wand.
	 * 
	 * @param wall
	 *            zu entfernende Wand.
	 */
	public void tear(Wall wall) {
		walls.remove(wall);
	}

	/**
	 * Liefert alle Wände des Labyrinths zurück.
	 * 
	 * @return
	 */
	public Collection<Wall> getWalls() {
		return Collections.unmodifiableCollection(walls);
	}

}
