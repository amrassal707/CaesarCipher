package org.example;

public class CaesarCipher {
    private String alphabet;
    private String shiftedAlphabet="";

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    public String getshiftedAlphabet() {
        return shiftedAlphabet;
    }

    public void setshiftedAlphabet(String shiftedAlphabet) {
        this.shiftedAlphabet = shiftedAlphabet;
    }
    // function that encrypts data, if you want to decrypt just send the input as 26-key , 26 representing the alphabet count

    public String encrypt(String input) {
        StringBuilder stringBuilder= new StringBuilder(input.toUpperCase());
        for(int i =0 ; i<stringBuilder.length();i++) {
            char ch= stringBuilder.charAt(i);
            int index= alphabet.indexOf(ch);
            if(index != -1) {
                stringBuilder.setCharAt(i,shiftedAlphabet.charAt(index));
            }

        }

        return stringBuilder.toString();

    }


    public CaesarCipher(int key) {
        alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        shiftedAlphabet= this.alphabet.substring(key) + this.alphabet.substring(0,key);


    }


}
