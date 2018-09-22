public class driver{
	public static void main(String[] args){
		System.out.println("------------Program inheritance-balok oleh Raja David H./113091045--------------\n");
		//segiempat
			balok blk = new balok(3,4,5);
			System.out.println("volume balok 1 : "+blk.hitungVolume());
			System.out.println("luas permukaan balok 1: "+blk.hitungLuasPermukaan()+"\n");
			//coba set
			System.out.println("coba set : ");
			blk.setpanjang(6);
			blk.setlebar(7);
			blk.settinggi(8);
			blk.printatribut();
			System.out.println("volume balok 1 : "+blk.hitungVolume());
			System.out.println("luas permukaan balok 1: "+blk.hitungLuasPermukaan()+"\n");
			
		System.out.println("--------------------------------------------------------------------------------");
	}
}