public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car car = null;
        String carBrand = c1.brand;
        if(c1.brand != null){
            System.out.println(carBrand);
        }
        else {
            System.out.println("null");
    }

    }
}

class Car{
    public String brand;

}
