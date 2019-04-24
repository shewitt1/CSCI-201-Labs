import java.util.*;

public class viralVideo {
    
        public static void main(String[] args) {
            String[] titles = {"Bear Walking Like Human", "Bulldogs vs Wildcats", "Summer Fun", "April 23 Bonus Points"};
            
                
            
            Video video1 = new Video(1, titles[0]);
            Video video2 = new Video(2, titles[1]);
            
            
            Random rand = new Random();
                
            for (int i = 0;i <= 100000;i++) {
                
                int id = rand.nextInt(2) + 1;
                
                int v = rand.nextInt(2);
                
                System.out.println(id + " " + v);
                if(id == 2)
                    if(v == 0)
                    {
                        video1.increaseView(true);
                    }else{
                        
                        video1.increaseView(false);
                    }
                else 
                    if(v == 0)
                    {
                        video2.increaseView(true);
                    }else{
                        
                        video2.increaseView(false);
                    }
                    
                        
                    
                
                
            }
            
            System.out.println("Video Titles:");
            for(int i = 0; i < titles.length; i++)
                System.out.println((i+1) + ": " + titles[i]);
                
            System.out.println(video1.toString());
            System.out.println(video2.toString());
   
            
        }

}