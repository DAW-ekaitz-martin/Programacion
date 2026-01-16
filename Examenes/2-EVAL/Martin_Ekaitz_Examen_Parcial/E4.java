import java.util.Scanner;
public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tablero = new char[6][7];
        inicializarJuego(tablero);
        mostrarTablero(tablero);
        boolean finalizar_juego = false;
        boolean partida_terminada = false;
        String turno = "blanco";
        do {
            while (!partida_terminada) {
                System.out.println("TURNO DEL JUGADOR BLANCO");
                int col;
                boolean vacia = false;
                do {
                    System.out.print("Ingrese la columna en la que quiere porner la ficha(1-7): ");
                    int columna = scanner.nextInt();
                    if(libre(tablero, turno, columna-1))
                        vacia = true;
                    col = columna;
                }while(!vacia);
                colocarFicha(tablero, turno, col-1);
                if (turno.equals("blanco"))
                    turno = "rojo";
                else 
                    turno = "blanco";

                mostrarTablero(tablero);
            }
            
        } while (!finalizar_juego);
    }
    public static void inicializarJuego(char[][] tablero) {
        for (int i = 0; i <= tablero.length-1; i++) {
            for (int j = 0; j <= tablero[0].length-1; j++) {
                tablero[i][j] = 'L';
            }
        }
    }
    public static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i <= tablero.length-1; i++) {
            for (int j = 0; j <= tablero[0].length-1; j++) {
                System.out.print(tablero[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static boolean libre(char[][] tablero, String jugador, int columna) {
        boolean libre = false;
        for(int i = tablero.length-1; i >= 0; i --) {
            if(tablero[i][columna] == 'L') {
                libre = true;
                break;
            } 
        }
        if (!libre) {
            System.out.println("La columna elegida está llena");
        }
        return libre;
    }
    public static boolean colocarFicha(char[][] tablero, String jugador, int columna) {
        boolean libre = false;
        if (jugador.equals("blanco")){
            for(int i = tablero.length-1; i >= 0; i --) {
                if(tablero[i][columna] == 'L') {
                    tablero[i][columna] = 'B';
                    libre = true;
                    break;
                } 
            }
        }
        else {
            for(int i = tablero.length-1; i >= 0; i --) {
                if(tablero[i][columna] == 'L') {
                    tablero[i][columna] = 'R';
                    libre = true;
                    break;
                } 
            }
        }
        if (!libre) {
            System.out.println("La columna elegida está llena");
        }
        return libre;
            
    }
    /*public static boolean comprobarGanador(char[][] tablero) {
        int contador = 0;
        boolean ganador = false;
        //Diagonal
        for (int i = 0; i <= tablero.length-1; i++) {
            for (int j = 0; j <= tablero[0].length-1; j++) {
                if (tablero[i][j]=='B') {
                    contador = 1;
                    for (int k = 0; k < 1; k++) {
                        for (int l = j + 1; l <= tablero[0].length-1; l++) {
                            if (tablero[i + 1][l] == 'B') {
                                contador ++;
                                if (contador == 4) {
                                    ganador = true;
                                    break;
                                }
                            }
                            else {
                                contador = 0;
                                break;
                            }  
                        }
                        
                    }
                }
            }
            System.out.println("");
        }
        //Vertical
        for (int i = 0; i <= tablero.length; i ++) {
            for (int j = 0; j <= tablero[0].length; j++) {
                if (tablero[i][j] == 'B'){
                    for(int k = i; k <= tablero.length; k++) {
                        for (int l = j + 1; l <= tablero[0].length; l++) {
                            if (tablero[l][j] == 'B') {
                                contador ++;
                            }

                        }
                    }
                    
                }
            }
        }
    }*/
}
