public class Arrays3 {

    public static void main(String[] args) {

        int[][] miArray = new int[3][3];
        miArray[0][0] = 1;
        miArray[0][1] = 2;
        miArray[0][2] = 3;
        miArray[1][0] = 4;
        miArray[1][1] = 5;
        miArray[1][2] = 6;
        miArray[2][0] = 7;
        miArray[2][1] = 8;
        miArray[2][2] = 9;

        System.out.println("Iteracion Bucle For");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print( miArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Iteracion Bucle ForEach");
        for(int[]fila: miArray){
            for(int col : fila){
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
