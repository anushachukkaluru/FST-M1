package Activities;

public class Car {
    public String color;
    public String transmission;
    int make;
    int tyres;
    int doors;
    Car()
    {
        this.tyres=4;
        this.doors=4;
    }
public void displayCharacteristics()
{
    System.out.println(color);
    System.out.println(transmission);
    System.out.println(make);
    System.out.println(tyres);
    System.out.println(doors);
}
    public  void accelarate()
    {

        System.out.println("Car is moving forward.");
    }
    public void  brake()
    {

        System.out.println("Car has stopped.");
    }
}


