import Decorator.*;

public class Main {
    public static void main(String[] args) {
        CarAssembly naseAuto = new BasicCar();
        naseAuto = new RedPaintCarDecorator(naseAuto);
        naseAuto = new DoubleExhaustDecorator(naseAuto);
        naseAuto.assemble();
    }
}