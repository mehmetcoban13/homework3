import java.util.List;

public class PlaystationController implements GameController{
    private List<ControllerButton> buttons;

    public List<ControllerButton> getButtons() {
        return buttons;
    }

    public void setButtons(List<ControllerButton> buttons) {
        this.buttons = buttons;
    }
}
