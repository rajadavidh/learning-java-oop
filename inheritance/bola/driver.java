public class driver{
	public static void main(String[] args){
		System.out.println("------------Program inheritance-bola oleh Raja David H./113091045--------------\n");
		//segiempat
			bola bl1 = new bola(7);
			System.out.println("volume bola 1 : "+bl1.hitungVolume());
			System.out.println("luas permukaan bola 1: "+bl1.hitungLuasPermukaan()+"\n");
			bola bl2 = new bola(5);
			System.out.println("volume bola 2 : "+bl2.hitungVolume());
			System.out.println("luas permukaan bola 2: "+bl2.hitungLuasPermukaan()+"\n");
			
			//coba set
			System.out.println("coba set bola 1: ");
			bl1.setradius(49);
			bl1.printatribut();
			System.out.println("volume bola 1 : "+bl1.hitungVolume());
			System.out.println("luas permukaan bola 1: "+bl1.hitungLuasPermukaan()+"\n");
			
		System.out.println("--------------------------------------------------------------------------------");
	}
}