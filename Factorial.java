public class Factorial{
	
	public int factorial(int n, String type){
		if(type.equals("recursive")){
			return factorial_recursive(n);
		}

		return factorial_iterative(n);
	}

	public int factorial_recursive(int n){
		if (n == 0) 
          return 1; 
          
        return n*factorial_recursive(n-1);
	}

	public int factorial_iterative(int n){
		int result = 1, i; 
        for (i=2; i<=n; i++) 
            result *= i; 
        return result; 
	}

}