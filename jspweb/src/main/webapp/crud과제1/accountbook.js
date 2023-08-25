/**
 * 
 */
let viewBoxInit = `<div class="boxtop"><span>항목</span> <span> 금액</span> <span> 날짜</span></div>`

 
 function bookinput()
 {
	 let info = {
		 'text': document.querySelector('.txt').value,
		 'price': document.querySelector('.price').value,
		 'inputdate': document.querySelector('.inputdate').value,
	 }
	 
	   $.ajax({
      url : "../Accountbook",
      method : "post",
      data : info ,
      success : function f(r){
		  console.log(r)
	  } ,
      error : function f(r){
		  console.log(r)
	  }
   })
   loadbook()
 }
 loadbook()
 function loadbook()
 {
	 
	 let sav = document.querySelector('.viewbox')
	 	 sav.innerHTML =viewBoxInit
	    $.ajax({
      url : "../Accountbook",
      method : "get",
      success : function f(r){
		  for(i =0;i<r.length;i++)
		  {
			  sav.innerHTML += `<div class="boxcon"><span> ${r[i].atext}  </span> <span> ${r[i].anumber}</span> <span> ${ r[i].adate }</span> 
		<button onclick="bookupdate(${r[i].ano}  )" type="button"> 수정 </button>
		<button onclick="bookdelete(${r[i].ano}  )" type="button"> 삭제 </button>
		</div>`
			  
		  }
	  } ,
      error : function f(r){}
   })

 }
 /*
    $.ajax({
      url : "",
      method : "",
      data : "" ,
      success : function f(r){} ,
      error : function f(r){}
   })
  */
 function bookupdate(ano)
 {
	 let text = prompt('학목 수정 내용')
	 let price = prompt('금액 수정 내용')
	 
	 
	    $.ajax({
      url : "../Accountbook",
      method : "put",
      data : {'ano':ano,'text':text,'price':price} ,
      success : function f(r){
		  if(r=='true')
		  {
			  
		  }
		  else{
			  console.log('에러')
		  }
	  } ,
      error : function f(r){
		  console.log('통신에러'+r)
	  }
   })
	 
	 loadbook()
 }
 function bookdelete(ano)
 {
	   $.ajax({
      url : "../Accountbook",
      method : "delete",
      data : {'ano':ano} ,
      success : function f(r){
		  if(r=='true')
		  {console.log("삭제성공")}
		  else
		  {console.log("삭제실패")}
		  
	  } ,
      error : function f(r){console.log("통신에러"+r)}
   })
	
	 loadbook() 
 }