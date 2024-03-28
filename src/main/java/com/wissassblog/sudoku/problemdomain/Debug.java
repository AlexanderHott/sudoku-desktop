package com.wissassblog.sudoku.problemdomain;

public class WordGames {
    private String myWord;

    public WordGames(String word) {
        myWord = word;
    }
    public WordGames() {
        myWord = "nothing to see here";
    }

    /*
    The setMyWord() method should allow the instance variable myWord
    to be updated to hold a new value.
    */
    public void setMyWord(String word) {
        myWord = word;
    }

    /*
    The replace() method should return the String result of replacing each
    instance of old in the instance variable myWord with new.
    The contents of the myWord should not be changed by this process.
    */
    public String replace(char old, char newChar) {
        String s = myWord;
        int len = s.length();
        for(int i=0;i<len;i++) {
            if(s.charAt(i) == old) {
                s = s.substring(0, i) + newChar + s.substring(i+1);
            }
        }
        return s;
    }

    /*
    The removeAll() method should return the String result of removing
    all copies of the parameter rem from the instance variable myWord.
    The contents of myWord should not be changed by this process.
    */
    public String removeAll(char rem) {
        String s = myWord;
        int len = s.length();
        for(int i=0;i<len;i++) {
            if (s.charAt(i).equals(rem)) {
                s = s.substring(0, i) + s.substring(i+1);
            }
        }
        return s;
    }

    /*
    The insert() method should return the String result of inserting the
    String new each time the char place is found in the instance variable myWord
    The contents of myWord should not be changed by this process.
    */
    public String insert(char place, String newStr) {
        String s = myWord;
        int len = s.length();
        for(int i=0;i<len;i++) {
            if(s.charAt(i) == place) {
                s = s.substring(0, i) + newStr + s.substring(i);
            }
        }
        return s;
    }

    /*
    The toString() method should return a String in the format
        "The word is _______"
    */
    public String toString() {
        return "The word is " + myWord;
    }

}
