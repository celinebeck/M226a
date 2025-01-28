public class SwapValori {
	public static void main(String[] args){
		int varA =  Integer.parseInt(args[0]);
		int varB =  Integer.parseInt(args[1]);	
		int varVar = varA;
		varA = varB;
		varB = varVar;
		System.out.println(varA + " " + varB);
	}
}