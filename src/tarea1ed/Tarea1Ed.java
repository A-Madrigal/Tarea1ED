
package tarea1ed;

public class Tarea1Ed {


    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int cont = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = cont++;
                System.out.print("   " + matriz[i][j]);
            }
            System.out.println("");
        }
        int SumaDiagonal1 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    SumaDiagonal1 += matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la Primer diagonal es de: " + SumaDiagonal1);

        int SumaDiagonal2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j == (matriz.length - 1)) {
                    SumaDiagonal2 += matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la Segunda diagonal es de: " + SumaDiagonal1);

        int sumaTotal = SumaDiagonal1 + SumaDiagonal2;
        System.out.println("La suma de las dos Diagonales es de: " + sumaTotal);
    }
}
