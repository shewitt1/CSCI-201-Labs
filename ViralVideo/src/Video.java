import java.text.DecimalFormat;

public class Video {

private int id;
private String title;
private int viewCount;
private int likes;
    
private static double totalLikes = 0;

public Video (int initId, String initTitle) {
    title = initTitle;
    id = initId;
    viewCount = 0;
    likes = 0;
}


public int getId() {
    return id;
}

public String getTitle() {
    return title;
}


public int getViewCount() {
    return viewCount;
}


public int getLikes() {
    return likes;
}


public void increaseView(boolean likeIsPressed) {
    
    viewCount++;
    if (likeIsPressed == true) {
        likes++;
        totalLikes++;
    }
    
}

public double likeability() {
    if (totalLikes == 0) {
        return 0;
    } else {
        return likes / totalLikes;
    }
}

public String toString() {
    DecimalFormat decimalFormat = new DecimalFormat("#.####");
    return title + "\nViews: " + viewCount + "\nLikes: " + likes + "\nLikeability:" + decimalFormat.format(likeability()) + "\n\n";
}







}