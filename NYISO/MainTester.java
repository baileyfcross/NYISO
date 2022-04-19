
/**
 * This Class tests the CatDog class
 *
 * @author (Bailey Cross)
 * @version (Spring 2022)
 */
public class MainTester
{
    public static void main(String args[]){
        CatDog game = new CatDog();
        // Test Variables
        
        String t1,t2,t3,t4,t5,t6;
        int j;
        
        /*
         * Test 1
         * Test for 3 players
         */
        t1 = "...c.....m";
        j = 5;
        
        System.out.println("Test 1: Expected: boring without all three");
        System.out.println("Returned: " + game.isCaught(t1,j));
        Spacer();
        
        /*
         * Test 2
         * test for protection and uppercase input
         */
        t2 = "...c..DM..";
        j = 5;
        
        System.out.println("Test 2: Expected: Protected!");
        System.out.println("Returned: " + game.isCaught(t2,j));
        Spacer();
        
        /*
         * Test 3
         * test for caught
         */
        t3 = "..c.m.d..";
        j = 5;
        
        System.out.println("Test 3: Expected: Caught!");
        System.out.println("Returned: " + game.isCaught(t3,j));
        Spacer();
        
        /*
         * Test 4
         * test for backwards protection with fringe mouse
         */
        t4 = ".m...dc....";
        j = 5;
        
        System.out.println("Test 4: Expected: Protected!");
        System.out.println("Returned: " + game.isCaught(t4,j));
        Spacer();
        /*
         * Test 5
         * Testing backwords catch with different j
         */
        t5 = "..m.....c..d..";
        j = 6;
        
        System.out.println("Test 5: Expected: Caught!");
        System.out.println("Returned: " + game.isCaught(t5,j));
        Spacer();
        
        /*
         * Test 6
         * Testing bounds and making sure they are right
         */
        t6 = "m..........cd";
        j = 10;
        
        System.out.println("Test 6: Expected: Escaped!");
        System.out.println("Returned: " + game.isCaught(t6,j));
    }
    
    public static void Spacer(){
        System.out.println();
    }
}
