package kocsi.test;

import org.junit.Test;

public class TestklasseTest {

	@Test
	public void test() {

		kocsi.cipher.MonoalphabeticCipher test1=new kocsi.cipher.MonoalphabeticCipher();
		System.out.println(test1.encrypt("HeLlO Test")); //verschl�sselung mit dem normalen alphabet
		System.out.println(test1.decrypt("hello world")); // --> als ergebnis kommt die selbe eingabe wie ausgabe weil die buchstaben mit den genau gleichen wieder ersetzt werden
		
		kocsi.cipher.SubstitutionCipher test2=new kocsi.cipher.SubstitutionCipher("ABCDEFGHIJKLMNOPQRSTUVWXYZ���s");
		System.out.println(test2.encrypt("Hello World")); //keine ver�nderung im ergebnis da alles zu lowercase() gesetzt ist
		System.out.println(test2.decrypt("HELLO WORLD"));
		
		kocsi.cipher.SubstitutionCipher test3=new kocsi.cipher.SubstitutionCipher("mnbvcxy��lkjhgfdsa�poiuztrewqs");
		System.out.println(test3.encrypt("hello world")); //verschl�sseln dieses textes mit dem ^ hier eingegebenen secret alphabet
		System.out.println(test3.decrypt("kxlnv lkxnv")); //entschl�sseln mit dem selben schl�ssen
	}

}
