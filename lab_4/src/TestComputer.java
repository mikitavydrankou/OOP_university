public class TestComputer {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.setDiscSize(1000);
        int result = c1.ExpandDisc(100, 150);
        System.out.println("Pozostało na dysku: " + result + " Mb");
    }
}
class Computer{
    private int discSize;

    public void setDiscSize(int SetDiskSize){
        this.discSize = SetDiskSize;
    }

    public int ExpandDisc(int file1, int file2){
        int remained = discSize;
        remained += file1;
        remained += file2;
        return remained;
    }
}
