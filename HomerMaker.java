import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class HomerMaker {
	
	public static Point[] setPoints(int x, int y){
		Point pHead = new Point(x, y);
		//x = 400, y = 100
		Point pEyeLeft = new Point(x+150, y+150);
		Point pEyeRight = new Point(x+270, y+150);
		Point pBeard = new Point(x+150, y+300);
    		Point pNose = new Point(x+250, y+220);
    		Point pEar = new Point(x-60, y+250);
    		Point pSide = new Point(x, y+120);
    		Point pHair = new Point(x+100, y-25);
		Point[] points = new Point[]{pHead, pNose, pEyeRight, pEyeLeft, pBeard, pEar, pSide, pHair};
		return points;
	}
	
	public static void makeHomer(int x, int y){
		Point[] points = HomerMaker.setPoints(x, y);
    		HomerMaker.makeHead(points[0]);
    		HomerMaker.makeNose(points[1]);
    		HomerMaker.makeEye(points[2]);
    		HomerMaker.makeEye(points[3]);
    		HomerMaker.makeBeard(points[4]);
    		HomerMaker.makeEar(points[5]);
    		HomerMaker.makeSideburns(points[6]);
    		HomerMaker.makeHair(points[7]);
	}
	
	public static JFrame makeHead(Point p){
		JFrame homer = new JFrame();
		Color c = new Color(255,255,0);
		Dimension d = new Dimension(350, 600);
		homer.setSize(d);
        	homer.setLocation(p);
        	homer.getContentPane().setBackground(c);
		homer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	homer.setVisible(true);
		return homer;
	}
	
	public static JFrame makeEye(Point p){
		JFrame eye = new JFrame();
		eye.setSize(100, 100);
		eye.setLocation(p);
		JLabel pupil = new JLabel("   .");
		pupil.setHorizontalTextPosition(JLabel.CENTER);
		pupil.setVerticalTextPosition(JLabel.TOP);
		Font f = new Font("Arial", 1, 70);
		pupil.setFont(f);
		eye.add(pupil);
                eye.getContentPane().setBackground(Color.white);
		eye.setVisible(true);
		return eye;
	}
	
	public static JFrame makeBeard(Point p){
		JFrame beard = new JFrame();
		beard.setSize(310, 250);
		beard.setLocation(p);
		Color c = new Color(188, 145, 101);
		beard.getContentPane().setBackground(c);
		JLabel mouth = new JLabel("\\_______");
		Font f = new Font("Arial", 1, 70);
		mouth.setFont(f);
		beard.add(mouth);
		beard.setVisible(true);
		return beard;
	}
	
	public static JFrame makeNose(Point p){
		JFrame nose = new JFrame();
		nose.setSize(100, 100);
		nose.setLocation(p);
		Color c = new Color(255, 255, 0);
		nose.getContentPane().setBackground(c);
		JLabel n = new JLabel("   >");
		Font f = new Font("Arial", 1, 70);
		n.setFont(f);
		nose.add(n);
		nose.setVisible(true);
		return nose;
	}
	
	public static JFrame makeEar(Point p){
		JFrame ear = new JFrame();
		ear.setSize(100, 100);
		ear.setLocation(p);
		Color c = new Color(255, 255, 0);
		ear.getContentPane().setBackground(c);
		JLabel n = new JLabel(" G");
		Font f = new Font("Arial", 1, 70);
		n.setFont(f);
		ear.add(n);
		ear.setVisible(true);
		return ear;
	}
	
	public static JFrame makeSideburns(Point p){
		JFrame sideburns = new JFrame();
		sideburns.setSize(100, 100);
		sideburns.setLocation(p);
		Color c = new Color(255, 255, 0);
		sideburns.getContentPane().setBackground(c);
		JLabel hair = new JLabel("M");
		Font f = new Font("Arial", 1, 70);
		hair.setFont(f);
		sideburns.add(hair);
		sideburns.setVisible(true);
		return sideburns;
	}

	public static JFrame makeHair(Point p){
		JFrame hair = new JFrame();
		hair.setSize(100, 100);
		hair.setLocation(p);
		Color c = new Color(255, 255, 0);
		hair.getContentPane().setBackground(c);
		JLabel hairs = new JLabel(" X");
		Font f = new Font("Arial", 1, 70);
		hairs.setFont(f);
		hair.add(hairs);
		hair.setVisible(true);
		return hair;
	}
	

	
        public static void main(String[] args){
            makeHomer(400,100);
        }
        
}
