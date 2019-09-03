package module1;

import processing.core.*;

public class MyPApplet extends PApplet {
	
	private String URL;
	private PImage backgroundImg;
	
	
	public MyPApplet() {
		// TODO Auto-generated constructor stub
	}
	
	public void setup() {
		size(400,400);
		URL = "C:\\Users\\Arun\\Desktop\\new_folder\\0e7582949f476a507b702ccd3833e9f06207970f676d24c63d50098d6127c297.jpg";
//		URL = "https://processing.org/img/processing-web.png";
		backgroundImg = loadImage(URL,"jpg");
	}
	
	public void draw() {
		backgroundImg.resize(0, height);
		background(10);
//		image(backgroundImg, 0, 0);
		// Use width and height to maintain relative location of the ellipse
		//
		int[] suncolor = setSunColor(second());
		fill(suncolor[0],suncolor[1],suncolor[2]);
		ellipse(width/4, height/5, width/5, height/5);
	}
	
	public int[] setSunColor(float seconds) {
		int[] rgb = new int[3];
		
		float difference = Math.abs(30-seconds);
		float ratio = difference/30;
		ratio = 1-ratio;
		
		rgb[0] = (int) (255*ratio);
		rgb[1] = (int) (255*ratio);
		rgb[2] = 0;
		
		return rgb;
	}
}
