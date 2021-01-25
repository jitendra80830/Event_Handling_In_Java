//Vertual key codes : An example
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class KeyEvents extends Applet implements KeyListener{
	String msg="";
	int x=10; //output coordinaters
	int y=20;
	public void init(){
		addKeyListener(this);
		requestFocus(); //request input focus
	}
	public void keyPressed(KeyEvent ke){
		showStatus("Key Peressed");
		int key=ke.getKeyCode();
		
		switch(key){
			case KeyEvent.VK_F1:msg+="<F1>";
			break;
			case KeyEvent.VK_F2:msg+="<F2>";
			break;
			case KeyEvent.VK_F3:msg+="<F3>";
			break;
			case KeyEvent.VK_PAGE_DOWN:msg+="<page down>";
			break;
			case KeyEvent.VK_PAGE_UP:msg+="<pgup>";
			break;
			case KeyEvent.VK_LEFT:msg+="<Left Arrow>";
			break;
			case KeyEvent.VK_RIGHT:msg+="<RightArrow>";
			break;
		}
		
		repaint();
	}
	public void keyReleased(KeyEvent ke){
		showStatus("KeyReleased");
	}
	public void keyTyped(KeyEvent ke){
		msg+=ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(msg,x,y);
	}
}
/*
<applet code="KeyEvents.class" height=400 width=500></applet>
*/