<html>
<head>
    <title><sitemesh:write property='title'/></title>

    <link
            href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
            rel="stylesheet">

    <link
            href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css"
            rel="stylesheet">
    <link
            href="${pageContext.request.contextPath}/resources/css/bootstrap-submenu.min.css"
            rel="stylesheet">

    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/jqwidgets/styles/jqx.base.css"/>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/jqwidgets/styles/jqx.bootstrap.css"/>

    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>

    <![endif]-->

    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/jquery-2.0.2.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/bootstrap-submenu.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/angular-route.min.js"></script>

    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/jqwidgets/jqxcore.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/jqwidgets/jqxangular.js"></script>


    <sitemesh:write property='head'/>

</head>

<body>
<jsp:include page="_menu.jsp"/>

<sitemesh:write property='body'/>

<script>
    $('.institute-menu>a').submenupicker();
</script>
</body>
</html>