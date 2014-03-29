package kocsi.cipher;

public class SubstitutionCipher extends MonoalphabeticCipher {
	
	public SubstitutionCipher(String secretAlphabet) {
		super();
		if(secretAlphabet.toCharArray().length==30)setSecretAlphabet(secretAlphabet);
			else System.out.print("Fehler: Falscher/zu kurzer Schlüssel \n");
	}
		
	public void setSecretAlphabeticCipher(String secretAlphabet) {
		super.setSecretAlphabet(secretAlphabet);    
	}
}
