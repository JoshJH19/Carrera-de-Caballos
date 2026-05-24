import java.util.Random;

public class Caballos {
    private String color;
    private double velocidade;
    private boolean salida;
    public Caballos(String color, double velocidade, boolean salida) {
        this.color = color;
        this.velocidade = 0;
        this.salida = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public void listos(){
        salida = true;
    }
    public void Carrera(double incrementar){
        if (salida == true){
            this.velocidade += incrementar;
            System.out.println("|| El caballo:" + this.color + " || Avanza: " + this.velocidade+ "||");
        }else {
            System.out.println("Aun no estan listos");
        }
    }
    public void reiniciar(){
        this.salida = false;
        this.velocidade = 0;
    }

}