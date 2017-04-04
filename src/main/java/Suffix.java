/**
 * Created by anthonycapriotti on 3/27/17.
 */
public class Suffix {

    public String suffix(String str){
        StringBuilder stringBuilder = new StringBuilder();

        //splits word at commas
        String[] tempArray = str.split(", ");

        //assigns each word to individual char array to compare, counter for iteration
        char[] firstWord = tempArray[0].toCharArray();
        char[] secondWord = tempArray[1].toCharArray();

        //counter initially set for length-1 of the char array with each iteration incfreases
        int counter = 1;

        //while the characters at the end of each word are the same insert with sb and incerease the counter
        while (firstWord[firstWord.length - counter] == secondWord[secondWord.length - counter]){
            stringBuilder.insert(0, firstWord[firstWord.length - counter]);
            counter++;
        }




        //when they don't match
        if (stringBuilder.toString().equals("")){
            return "NULL";
        }

        return stringBuilder.toString();

    }
}
