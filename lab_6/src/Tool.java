public class Tool {
    protected String name;

    protected Tool(String name) {
        this.name = name;
    }
}

class Hammer extends Tool {
    public Hammer(String name) {
        super(name);
    }
}

