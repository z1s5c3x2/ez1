
// 1. 회원가입 메소드
function signup() {
	
	// 1. HTML에 가져올 데이터의 tag객체 호출 [ DOM객체 : html태그를 객체화 ]
	let midInput = document.querySelector('.mid'); 
	let mpwdInput = document.querySelector('.mpwd'); 
	let mpwdconfirmInput = document.querySelector('.mpwdconfirm'); 
	let memailInput = document.querySelector('.memail'); 
	let mimgInput = document.querySelector('.mimg'); 
	
	// 2. (객체화)
	let info = {
		mid : midInput.value,
		mpwd : mpwdInput.value,
		memail : memailInput.value,
		mimg : mimgInput.value
	}
	// 3. 유효성 검사
	
	// 4. AJAX메소드를 이요한 Servlet와 통신
	$.ajax({
         url : "../MemberInfoController",     
         method : "post",    
         data : info,      
         
         success : r => {console.log('통신성공');} ,       
         error : e => {console.log('통신실패'+e);}       
      });

	
	// 5. Servlet의 응답에 따른 제어
	
}

function idcheck()
{
	let mid = document.querySelector('.mid').value
	let midj = /^[a-z0-9]{5,30}$/
	let idcheckbox = document.querySelector('.idcheckbox')
	if(midj.test(mid))
	{
		
		idcheckbox.innerHTML = `잘했다`
		$.ajax({
			url : "../MemberFindController",
			method : 'get',
			data : {mid:mid},
			success : r =>{
				if(r)
				{
					idcheckbox.innerHTML = `있다`
				}else{
					idcheckbox.innerHTML = `없다`
				}
			},
			error : e =>{
				console.log(e)
			}
		})
		
	}else{
		idcheckbox.innerHTML = `알아서 잘 치시오`
	}
}