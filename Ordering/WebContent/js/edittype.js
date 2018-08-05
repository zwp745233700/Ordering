//点击出现类别修改框
function edit(obj)
{
	var i1=obj.id+1;
	var i2=obj.id+2;
	if(document.getElementById(i1).style.display=='none'&&document.getElementById(i2).style.display=='block')
	{
		document.getElementById(i1).style.display='block';
	 	document.getElementById(i2).style.display='none';
	}else
	{
		document.getElementById(i1).style.display='none';
	 	document.getElementById(i2).style.display='block';
	}
}

