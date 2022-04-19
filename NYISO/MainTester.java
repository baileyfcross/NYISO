
/**
 * Write a description of class MainTester here.
 *
 * @author (Bailey Cross)
 * @version (Spring 2022)
 */
public class MainTester
{
    public static void main(String args[]){
        Main game = new Main();
        // Test Variables
        
        String t1,t2,t3,t4,t5;
        int j;
        
        /*
         * Test 1
         */
        t1 = "...c.....m";
        j = 5;
        
        System.out.println("Test1: \tExpected: boring without all three");
        System.out.println("Returned: " + game.isCaught(t1,j));
        
        /*
         * Test 2
         */
        t2 = "...c..D...m";
        j = 5;
        
        System.out.println("Test2: \tExpected: Protected!");
        System.out.println("Returned: " + game.isCaught(t2,j));
        
        
    }
}
