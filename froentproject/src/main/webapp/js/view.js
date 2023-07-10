// 1. list.js 에서 클릭된 게시물 번호 호출 [ 세션 ]
let no = sessionStorage.getItem('no')
let boardList = JSON.parse(localStorage.getItem('boardList'))

// 2. 클릭된 게시물번호의 게시물 찾아서 출력
onView()
function onView(){
   // 식별자 : 인덱스, 게시물 번호= 인덱스 찾기
   // 1. 해당하는 게시물번호의 게시물찾기
   
   let title = document.querySelector('.title')
   let writedate = document.querySelector('.writedate')
   let content = document.querySelector('.content')
   
   
   for(let i=0; i<boardList.length; i++){
      let b = boardList[i]   // i번째 게시물을 꺼내기
      if(b.id == no){
         //만약에 i번째 게시물 번호와 클릭된 게시물 번호와 같으면
         console.log(b)
         
         title.innerHTML=b.title
         writedate.innerHTML=`작성자 : ${b.writer} 작성일 : ${b.date}`
         content.innerHTML=b.content
         
         break;
      }
   
   }
   
}
function onDelete()
{
	for(let i = 0 ; i<boardList.legth;i++)
	{
		if(no == boardList[i].id)
		{
			boardList.splice(i,1)
			localStorage.setItem('boarList',JSON.stringify( boardList))
			sessionStorage.removeItem('no')
			
			break
		}
	}
	location.href='list.jsp'
}

function onWrite()
{
	location.href='update.jsp'
}