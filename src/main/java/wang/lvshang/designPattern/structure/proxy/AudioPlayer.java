package wang.lvshang.designPattern.structure.proxy;


public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        System.out.println("play audio player");
    }



}
