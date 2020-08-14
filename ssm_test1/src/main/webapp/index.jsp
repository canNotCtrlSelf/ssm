<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2><br/>
<a href="account/findAll">findAll</a><br/>
<form method="post" action="account/saveAccount">
    姓名：<input type="text" name="name"><br/>
    存款：<input type="text" name="money"><br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
