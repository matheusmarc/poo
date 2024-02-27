import java.util.Scanner;

public class exercicio1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = teclado.nextLine();

        System.out.println("Ano de nascimento: ");
        int anoNasc = teclado.nextInt();
        
        System.out.println("Ano atual: ");
        int anoAtual = teclado.nextInt();

        System.out.println(nome+", "+"possui "+(anoAtual-anoNasc)+" anos");
    }
}