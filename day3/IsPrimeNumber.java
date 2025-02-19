package week1.day3;

public class IsPrimeNumber {
	
	public static void main(String[] args)
	{
	int number = 13;
	boolean isPrime = isPrime(number);
	
	 if (isPrime) {
         System.out.println(number + " is a prime number.");
     } else {
         System.out.println(number + " is not a prime number.");
     }
	  }
	
	public static boolean isPrime(int number)
	{
		
		for (int i = 2; i < number; i++)
		{ 
            if (number % i == 0) 
            {
                return false;
            }
		}
		return true;
	}
	

}
