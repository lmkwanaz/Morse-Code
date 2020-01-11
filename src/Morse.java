import java.util.*;

public class Morse {
    public static String lettersToMorseCode(String code){

        char[] morse_code =
                { 'a',
                'b', 'c',
                'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?', ' ' };

        String[] morse_code1 = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--..", " "};
        String lower_str = code.toLowerCase();
        char[] changeit = lower_str.toCharArray();
        String newstr = "";

        if(code.length() != 0){
            for(int i=0; i<changeit.length;i++){
                for(int k=0; k<39; k++){
                    if(changeit[i] == morse_code[k]){
                        newstr += morse_code1[k] + " ";
                    }else if(Character.isWhitespace(changeit[i])){
			newstr += "/ ";
			break;
		    }
                }
            }

            System.out.println(newstr);

            //assert newstr == lower_str : "this is wrong";
            ///System.out.println("this is right");

        }else{
            System.out.println("can you please put something");
        }
        return newstr;
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

        if(code.length() != 0){
            for(int i=0; i<changeit.length;i++){
                for(int k=0; k<39 ;k++){
                    if(changeit[i].equals(morse_code1[k])){

                        newstr += morse_code[k];
                    }else if(changeit[i].equals("/")){
			newstr += " ";
			break;
		    }
                }
            }
            System.out.println(newstr);
            //System.out.println(newstr);
         //   assert newstr == code : "this is wrong1";
           // System.out.println("this is right1");
        }else{
            System.out.println("can you please put something1");
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
