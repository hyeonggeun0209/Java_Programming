
public class Cuboid {
	int width;
	int length;
	int height;
	
	Cuboid() {
		width = -1;
		length = -1;
		height = -1;
	}
	
	Cuboid(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
	}
	
	Cuboid(int l) {
		width = l;
		length = l;
		height = l;
	}
	
	Cuboid(Cuboid b) {
		width = b.width;
		length = b.length;
		height = b.height;
	}
	
	double getVol() {
		return width * length * height;
	}
}
