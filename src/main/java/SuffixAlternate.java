/**
 * Created by anthonycapriotti on 3/27/17.
 */
public class SuffixAlternate {

    public String suffixToo(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        String[] tempArray = string.split(", ");
        int counter = 1;

        while (tempArray[0].charAt(tempArray[0].length()-counter) == tempArray[1].charAt(tempArray[1].length()-counter)){
            stringBuilder.insert(0, tempArray[0].charAt(tempArray.length -counter));
            counter++;
        }

        if (stringBuilder.toString().equals("")){
            return "NULL";
        }

        return stringBuilder.toString();

    }
}
