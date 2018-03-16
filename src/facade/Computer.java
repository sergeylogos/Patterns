package facade;


public class Computer {
    private String computerModel;
    private Monitor monitor;
//      Not Facade
//    public Computer(String computerModel, Monitor monitor) {
//        this.computerModel = computerModel;
//        this.monitor = monitor;
//    }


    public Computer(String computerModel, int inc, String model) {
        this.computerModel = computerModel;
        this.monitor = new Monitor(inc, model);
    }
}
