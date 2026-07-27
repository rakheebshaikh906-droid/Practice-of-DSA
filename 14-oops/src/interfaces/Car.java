package interfaces;

public class Car implements Brake,Engine{
    @Override
    public void start() {
        System.out.println("car is started");

    }

    @Override
    public void brake() {
        System.out.println("we used brake");
    }

    @Override
    public void stop() {
        System.out.println("we stop the car");
    }

    @Override
    public void acc() {
        System.out.println("we used accelerator");
    }
}
