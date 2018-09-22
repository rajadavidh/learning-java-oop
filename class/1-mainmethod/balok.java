public class balok{
	//atribut
		int panjang,lebar,tinggi;

	//method
		balok(){
			System.out.printf("Telah lahir obyek balok");
		}
		
		balok(int p,int l,int t){
			panjang = p;
			lebar = l;
			tinggi = t;
			System.out.println("Telah lahir obyek balok dengan :");
			System.out.println("panjang = "+panjang);
			System.out.println("lebar = "+lebar);
			System.out.println("tinggi = "+tinggi);
		}
		
		double hitungVolume(){
			return panjang*lebar*tinggi;
		}
		
		double hitungLuasPermukaan(){
			return 2*((panjang*lebar)+(panjang*tinggi)+(tinggi*lebar));
		}
		
	//main
	public static void main(String[] args){
		balok blk = new balok(3,4,5);
		//double luas = blk.hitungluas();
		System.out.println("volume: "+blk.hitungVolume());
		System.out.println("luas permukaan: "+blk.hitungLuasPermukaan());
	}
}