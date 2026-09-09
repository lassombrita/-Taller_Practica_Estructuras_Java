import java.util.Scanner;
public class BarreglosNombres {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[]pacientes = new String[8];

        for(int i = 0;i<7;i++){
            pacientes[i] = sc.nextLine();
        }

        System.out.print("escriba su nombre");
        String nombreBuscado = sc.nextLine();

        int posicion = -1;

        for(int i = 0;i <= 7;i++){
            if(pacientes[i].equalsIgnoreCase(nombreBuscado)){
            posicion = i;
            break;
            }
        }
        if(posicion != -1){
            System.out.println("Encontrado en posicion: " + posicion);
        }else{
            System.out.println("posicon no encontrada");
        }
        sc.close();

    }

}
