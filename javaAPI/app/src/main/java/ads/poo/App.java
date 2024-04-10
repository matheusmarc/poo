/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        String s = "Juca";

        nomes.add(s);
        nomes.add("Matheus");
        nomes.add("Lucas");

        System.out.println(nomes);
//
//        if(!nomes.isEmpty()){
//            nomes.clear();
//        }
//
//        nomes.remove(s);

//        String[] v = (String[]) nomes.toArray();

        for(int i = 0; i<nomes.size(); i++){
            System.out.println("Nome: "+nomes.get(i));
        }

        for(String e : nomes){
            System.out.println("Nome: "+e);
        }

        //Lambda
        nomes.forEach(elemento-> {
            System.out.println("Nome: " + elemento);
            //Mais de uma instrução
        });

        nomes.forEach(System.out::println);

        // Entre com o número até chegar em 999 e parar, depois imprimir os números ordenados

        Stack<Integer> numeros = new Stack<>();
        Stack<Integer> reversed = new Stack<>();

        Scanner teclado = new Scanner(System.in);

        int numero = 0;

        while(numero !=999){
            numero =teclado.nextInt();
            if(numero != 999){
                numeros.push(numero);
            }
        }

        while(!numeros.isEmpty()){
            System.out.println(numeros.pop());
        }


//        for(int i = 0; i<=numeros.size(); i++) {
//            reversed.push(numeros.pop());
//        }
        // ou  Collections.sort(numeros);

//        reversed.forEach(n-> System.out.println(n));







    }
}
