public class Droid {

    String name;
    int baterryLevel;
    public Droid(String droidName){
        name = droidName;
        baterryLevel = 100;
    }
    public String toString(){
        return "Hello, I am a droid: " + name ;
    }
    public void performTask(String task){
        baterryLevel = baterryLevel - 10;
        System.out.println(name + " is performing task: " + task);
    }
    public void energyReport(int baterry){
        System.out.println("My baterry level is " + baterryLevel);
    }
    public void chargingDroid(int charging){
        baterryLevel = baterryLevel + 10;
        System.out.println("Charged up to the + " + charging);
    }

    public static void main(String[]args ){
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("play.");
        codey.performTask("coding");
        codey.energyReport(0);
    }
}





















