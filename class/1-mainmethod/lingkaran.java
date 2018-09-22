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
	public static void main(String[] args){
		lingkaran ling1 = new lingkaran(7);
		//double luas = ling.hitungluas();
		System.out.println("luas1: "+ling1.hitungLuas());
		System.out.println("keliling1: "+ling1.hitungKeliling());
		lingkaran ling2 = new lingkaran(5);
		System.out.println("luas2: "+ling2.hitungLuas());
		System.out.println("keliling2: "+ling2.hitungKeliling());
		System.out.println("PHI: "+Math.PI);
	}
}