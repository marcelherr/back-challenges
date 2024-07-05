public class Main {
    public static void main(String[] args) {
        Playable mp1 = new MusicPlayer();
        Playable vp1 = new VideoPlayer();
        MediaController mc = new MediaController();

        mc.playMedia(mp1);
        mc.playMedia(vp1);
    }
}
