import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamano de la arena (1-3)");
        int numero = scanner.nextInt();
        Arena arena = new Arena(numero);

        arena.mostrarArena();
    }
}
