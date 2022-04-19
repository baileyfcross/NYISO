
/**
 * This class will take in a String argument within args[0].
 * This String argument will have the mouse, cat, and dog.
 *
 * @author (Bailey Cross)
 * @version (Spring 2022)
 */
public class Main
{
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
        /*
         * I pull my string and put it all in lowercase so I can have
         * consistency searching the string.
         * 
         * I also take the second args argument and turn that into an int
         */
        String tempX;
        tempX = x.toLowerCase();
        // My flags to find the letters in the string
        boolean isC = false;
        boolean isM = false;
        boolean isD = false;

        //This is a char array so I can loop through the string.
        char[] tempCharArr = tempX.toCharArray();
        
        int catPos = -1;
        int mousePos = -1;
        
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
            return"boring without all three"; 
        }      

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
        /*
         * If the catPos is greater than the mousePos, then we will 
         * have to do a loop going the opposite way
         * 
         * Note: I do an else if statement just so I can return if there's
         * been an error in the code
         * 
         */
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