public class Song {
    //Instance variables
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.duration = 180;
    }

    public void play(){
        System.out.println("Now playing: " + title);
    }

    public void stop(){
        System.out.println(title + " has stopped playing.");
    }

    public String getDetails(){
        return title + " by " + artist + " (" + duration + ")";
    }

    public void setDuration(int seconds){
        duration = seconds;
    }
}
