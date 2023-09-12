public class App {
    public static void main (String [] args) {
        Car car = new Car() ;
        car.setDist(200);
        car.setComb(20);
        System.out.println(car.getDist() );
        System.out.println(car.getComb() );
        System.out.println(car.getDiv("a distancia percorrida foi de") );

    }
}
