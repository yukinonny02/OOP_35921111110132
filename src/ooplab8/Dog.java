package ooplab8;

//Dog is a cat
//Dog is sub-class
//Pet is super-class
public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");
    }
}//clas