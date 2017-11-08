import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
public class MouseEvents extends JFrame implements MouseListener{
	JLabel l1;
	MouseEvents()
	{
		setLayout(new FlowLayout());
		l1=new JLabel("Mouse");
		add(l1);
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		l1.setText("Clicked");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();
		f.setSize(400, 400);
		f.setVisible(true);
		f.setTitle("Mouse Events");
	}

}
