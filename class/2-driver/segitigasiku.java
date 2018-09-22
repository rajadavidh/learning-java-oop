public class segitigasiku{
	//atribut
		int alas;
		int tinggi;

	//method
		segitigasiku(){
			System.out.printf("Telah lahir obyek segitiga");
		}
		
		segitigasiku(int a,int t){
			alas = a;
			tinggi = t;
			System.out.println("Telah lahir obyek segitiga dengan :");
			System.out.println("alas = "+alas);
			System.out.println("tinggi = "+tinggi);
		}
		
		double hitungluas(){
			return 0.5*(alas*tinggi);
		}
		
		double hitungkeliling(){
			return alas+tinggi+Math.sqrt((alas*alas)+(tinggi*tinggi));
		}
		
	//main
}