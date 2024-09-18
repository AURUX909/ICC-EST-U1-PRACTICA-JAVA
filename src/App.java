public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String cadena = "Hola mundo";

        System.out.println(cadena);
        int edad = 10;

        System.out.println("Tamaño de la cadena");
        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[0]);

        // Imprimir cada carácter separado por un guion
        for (int i = 0; i < cadena.length(); i++) {
            if (i == cadena.length() - 1) {
                System.out.print(cadena.charAt(i));
            } else {
                System.out.print(cadena.charAt(i) + "-");
            }
        }
        System.out.println("");

        // Contar palabras
        int palabras = cadena.split(" ").length;
        System.out.println("Número de palabras: " + palabras);

        // Contar cuántas 'a' hay en la cadena
        int conteoA = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
                conteoA++;
            }
        }
        System.out.println("Número de 'a' en la cadena: " + conteoA);
    }
}

