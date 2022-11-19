package Java12.sub1;

public class CSphere {
	double radius;
	public CSphere(double r){
		radius = r;
	}
	public void show() {
		System.out.println((4/3)*Math.PI*radius*radius);
	}
}
