public interface LoudAnimal {
    void makeNoise();
}

class Dog implements LoudAnimal {
    @Override
    public void makeNoise() {
        System.out.println("WoofWoof");
    }
}

class Cat implements LoudAnimal {
    @Override
    public void makeNoise() {
        System.out.println("MeowMeow");
    }
}



