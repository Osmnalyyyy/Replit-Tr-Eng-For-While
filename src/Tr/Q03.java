package Tr;

public class Q03 {
    public static void main(String[] args) {
        //Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        //
        //Input :
        //
        //String str=“Javaisalsoeasy”
        //
        //Output: a s
        String str="Javaisalsoeasy";
        String bos="";
        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.substring(i,i+1))!=str.lastIndexOf(str.substring(i,i+1))){
               if (!bos.contains(str.substring(i,i+1))) {
                   bos += str.substring(i, i + 1)+" ";
               }
            }
        }
        System.out.println("Tekrarlanan karakterler : "+bos);
    }
}
