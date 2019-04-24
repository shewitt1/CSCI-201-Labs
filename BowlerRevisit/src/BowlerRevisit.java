import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BowlerRevisit {
    public static void main(String[] args) throws Exception{
        Scanner bowlerFile = new Scanner(new File("Bowlers2019"));

        ArrayList<Bowler> bowlers = new ArrayList<>();

        while(bowlerFile.hasNextInt()){
            int id = bowlerFile.nextInt();

            Bowler newBowler;
            // bowler has not been added
            if(bowlers.size() < id){
                newBowler = new Bowler(id);
                bowlers.add(newBowler);
            }
            else{
            	//System.out.println("id = " + id);
                newBowler = bowlers.get(id-1);
            }

            int temp = bowlerFile.nextInt();

            for(int i = 0; i < 3; i++){
                int game = bowlerFile.nextInt();
                newBowler.addGame(game);
            }
        }
        Bowler highGameBowler = bowlers.get(0);
        ArrayList<Bowler> highGameBowlers = new ArrayList<>();
        highGameBowlers.add(bowlers.get(0));
        Bowler highAvgBowler = bowlers.get(0); //set high bowler to first bowler
        for(Bowler currentBowler : bowlers){
            System.out.println(currentBowler);
            if (currentBowler.average() > highAvgBowler.average()) {
            	highAvgBowler = currentBowler;
            }
            if (currentBowler.highGame() > highGameBowlers.get(0).highGame()) {
            	highGameBowlers = new ArrayList<>();
            	highGameBowlers.add(currentBowler);
            }
        }
        
        System.out.printf("Bowler #%d has the highest average with %1.2f\n",
        		highAvgBowler.getId(), highAvgBowler.average());
        for (Bowler bowler : highGameBowlers) {
        System.out.printf("Bowler #%d has the highest game with %d\n",
        		bowler.getId(), bowler.highGame());
        }
    }
}
