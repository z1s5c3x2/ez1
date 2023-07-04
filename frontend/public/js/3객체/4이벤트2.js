/**
 * 
 */
let moving = document.querySelector(".moving")
 moving.style.position = `absolute`
 
 let mosarray = document.querySelectorAll(".mos")
 let moslife = []
 for(let i=0;i<mosarray.length;i++)
 {
	 moslife[i]= true
 }
 console.log(moslife)
  for(m of mosarray)
 {
	 m.style.position = `absolute`
 }
 let moscount = moslife.length
 let dcount = 0
 
 document.querySelector(".h3box").innerHTML =`남은모기수 : `+moscount
 document.querySelector(".h3box").innerHTML += `</br>에프킬라 뿌린 횟수 : ` + dcount
 document.querySelector(".textbox").addEventListener("input",()=>{
	 dcount ++
	 /*
	 for(item of document.querySelector(".textbox").value)
	 {
		document.querySelector(".h3box").innerHTML += item		 
	 }
	  
	  document.querySelector(".h3box").innerHTML += `<br>`*/
	  for(let i=0;i<mosarray.length;i++){
		  if(moslife[i])
		  	{
				mosarray[i].style.left = (Math.random()*700)+"px"
	 			mosarray[i].style.top = (Math.random()*700 )+"px"
	 			if(Math.random()*10000 < 15)
	 			{
				 mosarray[i].innerHTML = "으악"
				 mosarray[i].style.backgroundColor = "red"
				 moslife[i] = false
				 	moscount --
				 	
				 	
			 		}
	 		}
	 		
	 		}
	 document.querySelector(".h3box").innerHTML =`남은모기수 : `+moscount
	  document.querySelector(".h3box").innerHTML += `</br>에프킬라 뿌린 횟수 : ` + dcount
 })
 
 
 moving.style.left = "200px"
 moving.addEventListener("click",()=>{
	 moving.style.left = (Math.random()*700)+"px"
	 
	 
	 moving.style.top = (Math.random()*700 )+"px"
 })
 


 

 // js - . 등등 사용이 안되어 camel 기법으로 기입 ex) background-color = backgroundColor
 /*
 document.querySelector(".textbox").addEventListener("keydown",(e)=>{
	console.log(e)	 
 })*/
 
 
 /*
 keyup
 keydown
 
  */