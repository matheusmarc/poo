package ads.poo;

public class Horario {
    private int h;
    private int m;
    private int s;

    // Construtor com hora, minuto e segundo definidos;

    public Horario(int h, int m, int s) {
        if((h>=0 && h<24) && (m>=0 && m<60) && (s>=0 && s<60)) {
            this.h = h;
            this.m = m;
            this.s = s;
        }
        else{
            this.h = 0;
            this.m = 0;
            this.s = 0;
        }
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

    @Override
    public String toString() {
        String horas;

        // Horas

        if(this.h<10){
            horas = "0"+h;
        }
        else{
            horas = Integer.toString(h);
        }

        //Minutos

        if(this.m<10){
            horas = horas + ":"+"0"+m;
        }
        else{
            horas = horas+":"+Integer.toString(m);
        }

        //Segundos

        if(this.s<10){
            horas = horas + ":"+"0"+s;
        }
        else{
            horas = horas+":"+Integer.toString(s);
        }

        return(horas);
    }
}
