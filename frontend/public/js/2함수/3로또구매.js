/**
 * 
 */
let numlist = []
 function GetLotto()
 {
	let btnHtml = `</br>`;

	for(let count = 1;count<=45;count++)
	{
		btnHtml+=`<button onclick="SelectNumber(${count})")))> ${count} </button>`
		if(count % 5 == 0)
		{
			btnHtml+=`<br/>`
		}
	}
	document.querySelector('.btnListView').innerHTML = btnHtml

	
	
 }
 
 function SelectNumber(num)
 {
	 if(numlist.length >5)
	 {
		 console.log("이미 6개 선택함")
		 return
	 }
	 if(numlist.indexOf(num) != -1)
	 {
		 console.log("중복선택")
		 return
	 }
	else{
		numlist.push(num)
		let asd = `${numlist}`
		document.querySelector('.SelectNumberView').innerHTML = asd
	}
	 
	 if(numlist.length ==6)
	 {
		 let asd = `<button onclick="ResultBtn()"> 번호 확인 </button>`
		 document.querySelector('.ResultView').innerHTML = asd
	 }
	 
 }
 
 function ResultBtn()
 {
	 let resultlist = []
	 for(let x=0;x<6;x++)
	 {
		 resultlist.push(Math.floor(Math.random()*45+1))
	 }
	 let count = 0
	
	 for(let x=0;x<6;x++)
	 {
		 if(resultlist[x] == numlist[x])
		 {
			 count++
		 }
	 }
	 alert(count+"개맞춤")
	 if(count ==0){console.log("탈락"); return}
	 
	 console.log(6-count+1+"등")
	 console.log("당첨번호"+resultlist)
	 console.log("선택번호"+numlist)
 }

 /*
 for let idx in array)
 {
	 print(idx)
 }
 for(let data of array)
 {
	 print(data)
 }
 
 array.foreach((data,idx)=>{
	 print(date)
	 print(idx)
 })
 */
 