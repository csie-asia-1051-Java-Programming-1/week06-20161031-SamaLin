package hw;

/*
 * Topic: 讓使用者輸入性別與身高，透過函數呼叫，依據男女不同, 幫她(他)計算並輸出其標準體重 ((1)男：(身高-170)*0.6+62 ,
 *         (2)女：(身高-158)*0.5+52)。函數算出結果後要回傳至主程式再印出結果。例如:輸入 1 170 則輸出 62.0,
 *          輸入 2 165 則輸出 55.5 
 * Date: 2016/10/31
 * Author: 105021058 蕭懋霖
 */

import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int type=scn.nextInt();
		float h=scn.nextInt();
		System.out.println(fun(h,type));
	}
	public static float fun(float h,int type) {
		float sum=0;
		switch(type){
		case 1:
			sum=(h-170f)*0.6f+62;
			break;
		case 2:
			sum=(h-158)*0.5f+52;
			break;
		}
		return sum;
	}

}

