package user;


//Press Ctrl + Shift + O for automaticall import
//https://www.mkyong.com/eclipse/how-to-import-class-automatically-in-eclipse/
import java.util.Scanner;

//https://www.youtube.com/watch?v=wQbEH4tVMJA
public class Scaninput {

	String nama ;
	int umur =40 ;

	public String main2() {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in) ;
		Scaninput input = new Scaninput() ;
		
		System.out.println("Ketik nama Anda:");
		String ss = sc.nextLine();
		System.out.println("Nama Anda: " + ss);
		
		System.out.println("Ketik umur Anda:");
		int a = sc.nextInt();
		System.out.println("Umur Anda: " + a);
		
		
		input.setUmur(a);
		
		return ss ;
	}

	void setNama(String var_nama)
	{
		nama = var_nama ;
	}
	
	void setUmur(int var_u)
	{
		umur = var_u ;
	}
	
	
	String getNama() {
		
		return nama ;
	}
	
	int getUmur() {
		
		return umur ;
	}
	
	
	
	// End of Class
}
