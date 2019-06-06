package Design_Pattern.Structural_Pattern.Adaptor;

public class AdaptorDemo {
    public static void main(String[] args) {
        MyPlayer player = new MyPlayer();
        //System.out.println(player.play("mp3", "some."));
    }
}


interface Player{
    public void play(String type, String filename);
}

interface AudioPlayer{
    public void playAudio(String filename);
}

interface videoPlayer{
    public  void playVideo(String filename);

}

class MyAudioPlayer implements AudioPlayer{

    @Override
    public void playAudio(String filename) {
        System.out.println("Playing, name: " + filename);
    }
}

class MyVideoPlayer implements videoPlayer{
    @Override
    public void playVideo(String filename){
        System.out.println("Playing, name: " + filename);
    }
}

class MyPlayer implements videoPlayer{



    @Override
    public void playVideo(String filename) {

    }
}
