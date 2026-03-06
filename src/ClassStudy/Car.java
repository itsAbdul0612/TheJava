package ClassStudy;

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model = model;
        this.isEngineOn = true;
    }

    class Engine{
        public void start(){
            if (!isEngineOn){
                isEngineOn = true;
                System.out.println(model +" Engine is starting.");
            } else {
                System.out.println("Engine is already on.");
            }
        }

        public void stop(){
            if (isEngineOn){
                isEngineOn = false;
                System.out.println(model +" Engine stopped.");
            }
            else {System.out.println("Engine is already stopped.");}
        }



    }
}
