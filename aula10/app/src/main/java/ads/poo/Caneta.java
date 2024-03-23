package ads.poo;

public class Caneta {

    private String cor = "Preta";
    private float porcentagemTinta = 100;
    // private final String marca = "BIC";
    private static int totalCanetas = 0;

    public Caneta(String cor, float porcentagemTinta){
        this.cor = cor;
        this.porcentagemTinta = porcentagemTinta;
        totalCanetas++;
    }

    public static int getTotalCanetas() {
        return totalCanetas;
    }

    public Caneta(String cor){
        this(cor,100);
    }

    public Caneta(){
        this("Preta",100);
    }

    public String desenhar(){

        if(porcentagemTinta>=1) {
            porcentagemTinta-= 1;
            return ("Desenhando com tinta " + cor + ", porcentagem de tinta em " + porcentagemTinta);
        }
        else{
            return("A sua caneta está sem tinta! Troque seu cartucho");
        }
    }

    public String trocarCartucho(String novaCor){
        cor = novaCor;
        porcentagemTinta = 100;
        return ("Novo cartucho na cor "+cor+" foi inserido, porcentagem de tinta agora em "+ porcentagemTinta);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPorcentagemTinta() {
        return porcentagemTinta;
    }

    public void setPorcentagemTinta(float porcentagemTinta) {
        this.porcentagemTinta = porcentagemTinta;
    }


}
