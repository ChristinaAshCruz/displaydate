<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Homepage</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/style.css" />
    <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/script.js"></script>
    <!-- change to match your file/naming structure -->
  </head>
  <body class="m-4" onload="pageAlert()">
    <h1>Homepage</h1>
    <div class="my-3" id="linkBlock">
      <a class="btn btn-primary me-2" href="/date" role="button">Date</a>
      <a class="btn btn-primary" href="/time" role="button">Time</a>
    </div>
  </body>
</html>
