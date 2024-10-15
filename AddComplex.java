public class AddComplex {
    public String addcomplex(String c1,String c2){
        int[] num=new int[4];
        int count=0;
        String temp1="";
        for(int i=0;i<c1.length();i++){
            if(c1.charAt(i)=='+' || c1.charAt(i)=='i'){
                num[count]=Integer.parseInt(temp1);
                temp1="";
                count++;
            }
            else{
                temp1=temp1+c1.charAt(i);
            }
        }
        for(int i=0;i<c2.length();i++){
            if(c2.charAt(i)=='+' || c2.charAt(i)=='i'){
                num[count]=Integer.parseInt(temp1);
                temp1="";
                count++;
            }
            else{
                temp1=temp1+c2.charAt(i);
            }
        }
        return (num[0]+num[2])+"+"+(num[1]+num[3])+"i";
    }
    public static void main(String[] args) {
        AddComplex a1=new AddComplex();
        System.out.println(a1.addcomplex("55+35i","45+50i"));
    }
}
