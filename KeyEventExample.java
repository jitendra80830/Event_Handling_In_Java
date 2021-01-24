//KeyEvent an Example
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class KeyEventExample extends Applet implements KeyListener{
	String msg;
	int x=0;//output coordinaters
	int y=20;
	
	public void init(){
		addKeyListener(this);
		requestFocus(); //request input focus
	}
	public void keyPressed(KeyEvent ke){
		showStatus("key doun");
	}
	public void keyReleased(KeyEvent ke){
		showStatus("key up");
	}
	public void keyTyped(KeyEvent ke){
		msg+=ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g){ //display
		g.drawString(msg,x,y);
	}
}
/*
<applet code="KeyEventExample.class" height=100 width=300></applet>
*/
		