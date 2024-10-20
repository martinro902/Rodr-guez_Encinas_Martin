import modelo.Almacen;
import modelo.Autor;
import modelo.Libro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int tamaño;
        Almacen almacen=null;  //LA VARIABLE QUE VOY A USAR PARA EL ALMACEN
        int respuesta;
        int pagpormin=1;
        Scanner sc=new Scanner(System.in);
        
        
        System.out.printf("\n|-----------------------------------------------------------------------------------|\n");
        System.out.println("|---BIENVENIDO A SU ALMACEN DE LIBROS PERSONAL, INDIQUE QUE ACCION DESEA REALIZAR---|");
        System.out.println("|-----------------------------------------------------------------------------------|");
        System.out.println("1) CREAR UN NUEVO ALMACEN");
        System.out.println("2) ESTABLECER UN RITMO DE LECTURA (PAGINAS POR MIN)");
        System.out.println("3) AÑADIR UN NUEVO LIBRO AL ALMACEN");
        System.out.println("4) MOSTRAR MIS LIBROS Y SU INFORMACION ACTUAL");
        System.out.println("5) SALIR (SE BORRARÁ TODA LA INFORMACIÓN)");
        
        do{
         
         respuesta = sc.nextInt();
         switch (respuesta) {
                case 1: //CREAR NUEVO
                  System.out.printf("\nINTRODUCE EL TAMAÑO DEL ALMACÉN: ");
                  tamaño =sc.nextInt();
                  almacen = new Almacen(tamaño);
                  System.out.printf("\nSE HA CREADO UN ALMACEN DE TAMAÑO %d\n\n",tamaño);
                  System.out.printf("\n|-----------------------------------------------------------------------------------|\n");
                  System.out.println("|-----------------------------¿QUE DESEA HACER AHORA?-------------------------------|");
                  System.out.println("|-----------------------------------------------------------------------------------|");
                  System.out.println("1) CREAR OTRO ALMACEN");
                  System.out.println("2) ESTABLECER UN RITMO DE LECTURA (PAGINAS POR MIN)");
                  System.out.println("3) AÑADIR UN NUEVO LIBRO AL ALMACEN");
                  System.out.println("4) MOSTRAR MIS LIBROS Y SU INFORMACION ACTUAL");
                  System.out.println("5) SALIR (SE BORRARÁ TODA LA INFORMACIÓN)");
                  break;

               case 2: //RITMO DE LECTURA
                  if (almacen == null) {  //ESTA COMPROBACION SE HACE PORQUE AL INICIALIZARLO A NULL PARA QUE NO DE ERRORES EL PROGRAMA FALLARÁ SI NO HAY NINGUN ALMACEN CREADO
                    System.out.printf("\nNO HAY ALMACEN CREADO, CREE UNO PREVIAMENTE\n");
                    break;
                  }
                  
                  System.out.printf("\nINTRODUCE EL RITMO DE LECTURA (PAGINAS POR MINUTO): ");
                  pagpormin =sc.nextInt();
                  almacen.ponerritmolectura(pagpormin);

                  System.out.printf("\nSE HA ESTABLECIDO EL RITMO DE LECTURA DE %d PAGINAS POR MIN\n\n",pagpormin);

                  System.out.printf("\n|-----------------------------------------------------------------------------------|\n");
                  System.out.println("|-----------------------------¿QUE DESEA HACER AHORA?-------------------------------|");
                  System.out.println("|-----------------------------------------------------------------------------------|");
                  System.out.println("1) CREAR UN NUEVO ALMACEN");
                  System.out.println("2) ESTABLECER UN RITMO DE LECTURA (PAGINAS POR MIN)");
                  System.out.println("3) AÑADIR UN NUEVO LIBRO AL ALMACEN");
                  System.out.println("4) MOSTRAR MIS LIBROS Y SU INFORMACION ACTUAL");
                  System.out.println("5) SALIR (SE BORRARÁ TODA LA INFORMACIÓN)");

                  break;

                case 3: //AÑADIR UN NUEVO LIBRO
                if (almacen == null) {  //ESTA COMPROBACION SE HACE PORQUE AL INICIALIZARLO A NULL PARA QUE NO DE ERRORES EL PROGRAMA FALLARÁ SI NO HAY NINGUN ALMACEN CREADO
                    System.out.printf("\nNO HAY ALMACEN CREADO, CREE UNO PREVIAMENTE\n");
                    break;
                  }
                sc.nextLine();
                System.out.printf("\nNOMBRE DEL AUTOR: ");
                  String nombre =sc.nextLine();
                System.out.printf("\nAPELLIDOS DEL AUTOR: ");
                  String apellidos =sc.nextLine();
                System.out.printf("\n¿ESTE AUTOR HA GANADO EL PREMIO PLANETA? (SI/NO): ");
                  String premioPlanetasino = sc.nextLine().toLowerCase();
                  
                  boolean premioPlaneta = (premioPlanetasino.equals("si")); //CON ESTO SE CONSIGUE DARLE UN VALOR AL BOOLEAN DEPENDIENDO DE SI SE PONE SI O CUALQUIER OTRA COSA 

                Autor autor = new Autor(nombre,apellidos, premioPlaneta);
                
                System.out.printf("\nTITULO DEL LIBRO: ");
                  String titulo =sc.nextLine();
                System.out.printf("\nAÑO DE PUBLICACION: ");
                  int anio =sc.nextInt();
                System.out.printf("\nNUMERO DE PAGINAS DEL LIBRO: ");
                  int paginas =sc.nextInt();
                System.out.printf("\nPRECIO DEL LIBRO: ");
                  double precio =sc.nextDouble();
                
                Libro libro = new Libro(autor,titulo, anio, paginas, precio);

                almacen.meterlibro(libro);

                System.out.printf("\n|-----------------------------------------------------------------------------------|\n");
                System.out.println("|-----------------------------¿QUE DESEA HACER AHORA?-------------------------------|");
                System.out.println("|-----------------------------------------------------------------------------------|");
                System.out.println("1) CREAR UN NUEVO ALMACEN");
                System.out.println("2) ESTABLECER UN RITMO DE LECTURA (PAGINAS POR MIN)");
                System.out.println("3) AÑADIR UN NUEVO LIBRO AL ALMACEN");
                System.out.println("4) MOSTRAR MIS LIBROS Y SU INFORMACION ACTUAL");
                System.out.println("5) SALIR (SE BORRARÁ TODA LA INFORMACIÓN)");

                break;

                case 4: // MOSTRAR INFORMACIÓN ACTUAL

                if (almacen == null) {  //ESTA COMPROBACION SE HACE PORQUE AL INICIALIZARLO A NULL PARA QUE NO DE ERRORES EL PROGRAMA FALLARÁ SI NO HAY NINGUN ALMACEN CREADO
                    System.out.printf("\nNO HAY ALMACEN CREADO, CREE UNO PREVIAMENTE\n");
                    break;
                  }

                almacen.mostrarlibrosactual();
                
                System.out.printf("\n|-----------------------------------------------------------------------------------|\n");
                System.out.println("|-----------------------------¿QUE DESEA HACER AHORA?-------------------------------|");
                System.out.println("|-----------------------------------------------------------------------------------|");
                System.out.println("1) CREAR UN NUEVO ALMACEN");
                System.out.println("2) ESTABLECER UN RITMO DE LECTURA (PAGINAS POR MIN)");
                System.out.println("3) AÑADIR UN NUEVO LIBRO AL ALMACEN");
                System.out.println("4) MOSTRAR MIS LIBROS Y SU INFORMACION ACTUAL");
                System.out.println("5) SALIR (SE BORRARÁ TODA LA INFORMACIÓN)");

                break;

                case 5: // SALIR

                System.out.printf("\nHASTA PRONTO!!!");
                return;
        
                default: //OPCION NO VALIDA

                System.out.printf("ERROR, INTRODUZCA UNA OPCION VÁLIDA");

                break;
            }
        }while(respuesta != 5);

        sc.close();
    }
}
