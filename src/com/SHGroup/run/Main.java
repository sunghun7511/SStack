package com.SHGroup.run;

import java.util.Scanner;

import com.SHGroup.SStack.OverflowException;
import com.SHGroup.SStack.SStack;
import com.SHGroup.SStack.UnderflowException;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);							//입력을 받기 위한 스캐너
		SStack s = new SStack(10);										//스택 객체 선언
		for(int i; ;){
			if((i = sc.nextInt()) == 8888) break;						//i를 입력받고 만약 8888이면 종료
			else if(i == 9999){											//i가 9999이면 pop
				try{													//예외 처리를 위한 try
					System.out.println("[ Pop : " + s.pop() + " ]");	//pop하여 나온 값을 보여줌
				}catch(UnderflowException ex){							//만약 언더플로우 오류가 난다면
					System.out.println("Underflow!");					//Underflow! 출력
				}
				s.print();												//현재 스택 출력
			}else{
				try{
					System.out.println("[ Push : " + s.push(i) + " ]");	//pop와 똑같지만, push
				}catch(OverflowException ex){							//만약 오버플로우가 난다면
					System.out.println("Overflow!");					//Overflow! 출력
				}
				s.print();												//현재 스택 출력
			}
		}
		sc.close();														//스캐너 닫기.
	}
}
