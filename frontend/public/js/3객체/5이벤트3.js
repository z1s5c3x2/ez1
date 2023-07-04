/**
 * 
 */

 let sbox = document.querySelector(".selectbox")
 sbox.addEventListener("change",()=>{
	 console.log(sbox.value)
 })
 
 let cbox = document.querySelector(".checkbox")
 cbox.addEventListener("change",()=>{
	
	console.log(cbox.checked)
 })
 let cbox2 = document.querySelector(".timer")
 let tbox = document.querySelector(".timerbox")
 let time = 0;
 let timerid = 0
 
 cbox2.addEventListener("change",()=>{
	if(cbox2.checked)
	{
		setInterval(()=>{
			time ++
			tbox.innerHTML = `${time}`
		},1000)
	}else{
		
	}	 
	 
 })