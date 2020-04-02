public class Main{

    public static void main(String[] args){
        Point point=new Point(3, 4).translate(1, 3).scale(0.5);
        point.printResult();

        Car car=new Car(101, 10, 0.2);
        car.detectConsumption();
        car.detectInterval(11);

    }
}