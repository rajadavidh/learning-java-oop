public class garis2D{
	//atribut
		private float x1;
		private float y1;
		private float x2;
		private float y2;
		
	//konstruktor
		public garis2D(){
			System.out.println("Telah lahir obyek garis 2D");
		}
		
		public garis2D(float x1,float y1,float x2,float y2){
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			System.out.println("Telah lahir obyek garis 2D dengan :");
			printatribut();
		}
		
	//get dan set
		//obyek 1
		public float getx1(){
			return x1;
		}
		
		public void setx1(float x1){
			this.x1 = x1;
		}
		
		public float gety1(){
			return y1;
		}
		
		public void sety1(float y1){
			this.y1 = y1;
		}
		
		//obyek 2
		public float getx2(){
			return x2;
		}
		
		public void setx2(float x2){
			this.x2 = x2;
		}
		
		public float gety2(){
			return y2;
		}
		
		public void sety2(float y2){
			this.y2 = y2;
		}
		
	//print atribut
		public void printatribut(){
			System.out.println("x1 = "+x1);
			System.out.println("y1 = "+y1);
			System.out.println("x2 = "+x2);
			System.out.println("y2 = "+y2);
		}
		
	//method2 lain
		public double panjang(){
			return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		}
		
		public double gradien(){
			return (y2-y1)/(x2-x1);
		}
		
		public double xtengah(){
			return	(x2-x1)/2;
		}
		
		public double ytengah(){
			return (y2-y1)/2;
		}
}