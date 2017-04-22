package com.SHGroup.SStack;

public class SStack {
	private final int list[];							//스택 배열 변수
	private int sp = 0;									//스택 포인터 변수
	public SStack(int size){							//길이를 설정 가능한 스택 객체 생성자
		this.list = new int[size];						//스택(list)를 size 크기로 초기화
	}
	
	public int pop() throws UnderflowException{
		if(sp <= 0)										//sp가 0보다 같거나 작으면
			throw new UnderflowException();				//Underflow 예외를 발생시킴
		int i = list[sp];								//스택 포인터에 있는 값을 i에 저장
		list[sp--] = 0;									//스택 포인터에 있는 값을 0으로 설정하고, sp를 1 내림
		return i;										//i 를 반환함.
	}
	
	public int push(int data) throws OverflowException{
		if(sp >= list.length)							//sp가 list의 크기랑 같거나 크면
			throw new OverflowException();				//Overflow 예외를 발생시킴
		return list[sp++] = data;						//스택의 sp에 data를 넣고, sp를 1 증가시킴
	}
	
	public int getSize(){
		return sp;										//크기는 sp랑 같으므로 sp를 반환
	}
	
	public void print(){
		System.out.print("[");							//[을 출력
		for(int i = 0 ; i < getSize() ; i ++){			//스택의 크기만큼 i 반복
			System.out.print((i==0?"":", ") + list[i]);	//i번재 값을 출력
		}
		System.out.println("]");						//]을 출력
	}
}