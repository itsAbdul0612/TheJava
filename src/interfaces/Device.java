package interfaces;

public class Device implements Camera, MusicPlayer, PhoneCalls{
    @Override
    public void takePictures() {
        System.out.println("Click!");
    }

    @Override
    public void takeVideo() {
        System.out.println("Rec..");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stoping music");
    }

    @Override
    public void makeCall(String s) {
        System.out.println("Ring Ring...");
    }

    @Override
    public void endCall() {
        System.out.println("End.");
    }

}
