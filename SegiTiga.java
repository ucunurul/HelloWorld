package Inheritance;

public class SegiTiga extends BangunDatar {
	
	public float luas() {
		float luas = (alas*tinggi)/2;
		System.out.println("Luas SegiTiga = "+luas);
		return luas;
	}
	
	public float keliling() {
		float keliling = sisi+sisi+sisi;
		System.out.println("Keliling SegiTiga = "+keliling);
		return keliling;
	}

	public static void main(String[] args) {
		BangunDatar hasil = new SegiTiga();
		hasil.alas = 2;
		hasil.tinggi =3;
		hasil.sisi = 2;
		
		hasil.luas();
		hasil.keliling();

	}

}
