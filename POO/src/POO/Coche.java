package POO;

public class Coche {


    private String marca;
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    private String color;

    public Coche(String marca, int ruedas, int largo, int ancho, int motor, int peso, String color){
        this.marca = marca;
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.motor = motor;
        this.peso = peso;
        this.color = color;
    }

//    public int getRuedas() {
//        return ruedas;
//    }
    public int getRuedas() {return ruedas;}
    public void setRuedas(int ruedas) {this.ruedas = ruedas;}
    public int getLargo() {return largo; }
    public void setLargo(int largo) {this.largo = largo;}
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int getMotor() {
        return motor;
    }
    public void setMotor(int motor) {
        this.motor = motor;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
