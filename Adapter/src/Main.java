public class Main {
    public static void main(String[] args) {
    MediaPlayer mediaPlayer = new AudioPlayer();
    mediaPlayer.play("mp3", "music.mp3");
    OldCassettePlayer oldCassettePlayer = new OldCassettePlayer();
    CassettePlayerAdapter cassettePlayerAdapter =new CassettePlayerAdapter(oldCassettePlayer);
        cassettePlayerAdapter.play("casseфывtte", "hits_of_90s");    }
}