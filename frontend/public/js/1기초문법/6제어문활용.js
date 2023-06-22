/**
 * 
 */

/*
let num1 = Number(prompt())
let num2 = Number(prompt())
if(num1 > num2)
{
	console.log(num1)
}
else
{
	console.log(num2)
}

num1 = Number(prompt())
num2 = Number(prompt())
let num3 = Number(prompt())
if(num1 > num2 && num1 >num3)
{
	console.log(num1)
}
else if(num2 > num1 && num2 >num3)
{
	console.log(num2)
}
else
{
	console.log(num3)	
}


num1 = Number(prompt())
num2 = Number(prompt())
num3 = Number(prompt())
let num4 = Number(prompt())
let answer = num1
if(answer < num2){answer = num2}
if(answer < num3){answer = num3}
if(answer < num4){answer = num4}
console.log(answer)*/

let numlist = [Number(prompt()),Number(prompt()),Number(prompt())]
let result = 2
let answerList = [] 

if(numlist[0] < numlist[1]){result --}
if(numlist[0] < numlist[2]){result --}
answerList[result] = numlist[0]
result = 2

if(numlist[1] < numlist[0]){result --}
if(numlist[1] < numlist[2]){result --}
answerList[result] = numlist[1]
result = 2

if(numlist[2] < numlist[1]){result --}
if(numlist[2] < numlist[0]){result --}
answerList[result] = numlist[2]
result = 2
console.log(answerList)


numlist = [Number(prompt()),Number(prompt()),Number(prompt()),Number(prompt())]
result = 3
answerList = [] 
	 
if(numlist[0] < numlist[1]){result --}
if(numlist[0] < numlist[2]){result --}
if(numlist[0] < numlist[3]){result --}
answerList[result] = numlist[0]
result = 3

if(numlist[1] < numlist[0]){result --}
if(numlist[1] < numlist[2]){result --}
if(numlist[1] < numlist[3]){result --}
answerList[result] = numlist[1]
result = 3

if(numlist[2] < numlist[1]){result --}
if(numlist[2] < numlist[0]){result --}
if(numlist[2] < numlist[3]){result --}
answerList[result] = numlist[2]
result = 3

if(numlist[3] < numlist[1]){result --}
if(numlist[3] < numlist[2]){result --}
if(numlist[3] < numlist[0]){result --}
answerList[result] = numlist[3]
result = 3

console.log(answerList)

let score = Number(prompt())
if(score>=90){ console.log("합격")}
else{console.log("탈락")}


score = Number(prompt())
if(score>=90){console.log("A")}
else if(score>=80){console.log("B")}
else if(score>=70){console.log("C")}
else {console.log("재시험")}
if(prompt()=="admin" && prompt()=="1234")
{
	console.log("로그인")
}
else
{
	console.log("실패")	
}

/* 

       문제 8 : 아이디와 비밀번호 입력받기 
             회원아이디가 admin 이고 비밀번호가 1234 이면 로그인 성공 출력 
                                     아니면 로그인실패 출력*/