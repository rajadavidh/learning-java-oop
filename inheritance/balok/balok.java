public class balok extends segiempat{
	//atribut
		private int tinggi;

	//konstruktor
		balok(){
			System.out.println("Telah lahir obyek balok");
		}
		
		balok(int panjang,int lebar,int tinggi){
			setpanjang(panjang);
			setlebar(lebar);
			this.tinggi = tinggi;
			System.out.println("Telah lahir obyek balok dengan :");
			printatribut();
		}
	
	//get dan set
		public int gettinggi(){
			return tinggi;
		}
		
		public void settinggi(int tinggi){
			this.tinggi=tinggi;
		}
		
	//print atribut
		public void printatribut(){
			super.printatribut();
			System.out.println("tinggi = "+tinggi);
		}
		
	//method-method lain	
		public int hitungVolume(){
			return hitungLuas()*tinggi;
		}
		
		public int hitungLuasPermukaan(){
			return 2*(hitungLuas()+(getpanjang()*tinggi)+(getlebar()*tinggi));
		}
}