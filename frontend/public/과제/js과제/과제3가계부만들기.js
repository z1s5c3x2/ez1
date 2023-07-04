 let dateArray = []
 let itemArray = []
 let priceArray = []
 let isFix = false
 
 function ListAdd()
 {
	 let date = document.querySelector('.dateInput').value
	 let itme = document.querySelector(".itemInput").value
	 let price = document.querySelector('.priceInput').value
	 
	 if (date == "" ||itme=="" || price=="")
	 {
		 alert("필수사항 미입력")
		 return
	 }

	 dateArray.push(date)
	 itemArray.push(itme)
	 priceArray.push(Number(price))
	 document.querySelector('.priceInput').value = ""
	 document.querySelector(".itemInput").value = ""
	UpdateView()
 }
 
 function UpdateView()
 {
	 let strhead =`<th>날짜</th>
		<th>항목</th>
		<th>금액</th>
		<th>삭제</th>
		`
	let str1 =""
	for(let idx = 0;idx<dateArray.length;idx++)
	{
		str1 += `<tr>
		<td>${dateArray[idx]}</td><td>${itemArray[idx]}</td><td>${priceArray[idx]}</td>
		<td><button onclick="DeleteList(${idx})")> 삭제 </button></td>
		
		</tr>`
	}
	//<td><button onclick="UpdateList(${idx})")> 수정 </button></td>
	let result = 0
	for(let x = 0;x<priceArray.length;x++){
		result+=priceArray[x]
	}
	let strf = `<tr><td colspan="5" class='total'>총 합계 :${result.toLocaleString()}</td> </tr>`
	document.querySelector('.viewList').innerHTML = strhead+str1+strf
	
 }
  function FixUpdateView()
 {
	 let strhead =`<th>날짜</th>
		<th>항목</th>
		<th>금액</th>
		<th>삭제</th>
		<th>수정</th>`
	let str1 =""
	for(let idx = 0;idx<dateArray.length;idx++)
	{
		str1 += `<tr>
		<td>${dateArray[idx]}</td><td>${itemArray[idx]}</td><td>${priceArray[idx]}</td>
		<td><button onclick="DeleteList(${idx})")> 삭제 </button></td>
		<td><button onclick="UpdateList(${idx})")> 선택 </button></td>
		</tr>`
	}
	let result = 0
	for(let x = 0;x<priceArray.length;x++){
		result+=priceArray[x]
	}
	let strf = `<tr><td colspan="5" class='total'>총 합계 :${result.toLocaleString()}</td> </tr>`
	document.querySelector('.viewList').innerHTML = strhead+str1+strf
	
 }
function UpdateList(idx)
{
	
	let date = document.querySelector('.dateInput').value
	let itme_1 = document.querySelector(".itemInput").value
	let price = document.querySelector('.priceInput').value
	if (date == "" ||itme_1=="" || price=="")
	{
		alert("필수사항 미입력")
		return
	}
	dateArray.splice(idx,1,date)
	priceArray.splice(idx,1,Number(price))
	itemArray.splice(idx,1,itme_1)
	UpdateView()
	document.querySelector('.priceInput').value = ""
	document.querySelector(".itemInput").value = ""
	
	
}
function DeleteList(idx)
{
	dateArray.splice(idx,1)
	priceArray.splice(idx,1)
	itemArray.splice(idx,1)
	UpdateView()
}