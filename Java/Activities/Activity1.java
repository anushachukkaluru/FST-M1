package Activities;

public class Activity1 {
    public  static void main(String[] args)
    {
        Car carInfo = new Car();
        carInfo.make=2014;
        carInfo.color="Black";
        carInfo.transmission="Manual";
        carInfo.displayCharacteristics();
        carInfo.accelarate();
        carInfo.brake();
    }

}


