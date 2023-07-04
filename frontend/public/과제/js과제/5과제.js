/**
 * 
 */

 let userbox = document.querySelector(".userbox")
 
 let u_left = 50;
 let u_top = 380;
 let is_jum = false
 let _tmp;
  
 document.body.addEventListener('keydown',(e)=>{
	 if(e.keyCode == 37)
	 {
		 console.log("왼")
		 u_left -=10
		 if(u_left <0)
		 {
			 u_left = 0
		 }
		 userbox.style.backgroundImage = `url(img/캐릭터_이동.png)`
	 }
	 else if(e.keyCode == 38)
	 {
		 if(!is_jum)
		 {
			 _tmp = setInterval(()=>{
			 if(!is_jum)
			 {
				 u_top -= 10
				 if(u_top < 290)
				 {
					 is_jum = true
				 }
			 }else{
				 u_top+=10
				 if(u_top >= 380)
				 {
					 is_jum = false
					 clearInterval(_tmp)
				 }
			 }
			 userbox.style.top = u_top+"px"
		 },50 )}
	 }
	 else if(e.keyCode == 39)
	 {
		 console.log("오")
		 
		 userbox.style.left ++;
		 u_left +=10
		 if(u_left > 900)
		 {
			 u_left = 900
		 }
		 userbox.style.backgroundImage = `url(img/캐릭터_이동.png)`
	 }else if(e.keyCode==65)
	 {
		 if(u_top != 380)
		 {
			 console.log("점프공격!!")
		 }
		 userbox.style.backgroundImage = `url(img/캐릭터_공격.png)`
	 }
	 userbox.style.left = u_left+"px"
	 
	 
 })
 document.body.addEventListener('keyup',()=>{
	 userbox.style.backgroundImage = `url(img/chr.png)`
 })
 
 
 