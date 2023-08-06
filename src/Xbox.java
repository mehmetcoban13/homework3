public class Xbox extends Device {

    public Xbox() {
        super("Xbox");
    }

    public Xbox(boolean isOpen) {
        super("Xbox", isOpen);
    }

    public Xbox(boolean isOpen, GameController controller) {
        super("Xbox", isOpen, controller);
    }

    @Override
    public void addController(GameController controller) throws IllegalArgumentException{
        if(controller instanceof XboxController){
            setController(controller);
            System.out.println("The controller has been successfully added to Xbox.");
        } else {
            throw new IllegalArgumentException("The given controller is not compatible with Xbox!");
        }
    }
    
}
