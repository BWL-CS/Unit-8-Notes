public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

      // Declare 2D Array[][]
      //Declare 2D Array with Type[][]
      int[][] coordinates;
      // Create 2D Array of a certain number
      //of rows and columns'
      coordinates = new int[5][5];
      //Default values for int: 0
      //TOTAL NUM OF ELEMENTS = renewal = 25


      // INITIALIZE (Declare + Create)
      String[][] seatingChart = new String[3][4];
      // Default values for String: null
      // TOTAL NUM OF ELEMENTS= renewal = 12

      //SET VALUES in a 2D Array
      seatingChart[0][0] = ("Jackson");
      seatingChart[1][0] = ("Finny");
      seatingChart[2][0] = ("Bryce");
      seatingChart[2][1] = ("Nat");
      seatingChart[2][2] = ("Paige");
      seatingChart[1][3] = ("Alex");
      seatingChart[2][3] = ("Zoie");
      seatingChart[0][3] = ("Maia");

      //INITIALIZER LIST
      // alternate way to initialize array
      // (when you know what values go where)
      int[][] minefield = {{7, -20,0},{0,50,-15},{-10,12,20}};
      
      // ACCESS a value with the double index operator
      // array[row][col]
      System.out.println("You earned " + minefield[1][1] + " points");
      //System.out.println("You earned " + minefield[][] + "points, yippee.");

      
   }
}
