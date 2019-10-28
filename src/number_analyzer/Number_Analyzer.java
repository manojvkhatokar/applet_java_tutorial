package number_analyzer;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Stack;

import javax.swing.JLabel;

public class Number_Analyzer {

	private JFrame frame;
	public static JTextField txtEnterANumber;
	public static boolean launch = false;
	 Stack<Integer> STACK = new Stack<Integer>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Number_Analyzer window = new Number_Analyzer();
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
	public Number_Analyzer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
JButton even_button = new JButton("even");
even_button.setBackground(Color.WHITE);
		
		JButton positive_button = new JButton("positive");
		positive_button.setBackground(Color.WHITE);
		
		JButton odd_button = new JButton("odd");
		odd_button.setBackground(Color.WHITE);
		
		JButton negative_button = new JButton("negative");
		negative_button.setBackground(Color.WHITE);
		
		JButton prime_button = new JButton("prime");
		prime_button.setBackground(Color.WHITE);
		JLabel error_label = new JLabel(" ");
		error_label.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		txtEnterANumber = new JTextField();
		txtEnterANumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				try{if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					
					int number =	Integer.parseInt(txtEnterANumber.getText());
					
					STACK.push(number);
					int prev_number = STACK.pop();
					
					prime_button.setBackground(Color.WHITE);
					even_button.setBackground(Color.WHITE);
					odd_button.setBackground(Color.WHITE);
					positive_button.setBackground(Color.WHITE);
					negative_button.setBackground(Color.WHITE);
					
					System.out.println(number);		
						
					int count=0;
					
					for(int i =1; i<=number;i++)
					{
						if(number%i ==0)
						{count ++;			
						}	
					}
					if(count==2)
					{
						System.out.println(" its a prime number");
						prime_button.setBackground(Color.GREEN);
						
					}
					if(number%2 ==0)
					{
						System.out.println(" its a even number");
						even_button.setBackground(Color.GREEN);
					}
					if((number%2)!=0)
					{
						System.out.println(" its a odd number");
						odd_button.setBackground(Color.GREEN);
					}
					if(number >0)
					{
						System.out.println(" its a positive number");
						positive_button.setBackground(Color.GREEN);
					}
					if(number <0)
					{
						System.out.println(" its a negative number");
						negative_button.setBackground(Color.GREEN);
					}
					
					
					
					
					
				}
				
				
			}
			catch(Exception ex)
			{
				//System.out.println(" Please enter a number ");
				error_label.setText("Please enter a number");
				
				
			}
				
				
		}
		});
		txtEnterANumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterANumber.setColumns(10);
		
		JLabel lblEnterANumber = new JLabel("Enter a number");
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(41, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(even_button)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(positive_button)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(192)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(negative_button)
							.addGap(35))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(odd_button)
							.addGap(57))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(103)
					.addComponent(lblEnterANumber)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtEnterANumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(104, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(error_label, GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(190, Short.MAX_VALUE)
					.addComponent(prime_button)
					.addGap(186))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEnterANumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEnterANumber))
					.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(even_button)
								.addComponent(odd_button))
							.addGap(12))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(positive_button)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(negative_button)))
							.addGap(17)
							.addComponent(prime_button)
							.addGap(48)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(error_label)
					.addGap(10))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
