import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleButton extends Button  {

    int width;
    int height;
    int locationX;
    int locationY;
    String name;

    public SimpleButton(String name, int width, int height){
        super(name);
        setSize(width, height);
//        setLocation(x,y);
        setFont(new Font("", Font.BOLD, 40));

        setBackground(new Color(244,141,28, 5));


    }

//    public void actionPerformed(ActionEvent e, int[] z, int a) {
//
//        if (e.getSource() == this) {
//            for (int i = 0; i < 3; i++) {
//                for (int j = 0; j < 3; j++) {
//                    this.setLabel("");
//
//                    z[i] = 0;
//                    a = 0;
//                }
//            }
//
//        }
//    }

}
