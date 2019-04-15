public class VotingMachine {
    private int demoVotes;
    private int repubVotes;
    
    public VotingMachine() {
        demoVotes = 0;
        repubVotes = 0;
    }
    
    /*
     * PreCondition: repubVotes contains some value -- n
     * 
     * PostCondition: repubVotes' value has increased by 1
     */
    public void voteRepublican() {
        repubVotes++;
    }
    
    public void voteDemocrat() {
        demoVotes++;
    }
    
    public String toString() {
        return "Republican Votes: " + repubVotes + "\nDemocrat Votes: " + demoVotes + "\n";
    }
    
    public void reset() {
        demoVotes = 0;
        repubVotes = 0;
    }
    
    public int getDemocratVotes() {
        return demoVotes;
    }
    
    public int getRepublicanVotes() {
        return repubVotes;
    }
    
    public int totalVotes() {
        return demoVotes + repubVotes;
    }

}