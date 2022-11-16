public class Code1 {
    public static void main(String[] args) {
    Code1 obj=new Code1();
    obj.reverse1();
    obj.reverse2();
    System.out.println(obj.reverse3(obj.str));
    obj.reverse4();
        
    }
    String str = "Dhaanish  College Of Engineering";
    public void reverse1() {
        char[] strArray = str.toCharArray();
        for (int i = strArray.length - 1; i >= 0; i--)  {
            System.out.print(strArray[i]);
        }
    }
    public void reverse2() {
        for (int i = str.length()- 1; i >= 0; i--){
            System.out.print(str.substring(i,i+1));}
    }
    public String reverse3(String str) {
        if ((null == str) || (str.length() <= 1)){
            return str;}
        return reverse3(str.substring(1)) + str.charAt(0);  
    }
    public void reverse4() {
        StringBuffer sbf = new StringBuffer(str);
        System.out.println(sbf.reverse());
    }
}