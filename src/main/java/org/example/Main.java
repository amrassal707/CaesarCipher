package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int key1 =14;




        String sentenceToDecrypt= "Top ncmy qkff vi vguv vbg ycpx";
        String sentenceToEncrypt="Hello World";


        // if the word is already encrypted and we are looking to decrypt, 26 represent the letters in the alphabet
        CaesarCipher CCdecryption= new CaesarCipher(26 - key1);

        String decrypted=  CCdecryption.encrypt(sentenceToDecrypt);

        // if we are looking to encrypt the data we use
        CaesarCipher CCencryption= new CaesarCipher(key1);
        String encrypted = CCencryption.encrypt(sentenceToEncrypt);


        ///////////////////////////////////////////////////////////////////////////

        // the below code if for encrypting using two keys instead of one

        // by dividing the sentence into two sentences with odd indices as sentence and even indices as another sentence

        // then we create a caesar object for each sentence we have since we have so we make two

        // then we encrypt the first sentence and store in a string

        // then we dercypt to test and make sure it was encrypted properly

        // same for the second sentence

        // in the end we combine both sentences together



//        String firstKey ="";
//        String secondKey="";
//        for(int i =0 ; i< sentenceToEncrypt.length(); i++) {
//            if((i+1) % 2 !=0) {
//                firstKey= firstKey + sentenceToEncrypt.charAt(i);
//
//            }
//            else {
//                secondKey = secondKey+ sentenceToEncrypt.charAt(i);
//            }
//        }




//        String encryptKey1 =CCforFirstKey.encrypt(firstKey);
//
//        String decryptKey1= CCforFirstKey.encrypt(firstKey,26-key1);
//        CCforFirstKey = new CaesarCipher(26-key1);

        // method to decrypt
//        String decryptKey1= CCforFirstKey.encrypt(firstKey);


//        CCforFirstKey = new CaesarCipher(key2);
//
//        String encryptKey2 =CCforFirstKey.encrypt(secondKey);
//
//        CCforFirstKey = new CaesarCipher(26-key2);
//        // method to decrypt
//        String decryptKey2= CCforFirstKey.encrypt(secondKey);
//
//        System.out.println("Word encrypted with key 1 "+ encryptKey1);
//        System.out.println("Word encrypted with key 2 "+ encryptKey2);
//
//        String fullwordDecryption="";
//        int i;
//
//        if(decryptKey1.length() >= decryptKey2.length()) {
//            for ( i =0 ; i <decryptKey2.length() ; i++) {
//                if(decryptKey1.charAt(i)== ' ') {
//                    fullwordDecryption= fullwordDecryption + ' ' + decryptKey2.charAt(i);
//                }
//                else if(decryptKey2.charAt(i)== ' ') {
//                    fullwordDecryption= fullwordDecryption + decryptKey1.charAt(i) + ' ';
//                }
//                else {
//                    fullwordDecryption= fullwordDecryption + decryptKey1.charAt(i) +decryptKey2.charAt(i);
//                }
//            }
//            for (int k= i; i<decryptKey1.length(); i++) {
//                fullwordDecryption =fullwordDecryption + decryptKey1.charAt(k);
//            }
//        }
//        String fullwordEncryption="";
//        if(encryptKey1.length() >= encryptKey2.length()) {
//            for ( i =0 ; i <encryptKey2.length() ; i++) {
//                if(decryptKey1.charAt(i)== ' ') {
//                    fullwordEncryption= fullwordEncryption + ' ' + encryptKey2.charAt(i);
//                }
//                else if(decryptKey2.charAt(i)== ' ') {
//                    fullwordEncryption= fullwordEncryption + encryptKey1.charAt(i) + ' ';
//                }
//                else {
//                    fullwordEncryption= fullwordEncryption + encryptKey1.charAt(i) +encryptKey2.charAt(i);
//                }
//            }
//            for (int k= i; i<encryptKey1.length(); i++) {
//                fullwordEncryption =fullwordEncryption + encryptKey1.charAt(k);
//            }
//
//            System.out.println("Word after fullwordEncryption " + fullwordEncryption);
//        }
//
//
//        System.out.println("Word after decryption " + fullwordDecryption);





    }
}