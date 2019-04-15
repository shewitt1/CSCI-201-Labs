import java.util.*;
public class votingMachineMain {

    public static void main(String[] args) {
        Random gen = new Random();
        
        int voterCount = gen.nextInt(500)+1;
        
        VotingMachine machine1 = new VotingMachine();
        
        int dcount = 0;
        int rcount = 0;
        System.out.printf("Number of voters: %d\n", voterCount);
        for (int personNum = 1; personNum <= voterCount; personNum++) {
            int voteType = gen.nextInt(2);
            
            if(voteType == 0) {
                machine1.voteDemocrat();
                dcount++;
            } else {
                machine1.voteRepublican();
                rcount++;
            }
        }//For
        
        System.out.printf("dcount = %d rcount = %d total = %d \n", dcount, rcount, dcount+rcount);
        System.out.printf("Machine1: %s \n", machine1);
    }

}