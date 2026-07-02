package Interfaces;

public interface PhoneCalls {
    public void makeCall(String s);
    public void endCall();

    public  default void makeVC(){
        System.out.println("Vc...");
    }

}
