 import java.util.Scanner;

public class Console {
    
    private static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {

        lerInt();
        
    }

    public static int lerInt(){

        int valor = leitor.nextInt();
        leitor.nextLine();
        return valor;
    }

    public static String lerString(){

        String txt = leitor.nextLine();
        return txt;
    }

    public static float lerFloat(){
        
        float valor = leitor.nextFloat();
        leitor.nextLine();
        return valor;
    }

    public static Character lerCharacter(){

        Character caracter = leitor.next().charAt(0);
        return caracter;
    }

    public static double lerDouble(){
        double valor = leitor.nextDouble();
        return valor;
    }
}
