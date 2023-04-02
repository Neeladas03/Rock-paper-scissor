import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
public class Demo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	while(true) {
	String rps[]= {"rock","paper","scissor"};
	Random rand=new Random();
	String computer=rps[rand.nextInt(rps.length)];
	String player;
	int playerwins=0;
	int computerwins=0;
	while(true) {
		player=JOptionPane.showInputDialog("Enter your move: rock || paper || scissor ");
		if(player.equals("rock")||player.equals("paper")||player.equals("scissor")) {
			break;
		}
		else {
			JOptionPane.showMessageDialog(null,"Enter a valid move");
		}
		
	}
	JOptionPane.showMessageDialog(null,"Your move: "+player);
	JOptionPane.showMessageDialog(null,"Computer move: "+computer);
	if(player.equals(computer)) {
		JOptionPane.showMessageDialog(null,"It is a tie");}
	else if(player.equals("rock")&&computer.equals("scissor")||player.equals("paper")&&computer.equals("rock")||player.equals("scissor")&&computer.equals("paper")) {
		JOptionPane.showMessageDialog(null,"You win this round");
		playerwins++;
	}
	else {
		JOptionPane.showMessageDialog(null,"Computer win this round");
		computerwins++;
	}
	JOptionPane.showMessageDialog(null,"Your wins: "+playerwins);
	JOptionPane.showMessageDialog(null,"Computer wins: "+computerwins);
	while(true) {
	if(playerwins>computerwins) {
		JOptionPane.showMessageDialog(null,"Congratulations you won!!!!");
	}
	else if(player.equals(computer)){
		JOptionPane.showMessageDialog(null,"Sorry the game is a tie try again....");
	}
	else {
		JOptionPane.showMessageDialog(null,"Sorry you lost the game :(");
	}
	break;
	
	}
	String playagain;  
	playagain=JOptionPane.showInputDialog("Do you want to play again? (yes/no)");
	if(playagain.equals("no")) {
	 break;
	}
	}
}
}
