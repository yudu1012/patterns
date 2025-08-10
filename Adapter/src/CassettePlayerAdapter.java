public class CassettePlayerAdapter implements MediaPlayer{
    private final OldCassettePlayer oldCassettePlayer;

    public CassettePlayerAdapter(OldCassettePlayer oldCassettePlayer) {
        this.oldCassettePlayer = oldCassettePlayer;
    }

    @Override
    public void play(String audioName, String fileName) {
        if (audioName.equalsIgnoreCase("cassette")){
            oldCassettePlayer.playCassette(fileName);
        }else{
            System.out.println("this file don't support cassette " + audioName);
        }
    }
}
