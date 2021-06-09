public class TestNotRepeatChar {

    //
    public static void main(String[] args) {
        String a = String.valueOf('a');
        System.out.println(a.length());

        System.out.println(maxStr("abccddefgge"));



    }


    //最大不重复子串
    public static String maxStr(String str){
        String nowStr = "";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            String schar = String.valueOf(str.charAt(i));
            if(!nowStr.contains(schar)){
                nowStr += schar;
                if(nowStr.length() > newStr.length()){
                    newStr = nowStr;
                }
            }else{
                nowStr = "";
                nowStr += schar;
            }
        }

        return newStr;
    }
}
