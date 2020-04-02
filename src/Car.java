public class Car{
    private int size;
    private int distance;
    private double efficiency;

    public Car(int distance, int size, double efficiency){
        this.distance=distance;
        this.size=size;
        this.efficiency=efficiency;
    }

    public void detectConsumption(){
        double g1=Double.valueOf(this.distance) * efficiency / Double.valueOf(this.size);
        double gas=Math.ceil(g1);
        System.out.println("needs "+gas+" full refuelings");
    }

    public void detectInterval(int currentDistance){
        int interval=this.distance-currentDistance;
        System.out.println("Meters to finish: "+interval);
        double gallons=(Double.valueOf(interval) * efficiency % size);
        System.out.println("Gallons in gas tank right now: "+gallons);
    }
}
