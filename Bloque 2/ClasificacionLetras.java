import java.util.Scanner;

public class ClasificacionLetras {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        char calificacion; 
        String descripcion = "";

        System.out.println("Clasificaremos sus notas con letras para sus reportes externos");
        System.out.print("Ingrese el promedio de sus notas: ");
        double nota = sc.nextDouble();
  
        if (nota >= 4.0 && nota <= 5.0) {
            calificacion = 'A';
        } 
        else if (nota >= 3.5 && nota < 4.0) {
            calificacion = 'B';
        } 
        else if (nota >= 3.0 && nota < 3.5) {
            calificacion = 'C';
        } 
        else {
            calificacion = 'D';
        }

        switch (calificacion) {
            case 'A':
                descripcion = "Excelente";
                break;
            case 'B': 
                descripcion = "Sobresaliente";
                break;
            case 'C':
                descripcion = "Aceptable";
                break;
            case 'D':
                descripcion = "Aprobado mínimo";
                break;
            default:
                descripcion = "Reprobado";
        }

        System.out.println("Categoria: " + calificacion);
        System.out.println("Calificación: " + descripcion);

        sc.close();
    }
}
