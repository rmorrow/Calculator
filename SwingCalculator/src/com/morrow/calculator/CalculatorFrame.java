package com.morrow.calculator;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {

	private JPanel contentPaneMain;
	public static JButton btnPercent;
	public JTextArea textAreaWorkingEquation;
	public JTextArea textAreaOutput;
	
	CalculatorListener calList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*
		 * EventQueue.invokeLater(new Runnable() { public void run() { try {
		 * CalculatorFrame frame = new CalculatorFrame();
		 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
		 */
	}

	
	/**
	 * Create the frame.
	 */
	public CalculatorFrame() {
		calList = new CalculatorListener(CalculatorFrame.this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 691);
		contentPaneMain = new JPanel();
		contentPaneMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneMain);
		GridBagLayout gbl_contentPaneMain = new GridBagLayout();
		gbl_contentPaneMain.columnWidths = new int[] { 425, 0 };
		gbl_contentPaneMain.rowHeights = new int[] { 100, 25, 500, 0 };
		gbl_contentPaneMain.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_contentPaneMain.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPaneMain.setLayout(gbl_contentPaneMain);

		textAreaWorkingEquation = new JTextArea();
		textAreaWorkingEquation.setAlignmentY(RIGHT_ALIGNMENT);
		textAreaWorkingEquation.setFont(new Font("Monospaced", Font.PLAIN, 60));
		GridBagConstraints gbc_textAreaWorkingEquation = new GridBagConstraints();
		gbc_textAreaWorkingEquation.fill = GridBagConstraints.BOTH;
		gbc_textAreaWorkingEquation.insets = new Insets(0, 0, 5, 0);
		gbc_textAreaWorkingEquation.gridx = 0;
		gbc_textAreaWorkingEquation.gridy = 0;
		contentPaneMain.add(textAreaWorkingEquation, gbc_textAreaWorkingEquation);

		JPanel panelButtons = new JPanel();
		GridBagConstraints gbc_panelButtons = new GridBagConstraints();
		gbc_panelButtons.fill = GridBagConstraints.BOTH;
		gbc_panelButtons.insets = new Insets(0, 0, 5, 0);
		gbc_panelButtons.gridx = 0;
		gbc_panelButtons.gridy = 2;
		contentPaneMain.add(panelButtons, gbc_panelButtons);
		panelButtons.setLayout(new GridLayout(0, 4, 0, 0));

		btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btnPercent);
		btnPercent.addActionListener(calList);

		JButton btnRoot = new JButton("\u221A");
		btnRoot.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btnRoot);
		btnRoot.addActionListener(calList);

		JButton btnSquare = new JButton("^2");
		btnSquare.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btnSquare);
		btnSquare.addActionListener(calList);

		JButton btnInverse = new JButton("1/x");
		btnInverse.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btnInverse);
		btnInverse.addActionListener(calList);

		JButton btnCe = new JButton("CE");
		btnCe.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btnCe);
		btnCe.addActionListener(calList);

		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btnC);
		btnC.addActionListener(calList);

		JButton btnBackspace = new JButton("<");
		btnBackspace.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btnBackspace);
		btnBackspace.addActionListener(calList);

		JButton btnDivide = new JButton("\u00F7");
		btnDivide.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btnDivide);
		btnDivide.addActionListener(calList);

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btn7);
		btn7.addActionListener(calList);

		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btn8);
		btn8.addActionListener(calList);

		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btn9);
		btn9.addActionListener(calList);

		JButton btnMultiply = new JButton("x");
		btnMultiply.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btnMultiply);
		btnMultiply.addActionListener(calList);

		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btn4);
		btn4.addActionListener(calList);

		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btn5);
		btn5.addActionListener(calList);

		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btn6);
		btn6.addActionListener(calList);

		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btnMinus);
		btnMinus.addActionListener(calList);

		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btn1);
		btn1.addActionListener(calList);

		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btn2);
		btn2.addActionListener(calList);

		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btn3);
		btn3.addActionListener(calList);

		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btnPlus);
		btnPlus.addActionListener(calList);

		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btnPlusMinus);
		btnPlusMinus.addActionListener(calList);

		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btn0);
		btn0.addActionListener(calList);

		JButton btnDecimal = new JButton(".");
		btnDecimal.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btnDecimal);
		btnDecimal.addActionListener(calList);

		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font("Buxton Sketch", Font.PLAIN, 30));
		panelButtons.add(btnEquals);
		btnEquals.addActionListener(calList);

		textAreaOutput = new JTextArea();
		GridBagConstraints gbc_textAreaOutput = new GridBagConstraints();
		gbc_textAreaOutput.fill = GridBagConstraints.BOTH;
		gbc_textAreaOutput.gridx = 0;
		gbc_textAreaOutput.gridy = 1;
		contentPaneMain.add(textAreaOutput, gbc_textAreaOutput);
	}

}