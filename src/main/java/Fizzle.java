/**
 * Created by anthonycapriotti on 3/27/17.
 */
import static java.lang.Character.getNumericValue;
public class Fizzle {

    public String fizzBuzz(String s){
        char[] digits = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < digits.length-1; i++){
            //accounts for zero otherwise would fall into the % 2== 0
            if (getNumericValue(digits[i]) != 0 && getNumericValue(digits[i+1]) != 0){
                //even sequential numbers build with stringbuilder
                if (getNumericValue(digits[i]) % 2 == 0 && getNumericValue(digits[i+1]) % 2 == 0){
                    sb.append(digits[i] + "*");
                //odd sequential numbers
                } else if (getNumericValue(digits[i]) % 2 != 0 && getNumericValue(digits[i+1]) % 2 != 0){
                    sb.append(digits[i] + "-");
                //returns zero's
                } else
                    sb.append(digits[i]);
            }else {
                sb.append(digits[i]);
            }
    }
    sb.append(digits[digits.length-1]);
    return sb.toString();
    }
}
