public class Convertor {

    public static Integer convertStringToInteger(String str) throws Exception {
        int integer = 0;
        for (int i=0 ; i<str.length() ; i++){

            if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != '-')
                throw new Exception("String was incorrect !!!");

            else integer += str.charAt(i);
        }

        if (integer > 32768 || integer < -32768)
            throw new Exception("Integer not valid !!!");

        else
            return integer;
    }

    public static boolean onlyNumber(String str){

        for (int i=0 ; i<str.length() ; i++){

            if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != '-')
                return false;
       }
        return true;
    }

    public static void main(String[] args) {
        try {
            System.out.println(convertStringToInteger("123"));
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}

