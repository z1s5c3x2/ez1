/**
 * 
 */

 let boardList = JSON.parse(localStorage.getItem('boardList'))
 


 function boardPrint()
 {if(boardList.length > 0)
 {
 	let postarea = document.querySelector('.postarea')
 	boardList.reverse()
 
 
 
 	for(item of boardList)
 	{
		 postarea.innerHTML+=`<tr>
                   	<td>${item.id}</td><td onclick="selectBoard(${item.id})">${item.title}</td><td>${item.writer}</td><td>${item.date}</td><td>${item.view}</td><td>${item.like}</td>
               	</tr>`
 	}
 }}
  boardPrint()
 
 function selectBoard(_gid)
 {
	 sessionStorage.setItem('no',_gid)
	 location.href="view.jsp"
	  for(let i=0; i<boardList.length; i++){
      let b = boardList[i]   // i번째 게시물을 꺼내기
      if(b.id == _gid){
         //만약에 i번째 게시물 번호와 클릭된 게시물 번호와 같으면
         console.log(b)

         
         boardList[i].view += 1
         localStorage.setItem('boardList', JSON.stringify(boardList))
         break;
      }
   
   }
 }
 
 