public abstract class Device {
    private String name;
    private boolean isOpen;
    private GameController controller;

    public abstract void addController(GameController controller) throws IllegalArgumentException;
    
    public void openDevice() {
        if(isOpen){
            throw new IllegalStateException("This device is already open!");
        } else {
            isOpen = true;
            System.out.println("The device is successfully opened. Happy gaming :)");
        }
    }

    public void shutdownDevice() {
        if(!isOpen){
            throw new IllegalStateException("This device is already closed!");
        } else {
            isOpen = false;
            System.out.println("The device is successfully closed. Hope to see you again :)");
        }
    }

    public void playGame(){
        if(isOpen){
            System.out.println("The game has started, happy gaming! :)");
        } else {
            throw new IllegalStateException("This device is closed, please first open the device!");
        }
        
    }

    public Device(String name) {
        this.name = name;
    }
    
    public Device(String name, boolean isOpen) {
        this.name = name;
        this.isOpen = isOpen;
    }

    public Device(String name, boolean isOpen, GameController controller) {
        this.name = name;
        this.isOpen = isOpen;
        addController(controller);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public GameController getController() {
        return controller;
    }

    public void setController(GameController controller) {
        this.controller = controller;
    }

}
