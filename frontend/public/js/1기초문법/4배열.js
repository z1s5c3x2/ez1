//예제1 : 배열선언
let 배열명 = [ '바나나', '사과', '딸기', '포도' ]
//예제2 : 배열 호출
console.log(배열명)
document.write(배열명)
//예제3 : 인덱스 사용
console.log( 배열명[0] )
document.write( '<h3> 과일개수 : '+배열명.length+'<h3>' )
document.write( '<ol>' )
document.write( '<li>'+배열명[0]+'</li>' )
document.write( '<li>'+배열명[1]+'</li>' )
document.write( '<li>'+배열명[2]+'</li>' )
document.write( '<li>'+배열명[3]+'</li>' )
document.write( '</ol>' )

배열명.splice(1,0,'파인애플')
console.log(배열명)

let 오늘출금할돈                   //변수
const 매일잃어도되는돈= 300000        //상수
let 강원랜드출금내역 = [12343530,4435243560,233324560] //배열

오늘출금할돈 = 5000000 + 매일잃어도되는돈

console.log(강원랜드출금내역)
console.log(오늘출금할돈)





