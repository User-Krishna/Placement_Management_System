import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon.*;
public class Mmgt extends JFrame implements ActionListener
          {
			  JLabel Jl;
            JButton Jb,Jb1,Jb2;
			Mmgt(String s)
			 {
			   super(s);
			   setLayout(null);
			   Jl=new JLabel(new ImageIcon("CBackground1.jpg"));
			   Jb=new JButton(new ImageIcon("SButton.jpg"));
			   Jb1=new JButton(new ImageIcon("CButton.jpg"));
			   Jb2=new JButton(new ImageIcon("SrButton.jpg"));
			    Jl.setBounds(0,0,800,500);
				Jb.setBounds(50,60,100,50);
				Jb1.setBounds(50,160,100,50);
				Jb2.setBounds(50,260,100,50);
			   
			   Jb.addActionListener(this);
			   Jb1.addActionListener(this);
			   Jb2.addActionListener(this);
			   add(Jb);
			   add(Jb1);
			   add(Jb2);
			   add(Jl);
			 }
			public void actionPerformed(ActionEvent e)
			{
			  if(e.getSource()==Jb)
			  {	
                  Student st=new Student("Student");
                  st.setSize(1900,1100);
                  st.setVisible(true);
     			  this.setVisible(false);
			  }
			  else if(e.getSource()==Jb1)
			  {
				        Company cm=new Company("Company Information");
                        cm.setSize(900,700);
                        cm.setVisible(true);
						this.setVisible(false);
			  }
			  else if(e.getSource()==Jb2)
			  {
				  Search sr=new Search("Search");
                  sr.setSize(1200,600);
                  sr.setVisible(true);
				  this.setVisible(false);
			  }
            }
      		public static void main(String[]arr)
		      {
			    Mmgt mg=new Mmgt("Mmgt");
				mg.setSize(800,490);
				mg.setVisible(true);
				
		     }			
			 
	}