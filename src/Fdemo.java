import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

class Fdemo extends Frame implements ActionListener {

    SimpleButton[][] b = new SimpleButton[3][3];
    Button newGame = new Button("New Game");

    int x = 8;
    int y = 28;

    public int[] z = new int[9];

    int a = 0;
    int l = 10;
    boolean hasWinner = false;

    public Fdemo(){


        setLayout(null);
        setVisible(true);
        setSize(800,600);
        setLocation(400,100);
        setBackground(Color.black);
        setForeground(Color.white);


        for (int i = 0; i <3; i++){
            for (int j = 0 ; j<3 ; j++){
                b[i][j] = new SimpleButton("",100, 100);
                b[i][j].setLocation(x,y);
                add(b[i][j]);
                b[i][j].addActionListener(this);
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

public static void removeListener(){

}


    public void actionPerformed(ActionEvent e){

        if(e.getSource() == newGame){
            for (int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++ ){
                    b[i][j].setLabel("");
                    b[i][j].addActionListener(this);
                    z[i] = 0;
                    a = 0;

                }
            }

        }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (e.getSource() == b[i][j] && z[i] == 0 && Objects.equals(b[i][j].getLabel(), "")) {
                if (a % 2 == 0) {
                    b[i][j].setLabel("O");

                    a++;

                } else {
                    b[i][j].setLabel("X");
                    a++;
                }
            }
        }
    }



    // winning conditions

    PlayerWinLabel p2 = new PlayerWinLabel("Gracz 2 wygrywa", l);
    PlayerWinLabel p1 = new PlayerWinLabel("Gracz 1 wygrywa", l);


    for (int i = 0; i < 3; i++) {
        if (b[i][0].getLabel() == "X" && b[i][1].getLabel() == "X" && b[i][2].getLabel() == "X") {

            add(p2);
            l += 50;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                b[j][k].removeActionListener(this);

                }
            }

        }
        if (b[i][0].getLabel() == "O" && b[i][1].getLabel() == "O" && b[i][2].getLabel() == "O") {
            add(p1);
            l += 50;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    b[j][k].removeActionListener(this);

                }
            }

        }
    }

    for (int i = 0; i < 3; i++) {
        if (b[0][i].getLabel() == "X" && b[1][i].getLabel() == "X" && b[2][i].getLabel() == "X") {
            add(p2);
            l += 50;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    b[j][k].removeActionListener(this);

                }
            }


        }
        if (b[0][i].getLabel() == "O" && b[1][i].getLabel() == "O" && b[2][i].getLabel() == "O") {
            add(p1);
            l += 50;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    b[j][k].removeActionListener(this);

                }
            }

        }
    }

    if (b[0][0].getLabel() == "O" && b[1][1].getLabel() == "O" && b[2][2].getLabel() == "O") {
        add(p1);
        l += 50;
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                b[j][k].removeActionListener(this);

            }
        }

    }

    if (b[0][0].getLabel() == "X" && b[1][1].getLabel() == "X" && b[2][2].getLabel() == "X") {
        add(p2);
        l += 50;
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                b[j][k].removeActionListener(this);

            }
        }


    }

    if (b[2][0].getLabel() == "O" && b[1][1].getLabel() == "O" && b[0][2].getLabel() == "O") {
        add(p1);
        l += 50;
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                b[j][k].removeActionListener(this);

            }
        }

    }

    if (b[2][0].getLabel() == "X" && b[1][1].getLabel() == "X" && b[0][2].getLabel() == "X") {
        add(p2);
        l += 50;
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                b[j][k].removeActionListener(this);

            }
        }


    }





    }


}
