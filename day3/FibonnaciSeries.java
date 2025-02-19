package week1.day3;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=8, iter1=0, iter2=1;
		System.out.println("Fibonacci Series " + n + " terms:");
		
		for (int i = 1; i <= n; ++i) {
            System.out.print(iter1 + ", ");
            int result= iter1+iter2;
            iter1=iter2;
            iter2=result;
		}
		
	}

}
