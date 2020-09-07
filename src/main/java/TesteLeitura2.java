import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

        while (scanner.hasNextLine()){
            String linha = scanner.nextLine();

            Scanner seperaLinha = new Scanner(linha);
            seperaLinha.useLocale(Locale.US);
            seperaLinha.useDelimiter(",");

            String tipoConta = seperaLinha.next();
            int agencia = seperaLinha.nextInt();
            int numero = seperaLinha.nextInt();
            String titular = seperaLinha.next();
            double saldo = seperaLinha.nextDouble();

            String valorFormatado = String.format("%s - %04d-%08d, %20s: %08.2f", tipoConta, agencia, numero, titular, saldo);
            System.out.println(valorFormatado);

            seperaLinha.close();
        }

        scanner.close();

    }
}
