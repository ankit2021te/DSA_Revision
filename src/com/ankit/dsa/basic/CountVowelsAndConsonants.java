package com.ankit.dsa.basic;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {

        String input = "Hello World123";
        int vowelsCount = 0;
        int consonantsCount = 0;
        int numberCount = 0;
        int extraCount = 0;
        CountVowelsAndConsonants vc = new CountVowelsAndConsonants();
        for(char c : input.toLowerCase().toCharArray()){
            if(vc.isVowel(c))
                vowelsCount++;
            else if(vc.isConsonants(c))
                consonantsCount++;
            else if(vc.isNumber(c))
                numberCount++;
            else
                extraCount++;
        }

        System.out.println("vowelsCount :"+vowelsCount);
        System.out.println("consonantsCount :"+consonantsCount);
        System.out.println("numberCount :"+numberCount);
        System.out.println("extraCount :"+extraCount);
    }

    private boolean isVowel(char c){
        return c=='a' ||c=='e'||c=='i'||c=='o'||c=='u';
    }

    private boolean isConsonants(char c){
        return Character.isLetter(c);
    }

    private boolean isNumber(char c){
        return Character.isDigit(c);
    }
}
