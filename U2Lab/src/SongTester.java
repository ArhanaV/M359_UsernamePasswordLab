public class SongTester {
    public static void main(String[] args) {
        Song s1 = new Song("Shake it Off", "Taylor Swift", 219);
        Song s2 = new Song("Can't Stop the Feeling", "Justin Bieber");

        s1.play();
        System.out.println(s1.getDetails());
        s1.stop();

        System.out.println(s2.getDetails());
        s2.setDuration(238);
        System.out.println("Updated: " + s2.getDetails());
    }
}
