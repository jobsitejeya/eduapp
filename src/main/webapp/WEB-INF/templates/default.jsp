<!DOCTYPE html>
<html>
<head lang="en">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <title>Dashboard - Dashboard</title>

    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/css/font-awesome.min.css">

    <!-- page specific plugin styles -->

    <!-- text fonts -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300">

    <!-- ace styles -->
    <link rel="stylesheet" href="resources/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style">

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="resources/css/ace-part2.min.css" class="ace-main-stylesheet"/>
    <![endif]-->

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="resources/css/ace-ie.min.css"/>
    <![endif]-->
    <sitemesh:write property='head'/>
</head>
<body class="no-skin">

<jsp:include page="_menu.jsp"/>



<!--[if !IE]> -->
<script src="resources/js/jquery.min.js"></script>
<!-- <![endif]-->
<!--[if IE]>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<![endif]-->
<!--[if !IE]> -->
<script type="text/javascript">
    window.jQuery || document.write("<script src='resources/js/jquery.min.js'>" + "<" + "/script>");
</script>

<!-- <![endif]-->
<!--[if IE]>
<script type="text/javascript">
    window.jQuery || document.write("<script src='dist/js/jquery1x.min.js'>" + "<" + "/script>");
</script>
<![endif]-->
<script type="text/javascript">
    if ('ontouchstart' in document.documentElement) document.write("<script src='dist/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
</script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/jquery-ui.custom.min.js"></script>
<script src="resources/js/jquery.ui.touch-punch.min.js"></script>
<script src="resources/js/jquery.easypiechart.min.js"></script>
<script src="resources/js/jquery.sparkline.min.js"></script>
<script src="resources/js/jquery.flot.min.js"></script>
<script src="resources/js/jquery.flot.pie.min.js"></script>
<script src="resources/js/jquery.flot.resize.min.js"></script>

<!-- ace scripts -->
<script src="resources/js/ace-elements.min.js"></script>
<script src="resources/js/ace.min.js"></script>

<jsp:include page="_content.jsp"></jsp:include>

<sitemesh:write property='body'/>
<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>