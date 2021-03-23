package arrayz;
import java.util.*;
public class arrayz {

	public static void main(String[]args) {
		// TODO Auto-generated method stub
		int [] myIntArray;
		myIntArray = new int [5];
		System.out.println(myIntArray[0]);
		
		int[] classSize;
		boolean[] brokenLights;
		String [] names = {"Tim", "Tony", "Sheila", "Meg"};
		//this is also called arrays literal
		System.out.println(names[2]);
		//zero based index so it prints out Sheila
		names[2] = "Steve"; // we replaced 
		// the value-place with a new value
		// so now it prints Steve
		System.out.println(names[2]);
		int size = names.length;
		
		System.out.println(Arrays.toString(names));
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
			
		}
		//define an array literal of your favorite foods
		
		{
			int [] myFoodsArray;
			myFoodsArray = new int [5];
			System.out.println(myFoodsArray[4]);
			
			String [] foods = {"beans", "rice", "pork dumpling", "ice cream"};
			System.out.println(foods[3]);
			
			System.out.println(Arrays.toString(foods));
			for (int i=0; i < foods.length; i++) {
				System.out.println(foods[i]);
				
			}
			
			{
				int [] emptyArray;
				emptyArray = new int [10];
				System.out.println(emptyArray[0]);
				
				emptyArray[0] = 1;
				emptyArray[1] = 2;
				emptyArray[2]=3;
				emptyArray[3] = 4;
				emptyArray[4] = 5;
				emptyArray[5] = 6;
				emptyArray[6] = 7;
				emptyArray[7] = 8;
				emptyArray[8] = 9;
				emptyArray[9] = 10;
				System.out.println(Arrays.toString(emptyArray));
				//cannot adjust size of Array
				// cannot access something outside
				// of the array
				System.out.println(emptyArray.length);
				
				//two ways to print the sum of 
				// all the numbers
				System.out.println(emptyArray[0] + emptyArray[2] + emptyArray [4] + emptyArray[5] + emptyArray[7]);
				int sum = 0;
				for(int i=0; i < emptyArray.length; i+=2) {
			//sum = sum + emptyArray[i];
					sum += emptyArray[i];
					
				}
				System.out.println("The sum of emptyArray is" + sum);
			
		//print the product of the numbers at indices 1,3,5,7,9
		System.out.println(emptyArray[1]* emptyArray[3]* emptyArray[5]* emptyArray[7]* emptyArray[9]);
		
		int prod = 1;//have to initialize outside the  loop
		for(int i=1; i < emptyArray.length; i+=2) {
			prod *= emptyArray[i];
			System.out.println(prod);
			}
		//Array lists
		
		ArrayList<String> stringArray = new ArrayList <String>();
		stringArray.add("Matt");
		stringArray.add("Sherri");
		stringArray.add("mo");
		System.out.println(stringArray);
		
		stringArray.add(1, "Kiara");
		System.out.println(stringArray);
		stringArray.remove(2);
		System.out.println(stringArray);
		stringArray.remove("Matt");
		System.out.println(stringArray);
		System.out.println(stringArray.get(1));
		System.out.println(stringArray);
		System.out.println(stringArray.size());
		System.out.println(stringArray.contains(foods));
		System.out.println(stringArray.isEmpty());
		Collections.reverse(stringArray);
		System.out.println(stringArray);
		stringArray.clear();
		
		}
			//next challenge
			
		}
		{
			ArrayList<String> faveAnimals = new ArrayList <String>();
			faveAnimals.add ("cat");
			faveAnimals.add("dogs");
			faveAnimals.add("snakes");
			faveAnimals.add("bears");
			System.out.println(faveAnimals);
			
			faveAnimals.add(1, "pineapple");
			System.out.println(faveAnimals);
			faveAnimals.add(faveAnimals.size()/2, "another pineapple");
			faveAnimals.remove(0);
			System.out.println(faveAnimals);
			faveAnimals.add(0,"caribou");
			System.out.println(faveAnimals);
			
		
		
			String myString = "I love ice cream";
			String str[] = myString.split(" ");
			System.out.println(str.length);
			System.out.println(str.getClass());
			List<String> arrayString = new ArrayList<String>();
			arrayString = Arrays.asList(str);
			System.out.println(arrayString.size());
			System.out.println(arrayString.getClass());
			ArrayList<String> arrayListString = new ArrayList<String>();
			Collections.addAll(arrayListString , str);
			System.out.println(arrayString.size());
			System.out.println(arrayString.getClass());
			arrayListString.add("new words");
			System.out.println(arrayListString);
		}
			
			/////array list to a string////
			
		{
			ArrayList<String> fruitList = new ArrayList<String>();
			fruitList.add("grape");
			fruitList.add("apple");
			fruitList.add("pear");
			fruitList.add("sapote");
			System.out.println(fruitList);
			System.out.println(fruitList.getClass());
			
			Object[] fruitArray = fruitList.toArray();
			System.out.println(fruitArray);
			System.out.println(fruitArray.getClass());
			
			String fruitString = Arrays.toString(fruitArray);
			System.out.println(fruitString);
			System.out.println(fruitString.getClass());
			
			System.out.println(fruitString.replace("]", "[").replace(",","")); 
			
			
			//arraylist of stirngs w one element
			//array of fave foods add each element to
			// to new arraylist one index higher
			//[" ", "Lasagna",]
			//print
			
			ArrayList<String> blankArray = new ArrayList<String>();
			blankArray.add(" ");
			System.out.println(blankArray);
			
			for(String value : fruitList)
				blankArray.add(value);	
			}
			
			////hashmaps
			
			HashMap<String, Integer> person = new HashMap<>();
			person.put("Joan", 24);
			person.put("Kiara", 24);
			person.put("Mo", 31);
			person.put("Amardeep", 40);
			System.out.println(person);
			
			person.remove("Amardeep");
			System.out.println(person);
			
	}
			
			
			
			
			
			
			
			
			
			
		
		
	}
	


			
		


