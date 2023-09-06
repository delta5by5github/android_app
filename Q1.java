import java.util.Scanner;

public class SouthAfricanFootballTeams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a city in South Africa: ");
        String city = scanner.nextLine();

        String footballTeam;

        switch (city.toLowerCase()) {
            case "johannesburg":
                footballTeam = "Moroka Swallows F.C.";
                break;
            case "cape town":
                footballTeam = "Cape Town City F.C.";
                break;
            case "durban":
                footballTeam = "AmaZulu F.C.";
                break;
            case "pretoria":
                footballTeam = "Mamelodi Sundowns F.C.";
                break;
            case "bloemfontein":
                footballTeam = "Bloemfontein Celtic F.C.";
                break;
            default:
                footballTeam = "No football team found for the specified city.";
        }

        System.out.println("Football team in " + city + ": " + footballTeam);
    }
}
