/**
 * 
 *///11
let num1 = Number(prompt('첫번째 정수 입력'))
let num2 = Number(prompt('두번째 정수 입력'))
let num3 = Number(prompt('세번째 정수 입력'))

console.log(
	num1>num2 && num1>num3 ? num2>num3 ? num1.toString()+num2.toString()+num3.toString():num1.toString()+num3.toString()+num2.toString() :
	num2>num3 ? num1>num3 ?num2.toString()+num1.toString()+num3.toString():num2.toString()+num3.toString()+num1.toString() : num1>num2 ? num3.toString()+num1.toString()+num2.toString(): num3.toString()+num2.toString()+num1.toString()
)
/**
 * 
 *///11


num1 = Number(prompt('p1 가위가 0 이고 바위가 1 이고 보가 2'))
num2 = Number(prompt('p2 가위가 0 이고 바위가 1 이고 보가 2'))

console.log(
	num1 == num2 ? '무승부' : 
	(num1 == 0 && num2== 2) || (num1 == 1 &&num2 ==0) || (num1 == 2 && num2==1) ? 'p1승리':'p2승리' 
	
)