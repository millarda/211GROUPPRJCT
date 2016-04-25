import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class Tile extends JButton{
	boolean checked, bomb, flagged;
	public Tile(boolean isbomb){
		setText(" ");
		checked = false;
		bomb = isbomb;
		flagged = false;
		addMouseListener(new Sweep());
		setBackground(Color.white);
	}
	public void plantBomb(){
		bomb = true;
	}
	private class Sweep implements MouseListener{
		public void mouseReleased(MouseEvent mEvent){
			if(SwingUtilities.isRightMouseButton(mEvent)){
				if(flagged == false && checked == false){
					setBackground(Color.yellow);
					flagged = true;
				}else if(checked == false){
					setBackground(Color.white);
					flagged = false;
				}
				
			}else if(SwingUtilities.isLeftMouseButton(mEvent)){
				if(flagged == false){
					setBackground(Color.gray);
					checked = true;
				}
			}
		}
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

	}

		
		
	
}
