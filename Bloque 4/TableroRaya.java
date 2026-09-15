import java.util.Scanner;

public class TableroRaya {

    public static void main(String[] args) {

        char simbolo = ' ';
        boolean celdaValida;

        Scanner sc = new Scanner(System.in);

        char[][] tablero = new char[3][3];

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = ' ';
            }
        }

        int turno = 1;
        boolean hayGanador = false;
        boolean tableroLleno = false;

        while(!hayGanador && !tableroLleno) {

            simbolo = (turno == 1) ? 'X' : 'O';

            for(int i = 0; i < tablero.length; i++){
                for(int j = 0; j < tablero[i].length; j++){
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Turno del jugador: " + simbolo);
            int fila;
            int columna;

            do {

                System.out.print("Ingrese la fila: ");
                fila = sc.nextInt();

                System.out.print("Ingrese la columna: ");
                columna = sc.nextInt();

                celdaValida = fila >= 0 && fila < tablero.length &&
                              columna >= 0 && columna < tablero[fila].length &&
                              tablero[fila][columna] == ' ';

                if(!celdaValida){
                    System.out.println("Celda inválida, intente de nuevo");
                }

            } while(!celdaValida);

            tablero[fila][columna] = simbolo;

            hayGanador = verificarGanador(tablero, simbolo);

            tableroLleno = true;

            for(int i = 0; i < tablero.length; i++){
                for(int j = 0; j < tablero[i].length; j++){

                    if(tablero[i][j] == ' '){
                        tableroLleno = false;
                    }
                }
            }

            if(!hayGanador){
                turno = (turno == 1) ? 2 : 1;
            }
        }

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

        if(hayGanador){
            System.out.println("Ganó el Jugador: " + simbolo);
        }else{
            System.out.println("Empate");
        }

        sc.close();
    }

    public static boolean verificarGanador(char[][] tablero, char simbolo){

        for(int i = 0; i < tablero.length; i++){

            if(tablero[i][0] == simbolo &&
               tablero[i][1] == simbolo &&
               tablero[i][2] == simbolo){

                return true;
            }
        }
        for(int j = 0; j < tablero.length; j++){

            if(tablero[0][j] == simbolo &&
               tablero[1][j] == simbolo &&
               tablero[2][j] == simbolo){

                return true;
            }
        }

        if(tablero[0][0] == simbolo &&
           tablero[1][1] == simbolo &&
           tablero[2][2] == simbolo){

            return true;
        }

        if(tablero[0][2] == simbolo &&
           tablero[1][1] == simbolo &&
           tablero[2][0] == simbolo){

            return true;
        }

        return false;
    }
}


