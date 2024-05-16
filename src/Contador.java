import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o range inicial: ");
        int rangeInicial = sc.nextInt();

        System.out.print("Digite o range final: ");
        int rangeFinal = sc.nextInt();

        System.out.println();
                
        try {
            contar(rangeInicial, rangeFinal);
        } catch (ParametrosInvalidosException e) {
            System.err.println("O range final precisa ser maior que o range inicial.");
        }

        sc.close();
    }

    private static void contar(int rangeInicial, int rangeFinal) throws ParametrosInvalidosException {

        int quantidade = rangeFinal - rangeInicial;

        if (quantidade <= 0)
            throw new ParametrosInvalidosException();

        for (int i = 1; i <= quantidade; i++) 
            System.out.println(String.format("Imprimindo o número %d", i));
    }
}
