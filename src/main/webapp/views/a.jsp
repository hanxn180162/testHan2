<%--
  Created by IntelliJ IDEA.
  User: 14643
  Date: 2018/12/19
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>查询界面</title>
</head>
<body>
        <form action="/API/hello" method="post">
            <input type="hidden" name="method" value="400002">
            <table>
                <tr>
                    <td align="right">姓名<font color="red">*</font>：</td>
                    <td> <input name="empName" type="text" size="100"
                                maxlength="18">
                    </td>
                </tr>
                <tr>
                    <td align="center"><input type="submit" value=" 提交  "/>
                    </td>
                </tr>
            </table>
        </form>
</body>
</html>
