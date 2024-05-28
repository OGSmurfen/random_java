import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator implements ActionListener{
	private JButton button0, button1, button2, button3, btnEquals, btnMultiply;
	private JButton button4, button5, button6, button7, button8, button9;
	private JButton btnClear, btnAC, btnDiv, plusBtn, minusBtn;
	private JTextField outputTF;
	private float var1=0, var2=0, result = 0;
	private Boolean mulFlag=false, divFlag=false, plusFlg=false, minusFlg=false;
	
	public static void main(String[] args){
		new Calculator();
	}
	Calculator(){
		JFrame frame = new JFrame();
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		btnClear = new JButton("C");
		btnAC = new JButton("AC");
		btnEquals = new JButton("=");
		btnMultiply = new JButton("*");
		btnDiv=new JButton("/");
		outputTF = new JTextField(20);
		plusBtn = new JButton("+");
		minusBtn = new JButton("-");
		
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		btnEquals.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnClear.addActionListener(this);
		btnAC.addActionListener(this);
		btnDiv.addActionListener(this);
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		
		button0.setBounds(120, 500, 100, 50);
		button1.setBounds(0, 420, 100, 50);
		button2.setBounds(120, 420, 100, 50);
		button3.setBounds(240, 420, 100, 50);
		button4.setBounds(0, 340, 100, 50);
		button5.setBounds(120, 340, 100, 50);
		button6.setBounds(240, 340, 100, 50);
		button7.setBounds(0, 260, 100, 50);
		button8.setBounds(120, 260, 100, 50);
		button9.setBounds(240, 260, 100, 50);
		btnEquals.setBounds(360, 500, 100, 50);
		btnMultiply.setBounds(360, 420, 100, 50);
		outputTF.setBounds(1, 1, 500, 50);
		btnClear.setBounds(0, 180, 100, 50);
		btnAC.setBounds(120, 180, 100, 50);
		btnDiv.setBounds(360, 340, 100, 50);
		plusBtn.setBounds(360, 260, 100, 50);
		minusBtn.setBounds(360, 180, 100, 50);
		
		frame.add(button0);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);
		frame.add(btnEquals);
		frame.add(btnMultiply);
		frame.add(outputTF);
		frame.add(btnClear);
		frame.add(btnAC);
		frame.add(btnDiv);
		frame.add(plusBtn);
		frame.add(minusBtn);
		
		//outputTF.setText("0");
		
		frame.setSize(500, 600);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button0){
			outputTF.setText(outputTF.getText()+"0");
		}
		if(e.getSource() == button1){
			outputTF.setText(outputTF.getText()+"1");
		}
		if(e.getSource() == button2){
			outputTF.setText(outputTF.getText()+"2");
		}
		if(e.getSource() == button3){
			outputTF.setText(outputTF.getText()+"3");
		}
		if(e.getSource() == button4){
			outputTF.setText(outputTF.getText()+"4");
		}
		if(e.getSource() == button5){
			outputTF.setText(outputTF.getText()+"5");
		}
		if(e.getSource() == button6){
			outputTF.setText(outputTF.getText()+"6");
		}
		if(e.getSource() == button7){
			outputTF.setText(outputTF.getText()+"7");
		}
		if(e.getSource() == button8){
			outputTF.setText(outputTF.getText()+"8");
		}
		if(e.getSource() == button9){
			outputTF.setText(outputTF.getText()+"9");
		}
		if(e.getSource() == btnMultiply){
			mulFlag = true;
			var1 = Float.parseFloat(outputTF.getText());
			outputTF.setText("");
		}
		if(e.getSource() == btnDiv){
			divFlag = true;
			var1 = Float.parseFloat(outputTF.getText());
			outputTF.setText("");
		}
		if(e.getSource() == plusBtn){
			plusFlg = true;
			var1 = Float.parseFloat(outputTF.getText());
			outputTF.setText("");
		}
		if(e.getSource() == minusBtn){
			minusFlg = true;
			var1 = Float.parseFloat(outputTF.getText());
			outputTF.setText("");
		}
		if(e.getSource() == btnClear){
			outputTF.setText("");
		}
		if(e.getSource() == btnAC){
			var1=0;var2=0;result=0;
			outputTF.setText("");
		}
		if(e.getSource() == btnEquals){
			var2 = Float.parseFloat(outputTF.getText());
			if(mulFlag){
				result = var1 * var2;
				mulFlag = false;
			}
			if(divFlag){
				result = var1 / var2;
				divFlag = false;
			}
			if(plusFlg){
				result = var1 + var2;
				plusFlg = false;
			}
			if(minusFlg){
				result = var1 - var2;
				minusFlg = false;
			}
			outputTF.setText(String.valueOf(result));
		}
		
	}
}

class LinePanel extends JPanel{
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.drawLine(60,50,60,350);
		g.drawLine(50,200,350,200);
	}
}