import java.util.ArrayList;

public class Bowler {

    private int id;
    ArrayList<Integer> games;

    public Bowler(int initId){
        id = initId;
        games = new ArrayList<>();
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void addGame(int newGame){
        games.add(newGame);
    }

    /**
     * algorithm:
     *      sum = 0
     *      for each game
     *          sum = sum + game
     *      average = sum / number of games
     *
     */
    public double average(){
        double result=0;
        double sum = 0;

        for(Integer game : games){
            sum = sum + game;
        }

        if(games.size() > 0){
            result = sum / games.size();
        }
        else{
            result = 0;
        }
        return result;
    }
    
    public int highGame() {
    if (games.size() <= 0) {
    	return 0;
    }	
    	int max = games.get(0);
    	
    	for(Integer game : games) {
    		if (game > max) {
    			max = game;
    		}
    	}
    	
    	return max;
    }
    
    /**
     * Return a string:
     * 		contains
     * 			Bowler Id
     * 			List of Bowler Games
     * 			Bowlers average
     * 
     */
    public String toString() {
    	String result="";
    	result += String.format("Bowler id: %d\n", id);
    	result += "\tGames: \n";
    	int gameOnRowCount = 0;
    	for (Integer game : games) {
    		if (gameOnRowCount % 3 == 0) result += "\t\t";
    		result += String.format("%3d ",  game);
    		if (gameOnRowCount % 3 == 2) {
    			result += "\n";
    			gameOnRowCount=0;
    		}
    		else 
    			gameOnRowCount++;    			
    	}
    	result += String.format("\tAverage: %6.2f\n", average());
    	return result;
    }
}
