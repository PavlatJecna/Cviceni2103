package Decorator;

public class BasicCar implements CarAssembly{
    @Override
    public void assemble() {
        System.out.println("Basic car.");
    }
}
