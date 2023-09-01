/**
 * 
 */

 function onWrite()
{
	if(loginState)
	{
		location.href = "write.jsp" 
	}
	else{
		alert('로그인점')
		location.href = "/jspweb/member/login.jsp"
	}
	
}