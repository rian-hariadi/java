package keuangan;

public class HargaTernak {
	private double ppn = 10.5 ;
	
	public int harga_sapi = 9000 ;
	public int harga_kambing = 1500 ;
	public int harga_ayam = 20 ;
	
	
	public void setPajak(double var_ppn) {
		double hrg = harga_sapi ;
		hrg = hrg + (ppn/100*hrg) ;
		
		int harga = (int) hrg ;
		harga_sapi = harga ;
				
	}
	
	
	public int getHargaSapi() {
		HargaTernak gh = new HargaTernak() ;
		
		gh.setPajak(ppn) ;
		
	
		HargaTernak o = new HargaTernak() ;
		String packageName = o.getClass().getPackage().getName()	;
		
		//System.out.println("Info " + packageName + ", harga sapi sekarang  : " + harga_sapi);
		return gh.harga_sapi ;
	}
	
}
