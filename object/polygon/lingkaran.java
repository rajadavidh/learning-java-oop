public class lingkaran{
	//atribut
		private float radius;

	//konstruktor
		lingkaran(){
			System.out.printf("Telah lahir obyek lingkaran");
		}
		
		lingkaran(float radius){
			this.radius = radius;
			System.out.println("Telah lahir obyek lingkaran dengan :");
			printatribut();
		}
	
	//get dan set
		public float getradius(){
			return radius;
		}
		
		public void setradius(float radius){
			this.radius=radius;
		}
	
	//print atribut
		public void printatribut(){
			System.out.println("radius = "+radius);
		}
		
	//method-method lain	
		public double hitungLuas(){
			if (radius%7==0){
				return (22*radius*radius)/7;
			} else {
				return Math.PI*radius*radius;
			}
		}
		
		public double hitungKeliling(){
			if (radius%7==0){
				return (22*radius*2)/7;
			} else {
				return Math.PI*radius*2;
			}
		}
		
}