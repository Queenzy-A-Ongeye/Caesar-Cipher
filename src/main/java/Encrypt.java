public class Encrypt{
    private String plainText;
    private int Shift;

    public String getPlainText(){
        return plainText;
    }
    public int getShift(){
        return Shift;
    }

    public Encrypt(String plainText, int Shift) {
        if(Shift>26){
            Shift  = Shift%26;
        }else if (Shift<0) {
            Shift = (Shift % 26) + 26;
        }
    }
    String outputText= "";
    int length = plainText.length();
    for (int i = 0; i< length; i++){
        char ch = plainText.charAt(i);
        if (Character.isLetter(ch)){
            if (Character.isLowerCase(ch)){
                char cc = (char)(ch+Shift);
                if (cc > 'z'){
                    outputText += (char) (cc-(26 - Shift));
                }
                else {
                    outputText += cc;
                }
            }
            else if (Character.isUpperCase(ch)){
                char cc = (char)(ch+Shift);
                if (cc > 'Z'){
                    outputText += (char) (cc-(26 - Shift));
                }
                else {
                    outputText += cc;
                }
            }

        }
        else {
            outputText += ch;
        }
//        String outputText1 = outputText;
        return outputText;
    }

    private class length {
    }
}