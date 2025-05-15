import java.util.Scanner;
//Importa la clase Scanner para poder leer datos del teclado.

public class ValidacionClave {
    public static void main(String[] args) {
//Creo un objeto llamado scanner que recibe lo que el usuario escribe en la consola.
    Scanner scanner = new Scanner(System.in);
//Se utiliza String: el guarda la contraseña correcta dentro de una variable de texto (String).
//String se usa porque una contraseña suele contener letras y números.
    String claveCorrecta = "123456";

    System.out.println("Ingresa tu contraseña: ");
//next int: leer número
    String ClaveIngresada = scanner.nextLine();
//.equals() compara el contenido real del texto, que es lo que normalmente queremos.
//Usamos .equals() para comparar texto en Java
    if(ClaveIngresada.equals(claveCorrecta)) {
        System.out.println("Acceso permitido");
    }else{
        System.out.println("Acceso denegado");
    }
    scanner.close();
    }
}
