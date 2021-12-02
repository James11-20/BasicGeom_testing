import java.awt.*;

public class BasicGeom {
    public static double calcDistance(Point p1, Point p2){
        double dist = 0;
        var xchange = p1.x - p2.x;
        var ychange = p1.y - p2.y;

        var intermediate = xchange*xchange +ychange*ychange;  //error
        dist = Math.sqrt(intermediate);
        return dist;
        }
    }
