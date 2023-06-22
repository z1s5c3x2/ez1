
let n = Number(prompt("횟수"))
console.log('문제1')
for(let x=0;x<n;x++)
{
	console.log("*")
}

n = Number(prompt("횟수"))
console.log('문제2')
for(let x=1;x<=n;x++)
{
	console.log("*")
	if(x%3==0){console.log('\n')}
}
n = Number(prompt("횟수"))
let _str = ""
console.log('문제3')
for(let x=0;x<n;x++)
{
	_str = ""
	for(let y=n-x;y<=n;y++)
	{
		_str +="*"
	}
	console.log(`${_str}`)
}

n = Number(prompt("횟수"))
console.log('문제4')
for(let x=0;x<n;x++)
{
	_str = ""
	for(let y=n-x;y>0;y--)
	{
		_str +="*"
	}
	console.log(`${_str}`)
}


n = Number(prompt("횟수"))
console.log('문제5')
for(let x=1;x<=n;x++)
{
	_str = ""
	
	for(let y = n-x;y>0;y--)
	{
		_str += " "
	}
	for(let i=n-x;i<n;i++)
	{
		_str += "*"
	}
	console.log(`${_str}`)
}


n = Number(prompt("횟수"))
console.log('문제6')
for(let x=1;x<=n;x++)
{
	_str = ""
	
	for(let y =n-x;y<n-1;y++)
	{
		_str += " "
	}
	for(let i=n-x;i>=0;i--)
	{
		_str += "*"
	}
	console.log(`${_str}`)
}

n = Number(prompt("횟수"))

console.log('문제7') 
for(let x=1;x<=n;x++)
{
	_str = ""
	
	for(let y=n-x; y>0 ; y--)
	{
		_str += " "
	}
	for(let i=0 ; i<x*2-1 ; i++)
	{
		_str += "*"
	}
	console.log(`${_str}`)
}


n = Number(prompt("횟수"))

console.log('문제8')
for(let x=n;x>0;x--)
{
	_str = ""
	
	for(let y=n-x; y>0 ; y--)
	{
		_str += " "
	}
	for(let i=0 ; i<x*2-1 ; i++)
	{
		_str += "*"
	}
	
	console.log(`${_str}`)
}

//문제 9 for문 하나 안에 출력?
//증감식에 변수 누적 x += n 
//
let adsub = 1
let isReverse = true
n = Number(prompt("횟수"))
console.log('문제9')
/*
for(let x=1;x<=n;x++)
{
	_str = ""
	
	for(let y=n-x; y>0 ; y--)
	{
		_str += " "
	}
	for(let i=0 ; i<x*2-1 ; i++)
	{
		_str += "*"
	}
	console.log(`${_str}`)
}
for(let x=n;x>0;x--)
{
	_str = ""
	
	for(let y=n-x; y>0 ; y--)
	{
		_str += " "
	}
	for(let i=0 ; i<x*2-1 ; i++)
	{
		_str += "*"
	}
	
	console.log(`${_str}`)
}*/

n = Math.round(n/2)
for(let x=1;x<=n;x+= adsub)
{
	_str = ""
	
	for(let y=n-x; y>0 ; y--)
	{
		_str += " "
	}
	for(let i=0 ; i<x*2-1 ; i++)
	{
		_str += "*"
	}
	console.log(`${_str}`)
	if(isReverse && x==n)
	{
		x+=1
		adsub = -1
		isReverse = false
	}
	else if(!isReverse)
	{
		if(x==1)
		{
			break
		}
	}
	
}

console.log('문제10')
n = Number(prompt("횟수"))
isReverse = true
let max = n-2+1
adsub = 1

for(let x=0;x<max;x+= adsub)
{
	_str = ""
	for(let z = 0;z<x;z++)
	{
		_str +=" "
	}
	_str +="*"
	if(x==parseInt(n/2)+1&&isReverse) // 가운데
	{

		console.log(_str)
		
		adsub = -1
		isReverse = false
		continue
	}
	else if(!isReverse)
	{
		if(x==-1)
		{break}
	}
	for(let i=n-(x*2); i>0;i--)
	{
		_str += " "
	}

	_str += "*"
	console.log(`${_str}`)
	
}
