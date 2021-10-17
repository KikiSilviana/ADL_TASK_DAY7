package com.adl.main;

import javax.swing.JOptionPane;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIMain extends javax.swing.JFrame {
	int angka=1;
	int Angka=0;
	String jawaban ="";
	String betul = "";
	int benar=0;
	int salah = 0;
	String [] Soal1= {"Siapakah Nama Trainner JC?","A. Hanif","B. Agung","C. Abdillah","D. Anggito" };
	String [] Soal2= {"Berapakah hasil dari penjumlahan 5+5 ?","A. 15","B. 10","C. 20","D. 25"};

	
	private JFrame frame;
	private JRadioButton A;
	protected JTextComponent txtAngka;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMain window = new GUIMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIMain() {
		initialize();
	}
	
//	private void clear() {
//		
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtSoal = new JTextArea();
		txtSoal.setText(""+Soal1[0]);
		txtSoal.setBounds(25, 27, 385, 102);
		frame.getContentPane().add(txtSoal);
		
		A = new JRadioButton("A");
		A. setText("A. Hanif");
		A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jawaban="A";
				}
			}
		);
		A.setBounds(25, 145, 109, 23);
		frame.getContentPane().add(A);
		
		JRadioButton B = new JRadioButton("B");
		B.setText(""+Soal1[2]);
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jawaban="B";
			}
		});
		B.setBounds(25, 171, 109, 23);
		frame.getContentPane().add(B);
		
		JRadioButton C = new JRadioButton("New radio button");
		C.setText(""+Soal1[3]);
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jawaban="C";
			}
		});
		C.setBounds(269, 145, 109, 23);
		frame.getContentPane().add(C);
		
		JRadioButton D = new JRadioButton("New radio button");
		D.setText(""+Soal1[4]);
		D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jawaban="D";
			}
		});
		D.setBounds(269, 171, 109, 23);
		frame.getContentPane().add(D);
		
	
		
		Button btnPrev = new Button("Prev");
		btnPrev.addActionListener(new ActionListener() {
			private JTextComponent txtAngka;

			public void actionPerformed(ActionEvent e) {
				Angka-=1;
				angka-=1;
				txtAngka.setText(""+Angka);
				
				if (angka==0) {
					txtAngka.setText("");
				} else {
					txtAngka.setText("");
				}
				
				if (angka==1) {
					txtSoal.setText(""+Soal1[0]);
					A.setText(""+Soal1[1]);
					B.setText(""+Soal1[2]);
					C.setText(""+Soal1[3]);
					D.setText(""+Soal1[4]);
					
				} else if (angka==2) {
					txtSoal.setText(""+Soal2[0]);
					A.setText(""+Soal2[1]);
					B.setText(""+Soal2[2]);
					C.setText(""+Soal2[3]);
					D.setText(""+Soal2[4]);
				}
				
			}});
		btnPrev.setBounds(36, 214, 70, 22);
		frame.getContentPane().add(btnPrev);
		
		Button btnResult = new Button("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Betul :"+benar+"\n"+"salah :"+salah);
			}
		});
		btnResult.setBounds(173, 214, 70, 22);
		frame.getContentPane().add(btnResult);
		
		Button btnNext = new Button("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Angka+=1;
				angka+=1;
//				txtAngka.setText(""+Angka);
				if (Angka==1) {
					if(A.isSelected()) {
						benar+=1;
					} else {
						salah+=1;
					}
				}if (angka==2) {
					
					txtSoal.setText(""+Soal2[0]);
					A.setText(""+Soal2[1]);
					B.setText(""+Soal2[2]);
					C.setText(""+Soal2[3]);
					D.setText(""+Soal2[4]);
					
				} if (Angka==2) {
					if(B.isSelected()) {
						benar+=1;
					} else {
						salah+=1;
					}
				}
			} 
//			void clear() {
//			}
		}
		);
		btnNext.setBounds(308, 214, 70, 22);
		frame.getContentPane().add(btnNext);
		
		TextField txtAngka = new TextField();
		txtAngka.setText(""+angka);
		txtAngka.setBounds(54, -1, 37, 22);
		frame.getContentPane().add(txtAngka);
		
		Label label = new Label("No.");
		label.setBounds(29, -1, 62, 22);
		frame.getContentPane().add(label);
	}
}
