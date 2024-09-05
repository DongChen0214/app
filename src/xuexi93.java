public class xuexi93 {
  public static void main(String[] aStrings){
     int a=50;
     int b=12;
     int c=0;
System.out.println("---------------");
     c=a&b;
     System.out.println("a&b=" +c);
     c=a|b;
     System.out.println("a|b=" +c);
     c=a^b;
     System.out.println("a^b=" +c);
     c= ~a;
     System.out.println("~a=" +c);
System.out.println("---------------");
     boolean d=true;
     boolean e=false;
     System.out.println("d&&e="  +(d&&e) );
     System.out.println("d||e=" +(d||e));
     System.out.println("!(d&&e)="  +!(d&&e) );
System.out.println("---------------");
     int f , g;
     f=10;
     g=(f==1) ?20 : 30;
     System.out.println(" g =" +g);
     g=(f==10) ?20 : 30;
     System.out.println(" g =" +g);
System.out.println("---------------");
     int h=8;
     while ( h<15) {
        System.out.println("h = " +h);
        h++;
        System.out.println("\n"); //\n表示回车
     }

System.out.println("---------------");
     int i = 10;
 
      do{
         System.out.println(" i= : " + i );
         i++;
         System.out.println("\n");
      }while( i < 20 );

   for(int j = 10; j < 20; j = j+1) {
    System.out.print(" j= : " + j );
    System.out.print("\n");
    }
System.out.println("---------------");
    int [] numbers = { 21,22,23,24,25};

    for (int k : numbers){
        System.out.print(k);
        System.out.print(",");
    }
System.out.println("---------------");
    System.out.println("\n");
    String [] names={ "zhou" ,"wu" ,"zheng" ,"wang" ,"zhao"};
    for( String name:names){
        System.out.print(name);
        System.out.print(",");
    }
System.out.println("---------------");
    int [] numbers1 = { 5,15,25,35,45 } ;
      for(int x : numbers1 ) {
        
         if( x == 30 ) {
            break;
         }
         System.out.print( x );
         System.out.print("\n");
      }
System.out.println("---------------");
    int [] numbers2 = {10, 20, 30, 40, 50};
 
      for(int y : numbers2 ) {
         if( y == 30 ) {
        continue;
         }
         System.out.print( y );
         System.out.print("\n");
      }
System.out.println("---------------");
    int z=10;
    if(z<20){
        System.out.println("z<20");
    }
System.out.println("---------------");
    int x1=10;
    if(x1<5){
        System.out.println("x1<5");
    }else{
        System.out.println("x1>5");
    }
System.out.println("---------------");
    int X1=30;
    int Y1=20;
    if(X1==30){
        if(Y1==20){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
System.out.println("---------------");
    int x2=10;
    int y2=20;
    int z2=30;
    if(x2<y2){
        if(z2<y2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
System.out.println("---------------");
    int x3=10;
    while(x3>20){
        System.out.print("x3=" +x3);
        x3++;
        System.out.print("\n");
    }
System.out.println("---------------");

    int y3=10;

    do{
        System.out.print("y3=" +y3);
        y3++;
        System.out.print("\n");

    }while(y3>20);
System.out.println("---------------");
    
    int steak=7;
    switch(steak)
    {
        case 1:
        System.out.println("rare");
        break;
        case 3:
        System.out.println("medium rare");
        break;
        case 5:
        System.out.println("medium");
        break;
        case 7:
        System.out.println("medium well");
        break;
        case 10:
        System.out.println("well done");
        break;
        default:
        System.out.println("向上取数字");
    }
    System.out.println("牛排熟度=" +steak);
System.out.println("---------------");
  }

}







  

