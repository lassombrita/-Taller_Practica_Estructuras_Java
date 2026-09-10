import java.util.Scanner;
public class RegistroVentas {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[][]ventas = new int[4][3];
        for(int i = 0;i<=3;i++ ){
            for(int j = 0;j<=2;j++){
                System.out.print("haga su registro");
                ventas[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<=3;i++){
           int totalSucursal = 0;
            for(int j = 0;j<=2;j++){
                totalSucursal = totalSucursal + ventas[i][j];
            }
            System.out.println("sucursal "+"sucursal: " + totalSucursal);
        }
        for(int i = 0;i<=2;i++){
            int totalProducto = 0;
            for(int j = 0;j<=3;j++){
                totalProducto = totalProducto + ventas[i][j];
            }
            System.out.println("producto"+"producto: " + totalProducto);
        }

        int maxVenta = ventas[0][0];
        int sucMax = 0, prodMax = 0;

        for(int i = 0;i<=3;i++){
            for(int j = 0;j<=0;j++){
                if(ventas[i][j]>maxVenta){
                    maxVenta = ventas[i][j];
                    sucMax = i;
                    prodMax = j;
                }
            }
        }
        System.out.println("tu maxVenta es: " + maxVenta);
        System.out.println("tu sucMax es: " + sucMax);
        System.out.println("tu prodMax es: " + prodMax);
        
        sc.close();

    }
}