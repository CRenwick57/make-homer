package makeAHomer;

import java.awt.Point;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Point> points = HomerMaker.setPoints(400, 100);
    	HomerMaker.makeHomer(points.get(0));
    	HomerMaker.makeNose(points.get(1));
    	HomerMaker.makeEye(points.get(2));
    	HomerMaker.makeEye(points.get(3));
    	HomerMaker.makeBeard(points.get(4));
    	HomerMaker.makeEar(points.get(5));
    	HomerMaker.makeSideburns(points.get(6));
    	HomerMaker.makeHair(points.get(7));
    }
}
