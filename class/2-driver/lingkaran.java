public class lingkaran{
	//atribut
		float radius;

	//method
		lingkaran(){
			System.out.printf("Telah lahir obyek lingkaran");
		}
		
		lingkaran(float r){
			radius = r;
			System.out.println("Telah lahir obyek lingkaran dengan :");
			System.out.println("radius = "+radius);
		}
		
		double hitungLuas(){
			if (radius%7==0){
				return (22*radius*radius)/7;
			} else {
				return Math.PI*radius*radius;
			}
		}
		
		double hitungKeliling(){
			if (radius%7==0){
				return (22*radius*2)/7;
			} else {
				return Math.PI*radius*2;
			}
		}
		
	//main
}