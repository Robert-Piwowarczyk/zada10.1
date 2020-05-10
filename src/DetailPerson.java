import java.util.Scanner;

public class DetailPerson {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj imię:");
        String firstName = sc.nextLine();

        System.out.println("Podaj nazwisko:");
        String lastName = sc.nextLine();

        System.out.println("Podaj wiek:");
        int age = sc.nextInt();

        System.out.println("Podaj pesel:");
        int pesel = sc.nextInt();

        try{
            Person newPerson = new Person("","",18,1234567890);
        } catch (NameUndefinedException e) {
                    System.out.println("podales złe imię lub nazwisko");
        } catch (IncorrectAgeException e) {
            System.out.println ("podales za mały wiek lub źle wpisałeś pesel");
        }
    }
}


