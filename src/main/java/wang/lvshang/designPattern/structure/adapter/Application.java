package wang.lvshang.designPattern.structure.adapter;

public class Application {
    public static void main(String[] args){
        MediaPlayer player = new AudioPlayer();
        player.play("mp3","file.mp3");
        player.play("mp4","file.mp4");
        player.play("vlc","file.vlc");
    }
}




