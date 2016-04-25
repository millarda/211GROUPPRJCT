import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class MenuItem extends JButton {
	boolean clicked;
	public MenuItem(String name){
		setText(name);
		clicked = false;
		addMouseListener(new Click());
	}
	public boolean isClicked(){
		return clicked;
	}
	private class Click implements MouseListener{
		public void mouseReleased(MouseEvent mEvent){
			if(SwingUtilities.isLeftMouseButton(mEvent)){
				clicked = true;
			}
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}
