import java.util.Scanner;
public class TiempoViaje {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese Los Minutos: ");
        int minutos = sc.nextInt();

    int segundosTotales = minutos * 60;

    int horas    = minutos / 60;           
    int minResto = minutos % 60;           
    int segResto = segundosTotales % 60;


    System.out.println("Sus segundos totales son: " + segundosTotales);
    System.out.println("Su hora es: " + horas);
    System.out.println("Sus minutos Restantes son: " + minResto);
    System.out.println("Sus segundos Restantes son: " + segResto);
    

    sc.close();
        
    }
}
