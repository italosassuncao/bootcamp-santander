import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Desafio3 {
    public static void main(String[] args) throws IOException {
        String linha;
        Double n;
        int positivos, i;

        positivos = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (i=0; i < 6; i++) {
            linha = br.readLine();
            n = Double.parseDouble(linha);
            if(n > 0.0)positivos++;
        }

        System.out.println("" + positivos + " valores positivos");
    }
}