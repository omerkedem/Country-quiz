import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Country country [] = new Country[10];
        country[0] = new Country("Israel",8_000_000,false,"Asia");
        country[1] = new Country("UK",70_000_000,true,"Europe");
        country[2] = new Country("Brazil",203_000_000,false,"South America");
        country[3] = new Country("Spain",50_000_000,false,"Europe");
        country[4] = new Country("Japan",123_500_000,true,"Asia");
        country[5] = new Country("Australia",27_000_000,true,"Asia");
        country[6] = new Country("France",66_500_000,false,"Europe");
        country[7] = new Country("Mexico",131_000_000,false,"North America");
        country[8] = new Country("USA",346_000_000,false,"North America");
        country[9] = new Country("Gibraltar",40_000,true,"Europe");
        int randomCountry;
        int randomContinent;
        Random random = new Random();
        String continents [] = {"Asia", "North America", "South America", "Europe", "Africa"};
        int answer, score =0;

        for(int i =0;i<10;i++)
        {
            randomContinent = random.nextInt(5);
            randomCountry = random.nextInt(10);
            System.out.println("is " + country[randomCountry].getName() + " in the continent " + continents[randomContinent] + "?" );
            answer = scanner.nextInt();
            if(answer == 1)
            {
                if (continents[randomContinent].equals(country[randomCountry].getContinent()))
                {
                    System.out.println("well done!!");
                    score++;
                }
                else
                    System.out.println("Wrong!!");

            }
            else {
                if (continents[randomContinent].equals(country[randomCountry].getContinent()))
                {
                    System.out.println("Wrong!!");

                }
                else
                {
                    System.out.println("well done!!");
                    score++;
                }


            }
        }
        System.out.println("your score is "+ score);

    }
}