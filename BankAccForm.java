import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class BankAccForm
{
	public static void main(String[] args)
	{
		String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String month[]={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		String year[]={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005"};
		String ac[]={"Savings","Current","SB","Fixed Deposit"};
		JFrame f=new JFrame("Account creation Form");		//Frame name
		f.setBackground(Color.blue);
		JLabel label=new JLabel("WELCOME TO SBJ BANK");
		label.setFont(new Font("WELCOME TO SBJ BANK", Font.BOLD, 18));		//heading
		label.setBounds(300,5,250,50);
		JLabel name=new JLabel("Name:");	//name
		name.setBounds(20,50,100,30);
		JTextField t1=new JTextField();
		t1.setBounds(130,53,150,25);
		JLabel aadhar=new JLabel("Aadhar Card No. :");	//aadhar no
		aadhar.setBounds(20,95,100,30);
		JTextField t2=new JTextField();
		t2.setBounds(130,98,150,25);
		JLabel dob=new JLabel("Date of Birth:");	//dob
		dob.setBounds(20,140,100,30);
		JComboBox dt=new JComboBox(date);	//date
		dt.setBounds(130,142,40,25);
		JComboBox mt=new JComboBox(month);	//month
		mt.setBounds(175,142,68,25);
		JComboBox yrr=new JComboBox(year);	//year
		yrr.setBounds(245,142,65,25);
		JLabel reg=new JLabel("Religion:");	//Religion
		reg.setBounds(20,185,100,30);
		JTextField t3=new JTextField();
		t3.setBounds(130,188,150,25);
		JLabel ms=new JLabel("Marital status:");	//marital status
		ms.setBounds(20,230,100,30);
		JRadioButton r1=new JRadioButton("Married");
		r1.setBounds(130,233,70,25);
		JRadioButton r2=new JRadioButton("Unmarried");
		r2.setBounds(210,233,90,25);
		JRadioButton r3=new JRadioButton("Others");
		r3.setBounds(310,233,75,25);
		JLabel caste=new JLabel("Caste(optional):");
        caste.setForeground(Color.orange);		//Caste
		caste.setBounds(20,275,100,30);
		JTextField t4=new JTextField();
		t4.setBounds(130,278,150,25);
		JLabel fname=new JLabel("Father name:");	//father name
		fname.setBounds(20,320,100,30);
		JTextField t5=new JTextField();
		t5.setBounds(130,323,150,25);
		JLabel mname=new JLabel("Mother name:");	//mother name
		mname.setBounds(20,365,100,30);
		JTextField t6=new JTextField();
		t6.setBounds(130,368,150,25);
		JLabel nation=new JLabel("Nationality:");	//Nationality
		nation.setBounds(20,410,100,30);
		JTextField t7=new JTextField();
		t7.setBounds(130,413,150,25);
		JLabel address=new JLabel("Address:");	//address
		address.setBounds(20,450,100,30);
		JTextArea a1=new JTextArea();
		a1.setBounds(130,458,180,100);
		JLabel mail=new JLabel("E-Mail Id:");	//mail id
		mail.setBounds(20,575,100,30);
		JTextField t8=new JTextField();
		t8.setBounds(130,578,150,25);
		JLabel phone=new JLabel("Phone no.:");	//Phone number
		phone.setBounds(20,625,100,30);
		JTextField t9=new JTextField();
		t9.setBounds(130,625,150,25);
		JCheckBox rule=new JCheckBox("I hereby agree to abide by the terms and conditions of the bank and declare that the information submitted by me are correct,true and valid.");
		rule.setForeground(Color.red);
		rule.setBounds(30,655,850,45);
		JLabel qual=new JLabel("Qualification:");	//qualification
		qual.setBounds(370,50,100,30);
		JTextField t10=new JTextField();
		t10.setBounds(500,53,200,25);
		JLabel gender=new JLabel("Gender:");	//gender
		gender.setBounds(370,95,100,30);
		JRadioButton r4=new JRadioButton("Male");
		r4.setBounds(500,98,80,25);
		JRadioButton r5=new JRadioButton("Female");
		r5.setBounds(600,98,80,25);
		JRadioButton r6=new JRadioButton("Others");
		r6.setBounds(700,98,80,25);
		JLabel pancard=new JLabel("Pan Card No. :");	//pan card no
		pancard.setBounds(370,140,100,30);
		JTextField t11=new JTextField();
		t11.setBounds(500,143,150,25);
		JLabel income=new JLabel("Income:");	//income
		income.setBounds(370,185,100,30);
		JTextField t12=new JTextField();
		t12.setBounds(500,188,150,25);
		JLabel atype=new JLabel("Account type:");	//account type
		atype.setBounds(400,230,100,30);
		JComboBox<String> acc=new JComboBox<>(ac);	
		acc.setBounds(525,233,150,35);
		JLabel comp=new JLabel("(In case of corporate account)");
        comp.setForeground(Color.red);		//heading
		comp.setBounds(390,270,250,30);
		JLabel cid=new JLabel("Company ID:");	//company id
		cid.setBounds(370,310,100,30);
		JTextField t13=new JTextField();
		t13.setBounds(500,313,150,25);
		JLabel cadd=new JLabel("Company Address");	//company address
		cadd.setBounds(370,355,200,30);
		JTextArea a2=new JTextArea();
		a2.setBounds(500,380,180,100);
		JLabel cmail=new JLabel("Company E-Mail Id");	//company mail id
		cmail.setBounds(370,480,200,30);
		JTextField t14=new JTextField();
		t14.setBounds(500,510,200,25);
		JCheckBox cheque=new JCheckBox("Cheque book needed");	//cheque
		cheque.setBounds(425,550,150,30);
		JLabel doc=new JLabel("Provide a Passport size photo and an Aadhar card copy to the Bank officials for verification.");	//doc verification
		doc.setBounds(165,730,600,30);
		JButton check=new JButton("CHECK");
		check.setBounds(450,600,200,40);
		JButton submit=new JButton("Submit");
		submit.setBounds(380,700,100,25);
		f.add(label);
		f.add(name);f.add(t1);
		f.add(aadhar);f.add(t2);
		f.add(dob);f.add(dt);f.add(mt);f.add(yrr);
		f.add(reg);f.add(t3);
		f.add(ms);f.add(r1);f.add(r2);f.add(r3);
		f.add(caste);f.add(t4);
		f.add(fname);f.add(t5);
		f.add(mname);f.add(t6);
		f.add(nation);f.add(t7);
		f.add(address);f.add(a1);
		f.add(mail);f.add(t8);
		f.add(phone);f.add(t9);
		f.add(rule);
		f.add(qual);f.add(t10);
		f.add(gender);f.add(r4);f.add(r5);f.add(r6);
		f.add(pancard);f.add(t11);
		f.add(income);f.add(t12);
		f.add(atype);f.add(acc);
		f.add(comp);
		f.add(cid);f.add(t13);
		f.add(cadd);f.add(a2);
		f.add(cmail);f.add(t14);
		f.add(cheque);
		f.add(doc);
		f.add(submit);
		f.add(check);
		check.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JLabel rule1= new JLabel("1. Check whether you enetered all the details correctly");
				JLabel rule2= new JLabel("2. Aadhar card-12 digits & ph.no-10 digits");
				JLabel rule3= new JLabel("3. Check whether all your details match your id proof");
				JFrame f1=new JFrame(); 
				rule1.setBounds(140,20,350,30);
				rule2.setBounds(160,40,400,30);
				rule3.setBounds(180,60,450,30);
				JButton back=new JButton("Click Here"); 
				back.setBounds(100,100,500,30);
				f1.add(rule1);
				f1.add(rule2);
				f1.add(rule3);
				f1.add(back);
				back.addActionListener(new ActionListener(){ 
					public void actionPerformed(ActionEvent e){
						JFrame nf=new JFrame();
						JLabel l1=new JLabel("Name:");	//name
						l1.setBounds(20,50,100,30);
						JLabel l2=new JLabel();
						l2.setText(t1.getText());
						l2.setBounds(130,53,150,25);
						JLabel l3=new JLabel("Aadhar Card No. :");	//aadhar no
						l3.setBounds(20,95,100,30);
						JLabel l4=new JLabel();
						l4.setText(t2.getText());
						l4.setBounds(130,98,150,25);
						JLabel l5=new JLabel("Date of Birth:");	//dob
						l5.setBounds(20,140,100,30);
						JLabel l6=new JLabel();
						l6.setText(dt.getItemAt(dt.getSelectedIndex())+"-"+mt.getItemAt(mt.getSelectedIndex())+"-"+yrr.getItemAt(yrr.getSelectedIndex()));
						l6.setBounds(130,142,150,25);
						JLabel l7=new JLabel("Religion:");	//Religion
						l7.setBounds(20,185,100,30);
						JLabel l8=new JLabel();
						l8.setText(t3.getText());
						l8.setBounds(130,188,150,25);
						JLabel l9=new JLabel("Marital status:");	//marital status
						l9.setBounds(20,230,100,30);
						JLabel l10=new JLabel();
						if(r1.isSelected())
							l10.setText("Married");
						if(r2.isSelected())
							l10.setText("Unmarried");
						if(r3.isSelected())
							l10.setText("Others");
						l10.setBounds(130,233,90,25);
						JLabel l11=new JLabel("Caste(optional):");	//Caste
						l11.setBounds(20,275,100,30);
						JLabel l12=new JLabel();
						l12.setText(t4.getText());
						l12.setBounds(130,278,150,25);
						JLabel l13=new JLabel("Father name:");	//father name
						l13.setBounds(20,320,100,30);
						JLabel l14=new JLabel();
						l14.setText(t5.getText());
						l14.setBounds(130,323,150,25);
						JLabel l15=new JLabel("Mother name:");	//mother name
						l15.setBounds(20,365,100,30);
						JLabel l16=new JLabel();
						l16.setText(t6.getText());
						l16.setBounds(130,368,150,25);
						JLabel l17=new JLabel("Nationality:");	//Nationality
						l17.setBounds(20,410,100,30);
						JLabel l18=new JLabel();
						l18.setText(t7.getText());
						l18.setBounds(130,413,150,25);
						JLabel l19=new JLabel("Address:");	//address
						l19.setBounds(20,450,100,30);
						JLabel l20=new JLabel();
						l20.setText(a1.getText());
						l20.setBounds(130,458,180,100);
						JLabel l21=new JLabel("E-Mail Id:");	//mail id
						l21.setBounds(20,575,100,30);
						JLabel l22=new JLabel();
						l22.setText(t8.getText());
						l22.setBounds(130,578,150,25);
						JLabel l23=new JLabel("Phone no.:");	//Phone number
						l23.setBounds(20,625,100,30);
						JLabel l24=new JLabel();
						l24.setText(t9.getText());
						l24.setBounds(130,625,150,25);
						JLabel l25=new JLabel("Qualification:");	//qualification
						l25.setBounds(370,50,100,30);
						JLabel l26=new JLabel();
						l26.setText(t10.getText());
						l26.setBounds(500,53,200,25);
						JLabel l27=new JLabel("Gender:");	//gender
						l27.setBounds(370,95,100,30);
						JLabel l28=new JLabel();
						if(r4.isSelected())
							l28.setText("Male");
						if(r5.isSelected())
							l28.setText("Female");
						if(r6.isSelected())
							l28.setText("Others");
						l28.setBounds(500,98,80,25);
						JLabel l29=new JLabel("Pan Card No. :");	//pan card no
						l29.setBounds(370,140,100,30);
						JLabel l30=new JLabel();
						l30.setText(t11.getText());
						l30.setBounds(500,143,150,25);
						JLabel l31=new JLabel("Income:");	//income
						l31.setBounds(370,185,100,30);
						JLabel l32=new JLabel();
						l32.setText(t12.getText());
						l32.setBounds(500,188,150,25);
						JLabel l33=new JLabel("Account type:");	//account type
						l33.setBounds(370,230,100,30);
						JLabel l34=new JLabel();
						l34.setText(""+acc.getItemAt(acc.getSelectedIndex()));			
						l34.setBounds(500,233,150,35);
						JLabel l35=new JLabel("(In case of corporate account)");	//heading
						l35.setBounds(390,270,250,30);
						JLabel l36=new JLabel("Company ID:");	//company id
						l36.setBounds(370,310,100,30);
						JLabel l37=new JLabel();
						l37.setText(t13.getText());
						l37.setBounds(500,313,150,25);
						JLabel l38=new JLabel("Company Address");	//company address
						l38.setBounds(370,355,200,30);
						JLabel l39=new JLabel();
						l39.setText(a2.getText());
						l39.setBounds(500,380,180,100);
						JLabel l40=new JLabel("Company E-Mail Id");	//company mail id
						l40.setBounds(370,480,200,30);
						JLabel l41=new JLabel();
						l41.setText(t14.getText());
						l41.setBounds(500,510,200,25);
						JLabel l42=new JLabel("Cheque book needed:");	//cheque
						l42.setBounds(370,550,150,30);
						JLabel l43=new JLabel();
						if(cheque.isSelected())
							l43.setText("YES");
						else
							l43.setText("NO");
						nf.add(l1);nf.add(l2);
						nf.add(l3);nf.add(l4);
						nf.add(l5);nf.add(l6);
						nf.add(l7);nf.add(l8);
						nf.add(l9);nf.add(l10);
						nf.add(l11);nf.add(l12);
						nf.add(l13);nf.add(l14);
						nf.add(l15);nf.add(l16);
						nf.add(l17);nf.add(l18);
						nf.add(l19);nf.add(l20);
						nf.add(l21);nf.add(l22);
						nf.add(l23);nf.add(l24);
						nf.add(l25);nf.add(l26);
						nf.add(l27);nf.add(l28);
						nf.add(l29);nf.add(l30);
						nf.add(l31);nf.add(l32);
						nf.add(l33);nf.add(l34);
						nf.add(l35);nf.add(l36);
						nf.add(l37);nf.add(l38);
						nf.add(l39);nf.add(l40);
						nf.add(l41);nf.add(l42);
						nf.add(l43);
						nf.setSize(900,800);
						nf.setLayout(null);
						nf.setVisible(true);
						nf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					}
				});  
				f1.setSize(700,200);
				f1.setLayout(null);
				f1.setVisible(true);
			}
		});
		submit.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JLabel thanks=new JLabel("THANK YOU FOR VISITING OUR BANK!");
				JLabel msg=new JLabel("Your account has been successfully created.You will receive text message from our bank in the given phone number regarding account details.");
				JLabel post=new JLabel("PassBook and Debit card will be delivered to the given address within 7 days.");
				JFrame f2=new JFrame();
				thanks.setBounds(375,90,450,30);
				msg.setBounds(75,30,900,30);
				post.setBounds(250,60,450,30);
				f2.add(thanks);
				f2.add(msg);
				f2.add(post);
				f2.setSize(975,200);
				f2.setLayout(null);
				f2.setVisible(true);
				f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		f.setSize(900,825);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}