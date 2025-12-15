import java.util.Scanner;
public class E14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matriz = new char[3][3];
        String turno = "usuario";
        for (int i = 0; i < 9; i++) {
            if (turno.equals("usuario")){
                System.out.println("TURNO DEL USUARIO");
                System.out.print("Ingrese la fila: ");
                int fila = scanner.nextInt();
                System.out.print("Ingrese la columna: ");
                int columna = scanner.nextInt();
                turno_usuario(matriz, fila, columna);
                imprimir_matriz(matriz);
                turno = "maquina";
            }
            else {
                System.out.println("TURNO DE LA MÁQUINA");
                turno_maquina(matriz);
                imprimir_matriz(matriz);
                turno = "usuario";
            }
        }
        scanner.close();
    }
    public static void imprimir_matriz(char[][] matriz) {
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz[0].length-1; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[0].length-1)
                    System.out.print(", ");
                else
                    System.out.println();
            }
        }
    }
    public static char[][] turno_usuario(char[][] matriz, int fila, int columna) {
        //Resto 1 para saber las posiciones
        fila = fila -1;
        columna = columna -1;
        if (matriz[fila][columna] != 'X' && matriz[fila][columna] != 'O')
            matriz[fila][columna] = 'X';
        else
            System.out.println("Ya hay una ficha en esa posición");
        return matriz;
    }
    public static char[][] turno_maquina(char[][] matriz) {
        int fila;
        int columna;
        do {
            fila = (int)(Math.random() * 3);
            columna = (int)(Math.random() * 3);
        }
        while(matriz[fila][columna] != 0);
        matriz[fila][columna] = '0';
        return matriz;
    }
}
