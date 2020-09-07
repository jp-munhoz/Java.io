import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestaEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {

//        PrintStream ps = new PrintStream("lorem2.txt");
//
//        ps.println("Eu to entendendo java");
//        ps.print("Nao to entendendo java");
//
//        ps.close();

        PrintWriter pw = new PrintWriter("lorem2.txt");
        pw.println("Ola mundo doidao");
        pw.println("ola mundo doidoooo");

        pw.close();

    }
}
