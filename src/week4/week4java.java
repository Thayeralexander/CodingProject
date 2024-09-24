package week4;

public class week4java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1. array
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//a.
		int differentAges = ages[ages.length - 1] - ages[0];
		System.out.println("The difference" + differentAges);

//b.		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 47}; 
		
		// New array with 9 numbers
		
		int differentAges2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println("age 2 difference" + differentAges2);
		//worked!
		

//c.
		int sum = 0;
		for (int age : ages) {
		    sum += age;
		}
		double average = (double) sum / ages.length;
		System.out.println("average age" + average);


//2.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//a.
		int totalLetters = 0; 
		// This gets the sum of letters

		
		for (String name : names) {
		    totalLetters += name.length(); 
		}

		double averageLetters = (double) totalLetters / names.length; 
		System.out.println("average letter" + averageLetters);
//b.
		String allNames = ""; 

		for (String name : names) {
		    allNames += name + " "; 
		}

		System.out.println("all names" + allNames.trim());

//3.array[array.length - 1]; 0 to the last number -1
		
//4.array[0];
		
//5 and 6.
		
        int[] nameLengths = new int[names.length];

		
		for (int i = 0; i < names.length; i++) {
		    nameLengths[i] = names[i].length(); 
		}

		
		for (int length : nameLengths) {
			sum += length;
		}
		
		System.out.println("sum" + sum);
//7.
		String word = "HelloHelloHello";
        int n = 3;
        String concatenated = concatenateWord(word, n);
        System.out.println(concatenated);
		
//8.
        
        String firstName = "John";
        String lastName = "Doe";
        String fullName = getFullName(firstName, lastName);
        System.out.println(fullName);
//9.
        
        int[] numbers = {20, 30, 50}; // Sum = 100
        boolean result = isSumGreaterThan100(numbers);
        System.out.println(result); //  false

        int[] numbers2 = {30, 40, 50}; // 120
        boolean result2 = isSumGreaterThan100(numbers2);
        System.out.println(result2); // true
		
//10.
        double[] numbers3 = {10.5, 20.0, 30.75}; 
        double average3 = calculateAverage(numbers3);
        System.out.println("The average is: " + average3); //  20.416666666666668

        double[] numbers4 = {}; // Empty 
        double average4 = calculateAverage(numbers4);
        System.out.println("The average is: " + average4);
        
        
        
//11.       
        
        double[] array1 = {10.5, 20.0, 30.75}; // Av 20.416666666666668
        double[] array2 = {5.0, 15.0, 25.0};   // Av15.0
        
        boolean result3 = isFirstAverageGreater(array1, array2);
        System.out.println("Is the average of array1 greater than array2? " + result3); // true

        double[] array3 = {10.0, 20.0};         // Av 15.0
        double[] array4 = {5.0, 25.0};          // Av 15.0
        
        boolean result4 = isFirstAverageGreater(array3, array4);
        System.out.println("Is the average of array3 greater than array4? " + result4);
        
        
//12.       
        
        boolean isHot1 = true;
        double money1 = 15.00;
        boolean result5 = willBuyDrink(isHot1, money1);
        System.out.println("Will buy drink? " + result5); // buy drink? true

        boolean isHot2 = false;
        double money2 = 12.00;
        boolean result6 = willBuyDrink(isHot2, money2);
        System.out.println("Will buy drink? " + result6); // buy drink? false

        boolean isHot3 = true;
        double money3 = 9.00;
        boolean result7 = willBuyDrink(isHot3, money3);
        System.out.println("Will buy drink? " + result7);
        
//13.
        int number = 5;
        long result8 = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result8); // of 5 is: 120

        int number2 = 0;
        long result9 = factorial(number2);
        System.out.println("The factorial of " + number2 + " is: " + result9);
        
        
        
        
        
        
        //these method questions just broke my brain!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!		
		
	}
//7
	private static String concatenateWord(String word, int n) {
		
		return word;
		
		
	}
	

//8	
	 public static String getFullName(String firstName, String lastName) {
	        return firstName + " " + lastName;
	    }
	 

//9. 
	
	 public static boolean isSumGreaterThan100(int[] numbers) {
	        int sum = 0; 
	        
	        // Loop through the array and cal the sum
	        for (int number : numbers) {
	            sum += number; // Add each element to sum
	        }
	        
	        // Return true if sum is greater than 100, otherwise false
	        return sum > 100;
	    }

	 
	 
	 
//10.
	 public static double calculateAverage(double[] numbers) {
	        double sum = 0; // Var to store the sum of the elements
	        
	        // Loop through the array and cal the sum
	        for (double number : numbers) {
	            sum += number; // Add each element to sum
	        }
	        
	        // Cal and return the av
	        return numbers.length > 0 ? sum / numbers.length : 0; // Avoid div by zer
	    }
	 
	 
	 
	 
//11. 
	  public static boolean isFirstAverageGreater(double[] array1, double[] array2) {
	        double average1 = calculateAverage(array1); // Av of the first array
	        double average2 = calculateAverage(array2); // Av of the second array
	        
	        return average1 > average2; // Return true if av1 is greater than av2
	    }
	 
	 
	 
	 
//12.
	  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	        
	        return isHotOutside && moneyInPocket > 10.50;
	    }
	  
	  
//13.
	  public static long factorial(int n) {
	        
	        if (n == 0) {
	            return 1;
	        } else {
	            
	            return n * factorial(n - 1);
	        }
	    }
	  
	  
	  
	  
	  
	  
	  
	  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
