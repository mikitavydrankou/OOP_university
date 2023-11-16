public class Animal {
    public String name;

    public Animal(){

    }

    public Animal(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return  this.name;
    }

    public boolean equals(Object other){
        if(other instanceof Animal temp){
            return this.name.equals(temp.name);
        }
        else{
            return false;
        }
    }

    public void makeSound(){
        System.out.println("Jakiś niewiadomy odgłos");
    }
}

class Cat extends Animal{
    public Cat(){

    }
    public Cat(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("Meow Meow");
    }
}
