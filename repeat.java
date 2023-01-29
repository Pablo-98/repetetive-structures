public class repeat {
    public static void main( String[] args){

    /* 
    components of a while loop:
     * (1) initialization of control variable
     * 2) while(condition){
     * 3) body of loop
     * 4) update of control variable
     * }
     */
        //initialize counter 

        int counter = 0; // declaration and assignment of variable
        while (counter < 5 ) { // the while loops evaluates the value of the counter variable and while the condition is met the code block executes
            // I am a comment inside the scope of the while loop
            System.out.println("Hello"); // this line of code is executed because the while loops condition is true 
            counter = counter +1; // update of the controle variable. In this case, an update to counter
        }

        

    }
}