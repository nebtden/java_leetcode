package wang.lvshang.designPattern.structure.adapter;

public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMusicPlayer;


    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp4")){
            AdvancedMediaPlayer player = new Mp4Player();
            player.playMp4(fileName);
        } else if (audioType.equals("vlc")) {
            AdvancedMediaPlayer player = new VlcPlayer();
            player.playVlc(fileName);
        }
    }

}
