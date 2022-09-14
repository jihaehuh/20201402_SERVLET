<%@ page contentType = "text/html;charset=utf-8" %>
<%@	page import="java.util.Date"%>
    <%! String greeting = "꾸팡페이지에 오신걸 환영합니다.";
      String tagline = "하단페이지 : 확인";%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				<%=greeting%>
			</h1>
		</div>
	</div>	
	<div class="container">
		<div class="text-center">
			<h3>
				<%=tagline%>
			</h3>
		</div>
		<hr>
	</div>	