package wang.lvshang.designPattern.structure.proxy;


public class Application {
    public static void main(String[] args){

        MediaPlayer player = new AudioPlayerProxy(new AudioPlayer());
        player.play("mp3","file.mp3");
    }
}
