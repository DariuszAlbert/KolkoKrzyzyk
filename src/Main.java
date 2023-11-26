
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

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
                    if (e.getSource()==b[i][j] && z[i] == 0 && Objects.equals(b[i][j].getLabel(), "")){
                        if(a % 2 == 0){
                            b[i][j].setLabel("O");
                            a++;

                        }else {
                            b[i][j].setLabel("X");
                            a++;
                        }
                    }
                }}


                // winning conditions

                for (int i = 0; i<3; i++){
                    if (b[i][0].getLabel() == "X" && b[i][1].getLabel() == "X" && b[i][2].getLabel() == "X" ){
                        System.out.println("X wygrywa");
                        Label player1 = new Label("Gracz 1 wygrywa");
                        player1.setSize(250,80);
                        player1.setLocation(500,200);
                        player1.setFont(new Font("", Font.BOLD, 20));
                        player1.setBackground(Color.white);
                        player1.setForeground(Color.black);
                        add(player1);
                }
                    if (b[i][0].getLabel() == "O" && b[i][1].getLabel() == "O" && b[i][2].getLabel() == "O" ){
                        System.out.println("O wygrywa");
                        Label player1 = new Label("Gracz 2 wygrywa");
                        player1.setSize(250,80);
                        player1.setLocation(500,200);
                        player1.setFont(new Font("", Font.BOLD, 20));
                        player1.setBackground(Color.white);
                        player1.setForeground(Color.black);
                        add(player1);
                    }
                }

                for (int i = 0; i<3; i++){
                    if (b[0][i].getLabel() == "X" && b[1][i].getLabel() == "X" && b[2][1].getLabel() == "X" ){
                        System.out.println("X wygrywa");
                        Label player1 = new Label("Gracz 1 wygrywa");
                        player1.setSize(250,80);
                        player1.setLocation(500,200);
                        player1.setFont(new Font("", Font.BOLD, 20));
                        player1.setBackground(Color.white);
                        player1.setForeground(Color.black);
                        add(player1);
                    }
                    if (b[0][i].getLabel() == "O" && b[1][i].getLabel() == "O" && b[2][i].getLabel() == "O" ){
                        System.out.println("O wygrywa");
                        Label player1 = new Label("Gracz 2 wygrywa");
                        player1.setSize(250,80);
                        player1.setLocation(500,200);
                        player1.setFont(new Font("", Font.BOLD, 20));
                        player1.setBackground(Color.white);
                        player1.setForeground(Color.black);
                        add(player1);
                    }
                }

        if (b[0][0].getLabel() == "O" && b[1][1].getLabel() == "O" && b[2][2].getLabel() == "O" ){
            System.out.println("O wygrywa");
            Label player1 = new Label("Gracz 2 wygrywa");
            player1.setSize(250,80);
            player1.setLocation(500,200);
            player1.setFont(new Font("", Font.BOLD, 20));
            player1.setBackground(Color.white);
            player1.setForeground(Color.black);
            add(player1);
        }

        if (b[0][0].getLabel() == "X" && b[1][1].getLabel() == "X" && b[2][2].getLabel() == "X" ){
            System.out.println("X wygrywa");
            Label player1 = new Label("Gracz 1 wygrywa");
            player1.setSize(250,80);
            player1.setLocation(500,200);
            player1.setFont(new Font("", Font.BOLD, 20));
            player1.setBackground(Color.white);
            player1.setForeground(Color.black);
            add(player1);
        }

        if (b[2][0].getLabel() == "O" && b[1][1].getLabel() == "O" && b[0][2].getLabel() == "O" ){
            System.out.println("O wygrywa");
            Label player1 = new Label("Gracz 2 wygrywa");
            player1.setSize(250,80);
            player1.setLocation(500,200);
            player1.setFont(new Font("", Font.BOLD, 20));
            player1.setBackground(Color.white);
            player1.setForeground(Color.black);
            add(player1);
        }

        if (b[2][0].getLabel() == "X" && b[1][1].getLabel() == "X" && b[0][2].getLabel() == "X" ){
            System.out.println("X wygrywa");
            Label player1 = new Label("Gracz 1 wygrywa");
            player1.setSize(250,80);
            player1.setLocation(500,200);
            player1.setFont(new Font("", Font.BOLD, 20));
            player1.setBackground(Color.white);
            player1.setForeground(Color.black);
            add(player1);
        }





        }


}

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
