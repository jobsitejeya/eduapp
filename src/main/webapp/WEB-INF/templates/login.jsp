<html>
<head>
<title><sitemesh:write property='title' /></title>

<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>

<![endif]-->
<sitemesh:write property='head' />

</head>

<body>
	<div class="container">
		<sitemesh:write property='body' />
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>