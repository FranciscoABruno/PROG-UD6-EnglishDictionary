import com.duolingo.entities.Diccionario;
import com.duolingo.utilities.InputUtils;

public class App {
    public static void main(String[] args) throws Exception {
        Diccionario diccionario = new Diccionario();

        System.out.println("¡Bienvenido al Diccionario de Duolingo!");

        boolean salir = false;
        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir palabra");
            System.out.println("2. Eliminar palabra");
            System.out.println("3. Existe palabra");
            System.out.println("4. Mostrar iniciales disponibles");
            System.out.println("5. Ver palabras por inicial");
            System.out.println("6. Cerrar programa");
            int opcion = InputUtils.leerEntero("Seleccione una opción: ");

        }
    }
}