public class ClearConsole {
    public static void clear() {
		
        String operatingSystem = System.getProperty("os.name").toLowerCase();
        try {
            if (operatingSystem.contains("win")) {
                // Per Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Per Linux/Mac
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
		System.out.println("Ciao");
		System.out.println("Ciao");
		System.out.println("Ciao");
		System.out.println("Ciao");
		System.out.println("Ciao");
		System.out.println("Ciao");
		System.out.println("Ciao");
        clear(); // Pulisce il terminale
		System.out.println("bbbbbbbbbbbbbb");
    }
}
