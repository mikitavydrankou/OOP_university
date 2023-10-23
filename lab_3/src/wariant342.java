
public class wariant342 {
    public static double mileKilometry(double a){
        double km = a / 0.621371;
        return km;
    }

    public static void main(String[] args) {
        double miles = 10.0; // Замените это значение на то, которое вы хотите конвертировать
        double kilometers = wariant342.mileKilometry(150);
        System.out.println(kilometers + " km");
        double kilometers2 = wariant342.mileKilometry(200);
        System.out.println(kilometers2 + " km");
    }
}
