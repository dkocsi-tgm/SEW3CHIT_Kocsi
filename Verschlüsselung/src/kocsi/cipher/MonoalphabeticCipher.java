package kocsi.cipher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MonoalphabeticCipher implements Cipher {

	private String secretAlphabet;
	
	public MonoalphabeticCipher() {
		setSecretAlphabet("abcdefghijklmnopqrstuvwxyzäöüß"); //setzen des geheimen alphabets = das normale alphabet
	}
	
	public String getSecretAlphabet() { //getter methode für secret alphabet
		return secretAlphabet; 
	}
	
	protected void setSecretAlphabet(String secretAlphabet) { //setter methode für secret alhabet, jedoch ist diese protected
		this.secretAlphabet = secretAlphabet;
	}

	@Override
	public String encrypt(String text) {
		text = text.toLowerCase(); //den einkommenden text so setzen, dass nur kleinbuchstaben vorkommen, da das secret alphabet auch nur kleinbuchstaben enthält
		char []saArray  = secretAlphabet.toCharArray(); //das secretAlphabet zu einem char Array umwandeln um auf jedes element einzeln zugreifen zu können
		String alphabet="abcdefghijklmnopqrstuvwxyzäöüß"; //das alphabet
		char [] aArray= alphabet.toCharArray(); //wird ebenfalls in einen char array umgewandelt um auf die elemente zugreifen zu können
		
		/*Schleife zum absuchen des Schüssels und verschlüsseln, mithilfe von Regex, sprich pattern matcher und replace*/
		for (int i = 0; i < alphabet.length();i++){ 
			
		Pattern p = Pattern.compile(""+aArray[i]);
	    Matcher m1 = p.matcher(text); 
	    text = m1.replaceAll(""+saArray[i]);
	    
		}
		return text.toLowerCase(); //rückgabe des textes wieder nur in kleinbuchstaben 
	}

	@Override
	public String decrypt(String text) {
		text = text.toLowerCase();
		char []saArray  = secretAlphabet.toCharArray();
		String alphabet="abcdefghijklmnopqrstuvwxyzäöüß";
		char [] aArray= alphabet.toCharArray();
		
		for (int i = 0; i < alphabet.length();i++){
		/*Schfeife zum entschlüsseln des schlüssels */	
		Pattern p = Pattern.compile(""+saArray[i]);
	    Matcher m1 = p.matcher(text); 
	    text = m1.replaceAll(""+aArray[i]);
	    
		}
		return text.toLowerCase();
	}
	
}
