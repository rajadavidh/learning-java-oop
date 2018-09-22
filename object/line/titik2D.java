import java.text.DecimalFormat;
public class titik2D{
	//atribut
		private double x;
		private double y;
		DecimalFormat desimal = new DecimalFormat ("0.0");
		
	//konstruktor
		public titik2D(){
			System.out.println("Telah lahir obyek titik 2D");
		}
		
		public titik2D(double x,double y){
			this.x = x;
			this.y = y;
			System.out.println("Telah lahir obyek titik 2D dengan :");
			printatribut();
		}
		
	//get dan set
		public double getx(){
			return x;
		}
		
		public void setx(double x){
			this.x = x;
		}
		
		public double gety(){
			return y;
		}
		
		public void sety(double y){
			this.y = y;
		}
		
	//print atribut
		public void printatribut(){
			System.out.println("x = "+x);
			System.out.println("y = "+y);
		}
		
	//method2 lain
		public double jarakorigin(){
			return Math.sqrt((x*x)+(y*y));
		}
		
		public void translasi(int dx,int dy){
			System.out.println("x = "+dx+x);
			System.out.println("y = "+dy+y);
		}
		
		public void dilatasi(double k){
			System.out.println("x = "+k*x);
			System.out.println("y = "+k*y);
		}
		
		public void rotasi(double theta){
			System.out.println("x = " +desimal.format((Math.cos(theta)*x)-(Math.sin(theta)*y)));
			System.out.println("y = " +desimal.format((Math.sin(theta)*x)+(Math.cos(theta)*y)));
		}
		
		public void mirrorsbx(){
			y = -1*y;
			printatribut();
		}
		
		public void mirrorsby(){
			x = -1*x;
			printatribut();
		}
}