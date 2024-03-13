package ads.poo;

import java.util.Random;

public class Buzz {

    private boolean capaceteAberto = false;
    private String[] frases = {"Ao infinito e além!", "Preparado para voar!", "Comando estelar, pronto para voar!", "Consigo resolver todas as missões do universo", "Saudações, eu sou o Buzz Lightyear e venho em paz", "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta."};
    private boolean asasAbertas = false;

    public boolean estadoCapacete(boolean estado) {
        capaceteAberto = estado;
         return capaceteAberto;
    }

    public boolean isCapaceteAberto() {
        return capaceteAberto;
    }

    public String falarFrase() {
        Random r = new Random();
        return frases[r.nextInt(6)];
    }

    public boolean estadoAsas(boolean estado){
        asasAbertas = estado;
        return asasAbertas;
    }

    public boolean isAsasAbertas(){
        return asasAbertas;
    }

    public String soltarLaser() {
        return("PEW! PEW! PEW! PEW!");
    }

    public String soltarGolpes() {
        return("POW! PEI! POW! POW!");
    }

}
