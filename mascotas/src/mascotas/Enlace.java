package mascotas;

import java.awt.Graphics;
import java.awt.Point;

public class Enlace {

	private int x1, y1, x2, y2;
	private double ang = 10, angSep = 90.0;
	private int dist = 10;
	Point p1 = new Point();
	Point p2 = new Point();

	public Enlace(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public void pintar(Graphics g) {
		p1.x = (int) (x2 + dist * Math.cos(ang - Math.toRadians(angSep)));
		p1.y = (int) (x2 - dist * Math.sin(ang - Math.toRadians(angSep)));
		p2.x = (int) (x2 + dist * Math.cos(ang + Math.toRadians(angSep)));
		p2.y = (int) (x2 - dist * Math.sin(ang + Math.toRadians(angSep)));

		g.drawLine(x1, y1, x2, y2);
		g.drawOval(x2, y2, 10, 10);
		// g.drawRect(x2, y2, 10, 10);
		// g.drawLine(x2, y2, p1.x, p1.y);
		// g.drawLine(x2, y2, p2.x, p2.y);

	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

}
