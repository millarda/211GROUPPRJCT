
import java.awt.*;

import javax.swing.JPanel;

public class FrameManager extends java.applet.Applet {
	public FrameManager(){
		int x = 4;
		int y = 7;
		Panel p;
		JPanel Field = new JPanel();
		Field.setLayout(new GridLayout(5,5));
		for(int i = 0; i<25; i++){
			Field.add(new Tile(false));
		}
		add("Center", Field);
	}
	public void init() {
		

		
		/*
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
		
		*/
		int x = 4;
		int y = 7;
		Panel p;
		JPanel Field = new JPanel();
		Field.setLayout(new GridLayout(5,5));
		for(int i = 0; i<25; i++){
			Field.add(new Tile(false));
		}
		add("Center", Field);

		//Math.random(
		//Panel p;
		//setLayout(new BorderLayout());
		//p=new Panel();
		//p.add(new ...);
		//add("Location", p);

	}
}
