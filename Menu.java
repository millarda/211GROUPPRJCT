import javax.swing.JPanel;
import java.awt.*;

public class Menu extends JPanel{
	MenuItem Beginner;
	MenuItem Medium;
	MenuItem Hard;
	public Menu(){
		Beginner = new MenuItem("Beginning");
		Medium = new MenuItem("Medium");
		Hard = new MenuItem("Hard");
		add(Beginner);
		add(Medium);
		add(Hard);
	}
	public int StartMenu(){
		int Difficulty=0;
		boolean SettingDifficulty = true;
		while(SettingDifficulty){
			if(Beginner.isClicked()){
				Difficulty = 0;
				SettingDifficulty = false;
			}else if(Medium.isClicked()){
				Difficulty = 1;
				SettingDifficulty = false;
			}else if(Hard.isClicked()){
				Difficulty = 2;
				SettingDifficulty = false;
			}
		}
		return Difficulty;
	}
	
}
