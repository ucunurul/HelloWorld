package PROB04;

import java.util.*;

public class hashmap {
	public static void main(String[] args) {
		HashMap<String,String> namaProduk = new HashMap<String, String>();
		namaProduk.put("KmZ04", "Samsung");
		namaProduk.put("KmZ02", "Nokia");
		namaProduk.put("KmZ05", "Motorolla");
		namaProduk.put("KmZ01", "Oppo");
		namaProduk.put("KmZ03", "Iphone");
		
		for(String produkID : namaProduk.keySet())
		{
			System.out.println("Key = " + produkID + "   Nama Produk = " + namaProduk.get(produkID));
		}
	
		System.out.println(namaProduk.entrySet());
		System.out.println(namaProduk.size());
		System.out.println(namaProduk.get("KmZ03"));
		System.out.println(namaProduk.containsKey("KmZ04"));
		System.out.println(namaProduk.containsValue("Sony"));
		TreeMap<String, String> produkBaruSort = new TreeMap<String, String> (namaProduk);
		
		for(String ProdukID : produkBaruSort.keySet()) {
			System.out.println("Key = " + ProdukID + " Nama Produk = " + namaProduk.get(ProdukID));
		}
		
	}
}
