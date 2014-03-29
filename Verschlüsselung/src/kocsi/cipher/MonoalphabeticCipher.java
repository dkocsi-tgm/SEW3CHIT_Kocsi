package kocsi.cipher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MonoalphabeticCipher implements Cipher {

	private String secretAlphabet;
	
	public MonoalphabeticCipher() {
		setSecretAlphabet("abcdefghijklmnopqrstuvwxyzäöüß");
	}
	
	public String getSecretAlphabet() {
		return secretAlphabet;
	}
	
	protected void setSecretAlphabet(String secretAlphabet) {
		this.secretAlphabet = secretAlphabet;
	}

	@Override
	public String encrypt(String text) {
		text = text.toLowerCase();
		char []saArray  = secretAlphabet.toCharArray();
		String alphabet="abcdefghijklmnopqrstuvwxyzäöüß";
		char [] aArray= alphabet.toCharArray();
		
		for (int i = 0; i < alphabet.length();i++){
			
		Pattern p = Pattern.compile(""+aArray[i]);
	    Matcher m1 = p.matcher(text); 
	    text = m1.replaceAll(""+saArray[i]);
	    
		}
		return text.toLowerCase();
	}

	@Override
	public String decrypt(String text) {
		text = text.toLowerCase();
		char []saArray  = secretAlphabet.toCharArray();
		String alphabet="abcdefghijklmnopqrstuvwxyzäöüß";
		char [] aArray= alphabet.toCharArray();
		
		for (int i = 0; i < alphabet.length();i++){
			
		Pattern p = Pattern.compile(""+aArray[i]);
	    Matcher m1 = p.matcher(text); 
	    text = m1.replaceAll(""+saArray[i]);
	    
		}
		return text.toLowerCase();
	}
	
}
