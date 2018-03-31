import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
public class Button extends JFrame implements ActionListener{
	public static final int WIDTH = 500;
	public static final int HEIGHT=500;
	public Button(){
		setSize(WIDTH,HEIGHT);
		setTitle("Button");
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JButton test1 = new JButton("Blue");
		test1.addActionListener(this);
		contentPane.add(test1);

		JButton test2 = new JButton("Red");
		test2.addActionListener(this);
		contentPane.add(test2);

		JButton test3 = new JButton("Done");
		test3.addActionListener(this);
		contentPane.add(test3);
	}

	public void actionPerformed(ActionEvent e){
		Container contentPane =getContentPane();
		if(e.getActionCommand().equals("Blue"))
			contentPane.setBackground(Color.BLUE);
		if(e.getActionCommand().equals("Red"))
			contentPane.setBackground(Color.RED);
		if(e.getActionCommand().equals("Done"))
			System.exit(0);
			
	}

	public static void main(String[] args) {
		new Button().setVisible(true);

	}

}
