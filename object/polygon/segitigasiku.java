public class segitigasiku{
	//atribut
		private int alas;
		private int tinggi;

	//konstruktor
		segitigasiku(){
			System.out.printf("Telah lahir obyek segitiga");
		}
		
		segitigasiku(int alas,int tinggi){
			this.alas = alas;
			this.tinggi = tinggi;
			System.out.println("Telah lahir obyek segitiga dengan :");
			printatribut();
		}
		
	//get dan set
		public int getalas(){
			return alas;
		}
		
		public void setalas(int alas){
			this.alas=alas;
		}
		
		public int gettinggi(){
			return alas;
		}
		
		public void settinggi(int tinggi){
			this.tinggi=tinggi;
		}
		
	//print atribut
		public void printatribut(){
			System.out.println("alas = "+alas);
			System.out.println("tinggi = "+tinggi);
		}
	
	//method-method lain
		public double hitungLuas(){
			return 0.5*(alas*tinggi);
		}
		
		public double hitungKeliling(){
			return alas+tinggi+Math.sqrt((alas*alas)+(tinggi*tinggi));
		}
}