/**
 * 
 */

 		$(document).ready(function() {
			  $('#summernote').summernote({
				  lang:'ko-KR',
				  height : 500,
				  placeholder:'여기에작성내용'
			  });
			});


function submitPost()
{
	let boardList = JSON.parse(localStorage.getItem('boardList'))
	
	if(boardList == null)
	{
		boardList = []		
	}
	
	board = 
		{
			title : document.querySelector(".title").value,
			content : $('#summernote').summernote('code'),
			id : boardList.length +1,
			date : `${new Date().getFullYear()} - ${new Date().getMonth()+1} - ${new Date().getDate()}`,
			view : 0,
			like : 0,
			writer: "asd"	
		}

	boardList.push(board)
	localStorage.setItem('boardList', JSON.stringify(boardList))
	location.href = "list.jsp"
}
function viewPost()
{
	location.href = "list.jsp"
}

