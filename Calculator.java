package UNIT_04;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class Calculator extends JFrame implements ActionListener{
	JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    
    Calculator()
    {
    	Scanner sc=new Scanner(System.in);
    	JLabel l1=new JLabel("Number 1:");
    	JLabel l2=new JLabel("Number 2:");
    	JLabel l3=new JLabel("Output:");
    	
    	JButton b1=new JButton("Sum");
    	JButton b2=new JButton("Subtract");
    	JButton b3=new JButton("Mul");
    	JButton b4=new JButton("Div");
    	
    	tf1 =new JTextField(10);
    	tf2 =new JTextField(10);
    	tf3 =new JTextField(10);
    	
    	setLayout(new FlowLayout());
    	add(l1);
    	add(tf1);
    	add(l2);
    	add(tf2);
    	add(b1);
    	add(b2);
    	add(b3);
    	add(b4);
    	add(l3);
    	add(tf3);
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	b4.addActionListener(this);
    }
	public void actionPerformed(ActionEvent e) {
	  String s=e.getActionCommand();
	  int res=0;
	  if(s.equals("Sum"))
	  {
		  res=Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText());
	  }
	  if(s.equals("Subtract"))
	  {
		  res=Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText());
	  }
	  if(s.equals("Mul"))
	  {
		  res=Integer.parseInt(tf1.getText())*Integer.parseInt(tf2.getText());
	  }
	  if(s.equals("Div"))
	  {
		  res=Integer.parseInt(tf1.getText())/Integer.parseInt(tf2.getText());
	  }
		tf3.setText(Integer.toString(res));
	}
	public static void main(String[] args)
	{
		Calculator d=new Calculator();
		d.setSize(400,400);
		d.setVisible(true);
	}
	
}
