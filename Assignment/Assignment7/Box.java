
public class Box extends Rect{
	int height;
	
	Box() {
		super();
		height = -1;
	}
	
	Box(int w, int l, int h) {
		super(w, l);
		height = h;
	}
	
	Box(int l) {
		super(l);
		height = l;
	}
	
	double getVol() {
		return super.getArea() * height;
	}
}
