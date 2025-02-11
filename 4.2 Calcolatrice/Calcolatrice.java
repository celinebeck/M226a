public class NotaModulo {
	public static void main(String[] args)
	{
		int n1 =  Integer.parseInt(args[0]);
		int n2 =  Integer.parseInt(args[1]);
		String operatore =  args[2];
		float risultato;
		if( operatore == "+")
		{
			risultato = n1 + n2;
		}
		else if (operatore == "-")
		{
			risultato = n1 - n2;
		}
		else if (operatore == "/")
		{
			risultato = n1/n2;
		}
		else if (operatore == "x")
		{
			risultato = n1 * n2;
		}
		System.out.println(n1 + operatore + n2 + " = " + risultato);
	}
}