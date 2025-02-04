public class ProgressioneArit {
	public static void main(String[] args){
		int n1 =  Integer.parseInt(args[0]);
		int n2 =  Integer.parseInt(args[1]);
		int n3 =  Integer.parseInt(args[2]);
		int diff = n2 - n1;
		
		
		if(n3 - n2 == diff){
			System.out.println("Progressione " + n1 + n2 + n3);
		}
		else{
			System.out.println("Non in progressione " + n1 + n2 + n3);
		}
	}
}