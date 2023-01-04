package wang.lvshang.designPattern.structure.adapter;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp4") || audioType.equals("vlc")){
            MediaAdapter player = new MediaAdapter();
            player.play(audioType,fileName);
        } else{
            System.out.println("play audio player");
        }


    }



}
