public class Car {
    String BrandName;
    int ManuDate;
    String Color;

    public Car(String BrandName, int ManuDate, String Color) {
        this.BrandName = BrandName;
        this.ManuDate = ManuDate;
        this.Color = Color;
    }


    void printDetails() {
        System.out.printf("Car BrandName is %s\n", this.BrandName);
        System.out.printf("Car ManuDate is %d\n", this.ManuDate);
        System.out.printf("Car BrandName is %s\n", this.Color);

    }
}
class Driver{
   public static void main(String[] args) {
        Car c1 = new Car("Audi",1995,"white");
        c1.printDetails();


    }
}