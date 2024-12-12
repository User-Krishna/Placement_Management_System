import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Company extends JFrame implements ActionListener,ItemListener
   {
	   
	   String Branch,pt,Stream;
	    int flag=0,x=0;
     JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6;
	 JTextField jt,jt1,jt2,jt3,jt4,jt5;
	 JCheckBox jc,jc1,jc2,jc3,jc4,jc5;
	 JButton jb,jb1,jb2,jb3,jb4,jb5;
	   Company(String s)
	      {
		    super (s);
			setLayout(null);
			jl=new JLabel("Company-Name");
			jl1=new JLabel("Package");
			jl2=new JLabel("Aggregate");
			jl3=new JLabel("Date");
			jl4=new JLabel("Time");
			jl5=new JLabel("No. of backs");
			jl6=new JLabel("Branch");
			jb=new JButton("Home");
			jb1=new JButton("Student"); 
			jb2=new JButton("Logout");
			jb3=new JButton("Edit");
			jb4=new JButton("Delete");
			jb5=new JButton("Submit");
			jc=new JCheckBox("IT");
			jc1=new JCheckBox("CSE");
			jc2=new JCheckBox("ECE");
			jc3=new JCheckBox("EE");
			jc4=new JCheckBox("Civil");
			jc5=new JCheckBox("ME");
			jt=new JTextField(20);
			jt1=new JTextField(20);
			jt2=new JTextField(20);
			jt3=new JTextField(20);
			jt4=new JTextField(20);
			jt5=new JTextField(20);
			  add(jl);
			  add(jt);
			  add(jl1);
			  add(jt1);
			  add(jl2);
			  add(jt2);
			  add(jl3);
			  add(jt3);
			  add(jl4);
			  add(jt4);
			  add(jl5);
			  add(jt5);
			  add(jb);
			  add(jb1);
			  add(jb2);
			  add(jb3);
			  add(jb4);
			  add(jb5);
			  add(jl6);
			  add(jc);
			  add(jc1);
			  add(jc2);
			  add(jc3);
			  add(jc4);
			  add(jc5);
			  jl.setBounds(35,80,180,40);           			
			  jl1.setBounds(35,130,180,40);           			
			  jl2.setBounds(35,180,180,40);           			
			  jl3.setBounds(35,230,180,40);           			
			  jl4.setBounds(35,280,180,40);           			
			  jl5.setBounds(35,330,180,40);           			
			  jl6.setBounds(35,380,180,40); 
              jt.setBounds(150,80,330,40);			
			  jt1.setBounds(150,130,330,40);			
			  jt2.setBounds(150,180,330,40);
			  jt3.setBounds(150,230,330,40);			
			  jt4.setBounds(150,280,330,40);			
			  jt5.setBounds(150,330,330,40);			
			  jc.setBounds(150,380,60,30);
			  jc1.setBounds(220,380,60,30);
			  jc2.setBounds(290,380,60,30);
			  jc3.setBounds(360,380,60,30);
			  jc4.setBounds(430,380,60,30);
			  jc5.setBounds(500,380,60,30);
              jb.setBounds(35,10,80,40);	
              jb1.setBounds(145,10,80,40);	
              jb2.setBounds(255,10,80,40);	
              jb3.setBounds(365,10,80,40);	
              jb4.setBounds(470,10,80,40);	
              jb5.setBounds(160,430,150,40);
              jb.addActionListener(this);
              jb1.addActionListener(this);
              jb2.addActionListener(this);	
              jb3.addActionListener(this);				  
              jb4.addActionListener(this);				  
              jb5.addActionListener(this);
              jc.addItemListener(this);	
              jc1.addItemListener(this);			  
              jc2.addItemListener(this);			  
              jc3.addItemListener(this);			  
              jc4.addItemListener(this);			  
              jc5.addItemListener(this);			  			  
		}

	   private void setLayout(java.lang.Object o) {
	   }

	   public void actionPerformed(ActionEvent e)
	  {
	   try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection cn=DriverManager.getConnection("jdbc:odbc:tnp");
		      if(e.getSource()==jb)
			    {
				  Mmgt mg=new Mmgt("Mmgt");
				  mg.setSize(900,700);
				  mg.setVisible(true);
				  this.setVisible(false);
			  }	
              else if(e.getSource()==jb1)
              {
				  Student std=new Student("Student");
				  std.setSize(1900,1100);
				  std.setVisible(true);
				  this.setVisible(false);
			  }	
             else if(e.getSource()==jb2)
             {
				  Login lg=new Login("Lo");
				  lg.setSize(620,555);
				  lg.setVisible(true);
				  this.setVisible(false);
			 }
			 else if(e.getSource()==jb3)
			   {   
		            
				    Statement st=cn.createStatement();			 
				    String Company_Name=jt.getText();
				    ResultSet rs=st.executeQuery("select * from Company where Company_Name='"+Company_Name+"'");
                  if(rs.next())
				    {
					    jt1.setText(rs.getString("Pkg"));
					    jt2.setText(rs.getInt("Aggregate")+"");
					    jt3.setText(rs.getString("Coming_Date"));
					    jt4.setText(rs.getString("Coming_Time"));
					    jt5.setText(rs.getInt("Back")+"");
						   Stream=rs.getString("Branch");
						if(Stream.indexOf("IT")!= -1){							    
						       jc.setSelected(true);
					    }
						if(Stream.indexOf("CSE") != -1){
						       jc1.setSelected(true);
					    }
						
					      flag=1;
				    }
				  else{
					JOptionPane.showMessageDialog(null,"Invalid Company_Name");
				   }
			    }	
		    else if(e.getSource()==jb4)
			  {
				    Statement st=cn.createStatement();			 
				    String Company_Name=jt.getText();
				    ResultSet rs=st.executeQuery("select * from Company where Company_Name='"+Company_Name+"'");
                  if(rs.next())
				    {
					    jt1.setText(rs.getString("Pkg"));
					    jt2.setText(rs.getInt("Aggregate")+"");
					    jt3.setText(rs.getString("Coming_Date"));
					    jt4.setText(rs.getString("Coming_Time"));
					    jt5.setText(rs.getInt("Back")+"");
					    	  flag=2;
				    }
				  else{
					JOptionPane.showMessageDialog(null,"Invalid Company_Name");
				   }  
			  }	
            else if(e.getSource()==jb5)
			     {	
		       
		                String Company_Name=jt.getText();
						String Pkg=jt1.getText();
                        int Aggregate=Integer.parseInt(jt2.getText());	
                        String Coming_Date=jt3.getText();
                        String Coming_Time=jt4.getText();	
                        int Back=Integer.parseInt(jt5.getText());
                        Statement st=cn.createStatement();		
                   if(flag==1)
			              {
				              st.execute("update Company set Pkg='"+Pkg+"',Aggregate='"+Aggregate+"',Coming_Date='"+Coming_Date+"',Coming_Time='"+Coming_Time+"',Back='"+Back+"',Branch='"+Branch+"' Where Company_Name='"+Company_Name+"'");
		                       JOptionPane.showMessageDialog(null,"Record updated");
						         this.setVisible(false);
					             Company cm=new Company("Company Info");
					             cm.setSize(1900,1100);
					             cm.setVisible(true);
			             }	
		          else if(flag==2)
			          {
					         st.execute("delete from Company where Company_Name='"+Company_Name+"'");
					         JOptionPane.showMessageDialog(null,"Deleted Successfully");
					         this.setVisible(false);
					         Company cm=new Company("Company Info");
					         cm.setSize(1900,1100);
					         cm.setVisible(true);
				    }
			 else{				
					    
                    								  
					      PreparedStatement ps=cn.prepareStatement("insert into Company values(?,?,?,?,?,?,?)");
							ps.setString(1,Company_Name);
						    ps.setString(2,Pkg);
							ps.setInt(3,Aggregate);
							ps.setString(4,Coming_Date);
						    ps.setString(5,Coming_Time);
							ps.setInt(6,Back);						 
							ps.setString(7,Branch);	
                               if(ps.executeUpdate()>0)
                                        {
											
                                          JOptionPane.showMessageDialog(null,"Record inserted");
										  this.setVisible(false);
										  Company cm=new Company("Company Info");
					                      cm.setSize(1900,1100);
					                      cm.setVisible(true);	 
                                        }
			 					 
								 else{
                                      JOptionPane.showMessageDialog(null,"try again");
                                     }
			         }
                         cn.close();
			 }				
                							
	  }
	  catch(ClassNotFoundException er){
			JOptionPane.showMessageDialog(null,er.getMessage());
	    	}
		   catch(SQLException er){
			JOptionPane.showMessageDialog(null,er.getMessage());
		   }							 
		}
	public void itemStateChanged(ItemEvent e)
    {
		if(jc.isSelected())
		{
			Branch="IT";
			pt=",";
		}
		if(jc1.isSelected())
		{
		   Branch=Branch+pt+"CSE";
             pt=",";		   
		}
		if(jc2.isSelected())
		{
			Branch=Branch+pt+"ECE";
              pt=",";			
		}
		if(jc3.isSelected())
		{
			Branch=Branch+pt+"EE";	
			  pt=",";
		}
		if(jc4.isSelected())
		{
			Branch=Branch+pt+"Civil";
                pt=",";			
		}
		if(jc5.isSelected())
		{
			Branch=Branch+pt+"ME";
                pt=",";			
		}
		
	} 	
    
  }		   