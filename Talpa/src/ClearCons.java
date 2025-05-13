public class ClearCons {
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
}
