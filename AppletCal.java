//Example of Applet with Even handling
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.TextField.*;

public class AppletCal extends Applet implements ActionListener{
	TextField one,two,res;
	Button add,sub,mul,div,mod;
	
	public void init(){
		Label l1=new Label("First Number:",Label.RIGHT);
		Label l2=new Label("Second Number:",Label.RIGHT);
		Label l3=new Label("Result:",Label.RIGHT);
		
		one=new TextField(5);
		two=new TextField(6);
		res=new TextField(7);
		
		add=new Button("Add");
		sub=new Button("Subtracts");
		mul=new Button("Multiply");
		div=new Button("Divide");
		mod=new Button("Mod");
		
		add(l1);
		add(one);
		add(l2);
		add(two);
		add(l3);
		add(res);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		
		one.addActionListener(this);
		two.addActionListener(this);
		res.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		String str=ae.getActionCommand();
		float b1,b2,b3=0;
		String msg;
		b1=Float.parseFloat(one.getText());
		b2=Float.parseFloat(two.getText());
		
		if(str.equals("Add"))
			b3=b1+b2;
		if(str.equals("Subtracts"))
			b3=b1-b2;
		if(str.equals("Multiply"))
			b3=b1*b2;
		if(str.equals("Divide"))
			b3=b1/b2;
		else
			b3=b1%b2;
		msg=String.valueOf(b3);
		res.setText(msg);
		repaint();
	}
	public void paint(Graphics g){
	}
}
/*
<applet code="AppletCal.class" height=400 width=400></applet>
*/
		
		
		
	