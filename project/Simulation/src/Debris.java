import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Debris extends Objects {
    private static final float RADIUS = 12f;

    public Debris(float x, float y) {
        super(x, y);
    }

    public float getRadius() {
        return RADIUS;
    }

    public void draw(Graphics g) {
        Graphics2D graphics = (Graphics2D) g;
        Ellipse2D.Float circle = new Ellipse2D.Float(
                x - RADIUS, y - RADIUS, RADIUS * 2, RADIUS * 2);
        graphics.setColor(new Color(139, 90, 43));
        graphics.fill(circle);
        graphics.setColor(new Color(78, 50, 25));
        graphics.draw(circle);
    }
}