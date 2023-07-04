/**
 * 
 */
let boardList = []
 function BoarderAdd()
 {
	 if(document.querySelector(".title").value ==""||
	 document.querySelector(".content").value == "" ||
	 document.querySelector(".id").value == "" ||
	 document.querySelector(".pwd").value == "")
	 {
		 alert("필수사항 미기재")
		 return
	 }
	 let s = new Date().getFullYear().toString() +"년" + 
	 new Date().getMonth().toString() +"월" +
	  new Date().getDay().toString() +"일" + 
	  new Date().getHours().toString() +":"+
	  new Date().getMinutes().toString() +":"+
	  new Date().getSeconds().toString()

	 let tmp = {
		 idx : boardList.length +1,
		 title:document.querySelector(".title").value,
		 content :document.querySelector(".content").value,
		 id : document.querySelector(".id").value,
		 pwd : document.querySelector(".pwd").value,
		 cd :s,
		 viewCount:0
	 }
	 boardList.push(tmp)
	 
	 document.querySelector(".title").value =""
	 document.querySelector(".content").value = "" 
	 document.querySelector(".id").value = "" 
	 document.querySelector(".pwd").value = ""
	 ViewUpdate()
 }
 

 function ViewBoardInfo(gIdx)
 {
	 gIdx -= 1
	 boardList[gIdx].viewCount +=1
	 document.querySelector('.boardInfo').innerHTML=`
	 <h3> 글 보기 페이지</h3>
	 	번호 : ${boardList[gIdx].idx} <br/>
    	제목 : ${boardList[gIdx].title} <br/>
    	내용 : ${boardList[gIdx].content} <br/>
    	작성자 : ${boardList[gIdx].id}<br/>
    	<button onclick="DeleteBoard(${gIdx})"> 삭제 </button>`
    	
	 ViewUpdate()
 }

 function DeleteBoard(gidx)
 {
	 
	 console.log(gidx)
	 if(document.querySelector(".id").value == "" && document.querySelector(".pwd").value =="")
	 {
		 alert("아이디와 비밀번호 미기재")
		 return
	 }
	 if(document.querySelector(".id").value == boardList[gidx].id &&
	    document.querySelector(".pwd").value == boardList[gidx].pwd)
	 {
		boardList.splice(gidx,1)
	 	ViewUpdate()		 
	 	 document.querySelector('.boardInfo').innerHTML=`
	 <h3> 글 보기 페이지</h3>`
	 }
	 else
	 {
		 alert("본인글 아님")
	 }
	 
	 
 }
 function ViewUpdate()
 {
	 let tbh = `<th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회수</th>`
	 for(let item of boardList)
	{
		
		tbh+=`<tr>
	    <td> ${item.idx} </td>
	    <td onclick="ViewBoardInfo(${item.idx})"> ${item.title} </td>
	    <td> ${item.id} </td>
	    <td> ${item.cd} </td>
	    <td> ${item.viewCount} </td>
		</tr>`
	}
	document.querySelector('.boardview').innerHTML =tbh
 }