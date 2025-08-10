public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioName, String fileName) {
        System.out.println("audioName " + audioName + " fileName " + fileName);
    }
}
