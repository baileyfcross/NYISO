
/**
 * This class will take in a String argument within args[0].
 * This String argument will have the mouse, cat, and dog.
 *
 * @author (Bailey Cross)
 * @version (Spring 2022)
 */
public class Main
{
    // Static variable because we want it to belong to the class
    private static int catPos = -1;
    private static int mousePos = -1;
    public static void main(String args[]){       
        if(args.length != 2){
            System.out.println("Usage: args[0]:x string, args[1] j int");
        }

        /*
         * I pull my string and put it all in lowercase so I can have
         * consistency searching the string.
         * 
         * I also take the second args argument and turn that into an int
         */
        String x = args[0].toLowerCase();
        int j = Integer.parseInt(args[1]);
        // My flags to find the letters in the string
        boolean isC = false;
        boolean isM = false;
        boolean isD = false;

        //This is a char array so I can loop through the string.
        char[] tempCharArr = x.toCharArray();

        // A for loop to go through the char array of the string x
        for(int i = 0; i < tempCharArr.length; i++){
            if(tempCharArr[i] == 'c'){
                isC = true;
                catPos = i;
            }
            if(tempCharArr[i] == 'd'){
                isD = true;
            }
            if(tempCharArr[i] == 'm'){
                isM = true;
                mousePos = i;
            }

            // Will break the loop early if all are found before the end
            if(isC && isM && isD){
                break;
            }
        }

        /*
         * If one of the flags are activated, then that means there
         * isn't enough players in the game
         */
        if((isC == false || isM == false|| isD == false)){
            System.out.println("boring without all three"); 
            return;
        }      

        // Creates an object of the main class to run the test function
        Main game = new Main();
        System.out.println(game.isCaught(x,j));
    }

    /*
     * Once we check that everything is there, we must play the game
     * 
     * A cat can jump j number of periods. The cat cannot jump over the
     * set amount or over the dog.
     * 
     * If the mouse is within the jump distance of the cat and not behind
     * the dog, then the cat catches the mouse.
     */
    public String isCaught(String x, int j){
        String tempX = x.toLowerCase();
        char[] tempCharArr = tempX.toCharArray();
        tempX = x.toLowerCase();
        
        if(mousePos > catPos){           
            
            // If the difference between the m and c is greater than the
            // c's ability to jump, then it automatically escapes
            if((mousePos - catPos) > j){
                return "Escaped!";
            }
            
            // This loop should only run if the first if statement 
            // didn't return
            for(int i = catPos; i < mousePos; i++){
                if (tempCharArr[i] == 'd'){
                    return "Protected!";
                }
            }
            return "Caught!";
        }
        
        else if(catPos > mousePos){
            if((catPos - mousePos) > j){
                return "Escaped!";
            }
            
            // This loop should only run if the first if statement 
            // didn't return
            for(int i = catPos; i > mousePos; i--){
                if (tempCharArr[i] == 'd'){
                    return "Protected!";
                }
            }
            return "Caught!";
        }
        return "There has been an error";
    }
}