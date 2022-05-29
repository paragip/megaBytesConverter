public class megaBytesConverter {
    public static void main (String[] args) {
        printMegaBytesAndKiloBytes(1025);

    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainedKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainedKiloBytes + " KB");
        }
    }
}
