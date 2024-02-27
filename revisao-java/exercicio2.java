import java.util.Scanner;

public class Exercicio2 {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        

        System.out.print("Nota 1: ");
        double n1 = teclado.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = teclado.nextDouble();


        System.out.print("Frequência em porcentagem: ");
        int frequencia = keyboard.nextInt();

        if (frequencia >= 75) {
            double media = (p1 + p2) / 2;
            if(media >= 6){
                System.out.println("Aprovado! Sua nota é: " + media);
            } else {
                System.out.println("Reprovado! Sua nota é: " + media);
            }
        } else {
            System.out.println("Reprovado por frequência insuficiente!");
        }
    }
}