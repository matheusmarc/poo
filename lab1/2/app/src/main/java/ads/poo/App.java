/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        Horario h1 = new Horario(0,0,0);
        Horario h2 = new Horario(0,16,53);

        System.out.println(h1);
        System.out.println(h1.extenso());
        System.out.println(h1.diferenca(h2));

    }
}
