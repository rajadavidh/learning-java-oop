public class driver{
	public static void main(String[] args){
		System.out.println("---------------Program Poligon oleh Raja David H./113091045-----------------\n");
		//segiempat
			segiempat sgmpt = new segiempat(3,4);
			System.out.println("luas segiempat 1 : "+sgmpt.hitungLuas());
			System.out.println("keliling segiempat 1: "+sgmpt.hitungKeliling()+"\n");
			//coba set
			System.out.println("coba set : ");
			sgmpt.setpanjang(5);
			sgmpt.setlebar(6);
			sgmpt.printatribut();
			System.out.println("luas segiempat 1 : "+sgmpt.hitungLuas());
			System.out.println("keliling segiempat 1: "+sgmpt.hitungKeliling()+"\n");
		
		System.out.println("===========================================================================\n");
			
		//lingkaran
			lingkaran ling1 = new lingkaran(7);
			System.out.println("luas lingkaran 1 : "+ling1.hitungLuas());
			System.out.println("keliling lingkaran 1 : "+ling1.hitungKeliling()+"\n");
			lingkaran ling2 = new lingkaran(5);
			System.out.println("luas lingkaran 2 : "+ling2.hitungLuas());
			System.out.println("keliling lingkaran 2 : "+ling2.hitungKeliling()+"\n");
			//coba set
			System.out.println("coba set ling1: ");
			ling1.setradius(49);
			ling1.printatribut();
			System.out.println("luas lingkaran 1 : "+ling1.hitungLuas());
			System.out.println("keliling lingkaran 1 : "+ling1.hitungKeliling()+"\n");
			
		System.out.println("===========================================================================\n");
			
		//segitigasiku
			segitigasiku sgsk = new segitigasiku(3,4);
			System.out.println("luas segitiga 1: "+sgsk.hitungLuas());
			System.out.println("keliling segitiga 1: "+sgsk.hitungKeliling());
			//coba set
			System.out.println("coba set : ");
			sgsk.setalas(6);
			sgsk.settinggi(8);
			sgsk.printatribut();
			System.out.println("luas segitiga 1 : "+sgsk.hitungLuas());
			System.out.println("keliling segitiga 1: "+sgsk.hitungKeliling()+"\n");
		System.out.println("----------------------------------------------------------------------------");
	}
}