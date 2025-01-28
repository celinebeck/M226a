public class Codice {
	public static void main(String[] args){
		String parola =  args[0];
		int lungP = parola.length();
		String pChiave = ""+parola.charAt(0)+parola.charAt(2)+parola.charAt(lungP-1)+parola.charAt(lungP-2);
		System.out.println(pChiave);
	}
}