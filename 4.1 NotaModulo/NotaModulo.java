public class NotaModulo {
	public static void main(String[] args)
	{
		float n1 =  Float.parseFloat(args[0]);
		float n2 =  Float.parseFloat(args[1]);
		float n3 =  Float.parseFloat(args[2]);
		float n4 =  Float.parseFloat(args[3]);
		float n5 =  Float.parseFloat(args[4]);
		
		float p1 =  Float.parseFloat(args[5]);
		float p2 =  Float.parseFloat(args[6]);
		
		float medianote = n1 * 0.10f + n2 * 0.15f + n3 * 0.20f + n4 * 0.25f + n5 * 0.3f;
		float mediaprog = (p1+p2)/2;
		
		float notafinale = (medianote + mediaprog)/2;
		System.out.println("Media note: " + medianote);
		System.out.println("Media progetti: " + mediaprogetti);
		System.out.println("Media materia: " + notafinele);
		
	}
}