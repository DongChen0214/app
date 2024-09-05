public class Logic {


     public static void main(String...args){
        int num=123;
        String text= "abc";
        if(num>90){
            System.out.println("A");
        }else if(num>80){
            System.out.println("B");
        }else if(num>70){
            System.out.println("C");
        }

     //switch 

     int[] arr = new int[3];
     int[] arr2 = new int[]{1,2,3};
     int arr3[] ={1,2,3};
     int[][] arr4 = {{}};
     int[][] arr5 = new int[1][2];
    
     for(int i=0; i<3;i++){
             System.out.println(i);
    }

    for(int i:arr){
        System.out.println(i);
    }
    
    for(int i=0;i<arr.length; i++){
        arr[i]= i;
    }

    for(int i : arr){
        System.out.println(i);
    }
    int j=0;
    while(j<9){
         System.out.println(j);
         j++;
         if(j<3){
            continue;
         }else if(j>5){
            break;
         }else{
            j++;
         }
    }

    do{
        System.out.println(j);
    }while(j<0);

    if(false)
        System.out.println("123");

    String test 1=j>123 ? "Y":"N";

     }
}
