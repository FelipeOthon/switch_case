<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da semana");
        int x = scanner.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }
        System.out.println("Dia da semana: " + dia);

        scanner.close();

>>>>>>> 6487083 (enviar repo)
    }
}