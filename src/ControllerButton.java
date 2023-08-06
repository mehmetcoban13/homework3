public abstract class ControllerButton {
    private String buttonName;

    public abstract void performAction();

    public ControllerButton(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

}
