import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Random;
import java.util.Scanner;

public class hello {public static void main(String[]args){

    String[][] arr=new String[3][3];
    Game game=new Game();
    System.out.println("共三回合，请输入剪刀（0），石头（1），布（2）：");
    game.View(arr);
    System.out.print("回合\t玩家\t电脑\t输赢情况\n");
    for(int i=0;i<3;i++)
    {
        System.out.print("第"+(i+1)+"次\t");
        for(int j=0;j<3;j++)
        {

            System.out.print(arr[i][j]+"\t\t");
        }
        System.out.println();
    }
}
}
class Game{
    GamePlayer gamePlayer=new GamePlayer();
    Computer computer=new Computer();
    Vs vs=new Vs();
    public String[][] View(String[][] arr)
    {

        for(int i=0;i<3;i++)
        {
            String player=gamePlayer.PlayerGoOut();
            if (player.equals("false"))
            {

                do {
                     System.out.println("输入有误，请重新输入第"+(i+1)+"回合的数");
                     player=gamePlayer.PlayerGoOut();
                }while (player.equals("false"));
            }
            String cop=computer.ComputerGoOut();
            arr[i][0]=player;
            arr[i][1]=cop;
            String outcome=vs.pk(player,cop);
            arr[i][2]=outcome;
        }
        return arr;
    }
}
class GamePlayer{
    Scanner scanner=new Scanner(System.in);
    public String PlayerGoOut(){
        int a=scanner.nextInt();
        if (a>=0&&a<=2)
        {
            String player=Integer.toString(a);
            return player;
        }
        else {
            return "false";
        }

    }
}
class Computer{
    public String ComputerGoOut()
    {
        Random random=new Random();
        int a=random.nextInt(3);
        String cop=Integer.toString(a);
        return cop;
    }
}
class Vs{
    public String pk(String player, String cop)
    {

        if(player.equals(cop))
        {
            return "平手";
        }
        else if((player.equals("1")&&cop.equals("0"))||(player.equals("0")&&cop.equals("2"))||(player.equals("2")&&cop.equals("1")))
        {
            return "你赢了";
        }
        else
        {
            return "你输了";
        }
    }
}

