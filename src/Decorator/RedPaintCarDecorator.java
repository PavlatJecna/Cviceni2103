package Decorator;

public class RedPaintCarDecorator extends CarDecorator{
    public RedPaintCarDecorator(CarAssembly car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Painted Red.");
    }
}
