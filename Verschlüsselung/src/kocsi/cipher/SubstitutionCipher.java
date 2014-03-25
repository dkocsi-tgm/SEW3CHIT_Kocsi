package kocsi.cipher;

public class SubstitutionCipher extends MonoalphabeticCipher {
	
	public SubstitutionCipher(String secretAlphabeticCode) {
		 super(secretAlphabeticCode);
         setSecretAlphabeticCipher(secretAlphabeticCode);
	}

	public void setSecretAlphabeticCipher(String secretAlphabeticCode) {
        secretAlphabeticCode = secretAlphabeticCode.toLowerCase();
        StringBuffer sb = new StringBuffer(secretAlphabeticCode);

        for (int z=0; z<sb.length(); z++) {
                char buchstabe = sb.charAt(z);
                for (int i=sb.length()-1; i>=0; i--) {
                        if (sb.charAt(i)==buchstabe && z!=i) {
                                sb.deleteCharAt(i);
                        }
                }
        }
        
        secretAlphabeticCode = "" + sb;
        for (int i=0; i<26; i++) {
                char buchstabe = (char) ('z' - i);
                boolean doppelt = false;
                for (int z=0; z<secretAlphabeticCode.length(); z++) {
                        if (secretAlphabeticCode.charAt(z) == buchstabe) {
                                doppelt = true;
                        }
                }
                if (doppelt == false) {
                        secretAlphabeticCode = secretAlphabeticCode + buchstabe;
                }
        }
        secretAlphabeticCode = secretAlphabeticCode.toUpperCase();
        setSecretAlphabet(secretAlphabeticCode);
	}
}
