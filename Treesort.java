import java.util.*;
import java.security.SecureRandom;

public class Treesort{
  public static void main(String[] args){
    SecureRandom randomNumbers=new SecureRandom();
    var number=new TreeSet<>();
    int k=0;//要印出的順序
    System.out.println("電腦從1~100的亂數中，亂數取出10個不重複的號碼....");
    while(number.size()<10){
      int n=randomNumbers.nextInt(100)+1;
      boolean status=true;//辨認是否要重抽
      if(number.size()!=0){
        if(number.contains(n)){//是否以前抽到一樣的數字了
          status=false;
        }
      }
      if(status){
        System.out.println("第"+(k+1)+"個號碼："+n);
        k++; 
        number.add(n);
      }
    }
    System.out.println("物件內元素個數為："+number.size());
    System.out.println("物件內元素的內容："+number);
    System.out.println("第一個元素內容為："+number.first());
    System.out.println("最後一個元素內容："+number.last());
    System.out.println("內容介於30~70者："+number.subSet(30,70));
  }
}