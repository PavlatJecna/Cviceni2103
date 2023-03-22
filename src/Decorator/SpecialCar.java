package Decorator;

public class SpecialCar implements CarAssembly{
    @Override
    public void assemble() {
        System.out.println("Special car.");
    }
}
