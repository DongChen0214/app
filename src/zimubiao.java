public class zimubiao {
    public static void main(String[] args) {
    
    char letter = 'A';
        for (int i = 0; i < 26; i++) {
        System.out.println(letter);;
        letter++;
        }
            
        String zimubiao = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(zimubiao);

    int count=0;
    for (int i = 97; i < 123; i++){
        System.out.print((char)i+"\t");
        count++;
        if (count>=5){
            System.out.println();
            count = 0;
        }
    }


    int i = 5;
    switch(i){
       case 0:
          System.out.println("0");
       case 1:
          System.out.println("1");
       case 2:
          System.out.println("2");
       default:
          System.out.println("default");
    }

    int j = 1;
      switch(j){
         case 0:
            System.out.println("0");
         case 1:
            System.out.println("1");
         case 2:
            System.out.println("2");
         case 3:
            System.out.println("3"); break;
         default:
            System.out.println("default");
      }

      System.out.println("90 度的正弦值=" + Math.sin(Math.PI/2));
      System.out.println("60度的正弦值=" +Math.sin(Math.PI/3));  
      System.out.println("0度的余弦值=" + Math.cos(0));  
      System.out.println("60度的正切值=" + Math.tan(Math.PI/3));  
      System.out.println("1的反正切值=" + Math.atan(1));  
      System.out.println("π/2的角度值=" + Math.toDegrees(Math.PI/2));  
      System.out.println(Math.PI);    

   double[ ] nums ={ 1.3, 1.7, 1.5 ,-1.3, -1.5, -1.7};
   for (double num : nums){
      test(num);
   }

   System.out.println("访问\"abc!\"");

   char[] dcArray= {'r', 'u', 'n', 'o', 'o', 'b'};
   String dcString = new String(dcArray);
   System.out.println(dcString);

   String site= "abcdefghijklmn";
   int len = site.length();
   System.out.println("长度=" +len);

   String String1 = "1945/";
   System.out.println(String1 + "10/01" + "!");

   

}
   private static void test( double num){
      System.out.println("Math.floor("+num+")=" +Math.floor(num));
      System.out.println("Math.round("+num+")=" +Math.round(num));
      System.out.println("Math.ceil("+num+")=" +Math.ceil(num));
   }

        }


