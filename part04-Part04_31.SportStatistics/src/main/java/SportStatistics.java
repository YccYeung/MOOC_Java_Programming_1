
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Storage> storage = new ArrayList<>();
        
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team");
        String temaName = scan.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            while (true) {

                String input = scanner.nextLine();
                String[] split = input.split(",");

                String homeTeam = split[0];
                String awayTeam = split[1];
                Integer homeScore = Integer.valueOf(split[2]);
                Integer awayScore = Integer.valueOf(split[3]);

                storage.add(new Storage(homeTeam, awayTeam, homeScore, awayScore));

            }

        } catch (Exception e) {
            //
        }

        int games = 0;
        int win = 0;
        int lose = 0;

        for (Storage i : storage) {
            if (i.home().equals(temaName)) {
                games++;
                
                if (i.homepts() > i.awaypts()) {
                    win++;
                }else {
                    lose++;
                }

            }
            if (i.away().equals(temaName)) {
                games++;

                if (i.awaypts() > i.homepts()){
                    win++;
                } 
            }

        }   

        

        System.out.println("Games: " + games);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);
        




    }

}
