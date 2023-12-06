import java.awt.*;

public class SimpleButton extends Button {

    int width;
    int height;
    int locationX;
    int locationY;
    String name;

    public SimpleButton(String name, int width, int height){
        super();
        this.setSize(width, height);
        this.setLabel(name);

    }



}
