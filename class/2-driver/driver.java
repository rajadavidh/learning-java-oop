class driver{
	public static void main(String[] args){
			//balok
			balok blk = new balok(3,4,5);
			System.out.println("volume: "+blk.hitungVolume());
			System.out.println("luas permukaan: "+blk.hitungLuasPermukaan());
			//lingkaran
			lingkaran ling1 = new lingkaran(7);
			System.out.println("luas1: "+ling1.hitungLuas());
			System.out.println("keliling1: "+ling1.hitungKeliling());
			lingkaran ling2 = new lingkaran(5);
			System.out.println("luas2: "+ling2.hitungLuas());
			System.out.println("keliling2: "+ling2.hitungKeliling());
			System.out.println("PHI: "+Math.PI);
			//segitigasiku
			segitigasiku sgsk = new segitigasiku(3,4);
			System.out.println("luas: "+sgsk.hitungluas());
			System.out.println("keliling: "+sgsk.hitungkeliling());
	}
}
