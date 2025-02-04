public class Primo {
	public static void main(String[] args){
		int n1 =  Integer.parseInt(args[0]);
		int check = 0;
		for(int n=1; n<n1; n++)
		{
			if(n1%n==0)
			{
			}
			else
			{
				check++;
			}
		}
		if(check==0)
		{
			System.out.println(""+n1+" e un numero primo");
		}
		else
		{
			System.out.println(""+n1+" non e un numero primo");
		}
	}
}