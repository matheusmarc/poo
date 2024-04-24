package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class AppLivraria {

    public static void main(String[] args) {

        HashMap<String, Livro> bancoDeDados = new HashMap();

        Autor deitel = new Autor("Deitel", "Americano");

        ArrayList<Autor> autoresJava = new ArrayList();
        autoresJava.add(deitel);

        Livro javaComoProgramar = new Livro("123", "Java como programar", 200.00, autoresJava);

        if (!bancoDeDados.containsKey(javaComoProgramar.getIsbn())) {
            bancoDeDados.put(javaComoProgramar.getIsbn(), javaComoProgramar);
        }

        Livro l = bancoDeDados.get("123");

        if(l != null){
            Autor outro = new Autor("Outro Autor", "Brasileiro");
            l.addAutor(outro);
        }
    }
}