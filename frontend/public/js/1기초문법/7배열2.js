/**
 * 
 */

let 배열목록 = []
let 배열목록2 = []
 function add()
 {
	 let _asd = document.querySelector('.content')
	 배열목록.push(_asd.value)
	 
	 let _id = document.querySelector('.writer')
	 배열목록2.push(_id.value)
	 
	 let contentTable = document.querySelector(".contentTable")
	 console.log(contentTable)
	 
	 let tableHTML = `<tr><th>내용</th><th>작성자</th></tr>`
	 console.log(tableHTML)
	 //tableHTML +='<tr><td></td><td>b</td><td>c</td></tr>'
	 
	 
	 for(let i =0;i<배열목록.length;i++)
	 {
		 tableHTML += `<tr><td>${배열목록[i]}</td><td>${배열목록2[i]}</td></tr>`
	 }
	 
	 contentTable.innerHTML = tableHTML
 }
 
