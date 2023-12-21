public class BenzynowySilnik implements Silnik{
    @Override
    public void urochom() {
        System.out.println("Jedzie!");
    }
    @Override
    public void zatrzyma() {
        System.out.println("Nie jedzie!");
    }
}
