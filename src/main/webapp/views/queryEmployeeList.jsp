<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14643
  Date: 2018/12/20
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee 查询界面</title>
</head>
<body>
   <div>
       <%--<c:forEach items="${empList}" var="emp">--%>
            <table>
                <%--<th>用户ID</th>--%>
                <%--<th>用户ID</th>--%>
                <%--<th>用户ID</th>--%>
                <%--<th>用户ID</th>--%>
                <tr>
                    <td>${emp.empId}</td>
                    <td>${emp.empName}</td>
                    <td>${emp.empSalary}</td>
                    <td>${emp.empAge}</td>
                </tr>
            </table>
       <%--</c:forEach>--%>
   </div>

</body>
</html>
