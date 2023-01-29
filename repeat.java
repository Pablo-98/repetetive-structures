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

    /* 
    //while loop 

        int counter = 0; //(1) declaration and assignment of variable
        while (counter < 5 ) { (2) the while loops evaluates the value of the counter variable and while the condition is met the code block executes
            // I am a comment inside the scope of the while loop
            System.out.println("Hello"); // (3)  this line of code is executed because the while loops condition is true 
            counter = counter +1; // (4)  update of the controle variable. In this case, an update to counter

    */

    // for loop 
    //postfix operator: ++ --

    // BODY UPDATE CONDITION
    //        (1)            (2)              (4)
    for(int counter = 0; counter < 5 ; counter++) {
        System.out.println("Hello world"); //(3)
    }

    //do-while loop

    /*
     * (1) initialization
     * do{
     * (3) body of the loop
     * (4) update of control variable
     * } while (condition); (4) 
     */

    /*example
     * do{
     * System.out.println("Hello world");
     * counter = counter +1;
     * } while (counter < 5); 
     * 
     */


        }

        

    }
