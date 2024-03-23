package ads.poo;

public class Ponto{

    private double x;
    private double y;


    public Ponto(double x,double y){
        this.x = x;
        this.y = y;
    }

    // Getters e Setters - X

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    // Getters e Setters - Y

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // ToString - (x,y)

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }

    // Método que receba como parâmetro um objeto da classe Ponto e retorne a distância entre os dois pontos.

    public double distancia(Ponto c){
        return(Math.sqrt(Math.pow(c.getX() - this.getX(), 2) + Math.pow(c.getY() - this.getY(), 2)));
    }
}
