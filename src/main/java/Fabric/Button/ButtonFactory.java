package Fabric.Button;

public class ButtonFactory {
    public Button getButton(Button.Type type) {
        switch (type) {
            case HTML -> {
                return new HTMLButton();
            }
            case WINDOWS -> {
                return new WindowsButton();
            }

        }
        throw new RuntimeException();
    }
}
