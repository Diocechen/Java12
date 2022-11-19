package Java12.sub2;

public class CTrapezoid {
	public int upper,base,height;
	
	public CTrapezoid(int u,int b,int h){
		upper = u;
		base = b;
		height = h;
	}
	public void show() {
		System.out.println((upper+base)*height/2);
	}
}
