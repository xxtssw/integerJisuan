package JiSuan;
import java.util.*;

public class JiSuan{
	
	void jia(int a,int b){	   
	    System.out.println("结果为："+(a+b));
	}

	void jian(int a,int b){
	   System.out.println("结果为："+(a-b));
	}

	void cheng(int a,int b){
		System.out.println("结果为："+(a*b));
	}

	void chu(int a,int b){
		System.out.println("结果为："+(a/b));
	}

     public static void main(String args[]){
    	 JiSuan c=new JiSuan();
    	 Scanner in=new Scanner(System.in);
    	 System.out.print("请输入一个整数:");
    	 int a=in.nextInt();
    	 System.out.print("请再输入一个整数:");
    	 int b=in.nextInt();
         System.out.println( "请选择:0-加法  1-减法  2-乘法 3-除法");
         int d=in.nextInt();
         
         switch(d){
               case 0: c.jia(a,b);break;
               case 1: c.jian(a,b);break;
               case 2: c.cheng(a,b);break;
               case 3: c.chu(a,b);break;
               default: System.out.println("输入错误。");
         }
     }
}
