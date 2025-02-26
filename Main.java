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

      // Nested loops are necessary to traverse 2D arrays
      //ENHANCED FOR-EACH LOOP to "visit" all items in order
      // OUTER LOOP iterates through each row
      //IMPORTANT Data type of a ROW is a 1D Array
      for (String[] row : seatingChart){
         //INNER loop iterates through certain values
         for(String col : row ) {
            System.out.print(col + " ");



         }
         System.out.println(); // Line break between rows
      }

      // Cannot end for ech if you want to MODIFY VALUES
      // or iterate in a different number
      //STANDARD ("ndexed") FOR LOOP
      for(int row = 0; row < minefield.length; row++){
         // array[0].lenght represents NUMBER OF COLUMNS in a row
         for(int col =0; col < minefield[0].length; col++){
            // if spot is a "bomb" (negative num, replace if
            if(minefield[row][col] < 0){
               minefield[row][col] = minefield[row][col] * -1;
            }
            System.out.print("[" + minefield[row][col] + "]");
         }
         System.out.println();

      }

      /*char[] asciArt = { 

         {'m','m','m'},
         {')','-','('},
        {'(',' ',' ',' ',')'},
        {'|',' ', ' ','|'},
        {'|',' ',' ',' ','|'},
        {'|','_','_','_','|'}
      };*/

      /*for(char[] row : asciArt){
         for (char col : row){
            System.out.println(col);
            
         }
         System.out.println();
      }
   }*/
}

}
