package hm.edu.cs.algdat.maze;

/**
 * Repräsentation einer Wand. Eine Wand ist immer gekennzeichnet durch das Feld
 * links oder oberhalb der Wand und die Ausrichtung der Wand (horizontal oder
 * vertikal). Beispiel:
 * <ul>
 * <li>{@code new Wall(2,3,Orientation.VERTICAL)} beschreibt die Wand zwischen
 * dem Feld in Zeile 2, Spalte 3 und dem Feld in Zeile 2, Spalte 4 (rechts
 * daneben, denn die Wand ist vertikal).
 * <li>{@code new Wall(2,3,Orientation.HORIZONTAL)} beschreibt die Wand zwischen
 * dem Feld in Zeile 2, Spalte 3 und dem Feld in Zeile 3, Spalte 3 (unter dem
 * Referenzfeld, denn die Wand ist horizontal).
 * </ul>
 * 
 * @author katz.bastian
 *
 */
public class Wall {
	private int column;
	private int row;
	private Orientation orientation;

	public int getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public Wall(int row, int column, Orientation direction) {
		this.column = column;
		this.row = row;
		this.orientation = direction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + column;
		result = prime * result + ((orientation == null) ? 0 : orientation.hashCode());
		result = prime * result + row;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wall other = (Wall) obj;
		if (column != other.column)
			return false;
		if (orientation != other.orientation)
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	
	
}
