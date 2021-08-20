public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {     // without overriding this method printed massage will be song adress in memory instead of title: duration
        return this.title+": "+this.duration;
    }
}
