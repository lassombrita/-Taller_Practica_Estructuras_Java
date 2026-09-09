import java.util.Scanner;
public class InversionArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escriba el tamaño del arreglo");
        int n = sc.nextInt();

        int[]inversion = new int[n];

        for(int i = 0; i < (n-1);i++){
            System.out.print("Ingrese su valor");
            inversion[i] = sc.nextInt();
        }
        System.out.println(inversion[n]);
        for(int i = 0;i < (n/2-1);i++){
            int temp = inversion[i];
            inversion[i] = inversion[n-1-i];
            inversion[n-1-i] = temp;
        }


    }

}
