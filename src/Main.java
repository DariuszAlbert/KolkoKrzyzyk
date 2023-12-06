
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;



public class Main {

    public static void main(String[] args) {
        Fdemo fdem = new Fdemo();
        fdem.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });


    }
}
