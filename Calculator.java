import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
import javax.swing.event.*;
public class Calculator {
	
	private JButton b1,b2,b3,bclear,b4,b5,b6,bdiv,b7,b8,b9,bmul,bdecimle,bzero,bminus,bequal,bplus,clearAll;
	JTextField input ;
	public void Design()
	{
		JFrame frame = new JFrame("Calculator By SHAHI");		
		Container c = new Container();
		c = frame.getContentPane();
		c.setBackground(new Color(200,255,0,80));
		c.setLayout(null);
		
		/*Main / Base Panel*/
		JLayeredPane lpane = new JLayeredPane();
		lpane.setLayout(new BorderLayout());
		lpane.setBounds(50, 50, 300, 400);
		lpane.setBackground(Color.black);
		Border border = BorderFactory.createLineBorder(Color.black);
		lpane.setBorder(border);	
		
		
		/*Center Panel*/
		JPanel p_center = new JPanel();
		p_center.setLayout(new BorderLayout());
		p_center.setBounds(0, 0, 300, 400);
		p_center.setBackground(new Color(255,255,0,80));
		//p_center.setBorder(border);
		
		/*INside Center Panel*/
		input = new JTextField(20);
		input.setForeground(new Color(0,0,0));
		Font fnt_equal = new Font("Times New Roman (Headings CS)" , Font.BOLD ,25 );
		Font font = new Font("Times New Roman (Headings CS)" , Font.PLAIN , 60);	
		input.setFont(font);
		input.setBounds(0, 0, 400, 100);
		input.setBackground(new Color(176,169,49));
		input.setBorder(border);
		p_center.add(input , BorderLayout.NORTH);
		p_center.setBorder(new BevelBorder(BevelBorder.LOWERED , Color.blue, Color.black , Color.BLUE ,Color.black ));
		
		/*buttons*/
		b1 = new JButton("1");
		b1.setBackground(new Color(169,216,253));
		Font fnt_but = new Font("Times New Roman (Headings CS)" , Font.BOLD ,25 );
		b1.setFont(fnt_but);		
		b2 = new JButton("2");
		b2.setFont(fnt_but);
		b2.setBackground(new Color(169,216,253));
		b3 = new JButton("3");
		b3.setFont(fnt_but);
		b3.setBackground(new Color(169,216,253));
		bclear = new JButton("C");
		bclear.setFont(fnt_equal);
		bclear.setBackground(new Color(176,255,49));
		b4 = new JButton("4");
		b4.setFont(fnt_but);
		b4.setBackground(new Color(169,216,253));
		b5 = new JButton("5");
		b5.setFont(fnt_but);
		b5.setBackground(new Color(169,216,253));
		b6 = new JButton("6");
		b6.setFont(fnt_but);
		b6.setBackground(new Color(169,216,253));
		bdiv = new JButton("/");
		bdiv.setFont(fnt_equal);
		bdiv.setBackground(new Color(176,255,49));
		b7 = new JButton("7");
		b7.setFont(fnt_but);
		b7.setBackground(new Color(169,216,253));
		b8 = new JButton("8");
		b8.setFont(fnt_but);
		b8.setBackground(new Color(169,216,253));
		b9 = new JButton("9");
		b9.setFont(fnt_but);
		b9.setBackground(new Color(169,216,253));
		bmul = new JButton("*");
		bmul.setFont(fnt_equal);
		bmul.setBackground(new Color(176,255,49));
		bminus = new JButton("-");
		bminus.setFont(fnt_equal);
		bminus.setBackground(new Color(176,255,49));
		bplus = new JButton("+");
		bplus.setFont(fnt_equal);
		bplus.setBackground(new Color(176,255,49));
		bdecimle = new JButton(".");
		bdecimle.setFont(fnt_equal);
		bdecimle.setBackground(new Color(176,255,49));
		bzero = new JButton("0");
		bzero.setFont(fnt_but);
		bzero.setBackground(new Color(169,216,253));
		bequal = new JButton("=");
		bequal.setBackground(new Color(176,255,49));	
		bequal.setFont(fnt_equal);
		clearAll = new JButton("Clear All");
		clearAll.setBackground(new Color(255,0,0));
		Font fnt = new Font("Times New Roman (Headings CS)" , Font.BOLD ,20 );	
		clearAll.setFont(fnt);
		
		/*For Buttons' Panel*/
		JPanel Bpanel = new JPanel();
		Bpanel.setLayout(new GridLayout (4, 4, 5,5));
		Bpanel.setBackground(new Color(176,169,49));
		Bpanel.setBorder(new BevelBorder(BevelBorder.RAISED , Color.blue, Color.black , Color.BLUE ,Color.black ));
		
		Bpanel.add(b1);
		Bpanel.add(b2);
		Bpanel.add(b3);
		Bpanel.add(bclear);
		Bpanel.add(b4);
		Bpanel.add(b5);
		Bpanel.add(b6);
		Bpanel.add(bdiv);
		Bpanel.add(b7);
		Bpanel.add(b8);
		Bpanel.add(b9);
		Bpanel.add(bmul);
		Bpanel.add(bdecimle);
		Bpanel.add(bzero);
		Bpanel.add(bminus);
		Bpanel.add(bplus);
		lpane.add(bequal , BorderLayout.SOUTH);
		p_center.add(clearAll , BorderLayout.SOUTH);
		
		
		/*Registerations*/
		ActionHandler ah = new ActionHandler();
		b1.addActionListener(ah);
		b2.addActionListener(ah);
		b3.addActionListener(ah);
		b4.addActionListener(ah);
		b5.addActionListener(ah);
		b6.addActionListener(ah);
		b7.addActionListener(ah);
		b8.addActionListener(ah);
		b9.addActionListener(ah);
		bzero.addActionListener(ah);
		bplus.addActionListener(ah);
		bminus.addActionListener(ah);
		bmul.addActionListener(ah);
		bdiv.addActionListener(ah);
		bdecimle.addActionListener(ah);
		bclear.addActionListener(ah);
		clearAll.addActionListener(ah);
		bequal.addActionListener(ah);
		
		/*Addition on Container*/
		lpane.add(p_center , BorderLayout.NORTH);
		lpane.add(Bpanel , BorderLayout.CENTER);
		c.add(lpane);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(425,535);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	/*Events on Calculator*/
	private class ActionHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String opt , result ,plus,mul,div,minus,equal,decimle;
			int n1,n2,n3,n4,n5,n6,n7,n8,n9,n0 ;
			if(e.getSource() == b1)
			{
				opt = b1.getText();
				n1 = Integer.parseInt(opt);
				result = n1+"";
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+result);
				}
			}
			else if(e.getSource() == b2)
			{
				opt = b2.getText();
				n2 = Integer.parseInt(opt);
				result = n2+"";
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+result);
				}
			}
			else if(e.getSource() == b3)
			{
				opt = b3.getText();
				n3 = Integer.parseInt(opt);
				result = n3+"";
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+result);
				}
			}
			else if(e.getSource() == b4)
			{
				opt = b4.getText();
				n4 = Integer.parseInt(opt);
				result = n4+"";
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+result);
				}
			}
			else if(e.getSource() == b5)
			{
				opt = b5.getText();
				n5 = Integer.parseInt(opt);
				result = n5+"";
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+result);
				}
			}
			else if(e.getSource() == b6)
			{
				opt = b6.getText();
				n6 = Integer.parseInt(opt);
				result = n6+"";
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+result);
				}
			}
			else if(e.getSource() == b7)
			{
				opt = b7.getText();
				n7 = Integer.parseInt(opt);
				result = n7+"";
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+result);
				}
			}
			else if(e.getSource() == b8)
			{
				opt = b8.getText();
				n8 = Integer.parseInt(opt);
				result = n8+"";
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+result);
				}
			}
			else if(e.getSource() == b9)
			{
				opt = b9.getText();
				n9 = Integer.parseInt(opt);
				result = n9+"";
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+result);
				}
			}
			else if(e.getSource() == bzero)
			{
				opt = bzero.getText();
				n0 = Integer.parseInt(opt);
				result = n0+"";
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+result);
				}
			}
			else if(e.getSource() == bplus)
			{
				plus = bplus.getText();
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+plus);
				}	
			}
			else if(e.getSource() == bminus)
			{
				minus = bminus.getText();
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+minus);
				}	
			}
			else if(e.getSource() == bmul)
			{
				mul = bmul.getText();
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+mul);
				}	
			}
			else if(e.getSource() == bdiv)
			{
				div = bdiv.getText();
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+div);
				}	
			}
			else if(e.getSource() == bdecimle)
			{
				decimle = bdecimle.getText();
				if(input.getText() != "")
				{
					input.setText(input.getText()+""+decimle);
				}	
			}
			else if(e.getSource() == bclear)
			{
				String str = input.getText();
				int length = str.length();
				String newStr = str.substring(0, length-1);
				input.setText(newStr);
			}
			else if(e.getSource() == clearAll)
			{
				input.setText("");
			}
			else if(e.getSource() == bequal) /* Start of Equal Button. */
			{
				String str = input.getText();
				int l_str = str.length();
				int index = 0;
				String equal_result = "" ;
				for(int i=0 ; i<l_str ; i++)
				{
					if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' )
					{
						index = i ;
						break;
					}
				}
				if(str.charAt(index)=='+')
				{
					int a  = Integer.parseInt(str.substring(0, index));
					int b  = Integer.parseInt(str.substring(index+1, l_str));
					
					int res = a+b ;
					equal_result  = res+"";
					input.setText(equal_result);
				}
				else if(str.charAt(index)=='-')
				{
					int a  = Integer.parseInt(str.substring(0, index));
					int b  = Integer.parseInt(str.substring(index+1, l_str));
					
					int res = a-b ;
					equal_result  = res+"";
					input.setText(equal_result);
				}
				else if(str.charAt(index)=='*')
				{
					int a  = Integer.parseInt(str.substring(0, index));
					int b  = Integer.parseInt(str.substring(index+1, l_str));
					
					int res = a*b ;
					equal_result  = res+"";
					input.setText(equal_result);
				}
				else if(str.charAt(index)=='/')
				{
					int a  = Integer.parseInt(str.substring(0, index));
					int b  = Integer.parseInt(str.substring(index+1, l_str));
					
					if(b==0)
					{
						input.setText("Invalid");
					}
					else
					{
						int res = a/b ;
						equal_result  = res+"";
						input.setText(equal_result);
					}
				}

			} // End of Equal Button Operations.
		}// End of ActionPerformed Method.
	}// End of ActionLintener Class.
} // End of Class Calculator.
