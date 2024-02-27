import java.util.Random;
import java.util.Scanner;


public class Exercicio3 {
            public static void main(String[] args) {

                Scanner teclado = new Scanner(System.in);

                int numeroAleatorio = new Random().nextInt(100)+1;
                int tentativas = 5;
                int cont = 5;


                System.out.println("Você tem 5 chances. Adivinhe!");
                for (int i = 0; i < tentativas; i++){

                    System.out.println("Qual número você acha que é?");

                    int numero = teclado.nextInt();

                    if(numero > 100){
                        System.out.println("O número não pode ser maior que 100.");
                    }else {


                        if(numero == numeroAleatorio){
                            System.out.println("Você acertou!");
                            break;
                        }
                        else{
                            contador--;
                            System.out.println("Você errou! Cuidado, você tem mais " + contador  +  " chances para acertar."  );

                            if(numero > numeroAleatorio){
                                System.out.println("O número que foi digitado é maior que o sorteado.");

                            }
                            else {
                                System.out.println("O número que foi digitado é menor que o sorteado.");

                            }
                        }



                    }
                }


                System.out.println("Número sorteado: " + numeroAleatorio);

            }
}