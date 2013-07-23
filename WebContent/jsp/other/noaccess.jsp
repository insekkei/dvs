<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.cs2c.dvs.pojo.News"%>
<jsp:include page="../common/header.jsp"></jsp:include>

<div class="hero-unit db comm">
	<div class="problempage">
		<h4>操作不允许...</h4>
		<div>
			<p class="text-warning">系统觉得，您可以换个方式操作...π_π，或许您可以：</p>
			<p class="text-success">1、直接<a href="javascript:history.back()">戳这里返回&gt;&gt;</a></p>
			<p class="text-success">2、如果您认为这样很不方便，请<a href="<%=request.getContextPath() %>/index.jsp#contact">联系我们</a>:P</p>
			<p class="errormsg">:)</p>
		</div>
	</div>
</div>
<jsp:include page="../common/footer.jsp"></jsp:include>