<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- 페이지 지시어, 반드시 필요한 부분이다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 종합 예제</title>
</head>
<body>
 <h2>JSP 종합 예제</h2>
 <hr>
 
 <%!
 	String[] members = { "1", "2", "3", "4"};
 	int num1 = 10;
 	
 	int calc(int num2) {
 		return num1 + num2;
 	}
 %>
 
 <H3>
 	1. JSP 주석
 	<!-- HTML주석: 화면에서는 안보이고 소스 보기에서는 보임 (쓰면 안됨.)-->
 	<%--JSP주서기 화면과 소스 보기에서 안 보임 (이걸써야함) --%>
 </H3>
 
 <h3>
 	2. calc(10) 메서드 실행결과: <%= calc(10) %>
 </h3>
 <hr>
 
 <h3>
 	3. include: hello.jsp
 </h3>
 <%@ include file="../hello.jsp" %>
 <hr>
 <h3>
 	4. 스크립트(배열 데이터 출력)
 </h3>
 <ul>
 	<%
 		for (String name : members) {
 	%>
 			<li><%= name %></li>
 	<%
 		}
 	%>
 </ul>
</body>
</html>