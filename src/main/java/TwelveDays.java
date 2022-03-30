class TwelveDays {
    //int[] verse={1,2,3,4,5,6,7,8,9,10,11,12};
    String[] songLines={"a Partridge in a Pear Tree.","two Turtle Doves, ","three French Hens, ","four Calling Birds, ",
    "five Gold Rings, ","six Geese-a-Laying, ","seven Swans-a-Swimming, ","eight Maids-a-Milking, ","nine Ladies Dancing, ",
    "ten Lords-a-Leaping, ","eleven Pipers Piping, ","twelve Drummers Drumming, "};
    String[] number={"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};

    String verse(int verseNumber) {
        String result="";
        result="On the "+number[verseNumber-1]+" day of Christmas my true love gave to me: ";
        if(verseNumber==1)
            result+="a Partridge in a Pear Tree.";
        else {
            for(int i=verseNumber-1;i>=1;i--){
                result+=songLines[i];
            }
            result+="and a Partridge in a Pear Tree.";
        }
        return result+"\n";
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String verses(int startVerse, int endVerse) {
        String result=verse(startVerse);
        for(int i=startVerse+1;i<=endVerse;i++){
            result+="\n"+verse(i);
        }
        return result;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
    
    String sing() {
        return verses(1,12);
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
