package module5;

import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.Marker;
import processing.core.PGraphics;

/** Implements a visual marker for ocean earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Your name here
 *
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = false;
	}
	

	/** Draw the earthquake as a square */
	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		pg.rect(x-radius, y-radius, 2*radius, 2*radius);
		
		
	}
	

	@Override
	public void showTitle(PGraphics pg, float x, float y) {
		pg.pushStyle();
		pg.fill(0);
		pg.text(this.getTitle() + "\nMagnitude: " + this.getMagnitude() + "\nDepth: " + this.getDepth() + " km", x+12, y+8);
		pg.popStyle();
	}

}
