<%--
  Created by IntelliJ IDEA.
  User: harrynguyen
  Date: 26/05/2020
  Time: 09:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="">
</head>
<body>
<div class="container">
    <h1 class="well">Add New Product</h1>
    <div class="col-lg-12 well">
        <div class="row">
            <form method="post">
                <div class="col-sm-12">
                    <div class="row">
                        <div class="col-sm-12 form-group">
                            <label>Id</label>
                            <input type="text" placeholder="Enter Name Product Here.." class="form-control" name="id">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Ten</label>
                        <input type="text" placeholder="Enter Price Here.." class="form-control" name="tensp">
                    </div>
                    <div class="form-group">
                        <label>Price</label>
                        <input type="text" placeholder="Enter Price Here.." class="form-control" name="gia">
                    </div>
                    <div class="form-group">
                        <label>Quantity</label>
                        <input type="text" placeholder="Enter Quantity Here.." class="form-control" name="soluong">
                    </div>
                    <div class="form-group">
                        <label>Color</label>
                        <input type="text" placeholder="Enter Color Here.." class="form-control" name="mau">
                    </div>
                    <div class="form-group">
                        <label>Description</label>
                        <input type="text" placeholder="Enter Description Here.." class="form-control"
                               name="mota">
                    </div>
                    <div class="form-group">
                        <label>Danh muc</label>

                        <select class="custom-select" name="categoryName">
                            <c:forEach items='${requestScope["categories"]}' var="category">
                                <option>${category.getCategory_name()}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <button type="submit" class="btn btn-lg btn-info">Submit</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
