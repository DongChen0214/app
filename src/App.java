//package works;

//import static work.demo.demo1;
public class App {
    public static void main(String[] args)  {
     //int num = new Scanner(System.in).nextInt();
     String t= text("hello world")//链式编程
                          .concat(" ")
                          .concat("a")
                          .concat(" ")
                          .concat("b")
                          .replace("l", "x")
                          .substring(2, 8)
                          ;
                         
    //demo01;

     System.out.println(t);
    }
     private static String text(String a){
        System.err.println("text length:" + a.length());
        a.length();//string自带一个方法
        return a;
    }
}
