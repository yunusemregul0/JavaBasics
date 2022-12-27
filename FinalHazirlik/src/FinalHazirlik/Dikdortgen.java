package FinalHazirlik;

public class Dikdortgen {
	private int en,boy;
	private static int nesneSayisi;
	
	//Constructor method using
		public Dikdortgen(int x,int y) {
			this.en=x;
			this.boy=y;
			nesneSayisi++;
		}
		public Dikdortgen() {
			this.en=5;
			this.boy=5;
			nesneSayisi++;
		}
	
	//set-get blocks using	
	public int getEn() {return en;}
			
	public void setEn(int en) {
		if (en<0) {
			this.en=0;
		}
		else
			this.en=en;
	}
	public int getBoy() {return boy;}
	public void setBoy(int boy) {
		this.boy=boy;
	}
	
	public int alanHesap() {
		return en*boy;
	}
	public static int getNesneSayisi() {
		return nesneSayisi;
	}
}
