public class time{
	//atribut
		private int hh;
		private int mm;
		private int ss;
		
	//konstruktor
		public time(){
			System.out.println("Lahir obyek time");
		}
		
		public time(int hh,int mm,int ss){
			this.hh = hh;
			this.mm = mm;
			this.ss = ss;
			System.out.println("Lahir obyek time dengan :");
			printatribut();
		}
		
	//get dan set
		public int gethh(){
			return hh;
		}
		
		public void sethh(int hh){
			this.hh = hh;
		}
		
		public int getmm(){
			return mm;
		}
		
		public void setmm(int mm){
			this.mm = mm;
		}
		
		public int getss(){
			return ss;
		}
		
		public void  setss(int ss){
			this.ss = ss;
		}
		

	//print atribut
		public void printatribut(){
			System.out.println("hh : "+hh);
			System.out.println("mm : "+mm);
			System.out.println("ss: "+ss);
		}
		
	//method2 lain
		public int selisihooo(){
			return (hh*3600)+(mm*60)+ss;
		}

}