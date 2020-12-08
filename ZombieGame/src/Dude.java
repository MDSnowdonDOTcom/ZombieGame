
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Dude {
	// dx, dy is the change in x and y-coordinate
	int x, dx, y,nx,nx2,left, dy; 
	Image still,jump,reverse;
	
	// still, jump, left image
	ImageIcon s = new ImageIcon("H:\\Downloads\\CSC 12\\ZombieGame\\zombie.png");
	ImageIcon j= new ImageIcon("H:\\Downloads\\CSC 12\\ZombieGame\\zombie.png");
	ImageIcon l = new ImageIcon("H:\\Downloads\\CSC 12\\ZombieGame\\zombie.png");
	
	public Dude() {
		x = 75;
		left = 75;
		nx = 0;
		nx2= 685; // a bit less than the length of the frame (700)
		y = 172;
		still = s.getImage();
	}

	public void move() {
		if (dx != -1){
			if (left + dx <= 150)
				left+=dx;
			else{
		x = x + dx;
		
		nx2= nx2+dx;
			nx = nx + dx;
	}}
		else
	{
		if (left+dx >0)
		left = left + dx;
	}
		}

	public int getX() {
		return x;
	}

	public int getnX() {
		return nx;
	}
	
	public int getnX2() {
		return nx2;
	}

	public int getdx() {
		return dx;
	}
	
	public Image getImage() {
		return still;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT)
		{		dx = -3;
		still = l.getImage();		}
		
		if (key == KeyEvent.VK_RIGHT)
			{dx = 5;
		still = s.getImage();	
			}
		
		if (key == KeyEvent.VK_UP)
			{dy = 1;
			still = j.getImage();
			}			}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT)
			dx = 0;

		if (key == KeyEvent.VK_RIGHT)
			dx = 0;
		
		if (key == KeyEvent.VK_UP)
			{dy = 0;
			still = s.getImage();}
			}
	}