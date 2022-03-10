import java.util.Scanner;

class Alumnos { //Base de datos, tiene que buscar, ordenarse x lo que quiera y motor de ofertas.
    public static void main (String[] args) {
        
        String [] alumnos = new String [1000];
        String [] ciudad = new String [1000];
        int i = 0, cant = 0;
        Scanner scanner = new Scanner(System.in);

        
        for (i=0; i<1000; i++){
            System.out.printf("Ingrese el nombre del alumno %d : ", i+1 );
            alumnos[i] = scanner.nextLine();
            System.out.printf("Ingrese la ciudad del alumno %d -> %s : ", i+1, alumnos[i] );
            ciudad[i] = scanner.nextLine();
            cant+=1;
            System.out.println("Si desea no agregar mas personas presione 1");
            int r = scanner.nextInt();
            if (r == 1){
                i = 1000;
            }
        }    

    }

    private void mostrarAlumnos(int cant, String [] alumnos, String [] ciudad) {
        System.out.println("Nombre\n-- Ciudad\n");
        



        
    }
}
