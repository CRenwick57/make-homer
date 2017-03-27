import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JLabel;

public class HomerMaker {
	
	public static ArrayList<Point> setPoints(int x, int y){
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
		ArrayList<Point> pointsL= new ArrayList<Point>();
		for (Point p : points){
			pointsL.add(p);
		}
		return pointsL;
	}
	
	public static void makeHomer(int x, int y){
		ArrayList<Point> points = HomerMaker.setPoints(x, y);
    	HomerMaker.makeHead(points.get(0));
    	HomerMaker.makeNose(points.get(1));
    	HomerMaker.makeEye(points.get(2));
    	HomerMaker.makeEye(points.get(3));
    	HomerMaker.makeBeard(points.get(4));
    	HomerMaker.makeEar(points.get(5));
    	HomerMaker.makeSideburns(points.get(6));
    	HomerMaker.makeHair(points.get(7));
	}
	
	public static Frame makeHead(Point p){
		Frame homer = new Frame();
		Color c = new Color(255,255,0);
		Dimension d = new Dimension(350, 600);
		homer.setSize(d);
        homer.setLocation(p);
        homer.setBackground(c);;
        homer.setVisible(true);
		return homer;
	}
	
	public static Frame makeEye(Point p){
		Frame eye = new Frame();
		eye.setSize(100, 100);
		eye.setLocation(p);
		JLabel pupil = new JLabel("   .");
		pupil.setHorizontalTextPosition(JLabel.CENTER);
		pupil.setVerticalTextPosition(JLabel.TOP);
		Font f = new Font("Arial", 1, 70);
		pupil.setFont(f);
		eye.add(pupil);
		eye.setVisible(true);
		return eye;
	}
	
	public static Frame makeBeard(Point p){
		Frame beard = new Frame();
		beard.setSize(310, 250);
		beard.setLocation(p);
		Color c = new Color(188, 145, 101);
		beard.setBackground(c);
		JLabel mouth = new JLabel("\\_______");
		Font f = new Font("Arial", 1, 70);
		mouth.setFont(f);
		beard.add(mouth);
		beard.setVisible(true);
		return beard;
	}
	
	public static Frame makeNose(Point p){
		Frame nose = new Frame();
		nose.setSize(100, 100);
		nose.setLocation(p);
		Color c = new Color(255, 255, 0);
		nose.setBackground(c);
		JLabel n = new JLabel("   >");
		Font f = new Font("Arial", 1, 70);
		n.setFont(f);
		nose.add(n);
		nose.setVisible(true);
		return nose;
	}
	
	public static Frame makeEar(Point p){
		Frame ear = new Frame();
		ear.setSize(100, 100);
		ear.setLocation(p);
		Color c = new Color(255, 255, 0);
		ear.setBackground(c);
		JLabel n = new JLabel(" G");
		Font f = new Font("Arial", 1, 70);
		n.setFont(f);
		ear.add(n);
		ear.setVisible(true);
		return ear;
	}
	
	public static Frame makeSideburns(Point p){
		Frame sideburns = new Frame();
		sideburns.setSize(100, 100);
		sideburns.setLocation(p);
		Color c = new Color(255, 255, 0);
		sideburns.setBackground(c);
		JLabel hair = new JLabel("M");
		Font f = new Font("Arial", 1, 70);
		hair.setFont(f);
		sideburns.add(hair);
		sideburns.setVisible(true);
		return sideburns;
	}

	public static Frame makeHair(Point p){
		Frame hair = new Frame();
		hair.setSize(100, 100);
		hair.setLocation(p);
		Color c = new Color(255, 255, 0);
		hair.setBackground(c);
		JLabel hairs = new JLabel(" X");
		Font f = new Font("Arial", 1, 70);
		hairs.setFont(f);
		hair.add(hairs);
		hair.setVisible(true);
		return hair;
	}
	
}
