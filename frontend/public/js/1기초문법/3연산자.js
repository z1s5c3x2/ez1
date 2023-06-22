/**
 * 
 */
/*
console.log('문제1')
let kor = parseInt(prompt("국어 점수 입력"))
let math = parseInt(prompt("수학 점수 입력"))
let eng = parseInt(prompt("영어 점수 입력"))

let sum = kor+math+eng;
console.log( '총점:' + (sum) )
console.log('평균:'+(sum/3))

console.log('문제2')
let num1 = parseInt(prompt("반지름 입력"))
console.log('넓이:'+(num1*num1/3.14))


console.log('문제3')

num1 = parseFloat(prompt("실수1 입력"))
let num2 = prompt("실수2 입력")

console.log(((num2/num1)*100)+"%")



console.log(  Number(prompt("정수 입력 ")) %2 ==0 )
console.log(  Number(prompt("정수 입력 ")) %7 ==0 )
let getMoney=Number(prompt("돈 입력 "))
console.log(("십만원") + Math.floor(getMoney /100000) +("장") )
console.log(("만원") +  Math.floor((getMoney %100000)/10000)+("장") )
console.log(("천원") +  Math.floor((getMoney %10000)/1000)+("장") )
let strId = prompt("아이디")
let strPwd = prompt("비밀번호")

console.log(  strId=="admin" && strPwd=="1234" )

let num1=Number(prompt("정수"))
console.log(  num1%2!=0 && num1%7==0)
let html = '<h3>하이</h3>'
html += '<p>문단 추가</p>'
document.write(html)


let 나이 = 38
let 연령구간 = 나이<= 19 ? '청소년':'성인'

let num1 = Number(prompt('첫번째 정수 입력'))
let num2 = Number(prompt('두번째 정수 입력'))
console.log(num1>num2 ? num1:num2 )

num1 = Number(prompt('첫번째 정수 입력'))
num2 = Number(prompt('두번째 정수 입력'))
let num3 = Number(prompt('세번째 정수 입력'))

console.log(
	num1>num2 && num1 > num3 ? num1: num2>num3 ? num2:num3
						
)*/

//11
num1 = Number(prompt('첫번째 정수 입력'))
num2 = Number(prompt('두번째 정수 입력'))
num3 = Number(prompt('세번째 정수 입력'))

console.log(
	num1>num2 && num1>num3 ? num2>num3 ? num1.toString()+num2.toString()+num3.toString():num1.toString()+num3.toString()+num2.toString() :
	num2>num3 ? num1>num3 ?num2.toString()+num1.toString()+num3.toString():num2.toString()+num3.toString()+num1.toString() : num1>num2 ? num3.toString()+num1.toString()+num2.toString(): num3.toString()+num2.toString()+num1.toString()
)


/12
num1 = Number(prompt('p1 가위가 0 이고 바위가 1 이고 보가 2'))
num2 = Number(prompt('p2 가위가 0 이고 바위가 1 이고 보가 2'))

console.log(
	num1 == num2 ? '무승부' : 
	(num1 == 0 && num2== 2) || (num1 == 1 &&num2 ==0) || (num1 == 2 && num2==1) ? 'p1승리':'p2승리' 
	
)