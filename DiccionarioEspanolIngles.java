import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class DiccionarioEspanolIngles {
    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("coche", "car");
        diccionario.put("árbol", "tree");
        diccionario.put("flor", "flower");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("tierra", "earth");
        diccionario.put("aire", "air");
        diccionario.put("mar", "sea");
        diccionario.put("montaña", "mountain");
        diccionario.put("río", "river");
        diccionario.put("bosque", "forest");
        diccionario.put("ciudad", "city");
        diccionario.put("pueblo", "village");

        // Escoger al azar 5 palabras en español del diccionario
        Random random = new Random();
        Object[] palabras = diccionario.keySet().toArray();
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        for (int i = 0; i < 5; i++) {
            String palabra = (String) palabras[random.nextInt(palabras.length)];
            System.out.print("Traduce la palabra '" + palabra + "' al inglés: ");
            String traduccion = scanner.nextLine();

            if (diccionario.get(palabra).equals(traduccion)) {
                correctas++;
                System.out.println("¡Correcto!");
            } else {
                incorrectas++;
                System.out.println("Incorrecto. La traducción correcta es: " + diccionario.get(palabra));
            }
        }

        // Mostrar el número de respuestas correctas e incorrectas
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);

        scanner.close();
    }
}
