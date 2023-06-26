/**
 * 
 */

 function 함수1(){console.log('함수1');}
 함수1()
 
 function 함수2(x,y)
 {
	 console.log(x+y)
 }
 
 함수2(3,5)
 함수2("콜라:",3)
 
 function 함수3(x,y)
 {
	 console.log(x+y)
	 return x+y
 }
 console.log(함수3(3,5))
 
 function 함수4(){return 3+8;}
 let 결과2= 함수4(); console.log("함수4 결과/리턴:"+결과2)
 
 function 함수5(){console.log('함수5실행시 함수1실행'); 함수1();}
 함수5()