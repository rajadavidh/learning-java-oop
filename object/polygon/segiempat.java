public class segiempat{
	//atribut
		private int panjang;
		private int lebar;

	//konstruktor
		segiempat(){
			System.out.printf("Telah lahir obyek segiempat");
		}
		
		segiempat(int panjang,int lebar){
			this.panjang = panjang;
			this.lebar = lebar;
			System.out.println("Telah lahir obyek segiempat dengan :");
			printatribut();
		}
	
	//get dan set
		public int getpanjang(){
			return panjang;
		}
		
		public void setpanjang(int panjang){
			this.panjang=panjang;
		}
		
		public int getlebar(){
			return lebar;
		}
		
		public void setlebar(int lebar){
			this.lebar=lebar;
		}
		
	//print atribut
		public void printatribut(){
			System.out.println("panjang = "+panjang);
			System.out.println("lebar = "+lebar);
		}
		
	//method-method lain
		public int hitungLuas(){
			return panjang*lebar;
		}
		
		public int hitungKeliling(){
			return 2*(panjang+lebar);
		}
	
}