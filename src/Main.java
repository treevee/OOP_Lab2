public class Main {
    public static void main(String[] args) {
        String string = "Вася";
        String string2 = "12345678";
        System.out.println(MixString(string,string2));
    }
    public static String MixString(String A, String B) {
        String mixed = "";
        int length = Math.min(A.length(), B.length());
        for (int i = 0; i < length; i++) {
            mixed = mixed + A.charAt(i) + B.charAt(i);
        }
        mixed = mixed + A.substring(length) + B.substring(length);
        return mixed;
    }

    public static void Separate(String string) {
        String[] words = string.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static int GetMaxBlockLength(String string){
        int length=1;
        int maxLength=1;
        char currentChar=string.charAt(0);
        for (int i=1; i<string.length(); i++){
            if(string.charAt(i-1)==string.charAt(i) && string.charAt(i)==currentChar){
                length++;
            }
            else{
                if(length>maxLength){
                    maxLength=length;
                }
                length=1;
                currentChar=string.charAt(i);
            }
        }
        return maxLength;
    }

    public static int GetSumOfStringDigits(String string){
        int sum=0;
        for (int i=0; i<string.length(); i++){
            if(IsDigit(string.substring(i,i+1))){
                sum+=Integer.parseInt(string.substring(i,i+1));
            }
        }
        return sum;
    }

    public static boolean IsDigit(String string) throws NumberFormatException {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean IsEndedWithEd(String string){
        return string.endsWith("ed");
    }



}