import java.util.HashMap;
import java.util.Scanner;


public class FirstHashMap {
	public static void main(String[] args){
		
		Scanner foo = new Scanner(System.in);
		int choice;
		String response="",mapAdd="";
		
		do{
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		
		myMap.put(1,"one");
		myMap.put(2, "two");
		myMap.put(3, "three");
		myMap.put(4, "four");
		myMap.put(5, "five");
		
		System.out.println("Prompt:		Pick a number between 1-5. ");
		choice = foo.nextInt();
		
		
		if(!myMap.containsKey(choice))
		{
			System.out.println("That number is not in the list. \n"
					+ "Please spell out that number. ");
			mapAdd = foo.next();
			myMap.put(choice, mapAdd);
			System.out.println("Response:	You picked number "+myMap.get(choice));
		}
		else {
		System.out.println("Response:	You picked number " + myMap.get(choice));
		}
		System.out.println("Would you like to try again? y/n");
		response = foo.next().toLowerCase();
		
		

		}while(!response.equals("n"));
		System.out.println("\n**Exit**");
		foo.close();
	}

}
