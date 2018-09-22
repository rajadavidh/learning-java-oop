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
	public static void main(String[] args){
		segitigasiku sgsk = new segitigasiku(3,4);
		//double luas = sgsk.hitungluas();
		System.out.println("luas: "+sgsk.hitungluas());
		System.out.println("keliling: "+sgsk.hitungkeliling());
	}
}