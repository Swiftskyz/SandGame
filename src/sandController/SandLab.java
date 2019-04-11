package sandController;

import java.awt.*;
import java.util.*;

public class SandLab
{
  //Step 4,6
  //add constants for particle types here
  public static final int EMPTY = 0;
  public static final int METAL = 1;
  public static final int SAND = 2;
  public static final int WATER = 3;
  public static final int ACID = 4;
  public static final int HELIUM = 5;
  public static final int FIRE = 6;
  public static final int EXPLOSION = 7;
  public static final int GRASS = 8;
  public static final int FUZZY_BUNNY = 9;
  
  //do not add any more fields below
  private int[][] grid;
  private SandDisplay display;
  
  
  /**
   * Constructor for SandLab
   * @param numRows The number of rows to start with
   * @param numCols The number of columns to start with;
   */
  public SandLab(int numRows, int numCols)
  {
    String[] names;
    // Change this value to add more buttons
    //Step 4,6
    names = new String[2];
    // Each value needs a name for the button
    names[EMPTY] = "Empty";
    names[METAL] = "Metal";
    names[SAND] = "Sand";
    names[WATER] = "Agua";
    names[ACID] = "acid";
    names[HELIUM] = "helium";
    names[FIRE] = "fire";
    names[EXPLOSION] = "explosion";
    names[GRASS] = "grass";
    names[FUZZY_BUNNY] = "Bunnies";
    
    
    //1. Add code to initialize the data member grid with same dimensions
    grid = new int[numRows][numCols];
    
    display = new SandDisplay("Falling Sand", numRows, numCols, names);
  }
  
  //called when the user clicks on a location using the given tool
  private void locationClicked(int row, int col, int tool)
  {
    //2. Assign the values associated with the parameters to the grid
   
  }

  //copies each element of grid into the display
  public void updateDisplay()
  {
	  for (int row = 0; row < grid.length; row++)
	  {
		  for(int col = 0; col < grid[0].length; col++)
		  {
			  Color drawColor;
			  if (grid[row][col] == EMPTY)
			  {
				  drawColor = Color.BLACK;
			  }
			  else if (grid[row][col] == METAL)
			  {
				  drawColor = Color.GRAY;
			  }
			  else if (grid[row][col] == SAND)
			  {
				  drawColor = Color.YELLOW;
			  }
			  else if (grid[row][col] == WATER)
			  {
				  drawColor = Color.BLUE;
			  }
			  else if (grid[row][col] == ACID)
			  {
				  drawColor = Color.MAGENTA;
			  }
			  else if (grid[row][col] == HELIUM)
			  {
				  drawColor = Color.WHITE;
			  }
			  else if (grid[row][col] == FIRE)
			  {
				  drawColor = Color.RED;
			  }
			  else if (grid[row][col] == EXPLOSION)
			  {
				  int red = (int) (Math.random() * 256);
				  int green = (int) (Math.random() * 40);
				  int blue = (int) (Math.random() * 256);
				  
				  drawColor = new Color(red, green, blue);
			  }
		  }
	  }
	  
	  
      //Step 3
   //Hint - use a nested for loop
    
  }

  //Step 5,7
  //called repeatedly.
  //causes one random particle in grid to maybe do something.
  public void step()
  {
    //Remember, you need to access both row and column to specify a spot in the array
    //The scalar refers to how big the value could be
    //int someRandom = (int) (Math.random() * scalar)
    //remember that you need to watch for the edges of the array
    
    
  }
  
  //do not modify this method!
  public void run()
  {
    while (true) // infinite loop
    {
      for (int i = 0; i < display.getSpeed(); i++)
      {
        step();
      }
      updateDisplay();
      display.repaint();
      display.pause(1);  //wait for redrawing and for mouse
      int[] mouseLoc = display.getMouseLocation();
      if (mouseLoc != null)  //test if mouse clicked
      {
        locationClicked(mouseLoc[0], mouseLoc[1], display.getTool());
      }
    }
  }
}
