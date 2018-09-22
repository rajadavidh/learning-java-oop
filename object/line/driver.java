public class driver{
	public static void main(String[]args){
		System.out.println("---------------Tugas 2 oleh Raja David H./113091045-----------------\n");
		//class time
			time waktu = new time(3,30,30);
			System.out.println("jika dijadikan detik :"+waktu.selisihooo());
		System.out.println("====================================================================\n");
		//class titik 2D
			titik2D point = new titik2D(3,4);
			System.out.println("jarak origin :"+point.jarakorigin());
			
			System.out.println("translasi  (2,5): ");
			point.setx(3);
			point.sety(4);
			point.translasi(2,5);
			
			System.out.println("dilatasi-> 1.5 kali : ");
			point.setx(3);
			point.sety(4);
			point.dilatasi(1.5); 
			
			System.out.println("rotasi 90 derajat : ");
			point.setx(3);
			point.sety(4);
			point.rotasi(Math.toRadians(90));
			
			System.out.println("dicerminkan dengan sumbu x: ");
			point.setx(3);
			point.sety(4);
			point.mirrorsbx();
			
			System.out.println("dicerminkan dengan sumbu y: ");
			point.setx(3);
			point.sety(4);
			point.mirrorsby();
		System.out.println("====================================================================\n");
		//class garis  2D
			garis2D line = new garis2D(3,4,6,8);
			System.out.println("panjang : "+line.panjang());
			System.out.println("gradien: "+line.gradien());
			System.out.println("x tengah : "+line.xtengah());
			System.out.println("y tengah : "+line.ytengah());
		System.out.println("----------------------------------------------------------------------");
	}
}