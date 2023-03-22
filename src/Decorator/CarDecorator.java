package Decorator;

public class CarDecorator implements CarAssembly {
    protected CarAssembly car;

    public CarDecorator(CarAssembly car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
