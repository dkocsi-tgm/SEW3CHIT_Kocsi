package kocsi.cipher;

import javax.swing.JOptionPane;

public class Test {
        public static void main (String [] args) {
                String wort = "ISYVKJRUXEDZQMCTPLOFNBWGAH";
                SubstitutionCipher kc = new SubstitutionCipher(wort);
                System.out.println(kc.getSecretAlphabet());
                wort = "Test";
                System.out.println(kc.encrypt(wort));
                wort = "FKOF";	// = test encr
                System.out.println(kc.decrypt(wort));
        }
}