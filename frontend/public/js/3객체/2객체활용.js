let userArray = []
function SignUp()
{
	if(document.querySelector(".Sid").value.length > 8 && document.querySelector(".Spwd").value.length)
	{
		userArray.push({userId: document.querySelector(".Sid").value,userPwd:document.querySelector(".Spwd").value})
		console.log("등록 성공")		
	}
		
	
	
}

function LoginBtn()
{
	let _gid = document.querySelector(".Lid").value
	let gpwd = document.querySelector(".Lpwd").value
	for(let item of userArray)
	{
		if(item.userId == _gid && gpwd == item.userPwd)
		{
			console.log("성공") 
			return
		}
	}
	console.log("실패")
	
	
}