
import java.awt.*;
import java.awt.event.*;

class Fdemo extends Frame implements ActionListener{

    Button[][] b = new Button[3][3];
    Button newGame = new Button("New Game");

    int x = 8;
    int y = 28;

    int[] z = new int[9];

    int a = 0;

            public Fdemo(){
                setLayout(null);
                setVisible(true);
                setSize(800,600);
                setLocation(400,100);
                setBackground(Color.black);
                setForeground(Color.white);

                for (int i = 0; i <3; i++){
                    for (int j = 0 ; j<3 ; j++){
                        b[i][j] = new Button();
                        b[i][j].setSize(100,100);
                        b[i][j].setLocation(x,y);
                        b[i][j].setFont(new Font("", Font.BOLD, 40));

                        add(b[i][j]);

                        b[i][j].addActionListener(this);
                        b[i][j].setBackground(new Color(244,141,28, 5));

//                        k++;
                        x+=100;
                    }

                    x=8;
                    y+=100;
                }

                //New Game BUTTON
                newGame.setSize(150,40);
                newGame.setLocation(500,300);
                newGame.setFont(new Font("", Font.BOLD, 20));
                newGame.addActionListener(this);
                newGame.setBackground(Color.white);
                newGame.setForeground(Color.black);

                add(newGame);
                newGame.addActionListener(this);
        }


    public void actionPerformed(ActionEvent e){

                if(e.getSource() == newGame){
                    for (int i = 0; i < 3; i++){
                        for(int j = 0; j < 3; j++ ){
                        b[i][j].setLabel("");
                        z[i] = 0;
                        a = 0;

                    }
                }

                }

                for (int i =0; i < 3; i++){
                    for(int j =0; j <3 ;j++){
                    if (e.getSource()==b[i][j] && z[i] == 0){
                        if(a % 2 == 0){
                            b[i][j].setLabel("O");
                            a++;

                        }else {
                            b[i][j].setLabel("X");
                            a++;
                        }
                    }
                }}




        }


}

public class Main {

    public static void main(String[] args) {
        Fdemo fdem = new Fdemo();


    }
}
