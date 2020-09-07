import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            linha = br.readLine();
            System.out.println(linha);
        }
        br.close();
    }
}
