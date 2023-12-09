import java.awt.*;

public class PlayerWinLabel extends Label {
    String playerName;
    int l;

    public PlayerWinLabel(String playerName, int l){
        super(playerName);
        this.playerName = playerName;
        this.l = l;

        setSize(250,80);
        setLocation(330,this.l);
        setFont(new Font("", Font.BOLD, 20));
        setForeground(Color.white);

    }

}
