import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.ImageIcon.*;
public class Student extends JFrame implements ActionListener,ItemListener
   {
	   String Gender,Back,Branch;
	   String t[]={"IT","CSE","ME","CE","ECE","EE","EIC","other"};
	   int flag=0;
     JLabel Jl,Jl1,Jl2,Jl3,Jl4,Jl5,Jl6,Jl7,Jl8,Jl9,Jl10,Jl11,Jl12,Jl13,Jl14,Jl15,Jl16;
	 JTextField Jt,Jt1,Jt2,Jt3,Jt4,Jt5,Jt6,Jt7,Jt8,Jt9,Jt11,Jt12,Jt13,Jt14;
	 JButton Jb,Jb1,Jb2,Jb3,Jb4,Jb5,Jb6;
	 JRadioButton Jr,Jr1,Jr2,Jr3;
	 ButtonGroup Jbg,Jbg1;
	 JComboBox Jc=null;
	 	 Student(String s)
	      {
	        super(s);
		    setLayout(null);
		    Jl=new JLabel(new ImageIcon("SBackground.jpg"));
		    Jl1=new JLabel("First-Name");
		    Jl2=new JLabel("Last-Name");
			Jl14=new JLabel("Gender");
            Jl3=new JLabel("DOB");			
			Jl4=new JLabel("Mobile no");
			Jl5=new JLabel("Email-Id");
		    Jl6=new JLabel("Father's name");
		    Jl7=new JLabel("Mother's name");
		    Jl8=new JLabel("10th%");
			Jl9=new JLabel("12th%");
		    Jl10=new JLabel("Branch");
			Jl11=new JLabel("College Name");
		    Jl12=new JLabel("Passing year");
		    Jl13=new JLabel("Aggregate");
			Jl15=new JLabel("No. of Back");
			Jl15.setVisible(false);
			Jl16=new JLabel("Backlog");
		    Jt=new JTextField(20);
		    Jt1=new JTextField(20);
		    Jt2=new JTextField(20);
		    Jt3=new JTextField(20);
		    Jt4=new JTextField(20);
		    Jt5=new JTextField(20);
		    Jt6=new JTextField(20);
		    Jt7=new JTextField(20);
		    Jt8=new JTextField(20);
			Jt9=new JTextField(20);
			Jc=new JComboBox(t);
			Jt11=new JTextField(60);
			Jt12=new JTextField(20);
			Jt13=new JTextField(20);
			Jt14=new JTextField(20);
			Jt14.setVisible(false);
			Jb=new JButton("Home");
			Jb1=new JButton("Company");
			Jb2=new JButton(new ImageIcon("SrButton.jpg"));
			Jb3=new JButton("Logout");
			Jb4=new JButton("Edit");
			Jb5=new JButton("Delete");
			Jb6=new JButton("Submit");
			  
			Jr=new JRadioButton("Male");
			Jr1=new JRadioButton("Female");
			Jbg=new ButtonGroup();
			Jbg1=new ButtonGroup();
			Jr2=new JRadioButton("Yes");
			Jr3=new JRadioButton("No");
		       add(Jb);
		       add(Jb1);
		       add(Jb2);
		       add(Jb3);
		       
		       add(Jt);
		       add(Jb4);
		       add(Jl1);
		       add(Jt1);
		       add(Jb5);
		       add(Jl2);
		       add(Jt2);
			   add(Jl14);
			   Jbg.add(Jr);
			   Jbg.add(Jr1);
			   add(Jr);
			   add(Jr1);
               add(Jr2);
               add(Jr3);			   
		       add(Jl3);
		       add(Jt3);
		       add(Jl4);
		       add(Jt4);
		       add(Jl5);
		       add(Jt5);
		       add(Jl6);
		       add(Jt6);
		       add(Jl7);
		       add(Jt7);
		       add(Jl8);
		       add(Jt8);
		       add(Jl9);
		       add(Jt9);			   
		       add(Jl10);
		       add(Jc);
		       add(Jl11);
		       add(Jt11);
		       add(Jl12);
		       add(Jt12);
		       add(Jl13);
		       add(Jt13);
               add(Jb6);
               Jbg1.add(Jr2);
               Jbg1.add(Jr3);
			   add(Jl15);
			   add(Jt14);
			   add(Jl16);
			   add(Jl);
			Jb.setBounds(35,10,80,40);		   
			Jb1.setBounds(160,10,80,40);		   
			Jb2.setBounds(290,10,80,40);		   
			Jb3.setBounds(420,10,80,40);		   
			Jb4.setBounds(550,80,80,40);		   
			Jb5.setBounds(550,130,80,40);		
			Jl.setBounds(0,0,1900,1100);           			
			Jl1.setBounds(35,130,180,40);           			
			Jl2.setBounds(35,180,180,40);           			
			Jl14.setBounds(35,230,180,40);           			
			Jl3.setBounds(35,280,180,40);           			
			Jl4.setBounds(35,330,180,40);           			
			Jl5.setBounds(35,380,180,40);           			
			Jl6.setBounds(35,430,180,40);           			
			Jl7.setBounds(35,480,180,40);           			
			Jl8.setBounds(35,530,180,40);           			
			Jl9.setBounds(35,580,180,40);           			
			Jl10.setBounds(35,630,180,40);           			
			Jl11.setBounds(35,680,180,40);           			
			Jl12.setBounds(35,730,180,40);           			
			Jl13.setBounds(35,780,180,40);
            Jl16.setBounds(35,830,180,40);			
            Jl15.setBounds(35,880,180,40);
			
			Jt.setBounds(150,80,330,40);			
			Jt1.setBounds(150,130,330,40);			
			Jt2.setBounds(150,180,330,40);
            Jr.setBounds(150,230,60,40);
			Jr1.setBounds(220,230,80,40);
			Jt3.setBounds(150,280,330,40);			
			Jt4.setBounds(150,330,330,40);			
			Jt5.setBounds(150,380,330,40);			
			Jt6.setBounds(150,430,330,40);			
			Jt7.setBounds(150,480,330,40);			
			Jt8.setBounds(150,530,330,40);			
			Jt9.setBounds(150,580,330,40);			
			Jc.setBounds(150,630,330,40);			
			Jt11.setBounds(150,680,330,40);			
			Jt12.setBounds(150,730,330,40);			
			Jt13.setBounds(150,780,330,40);
			Jr2.setBounds(150,830,60,40);
            Jr3.setBounds(220,830,80,40);			
			Jt14.setBounds(150,880,330,40);
            Jb6.setBounds(180,940,100,30);
			Jb.addActionListener(this);
			Jb1.addActionListener(this);
			Jb2.addActionListener(this);
            Jb3.addActionListener(this);
			Jb4.addActionListener(this);
			Jb5.addActionListener(this);
            Jb6.addActionListener(this);
            Jr.addItemListener(this);
            Jr1.addItemListener(this);
            Jr2.addItemListener(this);
            Jr3.addItemListener(this);	
            Jc.addItemListener(this); 
		}
    public void actionPerformed(ActionEvent e)
	{
	
	 try{
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             Connection cn=DriverManager.getConnection("jdbc:odbc:tnp");
			 
             
		  if(e.getSource()==Jb)
			 {
				Mmgt mg=new Mmgt("Mmgt");
				mg.setSize(1900,1100);
				mg.setVisible(true);
				this.setVisible(false);
			 }
         else if(e.getSource()==Jb1)
		 {
			   Company cm=new Company("Company Information");
               cm.setSize(1900,1100);
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
			 else if(e.getSource()==Jb3)
			 {				 
                Login lg=new Login("Login");
                lg.setSize(620,555);
                lg.setVisible(true);
				this.setVisible(false);
			 }
			else if(e.getSource()==Jb4)
			 {
				 Statement st=cn.createStatement();			 
				 int Student_Id=Integer.parseInt(Jt.getText());
				ResultSet rs=st.executeQuery("select * from Studentrecord where Student_Id="+Student_Id);
                if(rs.next())
				{
					Jt1.setText(rs.getString("First_Name"));
					Jt2.setText(rs.getString("Last_Name"));
					if(rs.getString("Gender").equalsIgnoreCase("Male")){
						Jr.setSelected(true);
					}
					else{
						Jr1.setSelected(true);
					}						
					Jt3.setText(rs.getString("DOB"));
					Jt4.setText(rs.getString("Mobile_No"));
					Jt5.setText(rs.getString("Email_Id"));
					Jt6.setText(rs.getString("Father_Name"));
					Jt7.setText(rs.getString("Mother_Name"));
					Jt8.setText(rs.getInt("Tenth_Percentage")+"");
					Jt9.setText(rs.getInt("Twelve_Percentage")+"");					
					Jt11.setText(rs.getString("College_Name"));
					Jt12.setText(rs.getInt("Passing_Year")+"");
					Jt13.setText(rs.getInt("Aggregate")+"");
					if(rs.getString("Back").equalsIgnoreCase("Yes")){
						Jr2.setSelected(true);
					}
					else{
						Jr3.setSelected(true);
					}
					Jt14.setText(rs.getInt("Total_Back")+"");
					flag=1;	
                }
				else{
					JOptionPane.showMessageDialog(null,"Invalid Student_Id");
				}			
			 }	 
			 else if(e.getSource()==Jb5)
			 {
				 Statement st=cn.createStatement();			 
				 int Student_Id=Integer.parseInt(Jt.getText());
				ResultSet rs=st.executeQuery("select * from Studentrecord where Student_Id="+Student_Id);
                if(rs.next())
				{
					Jt1.setText(rs.getString("First_Name"));
					Jt2.setText(rs.getString("Last_Name"));
					if(rs.getString("Gender").equalsIgnoreCase("Male")){
						Jr.setSelected(true);
					}
					else{
						Jr1.setSelected(true);
					}
						
					Jt3.setText(rs.getString("DOB"));
					Jt4.setText(rs.getString("Mobile_No"));
					Jt5.setText(rs.getString("Email_Id"));
					Jt6.setText(rs.getString("Father_Name"));
					Jt7.setText(rs.getString("Mother_Name"));
					Jt8.setText(rs.getInt("Tenth_Percentage")+"");
					Jt9.setText(rs.getInt("Twelve_Percentage")+"");
					Jt11.setText(rs.getString("College_Name"));
					Jt12.setText(rs.getInt("Passing_Year")+"");
					Jt13.setText(rs.getInt("Aggregate")+"");
					if(rs.getString("Back").equalsIgnoreCase("Yes")){
						Jr2.setSelected(true);
					}
					else{
						Jr3.setSelected(true);
					}
					Jt14.setText(rs.getInt("Total_Back")+"");
					flag=2;	
                }
				else{
					JOptionPane.showMessageDialog(null,"Invalid Student_Id");
				}			
			 }	 
             else if(e.getSource()==Jb6)
			 {	
		       
		                int Student_Id=Integer.parseInt(Jt.getText());
						String First_Name=Jt1.getText();
						String Last_Name=Jt2.getText();
                        String DOB=Jt3.getText();
					    String Mobile_No=Jt4.getText();
						String Email_Id=Jt5.getText();
						String Father_Name=Jt6.getText();
						String Mother_Name=Jt7.getText();
						int Tenth_Percentage=Integer.parseInt(Jt8.getText());
						int Twelve_Percentage=Integer.parseInt(Jt9.getText());
						String College_Name=Jt11.getText();
						int Passing_Year=Integer.parseInt(Jt12.getText());
						int Aggregate=Integer.parseInt(Jt13.getText());
						int Total_Back=Integer.parseInt(Jt14.getText());
						
					Statement st=cn.createStatement();	
					      
					  
              if(flag==1)
			  {
				   st.execute("update Studentrecord set First_Name='"+First_Name+"',Last_Name='"+Last_Name+"',Gender='"+Gender+"',DOB='"+DOB+"',Mobile_No='"+Mobile_No+"',Email_Id='"+Email_Id+"',Father_Name='"+Father_Name+"',Mother_Name='"+Mother_Name+"',Tenth_Percentage='"+Tenth_Percentage+"',Twelve_Percentage='"+Twelve_Percentage+"',Branch='"+Branch+"',College_Name='"+College_Name+"',Passing_Year='"+Passing_Year+"',Aggregate='"+Aggregate+"',Back='"+Back+"',Total_Back='"+Total_Back+"' where Student_Id="+Student_Id);
		              JOptionPane.showMessageDialog(null,"Record updated");
						  this.setVisible(false);
					      Student std=new Student("Student");
					      std.setSize(1900,1100);
					      std.setVisible(true);
			  }	
		    else if(flag==2)
			 {
					st.execute("delete from Studentrecord where Student_Id="+Student_Id);
					JOptionPane.showMessageDialog(null,"Deleted Successfully");
					this.setVisible(false);
					Student std=new Student("Student");
					std.setSize(1900,1100);
					std.setVisible(true);
				}
			 else{				
					    
                    								  
					      PreparedStatement ps=cn.prepareStatement("insert into Studentrecord values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
							ps.setInt(1,Student_Id);
						    ps.setString(2,First_Name);
							ps.setString(3,Last_Name);
							ps.setString(4,Gender);
						    ps.setString(5,DOB);
							ps.setString(6,Mobile_No);
							ps.setString(7,Email_Id);
							ps.setString(8,Father_Name);
							ps.setString(9,Mother_Name);
							ps.setInt(10,Tenth_Percentage);
							ps.setInt(11,Twelve_Percentage);
							ps.setString(12,Branch);
							ps.setString(13,College_Name);
							ps.setInt(14,Passing_Year);
							ps.setInt(15,Aggregate);
							ps.setString(16,Back);
							ps.setInt(17,Total_Back);
							
							     if(ps.executeUpdate()>0)
                                        {
											
                                          JOptionPane.showMessageDialog(null,"Record inserted");
										  this.setVisible(false);
										  Student std=new Student("Student");
				                          std.setSize(1900,1100);
				                          std.setVisible(true);
											 
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
			   if(Jr.isSelected())
                               {
                                 Gender="Male";
                               }
                             else if(Jr1.isSelected())
				                {
                                  Gender="Female";
                                }
								
			   if(Jr2.isSelected())
			   {
				   
				   Back="Yes";
				 Jl15.setVisible(true);
				 Jt14.setVisible(true);
			   }
               else if(Jr3.isSelected())
			   {
				   Back="No";
				 Jl15.setVisible(false);
				 Jt14.setVisible(false);
				 Jt14.setText("0");
               }
    	            Branch=Jc.getSelectedItem().toString();
                 				 
           }
		   public static void main(String[]arr)
		      {
			     Student st=new Student("Student");
                  st.setSize(1900,1100);
                  st.setVisible(true);
				
		     }			
		
    }			 	