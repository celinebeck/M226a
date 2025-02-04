public class Quadrato {
	public static void main(String[] args){
		if(args.length>1 )
		{
			System.out.println("Non puo essere fatto: troppi argomenti");
		}
		else{
		int n1 =  Integer.parseInt(args[0]);
		for (int n = n1; n>0;n--)
		{
			for (int n2 = n1; n2>0;n2--)
			{
				System.out.print("*");
			}	
			System.out.println("");
		}		
		}
	}
}