/**
 * 
 */


let 학생리스트=[]

function test1()
{

	let w = document.querySelector(".sname").value
	
	학생리스트.indexOf(w) == -1 ? 학생리스트.push(w) : alert('중복') 
	
	
	let sU = document.querySelector(".slist")
	sU.innerHTML ='<li>'+학생리스트+'</li>'
	

	
	document.querySelector(".sname").value = ""
	
}

function test2()
{
	let _get = document.querySelector(".sname").value
	if(학생리스트.indexOf(_get) == -1){return;}
	학생리스트.splice(학생리스트.indexOf(_get),1)
	
	let sU = document.querySelector(".slist")
	sU.innerHTML ='<li>'+학생리스트+'</li>'
	document.querySelector(".sname").value = ""
	
}

