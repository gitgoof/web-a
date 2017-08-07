<%--
  Created by IntelliJ IDEA.
  User: gaofeng
  Date: 2017/7/19
  Time: 下午5:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>我的首界面</title>
  </head>
  <body>
  <br>
  <h4><a href="/helloworld.form">Hello world</a></h4>
  <h3><a href="/getAll">get all people</a></h3>

  <form action="/login" method="post">
    <label >input your name</label>
    <input name="name" id="name" type="text"/><br>
    <input type="submit"  value="to Login"/>
  </form>

  </body>
</html>
