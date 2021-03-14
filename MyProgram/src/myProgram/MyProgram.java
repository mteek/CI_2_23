package myProgram;

import java.util.Scanner;


public class MyProgram {
	///joke
	Scanner input ; 
	String name = "";
	String reply = "";     //what does resolve mean in this ide?
    static int ageLimit = 18; 
	int age = 0; 
 
public static void main (String []args){

Scanner input = new Scanner(System.in);///why is my compiler flagging this?///
 
//When getting input using userInput.nextLine(),the data is captured as a String type. 
// Since we are looking for an integer value, we need to convert the input to an integer.
//We do this by using:Integer.parseInt()
// which converts the input to an integer, and allows it to be stored in the age variable.

System.out.println("hi, what's your name?: ");
String name = input.nextLine();    ///// so, this is a variable that only the user can assign value...this is different from
								 ////// static variables declared in the class...what's the big difference?

									//// what is initializing a variable?
System.out.println("cool. how old are you?:  ");
int age = Integer.parseInt(input.nextLine());


if (age < ageLimit){
	  System.out.println("You are too young! Sorry!");
	  System.exit(0);
	} else {

System.out.printf(" hi %s", name); //question: why was this print f and not print l n?//

System.out.println("I am going to tell you a joke, ok?:   ");
String reply = input.nextLine(); ///why is my compiler flagging this?/// because the variable 
									/// isn't being read as local
									/// is it because of the naming convention I used?
									/// will be a compile error if a variable is used 
									// before it has been assigned a value
									// << do these notes from the slides apply?

									// this is comforting: Variables are initiated with literal values, as in '0' above.
									///They can also be initialized with other variables.



System.out.println("how did Harry Potter get down the hill?:  ");
String answer = input.nextLine();///why is my compiler flagging this?///

System.out.println("walking");
System.out.println("jk rolling!");


///



}
}
}



///astrology
// if month = value and day = value
// then output
// but output will have 12 possible answers
// which equal combinations of int day and int month
// so 12 variables with many values
// values, luckily, of day and month
// only fall between 1-31 for day
// and 1-12 for month
// which means that there are ????