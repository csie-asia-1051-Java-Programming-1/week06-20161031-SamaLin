package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021058 蕭懋霖
 */

import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		float m=scn.nextInt();
		float n=scn.nextInt();
		System.out.print(C(m)/C(n)*C(m-n));
	}
	public static float C(float v1)
	{
		float sum=1;
		for(float i=1;i<=v1;i++)
		{
			sum=sum*i;
		}
		return sum;
	}

}
