/**
 * 
 */
console.log("asd")


function 예제1()
{
	console.log("버튼1")
	$.ajax({
		url : "https://jsonplaceholder.typicode.com/posts",
		method : "get",
		success:function(result){
		console.log(result)
		
		}
	})
}

function 예제2()
{
	console.log("버튼2")
	$.ajax({
		url : "../Test1",
		method:"get",
		success:(result)=>{console.log("?dfg")}
	})
	
}
function 사이클테스트()
{
	$.ajax({
	url:"../tmpTest",
	success:(result)=>{console.log("?")}
	})
}
