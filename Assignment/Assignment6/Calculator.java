
public class Calculator implements AddSub, MulDiv {

	@Override
	public double multiply(double[] a) {
		// TODO Auto-generated method stub
		return a[0] * a[1];
	}

	@Override
	public double divide(double[] a) {
		// TODO Auto-generated method stub
		return a[0] / a[1];
	}

	@Override
	public double add(double[] a) {
		// TODO Auto-generated method stub
		return a[0] + a[1];
	}

	@Override
	public double subtract(double[] a) {
		// TODO Auto-generated method stub
		return a[0] - a[1];
	}

}
