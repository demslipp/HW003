public final class Point{
    private final double x;
    private  final double y;

    public Point(){
        this.x=10;
        this.y=10;
    }

    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }


    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public Point translate(double translatedX, double translatedY){
        translatedX+=this.x;
        translatedY+=this.y;

        return new Point(translatedX, translatedY);
    }
    public  Point scale(double sc){
        double scaledX;
        double scaledY;
        scaledX=this.x*sc;
        scaledY=this.y*sc;
        return new Point(scaledX, scaledY);
    }


    public void printResult(){
        System.out.println("Point{"+
                "x="+x+
                ", y="+y+
                '}');
    }
}
