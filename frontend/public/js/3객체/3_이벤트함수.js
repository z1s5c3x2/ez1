/**
 * 
 */

console.log(document.querySelectorAll('div')[2].innerHTML+="32423") //return array

console.log(document)

//html이 열렸을때
document.addEventListener('DOMContentLoaded',()=>{
	console.log(" 실행1")
})
//해당 객체가 호출되었을때
window.onload = ()=>{
	console.log("이벤트 실행2");
}
//스크립트가 열렸을때
console.log("실행 3")

let p = document.querySelector('p'); console.log(p);
p.addEventListener('click',()=>{
	console.log("클릭")
})