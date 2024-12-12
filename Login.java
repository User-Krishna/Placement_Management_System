import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.ImageIcon.*;
import javax.swing.JPanel.*;
public class Login extends JFrame implements ActionListener
   {
     JLabel Jl;
	 JPanel Jp;
	 JTextField Jt;
	 JPasswordField Jf;
	 JButton Jb;
	 	 Login(String s)
	   {
	     super(s);
		 setLayout(null);
		 Jl=new JLabel(new ImageIcon("Background.jpg"));
		 Jp=new JPanel();
		 
		 
		 Jt=new JTextField(20);
		 Jf=new JPasswordField(20);
		 Jb=new JButton(new ImageIcon("button.jpg"));
		   
		   //add(Jp);
		   //validate();
		   Jl.setBounds(0,0,600,500);
		   Jt.setBounds(350,290,200,40);
		   Jf.setBounds(350,340,200,40);
		   Jb.setBounds(400,400,90,33);
		   Jb.addActionListener(this);
		   add(Jb);
		   
		   add(Jt);
		   add(Jf);
		   add(Jl);
		   
		}
     public void actionPerformed(ActionEvent e)
            {
              try{
                   String Admin=Jt.getText();
				   String Password=Jf.getText();
      			   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                   Connection cn=DriverManager.getConnection("jdbc:odbc:tnp");								  
				   Statement st=cn.createStatement();
				   ResultSet rs=st.executeQuery("select * from Admin where Admin='"+Admin+"' AND Password='"+Password+"'");
				    if(rs.next()){
					               Mmgt mt=new Mmgt("Management");
								   mt.setSize(800,490);
								   mt.setVisible(true);
								   this.setVisible(false);
					}  
			        else{
                          JOptionPane.showMessageDialog(null,"Invalid Id/Password)");
                        }
                 cn.close();
               	}
              catch(Exception er){}
			}  
		public static void main(String[]arr)
		      {
			    Login lg=new Login("Login");
				lg.setSize(620,555);
				lg.setVisible(true);
		     }
    }			 