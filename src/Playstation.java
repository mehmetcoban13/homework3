public class Playstation extends Device {

    public Playstation() {
        super("Playstation");
    }

    public Playstation(boolean isOpen) {
        super("Playstation", isOpen);
    }

    public Playstation(boolean isOpen, GameController controller) {
        super("Playstation", isOpen, controller);
    }

    @Override
    public void addController(GameController controller) throws IllegalArgumentException {
        if(controller instanceof PlaystationController){
            setController(controller);
            System.out.println("The controller has been successfully added to Playstation.");
        } else {
            throw new IllegalArgumentException("The given controller is not compatible with Playstation!");
        }
    }
    
}
