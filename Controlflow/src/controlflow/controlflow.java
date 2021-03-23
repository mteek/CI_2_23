package controlflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class controlflow {
public static void main (String [] args) {

final class AsciiChars {
 
	char ch1 = 'a';
	char ch2 = 'b';
	// character whose ASCII value to be found
	int asciivalue1 = (int) ch1;
	int asciivalue2 = (int) ch2;}
	
	for (int i = 0; i <= 255; i++)
	System.out.println("these are all the ascii number values  "+(char)i + "  =  " + i);	
{
	for(int i = 'a'; i<= 'z'; i++)
	System.out.println("these are all the lowercase letter ascii values: " + (char)i + " = " +i);
}
{
	for(int i = 'A'; i<= 'Z'; i++)
		System.out.println("these are all the uppercase ascii values:  " + (char)i + "  =  " +i);
}
{

	Scanner input = new Scanner (System.in);
	System.out.println("Hello, please enter your name:   ");
	String name = input.nextLine();
	System.out.printf("hello %s!\n",name);
	
	String answer; 
	boolean yn;
	
	System.out.printf("do you wish to continue to the interactive portion %s?\n", name);
	System.out.println("y/n");
	while (true) {
		answer = input.nextLine().trim().toLowerCase();
		if (answer.equals("y")) {
			yn = true;
			System.out.println("press enter");
			continue;
		}else if (answer.equals("n")) {
			yn = false;
			System.out.println("ok, come back later when you're ready to complete the survey");
		}
	
	System.out.println("what is the name of your favorite pet?");
	String petName = input.nextLine();
	
	System.out.println("what's the first name of your favorite actress or actor?");
	String actName = input.nextLine();
	
	System.out.println("what is the age of your favorite pet?");
	int petAge = input.nextInt();
	{
	for (int i = 0; i <= 18; i++);
	System.out.println("what's your lucky number?");
	int userNum = input.nextInt();
	{
	for (int i = 1; i <= 99; i++);
	}
	System.out.println("what's your favorite basketball jersey number?");
	int jerseyNum = input.nextInt();
	{
	for (int i = 0; i <= 99; i++);
	}
	System.out.println("what's car's model year (two-digits, please) ?");
	int modelNum = input.nextInt();
	{
		for (int i = 00; i <= 99; i++);
	}
	System.out.println("give a random number between 1 and 50");
	int randNum = input.nextInt();
	{
	for (int i = 1; i <= 50; i++);
	}
	int min = 1;
	int max = 65; 
	int magicMin = 1;
	int magicMax = 75;
	
	System.out.println("this is the Magic Ball number:");  
	int m = (int)(Math.random()*(magicMin*randNum)+min);  
	System.out.println(m);  
	
	System.out.println("this is a random generated number"+min+" to "+max+ ":");  
	int a = (int)(Math.random()*(max-min+1)+min);  
	System.out.println(a);  
	
	System.out.println("Random value of type int between "+min+" to "+max+ ":");  
	int b = (int)(Math.random()*(max-min+1)+min);  
	System.out.println(b);  
	
	System.out.println("Random value of type int between "+min+" to "+max+ ":");  
	int c = (int)(Math.random()*(max-min+1)+min);  
	System.out.println(c);  
	
	System.out.println("lottery number:");  
	int lotto1 = (int) (modelNum + userNum);  
	System.out.println(lotto1);  
	
	System.out.println("lottery number:");  
	int lotto2 = (int) (randNum - c);  
	System.out.println(lotto2);  
	
	System.out.println("lottery number:");  
	int lotto3 = (int) (petAge + modelNum);  
	System.out.println(lotto3);  
	
	System.out.println("lottery number:");  
	int lotto4 = (int) (jerseyNum + userNum +petAge);  
	System.out.println(lotto4);  
	
	System.out.println("lottery number:");  
	int lotto5 = 42;  
	
	ArrayList<Integer> lottoList = new ArrayList<Integer>();
	lottoList.add(lotto5); 
	lottoList.add(lotto4);
	lottoList.add(lotto3);
	lottoList.add(lotto2);
	lottoList.add(lotto1);
	
	System.out.println("Lottery Numbers:" + lottoList + "Magic ball:" + m);  
	
	int k = 0; 
	boolean bool; 
	System.out.printf("would you like to play again?");
	System.out.println("1 for yes // 0 for no");
	k = input.nextInt();
	if (k >= 1) {	
		bool = true;
	}
	else {
		bool = false;
	}
	System.out.println("ok, thank you for playing. goodbye.");
	///System.exit(0);       //Terminatejvm  int myInt = myBoolean ? 1 : 0;
}
}
}
}
}




	


	
////notes
///Computers can understand only the numeric values. 
///but it is not always certain that all the inputs are given in numeric form. 
///So, there was a need for an encoding system which could 
///convert the text files into numeric values.
///(ASCII) is an encoding approach, which is a code for representing 
///128 characters in English into seven bit integers. 95 out of 128 
///characters are printable which include digits from 0 to 9, lowercase 
///and uppercase letters from a to z and the punctuation symbols. 
///ASCII is used in electronic Communication. ASCII originated from the 
///telegraph code and it was implied as a 7- bit code for teleprompter. 
///In comparison to the telegraph code,
///ASCII codes are more convenient and can feature a large number of devices.
///char ch1 = 'a';
//char ch2 = 'b';
// character whose ASCII value to be found  
///int asciival1 = (int) ch1;
///int asciival2 = (int) ch2;
// type casting // cast/convert a charter to int type ;; variable that stores the integer value of the character  



