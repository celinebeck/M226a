public class Fibonacci {
	public static void main(String[] args){
		int n1 = 0;
		int n2 = 1;
		int somma = 0;
		while (somma<100000)
		{
			somma = n1 + n2;
			n1 = n2;
			n2 = somma;
			System.out.println(somma);
		}		
		
	}
}