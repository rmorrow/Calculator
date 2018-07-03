
package com.morrow.calculator;
import java.awt.EventQueue;

public class Calculator {

	public Calculator() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorFrame frame = new CalculatorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void main(String args[]) {
		
		Calculator calc = new Calculator();
	}

}
