package com.morrow.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JTextArea;

import com.morrow.calculator.*;

public class SwingCalculatorListener implements ActionListener {

	JTextArea workingEquationTextArea = new JTextArea();
	SwingCalculatorFrame localFrame;
	ScriptEngine engine; 
	ScriptEngineManager manager;
		
	public SwingCalculatorListener(SwingCalculatorFrame frame) {
		manager = new ScriptEngineManager();
		engine = manager.getEngineByName("js");
		manager.getEngineByName("js");
		workingEquationTextArea = frame.textAreaWorkingEquation;
		localFrame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		int solved =0;
		Object result = null;
		
		
		String equation = localFrame.textAreaWorkingEquation.getText().toString();
	
		switch(((JButton) e.getSource()).getText()) {
			case "=":
				try {
					result = engine.eval(localFrame.textAreaWorkingEquation.getText());
				} catch (ScriptException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("The equation is " + (localFrame.textAreaWorkingEquation.getText().toString()) + " = " + result);
				break;
			case "x":
				localFrame.textAreaWorkingEquation.append(" " + ((JButton) e.getSource()).getText() + " ");
				break;
			default:
				localFrame.textAreaWorkingEquation.append(((JButton) e.getSource()).getText());
				break;
				
		}
	}

}
