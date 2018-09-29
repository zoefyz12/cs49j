
import java.awt.Color;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
/**
 * Describes a mosaic table top
 */
/**
 * This class is going to model a tile floor.
 * @author Fangyi Zhao
 *
 */
public class TileFloor
{
    public static final int RED = 0;
    public static final int GREEN = 1;
    public static final int BLUE = 2;
    public static final int BLACK = 3;
    public static final int CYAN = 4;
    
    public static final int GAP = 3;
    public static final int SIDE = 10;
    public static final int DEFAULT_ROWS = 8;
    public static final int DEFAULT_COLUMNS = 6;
    
    private Random random;
    private int x;
    private int y;
    
    //must be initialized in the constructors
    private  final int ROWS;
    private  final int COLUMNS;
    
    
    
    /**
     * Models a tile floor with upper left hand corner at x, y and square tiles with side of 10 with the 
     * default number of rows and columns
     * @param x the x coordinate of the upper left hand corner of the table top
     * @param y the x coordinate of the upper left hand corner of the table top
     */
    public TileFloor(int x, int y)
    {
        random = new Random(12345);
        ROWS = DEFAULT_ROWS;
        COLUMNS= DEFAULT_COLUMNS;
        this.x = x;
        this.y = y;
    }
    
    /**
     * Models a tile floor with upper left hand corner at x, y and square tiles with side of 10.
     * @param x the x coordinate of the upper left hand corner of the table top
     * @param y the x coordinate of the upper left hand corner of the table top
     * @param rows the number of rows in this TileFloor
     * @param columns the number of squares in each row of this TileFloor
     */
    public TileFloor( int x, int y, int rows, int columns)
    {
        random = new Random(12345);
        ROWS = rows;
        COLUMNS= columns;
        this.x = x;
        this.y = y;
    }
    /**
     * For this method is going to randomly draw a color object either red, green, blue, black, or cyan on the floor.
     * @return The selected color need to be returned.
     */
    private Color randomColor()
    {
    	int randomNum = random.nextInt(5);
    	
    	if (randomNum == RED)
    		return Color.RED;
    	else if (randomNum == GREEN)
    		return Color.GREEN;
    	else if (randomNum == BLUE)
    		return Color.BLUE;
    	else if (randomNum == BLACK)
    		return Color.BLACK;
    	else 
    		return Color.CYAN;
    	
		
    }
    
    /**
     * Sets a new x for  the table top
     * @param x the new x coordinate of this object.
     */
    public void setX(int x)
    {
        this.x = x;
    }
    
    /**
     * Sets a new y for  the table top
     * @param theY the new y coordinate of this object.
     */
    public void setY(int theY)
    {
        y = theY;
    }
    /**
     * For this draw method, draws the floor with the rows filled squares at the x, y coordinates.
     * @param g2 The format that can be draw. 
     */
    public void draw(Graphics2D g2)
    {
    	Rectangle box;
    	/**
    	 * The for loop to set the rows.
    	 */
    	for (int i = 0; i < ROWS; i++)
    	{
    		/**
    		 * The for loop to set the columns.
    		 */
    		for (int j = 0; j < COLUMNS; j++)
    		{
    			/**
    			 * When get the coordinate of the rows and column, then draw the little square.
    			 */
    			g2.setColor(randomColor());
    			box = new Rectangle(x + j  * (SIDE + GAP), y + i * (SIDE + GAP), SIDE, SIDE);
    			g2.fill(box);
    		}
    	}
    }
}      
   

