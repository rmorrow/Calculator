package com.morrow.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.CharsetDecoder;
import java.util.Iterator;
import java.util.Stack;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextArea;

import com.morrow.calculator.*;

public class CalculatorListener implements ActionListener {

	JTextArea workingEquationTextArea = new JTextArea();
	JTextArea outputArea = new JTextArea();
	CalculatorFrame localFrame;
	ScriptEngine engine; 
	ScriptEngineManager manager;
	String workingEquation="";
	Stack equationStack = new Stack();
		
	public CalculatorListener(CalculatorFrame frame) {
		manager = new ScriptEngineManager();
		engine = manager.getEngineByName("js");
		manager.getEngineByName("js");
		workingEquationTextArea = frame.textAreaWorkingEquation;
		outputArea = frame.textAreaOutput;
		localFrame = frame;

	}
	
	public void actionPerformed(ActionEvent e) {
		int solved =0;
		Object result = null;
		
		
		String equation = localFrame.textAreaWorkingEquation.getText().toString();
	
		switch( ((JButton) e.getSource()).getText()) {
			
			case "%":
				System.out.println("Percent sign push");
				equationStack.push("%");
				localFrame.textAreaWorkingEquation.append(((JButton) e.getSource()).getText());

				break;
			case "\u221A": //Square root
				System.out.println("square root sign push");
				equationStack.push("\\u221A");
				localFrame.textAreaWorkingEquation.append("\u221A");

				break;
			case "^2":
				System.out.println("squared sign push");
				equationStack.push("^2");
				localFrame.textAreaWorkingEquation.append(((JButton) e.getSource()).getText());
				break;
			case "1/x":
				equationStack.push("1/x");
				System.out.println("inverse sign push");
				
				break;
			case "CE":
				workingEquation = "";
				System.out.println("CE sign push");
				equationStack.clear();
				localFrame.textAreaWorkingEquation.setText("");
				break;
			case "C":
				workingEquation = "";
				System.out.println("C sign push");
				localFrame.textAreaWorkingEquation.setText("");
				equationStack.clear();


				break;
			case "\u00F7": //divide button
				System.out.println("Divide sign push");
				workingEquation = workingEquation + "/";
				equationStack.push("/");
				localFrame.textAreaWorkingEquation.append("\u00F7");

				break;
			case "<":
				System.out.println("Backspace sign push");
				equationStack.pop();
				break;
			case "x":
				workingEquation = workingEquation + "*";
				localFrame.textAreaWorkingEquation.append("*");
				equationStack.push("*");
				break;
			case "-":
				System.out.println("Minus sign push");
				workingEquation = workingEquation + (((JButton) e.getSource()).getText());
				localFrame.textAreaWorkingEquation.append(((JButton) e.getSource()).getText());
				equationStack.push("-");
				break;
			case "+":
				System.out.println("Addition sign push");
				workingEquation = workingEquation + (((JButton) e.getSource()).getText());
				localFrame.textAreaWorkingEquation.append(((JButton) e.getSource()).getText());
				equationStack.push("+");
				break;
			case "+/-":
				System.out.println("Plus/minus sign push");
				equationStack.push("+/-");
				break;
			
			case "=":
				try {
					//result = engine.eval(localFrame.textAreaWorkingEquation.getText());
					result = engine.eval(workingEquation);
				} catch (ScriptException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("The equation is " + (localFrame.textAreaWorkingEquation.getText().toString()) + " = " + result);
				localFrame.textAreaOutput.setText(result.toString());
				break;
		
			default:
				localFrame.textAreaWorkingEquation.append(((JButton) e.getSource()).getText());
				workingEquation = workingEquation + (((JButton) e.getSource()).getText());
				System.out.println("Working equation: " + workingEquation);
				equationStack.push(((JButton) e.getSource()).getText());
				System.out.println("Stack: " + equationStack.stream());
				showStackEquation();
				break;
				
		}
	}
	public String showStackEquation() {
		//while(equationStack.stream())
		workingEquation = "";
		Iterator iterator = (Iterator) equationStack.iterator();
		while(iterator.hasNext()) {
			workingEquation  += iterator.next();
		}
		System.out.println("Working equation= " + workingEquation);
		return workingEquation;
	}

}