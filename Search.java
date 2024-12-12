import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Search extends JFrame implements ActionListener,ItemListener
   {
	   String s;
      JLabel jl;
	  JButton jb,jb1,jb2,jb3,jb4;
      JComboBox jc=null;
	  JTable jt=null;
	  DefaultTableModel dtm=null;
	   Search(String s)
	    {
		 super(s);
		 setLayout(null);
		 jl=new JLabel("Company");
		 jc=new JComboBox();
		 jb=new JButton("Home");
		 jb1=new JButton("Company");
		 jb2=new JButton("Student");
		 jb3=new JButton("Logout");
		 jb4=new JButton("Submit");
		 jt=new JTable();
		 dtm=new DefaultTableModel(0,0);
		 String Column[]=new String[] {"First_Name","Last_Name","Mobile_No","Email_Id","Branch"};
		 dtm.setColumnIdentifiers(Column);
		 jt.setModel(dtm);
		 JScrollPane js=new JScrollPane(jt);
		 add(js);
		 js.setBounds(160,180,500,500);
		   add(jl);
    try{
		   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           Connection cn=DriverManager.getConnection("jdbc:odbc:tnp");
		   Statement st=cn.createStatement();
           ResultSet rs=st.executeQuery("select * from Company");
           while(rs.next())
		   {
			   jc.addItem(rs.getString("Company_Name"));
		   }	
	  }	
catch(ClassNotFoundException er){
			JOptionPane.showMessageDialog(null,er.getMessage());
	    	}
     catch(SQLException er){
			JOptionPane.showMessageDialog(null,er.getMessage());
		   }	  
		   add(jc);
		   add(jb);
		   add(jb1);
		   add(jb2);
		   add(jb3);
		   add(jb4);
		   jb.setBounds(10,10,80,35);
		   jb1.setBounds(100,10,80,35);
		   jb2.setBounds(190,10,80,35);
		   jb3.setBounds(280,10,80,35);
		   jl.setBounds(40,80,80,40);
		   jc.setBounds(130,80,140,40);
		   jb4.setBounds(140,130,80,35);
		    jb.addActionListener(this);
			jb1.addActionListener(this);
			jb2.addActionListener(this);
            jb3.addActionListener(this);
			jb4.addActionListener(this);
			jc.addItemListener(this);
			
	   }
	   public void itemStateChanged(ItemEvent e){
    	            s=jc.getSelectedItem().toString();
	   }
	 public void actionPerformed(ActionEvent e)
	 {
     try{
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection cn=DriverManager.getConnection("jdbc:odbc:tnp");
		 Statement st=cn.createStatement();
		 Statement st1=cn.createStatement();
		   if(e.getSource()==jb)
			 {
				Mmgt mg=new Mmgt("Mmgt");
				mg.setSize(1900,1100);
				mg.setVisible(true);
				this.setVisible(false);
			 }
         else if(e.getSource()==jb1)
		 {
			   Company cm=new Company("Company Information");
               cm.setSize(1900,1100);
               cm.setVisible(true);
			   this.setVisible(false);
		 }	
        else if(e.getSource()==jb2)
		{
			    Student std=new Student("Student");
				std.setSize(1900,1100);
				std.setVisible(true);
				this.setVisible(false);
		 }			
	     else if(e.getSource()==jb3)
	      {				 
                Login lg=new Login("Login");
                lg.setSize(620,555);
                lg.setVisible(true);
				this.setVisible(false);
	      }
		  
		  else if(e.getSource()==jb4)
		  { 
	         dtm.setRowCount(0);
	         ResultSet rs=st.executeQuery("select * from Company where Company_Name='"+s+"'"); 
		     if(rs.next())
		     {	
		 
			    int Aggrigate=rs.getInt("Aggregate");
			    int Back=rs.getInt("Back");
			    String Branch=rs.getString("Branch");
			    String Br[]=Branch.split(",");			   
			   for(int i=0;i<Br.length;i++)
			   {
      	   
                       ResultSet rs1=st1.executeQuery("select * from Studentrecord where Aggregate>="+Aggrigate+"AND Total_Back<="+Back+" AND Branch LIKE '"+Br[i]+"'");
		                while(rs1.next())
		                { 
		                  dtm.addRow(new Object[]{rs1.getString("First_Name"),rs1.getString("Last_Name"),rs1.getString("Mobile_No"),rs1.getString("Email_Id"),rs1.getString("Branch")});		          
			            }			  
		       }
		   } 
	    }
	   cn.close(); 
	 }
	 
	 catch(ClassNotFoundException er){
			JOptionPane.showMessageDialog(null,er.getMessage());
	    	}
     catch(SQLException er){
			JOptionPane.showMessageDialog(null,er.getMessage());
		   }		 			  
	   }

	       
}		