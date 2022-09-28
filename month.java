import java.util.*;

public class month{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    var hmap=new HashMap<>();
    hmap.put("1","January");//key ,value
    hmap.put("2","February");
    hmap.put("3","March");
    hmap.put("4","April");
    hmap.put("5","May");
    hmap.put("6","June");
    hmap.put("7","July");
    hmap.put("8","August");
    hmap.put("9","September");
    hmap.put("10","October");
    hmap.put("11","November");
    hmap.put("12","December");
    /*var hmap2=Map.of("1","January","2","February","3","March","4","April","5","May","6","June","7","July","8","August","9","September","10","October","11","November");*/
    
    System.out.print("請輸入1~12?");
    int n=sc.nextInt();
    if(n<1 || n>12){
      System.out.println("範圍錯誤!");
    }else{
      String s=Integer.toString(n);
      System.out.println(hmap.get(s));
    }
  }
}