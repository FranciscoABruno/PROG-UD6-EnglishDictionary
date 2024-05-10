import com.duolingo.entities.Dictionary;
import com.duolingo.utilities.InputUtils;

public class App {
    public static void main(String[] args) throws Exception {
        Dictionary dictionary = new Dictionary();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenú: ");
            System.out.println("1. Añadir palabra");
            System.out.println("2. Eliminar palabra");
            System.out.println("3. Existe palabra");
            System.out.println("4. Mostrar iniciales disponibles");
            System.out.println("5. Ver palabras por inicial");
            System.out.println("6. Cerrar programa");
            int option = InputUtils.readInt("Selecciona una opción: \n");

            switch (option) {
                case 1:
                String newWord = InputUtils.readString("Ingresa la palabra a añadir: ");
                dictionary.addWord(newWord);
                System.out.println("Palabra agregada correctamente");
                break;
                case 2:
                String wordToRemove = InputUtils.readString("Ingresa la palabra a eliminar: ");
                if (dictionary.removeWord(wordToRemove)) {
                    System.out.println("Palabra eliminada correctamente");
                } else {
                    System.out.println("La palabra no estaba almacenada en el diccionario.");
                }
                break;
                case 3:
                String wordToCheck = InputUtils.readString("Ingresa la palabra a buscar: ");
                if (dictionary.hasWord(wordToCheck)) {
                    System.out.println("Palabra en el diccionario");
                } else {
                    System.out.println("La palabra no está en el diccionario");
                }
                break;
                case 4:
                    System.out.println("iniciales disponibles: " + dictionary.getAvailableInitials());
                break;
                case 5:
                    char initial = InputUtils.readChar("Ingresa la inicial para ver palabras: ");
                    System.out.println("Palabras con la inicial '" + initial + "': " + dictionary.getWordsByInitial(initial));
                    break;
                    case 6:
                    exit = true;
                    System.out.println("Programa cerrado");
                    break;
                default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }

        }
    }
}