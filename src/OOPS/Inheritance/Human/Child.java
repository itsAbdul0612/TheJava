package OOPS.Inheritance.Human;

public class Child extends Parent{
   public Child(String name, int age){
       super(name, age);
       System.out.println("Childs Constructor Called.");

   }
   public void childMethod(){
       super.parentMethod();
       System.out.println("Child Method Called.");
   }

    @Override
    public void money() {
        System.out.println("Father left me no money.");
    }
}
