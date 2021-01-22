//Scribble 2 applet : An Example
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Scribble2 extends Applet{
	private int last_x; //store the last mouse position of x
	private int last_y; //store the last mouse position of y
	
	private Color current_color=Color.black; //store the current_color
	
	private Button clear_button; //the clear button
	private Choice color_choice; //the color drown list
	
	//this method is called to initialize the applet
	public void init(){
		this.setBackground(Color.white);
		clear_button=new Button("clear");
		clear_button.setBackground(Color.lightGray);
		clear_button.setForeground(Color.black);
		this.add(clear_button);
		
		//create a menu of color added it to the applet
		//also set the menu's color add a list
		color_choice=new Choice();
		color_choice.addItem("black");
		color_choice.addItem("red");
		color_choice.addItem("yellow");
		color_choice.addItem("green");
		color_choice.setForeground(Color.black);
		color_choice.setBackground(Color.lightGray);
		this.add(new Label("color"));
		this.add(color_choice);
	}
	//this method is called whhen the user click the mouse to start a Scribble
	public boolean mouseDoun(Event e,int x,int y){
		last_x=x;
		last_y=y;
		return true;
	}
	//this Method is called whhen the user dragg the mouse
	public boolean mouseDrag(Event e,int x,int y){
		Graphics g=this.getGraphics();
		g.setColor(current_color);
		g.drawLine(last_x,last_x,x,y);
		last_x=x;
		last_y=y;
		return true;
	}
	//this method is called when the user click the button or choise a color
	public  boolean action(Event event,Object arg){
		
		//if the clear button was clicked on ,handle it
		if(event.target==clear_button){
			Graphics g=this.getGraphics();
			Rectangle r=this.bounds();
			g.setColor(this.getBackground());
			g.fillRect(r.x,r.y,r.width,r.height);
			return true;
		}
		//Otherwise if a color was chosen handle that
		else if(event.target==color_choice){
			if(arg.equals("black"))
				current_color=Color.black;
			else if(arg.equals("red"))
				current_color=Color.red;
			else if(arg.equals("yellow"))
				current_color=Color.yellow;
			else if(arg.equals("green"))
				current_color=Color.green;
			return true;
		}
		//otherwise,let the superclass handle it
		else
			return super.action(event,arg);
	}
}
/*
<applet code="Scribble2.class" height=500 width=400></applet>
*/
		 
	
	