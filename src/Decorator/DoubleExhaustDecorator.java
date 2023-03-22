package Decorator;

public class DoubleExhaustDecorator extends CarDecorator{
    public DoubleExhaustDecorator(CarAssembly car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Added double exhaust.");
    }
}
