<%@ page contentType = "text/html;charset=utf-8" %>
<%@	page import="java.util.Date"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="example.*" %>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" />

    <%! String greeting = "꾸팡페이지에 오신걸 환영합니다.";
      String tagline = "하단페이지 : 확인";%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				<%=greeting%>
			</h1>
		</div>
	</div>	
	<%
		ArrayList<Product> listOfProducts = productDAO.getAllProducts(); // 리스트에 상품 전체 정보를 얻어온다.
	%> 
	<%
		ProductRepository dao = ProductRepository.getInstance();
		ArrayList<Product> listOfProducts = dao.getAllProducts();
	%>
	<div class="container">
		<div class="text-center">
			<h3>
				<%=tagline%>
			</h3>
		</div>
		<div class="row" align="center">
			<%
				for (int i = 0; i < listOfProducts.size(); i++) {
					Product product = listOfProducts.get(i);
			%>
			<div class="col-md-4">
            	<div class="card bg-dark text-white">
            		<img src="image/product/<%=product.getProductId()%>.jpg" class="card-img" alt="...">
                	<div class="card-img-overlay">
            		<h5 class="card-title">그래픽 카드 이미지 샘플<img src="image\Product1.jpg" class="img-fluid" alt="Product1"></h5>
            		<p class="card-text">출처 : 구글 검색</p>
            		</div>
                	</div>
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><%=product.getUnitPrice()%>원
                <p><a href="product_detail.jsp?id=<%=product.getProductId()%>" class="btn btn-secondary" role="button"> 상품 상세 정보 &raquo;</a>
			</div>
			<%
				}
			%>
		</div>
		<hr>
	</div>	
	
	
