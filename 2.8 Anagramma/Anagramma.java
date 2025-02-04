public class Anagramma {
	public static void main(String[] args){
		String parola1 =  args[0];
		String parola2 =  args[1];
		String riserva =  args[1];
		int check = 0;
		if(parola1.length() == parola2.length())
		{
			for(int index1 = 0; index1< parola1.length(); index1++)
			{
				for(int index2 = 0; index2<parola2.length();index2++)
				{
					if(parola1.charAt(index1)== parola2.charAt(index2))
					{
						check++;
						parola2 = parola2.replaceFirst(parola2.charAt(index2)+""," ");
						break;
					}
					
					
					
				}
				//System.out.println("parola2 "+parola2);
			}
			if(check==parola1.length())
			{
				System.out.println(""+parola1+" e "+ riserva+" sono anagrammi");
			}
			else
			{
				System.out.println(""+parola1+" e "+ riserva+" non sono anagrammi");
			}
		}
		else
		{
			System.out.println(""+parola1+" e "+ riserva+" non sono anagrammi");
		}
		
	}
}