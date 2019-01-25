public class Fibonacci{
	
	public int fibonacci(int n, String type){
		if(type.equals("recursive")){
			return fibonacci_recursive(n);
		}

		return fibonacci_iterative(n);
	}

	public int fibonacci_recursive(int n){
		if (n <= 1) 
			return n; 
		return fibonacci_recursive(n-1) + fibonacci_recursive(n-2); 
	}

	public int fibonacci_iterative(int n){
		int first = 0;
		int second = 1;
		int result = 0;
		if(n == 1 || n == 0)
			return 1;
		for(int i = 1; i < n; i++){
			result = first+second;
			first = second;
			second = result;
		}
		
		return result;
	}

}