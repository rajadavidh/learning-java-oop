public class bola extends lingkaran{
	//atribut 

	//konstruktor
		bola(){
			System.out.println("Telah lahir obyek bola");
		}
		
		bola(float radius){
			setradius(radius);
			System.out.println("Telah lahir obyek bola dengan :");
			printatribut();
		}
	
	//get dan set -> idem dengan class lingkaran
		
	//print atribut -> idem dengan class lingkaran
		
	//method-method lain	
		public double hitungVolume(){
			return (4*hitungLuas()*getradius())/3;
		}
		
		public double hitungLuasPermukaan(){
			return 4*hitungLuas();
		}
}