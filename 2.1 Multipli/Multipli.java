public class Multipli {
	public static void main(String[] args){
		int n1 =  Integer.parseInt(args[0]);
		if(n1 % 3==0){
			System.out.println(n1 + " e multiplo di 3");
		}
		else{
			System.out.println(n1 + " non e multiplo di 3");
		}
	}
}