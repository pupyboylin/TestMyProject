<%@ page language="java" contentType="text/html; charset=BIG5" pageEncoding="BIG5"%>
<%-- <%@ page language="java" contentType="text/html;charset=UTF-8" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-1.11.3.min.js"></script>
<!-- <script type="text/javascript" src="/resources/js/jquery-3.1.1.min.js"></script> -->
<!-- <script type="Text/JavaScript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6/jquery.min.js"></script> -->

<script type="text/javascript">
	$(document).ready(function() {
		$('#showResult').click(function() {
			//alert('success');
		});
		//top.location.href = '';
	});
	
	function goToDisplay(){
		//alert('success');
		location.href = 'http://localhost:8080/restfulv2/searchResult';
	}
	
	function goToInsert(){
		//alert('success');
		//location.href = 'http://localhost:8080/restful/customerResult';
		var v=document.getElementById("id_div").value;
		if(v == '') alert('請輸入json格式資料');
		else document.getElementById("myForm").submit();
	}
	
	function goToDisplay2(){
		//alert('success');
		//location.href = 'http://localhost:8080/restfulv2/infoQuery';
		var userName = $('#id_userName').val();
		alert('userName='+userName);
		if(userName == '') alert('請輸入使用者名稱');
		else document.getElementById("myForm2").submit();
	}

</script>
</head>
<body>
	<form id="myForm" action="infoCreate" method="post">
		<textarea id="id_div" rows="4" cols="50" name="insertString"></textarea><br>
		<button type="button" onclick="goToInsert()">檢查輸入的json資料</button><br>
		<button id="showResult" type="button" onclick="goToDisplay()">送出查詢</button>
	</form>
	
	<form id="myForm2" action="infoQuery" method="post">
		
		user name: <input type="text" name="userName" id="id_userName"><br>
		include: <input type="text" name="include"><br>
		include: <input type="text" name="include"><br>
		exclude: <input type="text" name="exclude"><br>
		exclude: <input type="text" name="exclude"><br>
		start: <input type="text" name="start"><br>
		rows: <input type="text" name="rows"><br>
		time start: <input type="text" name="timeStart"><br>
		time end: <input type="text" name="timeEnd"><br>
		order by: <input type="text" name="orderBy"><br>
		<button id="showResult" type="button" onclick="goToDisplay2()">送出查詢</button>
	</form>
	
	
	<!-- <button id="showResult" type="button">送出查詢</button> -->
</body>
</html>