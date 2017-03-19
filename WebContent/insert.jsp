<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Thêm sinh viên</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>


<div class="container">0
    <h3 class="header">Thêm mới sinh viên</h3>
	<html:form action="/insert" method="post" styleClass="box">
        <div class="row form-group">
            <label class="col-lg-2">Mã SV</label>
            <div class="col-lg-3">
            	<html:text property="maSv" styleClass="form-control"></html:text>
            </div>
        </div>
        
        <div class="row form-group">
            <label class="col-lg-2">Họ tên</label>
            <div class="col-lg-3">
            	<html:text property="hoTen" styleClass="form-control"></html:text>
            </div>
        </div>
        
        <div class="row form-group">
            <label class="col-lg-2">Dia chi</label>
            <div class="col-lg-3">
            	<html:text property="diaChi" styleClass="form-control"></html:text>
            </div>
        </div>
        
        <div class="row form-group">
            <label class="col-lg-2">Lop</label>
            <div class="col-lg-3">
            	<html:select property="maLop" styleClass="form form-control">
            		<html:optionsCollection name="sinhVienForm" property="listLop" label="tenLop" value="maLop" />
            	</html:select>
            </div>
        </div>
        
        <div class="row form-group">
            <div class="col-lg-3 col-lg-offset-2">
            	<html:submit styleClass="btn btn-danger">Thêm mới</html:submit>
                <button class="btn btn-primary" onclick="history.go(-1);">Quay lại</button>
            </div>
        </div>
    </html:form>
    <br>
</div>
</body>
</html>