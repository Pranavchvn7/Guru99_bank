package Other;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first=0, second=1, result;
		int n=5;
		
		System.out.print("Fibonacci Series: ");
		for(int i=0;i<n;i++) {
			if(i==0) {
				System.out.print(first+" ");
			}
			if(i==1) {
				System.out.print(second+" ");
			}
			result= first+second;
			System.out.print(result+" ");
			first=second;
			second=result;
		}
		
	}

}
