package ads.poo;

public class Horario {
    private int h;
    private int m;
    private int s;
    private String[] horas = new String[]{"Zero", "Uma", "Duas", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove", "Vinte", "Vinte e um", "Vinte e dois", "Vinte e três"};

    private String[] minsec = new String[]{"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove", "Vinte", "Trinta","Quarenta", "Cinquenta"};

    // Construtor com hora, minuto e segundo definidos;

    public Horario(int h, int m, int s) {
        this.h = 0;
        this.m = 0;
        this.s = 0;
        this.setH(h);
        this.setM(m);
        this.setS(s);
    }

    // Construtor com hora, e minuto definidos;

    public Horario(int h, int m) {
        this(h,m,0);
    }

    // Construtor com apenas hora definida;

    public Horario(int h) {
        this(h,0,0);
    }

    // Setters

    public boolean setH(int h) {
        if(h>=0 && h<24){
            this.h = h;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean setM(int m){
        if(m>=0 && m<60){
            this.m = m;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean setS(int s){
        if(s>=0 && s<60){
            this.s = s;
            return true;
        }
        else{
            return false;
        }
    }

    public String extenso(){
        String extenso = this.horas[this.h] + (this.h == 1 ? " hora":" horas") ;

        if(this.m < 21){
            extenso = extenso + ", " +this.minsec[this.m] + (this.m == 1 ? " minuto":" minutos") ;
        }
        else{
            extenso = extenso + ", " + this.minsec[(this.m/10)+18] + " e " + this.minsec[(this.m%10)]+ " minutos";
        }

        if(this.s < 21){
            extenso = extenso + " e " +this.minsec[this.s] + (this.s == 1 ? " segundo":" segundos")  ;
        }
        else{
            extenso = extenso + " e " + this.minsec[(this.s/10)+18] + " e " + this.minsec[(this.s%10)] + " segundos";
        }
        return extenso;
    }

    @Override
    public String toString() {
        return(String.format("%02d:%02d:%02d",this.h, this.m, this.s));
    }
}
