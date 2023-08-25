/**
 * 
 */
console.log('?')

function 예제1()
{
	
	$.ajax({
		url : "../test6",
		data:{'key1':'val1'},
		method:"get",
		success: result => {console.log(result)}
	})
	
}

function 예제2()
{
	
	$.ajax({
		url : "../test7",
		data:{'name':document.querySelector(".name").value,
				'age':document.querySelector(".age").value},
		method:"get",
		success: result => {console.log(result)}
	})
	
}