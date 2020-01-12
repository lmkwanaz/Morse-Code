import java.util.*;

public class Morse {
    public static String lettersToMorseCode(String code){

        char[] morse_code =
                { 'a',
                'b', 'c',
                'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?' };

        String[] morse_code1 = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.."};
        String lower_str = code.toLowerCase();
        char[] changeit = lower_str.toCharArray();
        String newstr = "";
	int count = 0;

        if(code.length() != 0){
            for(int i=0; i<changeit.length;i++){
                for(int k=0; k<39; k++){
                    if(changeit[i] == morse_code[k]){
                        newstr += morse_code1[k] + " ";
			count++;
                    }else if(Character.isWhitespace(changeit[i])){
			newstr += "/ ";
			count++; 
			break;
		    }
                }
            }

	     assert count == code.length() : "this is totaly wrong in morseToCode";
            System.out.println(newstr);

        }else{
            System.out.println("this field shouldn't be empty");
        }
        return code;
    }


    public static String morseCodeToLetters(String code){

        char[] morse_code =
                { 'a', 'b', 'c',
                        'd', 'e', 'f',
                        'g', 'h', 'i',
                        'j', 'k', 'l',
                        'm', 'n', 'o',
                        'p', 'q', 'r', 's',
                        't', 'u', 'v',
                        'w', 'x', 'y', 'z',
                        '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                        ',', '.', '?' };

        String[] morse_code1 = { ".-", "-...", "-.-.",
                "-..", ".", "..-.",
                "--.", "....", "..",
                ".---", "-.-", ".-..",
                "--", "-.", "---",
                ".---.", "--.-", ".-.", "...",
                "-", "..-", "...-",
                ".--", "-..-", "-.--", "--..",
                ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----",
                "--..--", ".-.-.-", "..--.." };

        String[] changeit = code.split(" ");

        String  newstr = " ";
	int morse_code_count = 0;

        if(code.length() != 0){
            for(int i=0; i<changeit.length;i++){
                for(int k=0; k<39 ;k++){
                    if(changeit[i].equals(morse_code1[k])){
			morse_code_count++;
                        newstr += morse_code[k];
                    }else if(changeit[i].equals("/")){
			newstr += " ";
			morse_code_count++;
			break;
		    }
                }
            }
            
             assert morse_code_count == newstr.length() - 1 : "this is totaly wrong in morseToCode";
            System.out.println(newstr);

        }else{
            System.out.println("this field shouldn't  be empty");
        }

        return newstr;
    }


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("please write something");
        String input = scan.nextLine();
        //lettersToMorseCode(input);
        morseCodeToLetters(input);
    }
}
