package ex;
/*
 * Topic: 使用者輸入一個大正整數值，請設計一個函數fun1(n)可以計算該大數字裡的數字總合。例如:輸入: 4832 則輸出 17
 * Date: 2016/10/31
 * Author: 105021058 蕭懋霖
 */

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String n =scn.next();
		fun1(n);
	}
	public static void fun1(String n){
		int sum=0;
		for(int i=0;i<n.length();i++)
		{
			sum=sum+((int)n.charAt(i))-48;
		}
		System.out.println(sum);
	}

}
