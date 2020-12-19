public class Convertor {

    public static Integer convertStringToInteger(String str) throws Exception {

        if (!onlyNumber(str))
                throw new Exception("String was incorrect !!!");


        int integer = Integer.parseInt(str);


        if (integer > 32767 || integer < -32767)
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
}

