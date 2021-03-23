package loophw;
import java.util.*;
public class Loophw {
	
public static void main (String [] args) {

	Scanner print = new Scanner(System.in);	
	System.out.println("give me 5 numbers");
	
	int num1 = print.nextInt();
	int num2 = print.nextInt();
	int num3 = print.nextInt();
	int num4 = print.nextInt();
	int num5 = print.nextInt();
	
	int [] array = new int [5];
	
	array[0] = num1;
	array[1] = num2;
	array[2] = num3;
	array[3] = num4;
	array[4] = num5;
	
	System.out.println(array[0] + array[1] + array[2]+ array[3]+ array[4]);
	System.out.println("this is the product" + array[0]* array[1]* array[2]* array[3]* array[4]);
	
	int max = array [0];
	for(int i=0; i<array.length; i++) {
		if(array[i]>max)
			max = array[i];
	}
	System.out.println("biggest number" + max);

	int min = array [0];
	for( int i=0; i<array.length; i++) {
		if(array[i]<min)
			min = array[i];

	}
	System.out.println("smallest number" + min);
}}



	
	
	
	
	
	

	
	
	


