import java.util.Scanner;

public class questao_2
{
       public static void main(String[] args) {
        var readString = "";
        Scanner reader = new Scanner(System.in);
        System.out.print("Insira ao texto a ser verificado: ");
        readString = reader.nextLine();
        long aCounter = readString.chars().filter(letter -> letter == 'a' || letter == 'A').count();
        System.out.println("A letra 'a' aparece na string " + aCounter + " vezes!");

    }    
}
