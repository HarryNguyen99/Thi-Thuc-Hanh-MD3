<%--
  Created by IntelliJ IDEA.
  User: harrynguyen
  Date: 26/05/2020
  Time: 09:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<div class="container" align="center">
    <div class="row col-md-10 col-md-offset-1 custyle">
        <form method="post" action="${pageContext.request.contextPath}/product?action=searchProduct"
              style="width: 200px">
            <input placeholder="Bạn cần tìm..." name="search" id="search" class="form-control" size="45"/>
            <br>
            <div align="center">
                <button type="submit" class="btn btn-primary" style="text-align: center">Search</button>
            </div>
        </form>
        <table class="table table-striped custab">
            <thead>
            <a href="${pageContext.request.contextPath}/product?action=createProduct"
               class="btn btn-primary btn-xs pull-left"><b>+</b> Add new Product</a>
            <tr>
                <th>ID</th>
                <th>Ten</th>
                <th>Gia</th>
                <th>So Luong</th>
                <th>mau</th>
                <th>danh muc</th>
                <th class="text-center">Action</th>
            </tr>
            </thead>
            <c:forEach items="${listProduct}" var="listProduct">
                <tr>
                    <td><c:out value="${listProduct.idSanPham}"/></td>
                    <td><c:out value="${listProduct.TenSP}"/></td>
                    <td><c:out value="${listProduct.Gia}"/></td>
                    <td><c:out value="${listProduct.SoLuong}"/></td>
                    <td><c:out value="${listProduct.Mau}"/></td>
                    <td><c:out value="${listProduct.TenDM}"/></td>
                    <td class="text-center"><a class='btn btn-info btn-xs'
                                               href="/product?action=updateProduct&id=${listProduct.idSanPham}"><span
                            class="glyphicon glyphicon-edit"></span> Edit</a>
                        <a href="/product?action=deleteProduct&id=${listProduct.idSanPham}" class="btn btn-danger btn-xs"><span
                                class="glyphicon glyphicon-remove"></span> Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
