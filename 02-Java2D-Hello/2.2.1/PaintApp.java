import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PaintApp {
	public static void main(String [] args) {
		PaintFrame frame = new PaintFrame();
		frame.setVisible(true);
	}
}

class PaintFrame extends JFrame{
	Rect r1, r2, r3;
	PaintFrame(){
		this.setTitle("Painting Figures");
		this.setSize(350,350);
		this.r1 = new Rect(50,  50,  100,30, 0,0,0);
		this.r2 = new Rect(150, 80,  100,30, 255,165,0);
		this.r3 = new Rect(50,  110, 100,30, 54,100,139);
	}
	
    public void paint (Graphics g) {
    super.paint(g);
	this.r1.paint(g);
	this.r2.paint(g);
	this.r3.paint(g);
	}

}

class Rect{
	int x, y;
	int w, h;
	int r, g, b;
	
	Rect(int x, int y, int w, int h, int r, int g, int b){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.r = r;
		this.g = g;
		this.b = b;		
	}
	
    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(this.x, this.y, this.w, this.h);
        g.setColor(new Color(this.r, this.g, this.b));
        g.fillRect(this.x, this.y, this.w, this.h);

    } 	 
}
