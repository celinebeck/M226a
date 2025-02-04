public class Fattoriale {
	public static void main(String[] args){
		int n1 =  Integer.parseInt(args[0]);
		int tot = 1;
		System.out.print("Fattoriale di "+ n1 + ": ");
		for (int n = n1; n>0;n--)
		{
			tot = tot* n;
			System.out.print(""+n+" * ");
		}	
		System.out.print("= "+ tot);		
	}
}