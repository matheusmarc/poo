package ads.poo;

public class Carro {

    // Commit foi excluído - 15/03
    private int velocidadeAtual;
    private final int velocidadeMaxima = 200;

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Carro(int velocidade){
        this.setVelocidade(velocidade);
    }

    public Carro(){
        this.velocidadeAtual = 0;
    }

    public int setVelocidade(int v){
        if(v<0 || v>velocidadeMaxima){
            velocidadeAtual = 0;
        }
        else{
            velocidadeAtual = v;
        }
        return velocidadeAtual;
    }

    public int acelerar(int acl){
        velocidadeAtual  += acl;
        if (velocidadeAtual + acl > velocidadeMaxima){
            return velocidadeAtual = velocidadeMaxima;
        }else {
            return velocidadeAtual;
        }
    }
    public int frear(int frear){
        velocidadeAtual -= frear;
        if (velocidadeAtual - frear < 0){
            return velocidadeAtual = 0;
        }else {
            return velocidadeAtual;
        }
    }

}

