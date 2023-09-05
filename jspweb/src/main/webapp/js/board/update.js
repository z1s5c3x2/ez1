/**
 * 
 */
getBoard()
 function getBoard()
 {
	 let bno = new URL(location.href).searchParams.get('bno')
	 $.ajax({
		 url:"/jspweb/BoardInfoController",
		 method:"get",
		 data:{type:2,bno:bno},
		 success:r=>{
			 document.querySelector('.bcno').value =`${r.bcno}`
			 document.querySelector('.btitle').value =`${r.btitle}`
			 document.querySelector('.bcontent').value =`${r.bcontent}`
			 document.querySelector('.oldfile').value =`${r.bfile}`
		 },
		 error:e=>{
			 
		 }
		 
	 })
 }
 function onUpdate()
 {
	 let bno = new URL(location.href).searchParams.get('bno')
	 let writeForm = document.querySelectorAll('.writeForm')[0]
	 let fd = new FormData(writeForm)
	 fd.set("bno",bno)
	 $.ajax({
		 url:"/jspweb/BoardInfoController",
		 method:"put",
		data :fd,
          contentType: false,
          processData: false,
		 success : r =>{
			 if(r) { 
				 alert('수정성공')
			 	location.href=`/jspweb/board/view.jsp?bno=${bno}`
			 }
			 else{alert('수정실패')}
		 },
		 error : e=>{console.log(e)}
		 
	 })
 }