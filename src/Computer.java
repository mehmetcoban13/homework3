public class Computer extends Device {

    public Computer() {
        super("Computer");
    }

    public Computer(String name, boolean isOpen) {
        super("Computer", isOpen);
    }

    public Computer(String name, boolean isOpen, GameController controller) {
        super("Computer", isOpen, controller);
    }

    @Override
    public void addController(GameController controller) throws IllegalArgumentException {
        if(controller instanceof PlaystationController){
            setController(controller);
            System.out.println("The Playstation controller has been successfully added to Computer.");
        } else if (controller instanceof XboxController){
            setController(controller);
            System.out.println("The Xbox controller has been successfully added to Computer.");
        } else {
            throw new IllegalArgumentException("The given controller is not compatible with Computer!");
        }
    }

}
