package hw;

/*
 * Topic: ���ϥΪ̿�J�ʧO�P�����A�z�L��ƩI�s�A�̾ڨk�k���P, ���o(�L)�p��ÿ�X��з��魫 ((1)�k�G(����-170)*0.6+62 ,
 *         (2)�k�G(����-158)*0.5+52)�C��ƺ�X���G��n�^�ǦܥD�{���A�L�X���G�C�Ҧp:��J 1 170 �h��X 62.0,
 *          ��J 2 165 �h��X 55.5 
 * Date: 2016/10/31
 * Author: 105021058 �����M
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

