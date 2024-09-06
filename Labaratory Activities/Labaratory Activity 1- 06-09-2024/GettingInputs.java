import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year: ");
        String year = scanner.nextLine();

        System.out.println("Enter the genre: ");
        String genre = scanner.nextLine();

        System.out.println("Enter the album: ");
        String album = scanner.nextLine();

        System.out.println("Enter the title: ");
        String title = scanner.nextLine();

        System.out.println("Enter the artist: ");
        String artist = scanner.nextLine();

        System.out.println("---------------\nSONG DETAILS\n---------------")

        System.out.println("Year Released: "+ year);
        System.out.println("Genre: "+ genre);
        System.out.println("Album: "+ album); 
        System.out.println("Title: "+ title);
        System.out.println("Artist: "+ artist);
        
        scanner.close();
    }
}