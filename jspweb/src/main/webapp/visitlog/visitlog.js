console.log('visitlog.js 열림');

// 1. Create ( 저장 )

function vwrite() {
   
   // 1. HTML input 태그 호출 
   let vwriterInput = document.querySelector('.vwriter');
   let vpwdInput = document.querySelector('.vpwd');
   let vcontentInput = document.querySelector('.vcontent');
   // 2. 객체화 
   let info = {
      vwriter : vwriterInput.value,
      vpwd : vpwdInput.value,
      vcontent : vcontentInput.value
   }; console.log(info);
   // 3. 유효성검사 
   
   // 4. AJAX 
   $.ajax({
      url : "../VisitLogController" ,
      method : 'post' ,
      data :   info  ,
      success: function(result){ 
		 vread()
		  
	   },
      
   });
      // 5. 결과에 따른 코드 
   
} // f e

// 1. Read ( 호출 )
vread()
function vread() {
   $.ajax({
      url : "../VisitLogController" ,
      method : 'get' ,
      success: function(result){ 
		   let p = document.querySelector('.visit_Bottom')
		   p.innerHTML = ``
		  for(i=0;i<result.length;i++)
		  {
			 p.innerHTML += `
			  <div class="visitbox">
               <div class="visitbox_top">
                  <div> ${result[i].vwriter} </div>
                  <div class="visitdate"> ${result[i].vdate} </div>
               </div>
               <div class="visitbox_center"> ${result[i].vcontent} </div>
               <div class="visitbox_bottom">
                  <button type="button" onclick="vupdate(${result[i].vno})">수정</button>
                  <button type="button" onclick="vdelete(${result[i].vno})">삭제</button>
               </div>
            </div>
			 `
		  }
	   },
      error: a =>{console.log(a)}
      
   });
} // f e


// 1. update ( 수정 )
function vupdate(vno) {
console.log("vupdate")
   let vcontent = prompt('수정할 방문록 내용:')
   let vpwd = prompt('방문록 비밀번호:')
   
   let info = {
     vno : vno,
      vcontent : vcontent,
      vpwd : vpwd
   }; console.log(info);
   
    $.ajax({
      url : "../VisitLogController",
      method : "put",
      data : info ,
      success : function f(r){ 
        if(r == 'true') console.log('수정 완료')
        else console.log('수정 실패')
     },
      error : function f(r){ console.log('vupdate 오류')}
   })
      vread();
} // f e 



// 1. delete ( 삭제 )
function vdelete(vno) {

   let vpwd = prompt('방문록 비밀번호')
   vInfo = {"vno":vno,"vpwd":vpwd}
   
    $.ajax({
      url : "../VisitLogController",
      method : "delete",
      data : vInfo ,
      success : function f(r){
		vread()	  
     	console.log(r)
     	} ,
      error : function f(r){console.log('삭제 에러'+r)}
   })
   
      
} // f e 