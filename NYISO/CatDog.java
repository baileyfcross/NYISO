/**
 * This class will execute a function when an object instance is created of
 * it.
 * String argument will have the mouse, cat, and dog.
 * 
 * NOTE: I make the assumption that the user will only ever put three
 * players on the board, 1 cat, 1 mouse, 1 dog.
 * 
 * @param {string} x - takes in a string
 * @param {number} j the amount of spaces the cat can jump
 * 
 * @returns {string}
 * 
 * @author (Bailey Cross)
 * @version (Spring 2022)
 */
public class CatDog
{
    /*
     * Once we check that everything is there, we must play the game
     * 
     * A cat can jump j number of periods. The cat cannot jump over the
     * set amount or over the dog.
     * 
     * If the mouse is within the jump distance of the cat and not behind
     * the dog, then the cat catches the mouse.
     * 
     */
    public String isCaught(String x, int j){
        /*
         * I pull my string and put it all in lowercase so I can have
         * consistency searching the string.
         */
        
        String board;
        board = x.toLowerCase();
        
        // My flags to find the letters in the string
        boolean isC = false;
        boolean isM = false;
        boolean isD = false;

        //This is a char array so I can loop through the string.
        char[] strCharArr = board.toCharArray();
        
        // -1 because if it returns that, then we know there is a problem
        int catPos = -1;
        int mousePos = -1;

        // A for loop to go through the char array of the string x
        for(int i = 0; i < strCharArr.length; i++){
            
            /*
             * This for loop looks for each player in the game
             */
            if(strCharArr[i] == 'c'){
                isC = true;
                catPos = i;
            }
            if(strCharArr[i] == 'd'){
                isD = true;
            }
            if(strCharArr[i] == 'm'){
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
            return"boring without all three"; 
        }      
        
        /*
         * This is where we start to check the positions of each player
         * and the moves that are possible
         */
        if(mousePos > catPos){           

            // If the difference between the m and c is greater than the
            // c's ability to jump, then it automatically escapes
            if((mousePos - catPos) > j){
                return "Escaped!";
            }

            // This loop should only run if the first if statement 
            // didn't return
            for(int i = catPos; i < mousePos; i++){
                if (strCharArr[i] == 'd'){
                    return "Protected!";
                }
            }
            return "Caught!";
        }
        /*
         * If the catPos is greater than the mousePos, then we will 
         * have to do a loop going the opposite way
         * 
         * Note: I do an else if statement just so I can return if there's
         * been an error in the code
         * 
         */
        else if(catPos > mousePos){
            
            // If the difference between the catPos and the mousePos is
            // greater than j, then return escape
            if((catPos - mousePos) > j){
                return "Escaped!";
            }
            
            // This loop should only run if the first if statement 
            // didn't return
            for(int i = catPos; i > mousePos; i--){
                if (strCharArr[i] == 'd'){
                    return "Protected!";
                }
            }
            return "Caught!";
        }
        return "There has been an error";
    }
}