import javax.swing.*;

public class Arrays2 {

    public static void main(String[] args) {

        String[] paises = new String[8];

        paises[0] = "Argentina";
        paises[1] = "Uruguay";
        paises[2] = "Bolivia";
        paises[3] = "Chile";
        paises[4] = "Peru";
        paises[5] = "Paraguay";
        paises[6] = "Brazil";
        paises[7] = "Colombia";

//        for (int i = 0; i < 8; i++) {
//            paises[i] = JOptionPane.showInputDialog("Introduce Pais " + (i+1));
//        }

        for (String pais : paises){
            System.out.println(pais);
        }
    }

}
