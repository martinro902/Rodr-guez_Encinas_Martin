package modelo;

public class Almacen {
    private Libro[] libros;
    private int numLibrosTotal;
    private double preciototal=0;
    private int tiempototallectura=0;
    private int tiempolectemp=0;
    private int pagpormin;

    public Almacen(int tamaño){
        libros = new Libro[tamaño];
        numLibrosTotal=0;
        pagpormin=1;
    }


    public void ponerritmolectura(int pagpormin){
        this.pagpormin = pagpormin;
    }
    
    public boolean meterlibro(Libro libro){
        if(numLibrosTotal<libros.length){
            libros[numLibrosTotal] = libro;
            numLibrosTotal++;
            return true;
        }else{
            System.out.printf("\nEl almacén de libros está lleno. No se puede añadir más.\n");
            return false;
        }
    }

    public void mostrarlibrosactual(){
        if (numLibrosTotal == 0) {
            System.out.println("\nNo hay libros en el almacén.");
            return;
        }
        else{
            System.out.printf("\n|------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            System.out.printf("|                                       TUS LIBROS GUARDADOS EN EL ALMACÉN ACTUALMENTE                                           \n");
            System.out.printf("|------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            System.out.printf("| 1) Título                 | 2) Año Publicación | 3) Autor                  | 4) Premio planeta | 5) Páginas   | 6) Tiempo total lectura | 7) Precio   \n");
            System.out.printf("|------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            
            for(int i=0; i < numLibrosTotal; i++){
                Libro libro = libros[i];
                tiempolectemp = libro.getPaginas() / pagpormin;
                tiempototallectura = tiempototallectura+tiempolectemp;
                preciototal = preciototal+libro.getPrecio();

            System.out.printf("\n| 1) %s                      | 2) %d              | 3) %s %s                  | 4) %s             | 5) %d         | 6) %d                   | 7) %.3f euros    \n", libros[i].getTitulo(),libros[i].getAnioPublicacion(),libros[i].getAutor().getNombre(),libros[i].getAutor().getApellidos(),libros[i].getAutor().getpremioPlaneta()? "SI": "NO",libro.getPaginas(),tiempolectemp,libro.getPrecio());
            
            }

            System.out.printf("|------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");  
            System.out.printf("|Tiempo total de lectura de su almacén:                                                                                 %d         \n", tiempototallectura);
            System.out.printf("|Precio total de su almacen:                                                                                            %.3f          \n",preciototal);    
            System.out.printf("|------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");  


        }
    }
    

    
}
