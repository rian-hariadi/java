package com.ahlicoding.peternakan;

import keuangan.HargaTernak;

public class main {
	
	int harga_sapi ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== Aplikasi Peternakan ===");
		
		main m = new main() ;
		System.out.println("Harga Sapi : " + m.getHargaSapi() );
	}
	
	
	int getHargaSapi() {
	
		HargaTernak sp = new HargaTernak() ;
		harga_sapi = sp.getHargaSapi() ;
		
		return this.harga_sapi ;
	}

}
