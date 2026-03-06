package ClassStudy;

public class Computer {
    private String brand;
    private String model;
    private String OS;

    public Computer(String brand, String model, String OS){
        this.brand = brand;
        this.model = model;
        this.OS = OS;
    }

    static class USB{
        private String type;

        public USB(String type){
            this.type = type;
        }

        public void displayInfo(){
            System.out.println("USB Type: " + type);
        }
    }

    public class OperatingSystem{

    }

}
