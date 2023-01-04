package wang.lvshang.designPattern.structure.proxy;


public class AudioPlayerProxy extends AudioPlayer {
    private AudioPlayer audioPlayer;

    public AudioPlayerProxy(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void play(String audioType, String fileName) {
        super.play( audioType,  fileName);
        System.out.println("play audio player parent");
    }
}
