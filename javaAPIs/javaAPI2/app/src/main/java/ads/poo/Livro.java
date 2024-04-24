package ads.poo;

import java.util.ArrayList;

public class Livro {

    private String isbn;
    private String titulo;
    private Double preco;
    private ArrayList<Autor> autores;

    public Livro(String isbn, String titulo, Double preco, ArrayList<Autor> autores) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.preco = preco;
        this.autores = autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public Boolean addAutor(Autor a){
        return this.autores.add(a);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Autor autor : this.autores) {
            sb.append(autor);
        }
        return String.format("ISBN: %s, Título: %s, preço: %d, Autores: \n%s", isbn, titulo, preco, autores, sb);
    }
}
