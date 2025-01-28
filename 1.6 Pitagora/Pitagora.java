public class Pitagora {
	public static void main(String[] args){
		double n1 =  Double.parseDouble(args[0]);
		double n2 =  Double.parseDouble(args[1]);		
		double ipotenusa = Math.sqrt((n1*n1)+(n2*n2));
		System.out.println(ipotenusa);
	}
}