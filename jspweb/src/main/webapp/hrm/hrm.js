/**
 * 
 */

 
 function preimg( object ){
   console.log('사진 선택 변경');
   console.log( object );
      // 이벤트 실행시킨 태그의 DOM객체를 인수로 받음
   console.log( document.querySelector('.mimg') );
   // 1. input태그의 속성 [ type, class, onchange, name 등등 ]
   // 1. input태그 이면서 type="file" 이면 추가적인 속성, 
      // .files : input type="file" 에 선택한 파일 정보를 리스트로 받음
   console.log( object.files );
      // 리스트 중에서 하나의 파일만 가져오기
   console.log( object.files[0] );   
   
   // --- 해당 파일을 바이트코드 변환
   // 2. JS 파일클래스 선언
      // 파일 읽기 클래스를 이용한 파일읽기객체 선언
   let file = new FileReader();   
   
   // 3. 파일 읽어오기 함수 제공
      // input에 등록된 파일리스트 붕 1개를 파일객체로 읽어오기
   file.readAsDataURL( object.files[0] );   
   console.log( file );
   

}
function loadlist()
{
	let target = document.querySelector('.viewbox')
	target.innerHTML = `<div class='boxitem'> <div> 이름 </div> <div> 전화번호 </div> <div> 직급 </div> <div> 등록일 </div> <div> 사진 </div> </div>`
	$.ajax({
		  url :"../HrmController",
		  method: "get",
		  success : r=>{	
			 for(i=0;i<r.length;i++)
			 {
				 target.innerHTML += `<div class='boxitem'> <div> ${r[i].hname} </div> <div> ${r[i].hphone} </div> <div> ${r[i].hrank} </div> <div> ${r[i].hdate} </div> <div> <img src="/jspweb/hrm/img/${r[i].himg}"> </div> </div>`
			 }
		},
		  error : e => {
			console.log(e)
		}
		  
	  })
}
function signup()
{
	   let sf = document.querySelectorAll('.signupForm')[0]
      let sd = new FormData(sf)
      
	$.ajax({
		  url :"../HrmController",
		  method: "post",
		  data : sd,
		  contentType: false,
		  processData:false,
		  success : r=>{	
			 console.log(r)
		},
		  error : e => {
			console.log(e)
		}
		  
	  })
}
