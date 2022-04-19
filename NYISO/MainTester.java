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
        String t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
        int j;
        
        /*
         * Test 1
         * Test for 3 players with no tokens
         */
        t1 = "........";
        j = 5;
        
        System.out.println("Test 1: Expected: boring without all three");
        System.out.println("Returned: " + game.isCaught(t1,j));
        Spacer();
        
        /*
         * Test 2
         * Test for 3 players again with undefined player token
         */
        t2 = "...f....";
        j = 5;
        
        System.out.println("Test 2: Expected: boring without all three");
        System.out.println("Returned: " + game.isCaught(t2,j));
        Spacer();
        
        /*
         * Test 3
         * Test for 3 players with two tokens
         */
        t3 = "...c.....m";
        j = 5;
        
        System.out.println("Test 3: Expected: boring without all three");
        System.out.println("Returned: " + game.isCaught(t3,j));
        Spacer();
        
        /*
         * Test 4
         * test for forward caught and three valid tokens
         */
        t4 = "..c.m.d..";
        j = 5;
        
        System.out.println("Test 4: Expected: Caught!");
        System.out.println("Returned: " + game.isCaught(t4,j));
        Spacer();
        
        /*
         * Test 5
         * test for forward catch and uppercase input
         */
        t5 = "...C..MD..";
        j = 5;
        
        System.out.println("Test 5: Expected: Caught!");
        System.out.println("Returned: " + game.isCaught(t5,j));
        Spacer();
        
        /*
         * Test 6
         * test for protection and uppercase input
         */
        t6 = "...c..DM..";
        j = 5;
        
        System.out.println("Test 6: Expected: Protected!");
        System.out.println("Returned: " + game.isCaught(t6,j));
        Spacer();
        
        
        /*
         * Test 7
         * test for forward escape with mouse on the fringe
         */
        t7 = ".c.....d.m..";
        j = 5;
        
        System.out.println("Test 7: Expected: Escape!");
        System.out.println("Returned: " + game.isCaught(t7,j));
        Spacer();
        
        /*
         * Test 8
         * Testing backward catch with different jump space
         */
        t8 = "..m.....c..d..";
        j = 6;
        
        System.out.println("Test 8: Expected: Caught!");
        System.out.println("Returned: " + game.isCaught(t8,j));
        Spacer();
        
        /*
         * Test 9
         * test for backwards protection with mouse on the fringe
         */
        t9 = ".m...dc....";
        j = 5;
        
        System.out.println("Test 9: Expected: Protected!");
        System.out.println("Returned: " + game.isCaught(t9,j));
        Spacer();
        
        /*
         * Test 10
         * Testing backward escape with different j
         */
        t10 = "m..........cd";
        j = 10;
        
        System.out.println("Test 10: Expected: Escaped!");
        System.out.println("Returned: " + game.isCaught(t10,j));
        Spacer();
    }
    
    public static void Spacer(){
        System.out.println();
    }
}
