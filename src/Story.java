public class Story {
    public String story;
    public Story() {
        story = "";
    }
    public void addEntry(String storyLine, String choice) {
        story += "DIALOGUE: " + storyLine + " --> ENTRY: " + choice + "\n";
    }
    public void printPast() {
        System.out.println("-+-+-+-+-+-+-+-+-+-STORY-+-+-+-+-+-+-+-+-+-");
        System.out.println(story);
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
    }
}
