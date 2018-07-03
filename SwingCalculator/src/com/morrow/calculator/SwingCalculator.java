package com.morrow.calculator;
import java.awt.EventQueue;

public class SwingCalculator {

	public SwingCalculator() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingCalculatorFrame frame = new SwingCalculatorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void main(String args[]) {
		
		SwingCalculator calc = new SwingCalculator();
	}

}
