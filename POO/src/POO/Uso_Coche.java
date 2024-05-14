package POO;

public class Uso_Coche {

    public static void main(String[] args) {
        Coche renault = new Coche("Renault", 4, 2000, 600, 1800, 600, "Azul");
        String info = "Mi coche es de marca " + renault.getMarca() + ", es de color " + renault.getColor() + ", tiene un largo de " + renault.getLargo() + "cms, un ancho de " + renault.getAncho() + "cms, posee un motor de " + renault.getMotor() + "cc y pesa " + renault.getPeso() + " kg.";
        System.out.println(info);
    }
}
