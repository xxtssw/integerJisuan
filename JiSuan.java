package JiSuan;
import java.util.*;

public class JiSuan{
	
	void jia(int a,int b){	   
	    System.out.println("���Ϊ��"+(a+b));
	}

	void jian(int a,int b){
	   System.out.println("���Ϊ��"+(a-b));
	}

	void cheng(int a,int b){
		System.out.println("���Ϊ��"+(a*b));
	}

	void chu(int a,int b){
		System.out.println("���Ϊ��"+(a/b));
	}

     public static void main(String args[]){
    	 JiSuan c=new JiSuan();
    	 Scanner in=new Scanner(System.in);
    	 System.out.print("������һ������:");
    	 int a=in.nextInt();
    	 System.out.print("��������һ������:");
    	 int b=in.nextInt();
         System.out.println( "��ѡ��:0-�ӷ�  1-����  2-�˷� 3-����");
         int d=in.nextInt();
         
         switch(d){
               case 0: c.jia(a,b);break;
               case 1: c.jian(a,b);break;
               case 2: c.cheng(a,b);break;
               case 3: c.chu(a,b);break;
               default: System.out.println("�������");
         }
     }
}
