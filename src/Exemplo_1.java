import java.util.Scanner;

public class Exemplo_1 {
    public static void main(String[] args) {
        double n1, n2, med;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextDouble();
        System.out.println();

        med = (n1 + n2)/2;

        if (med >= 6) {
            System.out.printf("A nota do aluno foi: -----> %.1f\n", med);
            System.out.print("O aluno foi aprovado");
        }

        else {
            System.out.printf("A nota do aluno foi: -----> %.1f\n", med);
            System.out.print("O aluno foi reprovado pois precisava de ao menos 6.0 para passar");
        }

    }
}
