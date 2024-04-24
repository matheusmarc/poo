package ads.poo;

public class Motor {
    private int cilindradas;
    private int horsePower;

    public Motor(int cilindradas, int horsePower) {
        this.cilindradas = cilindradas;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return String.format("Cilindradas: %d , HorsePower: %d", cilindradas, horsePower);
    }
}
