package ordenamientoobjetos;

/**
 *
 * @author Johan Sebastian Lasso Rivas
 */
public class OrdenamientoObjetos {

    
    public static void main(String[] args) {
       
        Estudiantes[] arrayEstudiantes = new Estudiantes[5];
        arrayEstudiantes[0] = new Estudiantes ("Juan", "Polania", "123", 5, 5.0);
        arrayEstudiantes[1] = new Estudiantes ("Carlos", "Gutierrez", "1234", 3, 4.8);
        arrayEstudiantes[2] = new Estudiantes ("Camilo", "Cortez", "12345", 4, 4.5);
        arrayEstudiantes[3] = new Estudiantes ("Edwin", "Perdomo", "123456", 2, 4.2);
        arrayEstudiantes[4] = new Estudiantes ("Felipe", "Polanco", "1234567", 1, 2.0);
        arrayEstudiantes[5] = new Estudiantes ("Fernando", "Peralta", "12345678", 6, 3.5);
    }
    
}