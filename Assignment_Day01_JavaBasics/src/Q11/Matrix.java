/**
 * 
 */
package Q11;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Matrix {
	private int rows = 10;
	private int columns = 10;
	private int[][] matrix;
	/**
	 * 
	 */
	public Matrix() {
		this.matrix = new int[rows][columns];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				matrix[i][j] = 0;
			}
		}
	}
	
	
	/**
	 * @param rows
	 * @param columns
	 * @param matrix
	 */
	public Matrix(int rows, int columns) {
		this();
		this.rows = rows;
		this.columns = columns;
		this.matrix = new int[rows][columns];
		
	}
	
	public void setElements(int r, int c, int value) {
		matrix[r][c] = value;
	}
	
	public Matrix transpose() {
		Matrix transposed = new Matrix(this.rows, this.columns);
		
		for(int i = 0; i < this.rows; i++) {
			for(int j = 0; j < this.columns; j++) {
				transposed.setElements(i, j, this.matrix[j][i]);
			}
		}
		
		return transposed;
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				s += matrix[i][j] + " ";
			}
			s += "\n";
		}
		
		return s;
	}

	
}
