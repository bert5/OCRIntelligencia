package fr.inteligenciaArtificial;

import java.lang.reflect.InvocationTargetException;

public class Image {
	
	private Pixel x1y1;
	private Pixel x1y2;
	private Pixel x1y3;
	private Pixel x1y4;
	private Pixel x1y5;
	private Pixel x2y1;
	private Pixel x2y2;
	private Pixel x2y3;
	private Pixel x2y4;
	private Pixel x2y5;
	private Pixel x3y1;
	private Pixel x3y2;
	private Pixel x3y3;
	private Pixel x3y4;
	private Pixel x3y5;
	private Pixel x4y1;
	private Pixel x4y2;
	private Pixel x4y3;
	private Pixel x4y4;
	private Pixel x4y5;
	private Pixel x5y1;
	private Pixel x5y2;
	private Pixel x5y3;
	private Pixel x5y4;
	private Pixel x5y5;
	
	public Image() {
	}
	
	public Image(Pixel x1y1, Pixel x1y2, Pixel x1y3, Pixel x1y4, Pixel x1y5, Pixel x2y1, Pixel x2y2, Pixel x2y3,
			Pixel x2y4, Pixel x2y5, Pixel x3y1, Pixel x3y2, Pixel x3y3, Pixel x3y4, Pixel x3y5, Pixel x4y1, Pixel x4y2,
			Pixel x4y3, Pixel x4y4, Pixel x4y5, Pixel x5y1, Pixel x5y2, Pixel x5y3, Pixel x5y4, Pixel x5y5) {
		super();
		this.x1y1 = x1y1;
		this.x1y2 = x1y2;
		this.x1y3 = x1y3;
		this.x1y4 = x1y4;
		this.x1y5 = x1y5;
		this.x2y1 = x2y1;
		this.x2y2 = x2y2;
		this.x2y3 = x2y3;
		this.x2y4 = x2y4;
		this.x2y5 = x2y5;
		this.x3y1 = x3y1;
		this.x3y2 = x3y2;
		this.x3y3 = x3y3;
		this.x3y4 = x3y4;
		this.x3y5 = x3y5;
		this.x4y1 = x4y1;
		this.x4y2 = x4y2;
		this.x4y3 = x4y3;
		this.x4y4 = x4y4;
		this.x4y5 = x4y5;
		this.x5y1 = x5y1;
		this.x5y2 = x5y2;
		this.x5y3 = x5y3;
		this.x5y4 = x5y4;
		this.x5y5 = x5y5;
	}
	
	public Image importImageFromUser() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Image imageImported = new Image();
		for(int i= 1; i<= 7; i++) {
			for(int j = 1; j<=5; j++) {
				Pixel pixel = new Pixel(true);
				imageImported.getClass().getMethod("setX" + i + "y" + j, Pixel.class).invoke(imageImported, pixel);
			}
		}
		return imageImported;
	}

	public Pixel getX1y1() {
		return x1y1;
	}

	public void setX1y1(Pixel x1y1) {
		this.x1y1 = x1y1;
	}

	public Pixel getX1y2() {
		return x1y2;
	}

	public void setX1y2(Pixel x1y2) {
		this.x1y2 = x1y2;
	}

	public Pixel getX1y3() {
		return x1y3;
	}

	public void setX1y3(Pixel x1y3) {
		this.x1y3 = x1y3;
	}

	public Pixel getX1y4() {
		return x1y4;
	}

	public void setX1y4(Pixel x1y4) {
		this.x1y4 = x1y4;
	}

	public Pixel getX1y5() {
		return x1y5;
	}

	public void setX1y5(Pixel x1y5) {
		this.x1y5 = x1y5;
	}

	public Pixel getX2y1() {
		return x2y1;
	}

	public void setX2y1(Pixel x2y1) {
		this.x2y1 = x2y1;
	}

	public Pixel getX2y2() {
		return x2y2;
	}

	public void setX2y2(Pixel x2y2) {
		this.x2y2 = x2y2;
	}

	public Pixel getX2y3() {
		return x2y3;
	}

	public void setX2y3(Pixel x2y3) {
		this.x2y3 = x2y3;
	}

	public Pixel getX2y4() {
		return x2y4;
	}

	public void setX2y4(Pixel x2y4) {
		this.x2y4 = x2y4;
	}

	public Pixel getX2y5() {
		return x2y5;
	}

	public void setX2y5(Pixel x2y5) {
		this.x2y5 = x2y5;
	}

	public Pixel getX3y1() {
		return x3y1;
	}

	public void setX3y1(Pixel x3y1) {
		this.x3y1 = x3y1;
	}

	public Pixel getX3y2() {
		return x3y2;
	}

	public void setX3y2(Pixel x3y2) {
		this.x3y2 = x3y2;
	}

	public Pixel getX3y3() {
		return x3y3;
	}

	public void setX3y3(Pixel x3y3) {
		this.x3y3 = x3y3;
	}

	public Pixel getX3y4() {
		return x3y4;
	}

	public void setX3y4(Pixel x3y4) {
		this.x3y4 = x3y4;
	}

	public Pixel getX3y5() {
		return x3y5;
	}

	public void setX3y5(Pixel x3y5) {
		this.x3y5 = x3y5;
	}

	public Pixel getX4y1() {
		return x4y1;
	}

	public void setX4y1(Pixel x4y1) {
		this.x4y1 = x4y1;
	}

	public Pixel getX4y2() {
		return x4y2;
	}

	public void setX4y2(Pixel x4y2) {
		this.x4y2 = x4y2;
	}

	public Pixel getX4y3() {
		return x4y3;
	}

	public void setX4y3(Pixel x4y3) {
		this.x4y3 = x4y3;
	}

	public Pixel getX4y4() {
		return x4y4;
	}

	public void setX4y4(Pixel x4y4) {
		this.x4y4 = x4y4;
	}

	public Pixel getX4y5() {
		return x4y5;
	}

	public void setX4y5(Pixel x4y5) {
		this.x4y5 = x4y5;
	}

	public Pixel getX5y1() {
		return x5y1;
	}

	public void setX5y1(Pixel x5y1) {
		this.x5y1 = x5y1;
	}

	public Pixel getX5y2() {
		return x5y2;
	}

	public void setX5y2(Pixel x5y2) {
		this.x5y2 = x5y2;
	}

	public Pixel getX5y3() {
		return x5y3;
	}

	public void setX5y3(Pixel x5y3) {
		this.x5y3 = x5y3;
	}

	public Pixel getX5y4() {
		return x5y4;
	}

	public void setX5y4(Pixel x5y4) {
		this.x5y4 = x5y4;
	}

	public Pixel getX5y5() {
		return x5y5;
	}

	public void setX5y5(Pixel x5y5) {
		this.x5y5 = x5y5;
	}
	
	
	
	
	

}
