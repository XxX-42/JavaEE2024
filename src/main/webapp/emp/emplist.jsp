<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="now" class="java.util.Date" />
<!DOCTYPE html>
<html>
<head>
    <title>emplist-员工列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    <fmt:formatDate value="${now}" pattern="yyyy年MM月dd日" />
                    <br />
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main员工管理系统</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome!欢迎 <span onclick="myClose()" style="color:darkcyan">${sessionScope.user.realname}</span> 使用员工管理系统
                <script>
                    myClose = function(){
                        if (confirm('确认退出登录吗？')){
                            location.href="${pageContext.request.contextPath}/user/logout";
                        }
                    }
                </script>
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        ID编号
                    </td>
                    <td>
                        员工姓名
                    </td>
                    <td>
                        员工工资
                    </td>
                    <td>
                        员工年龄
                    </td>
                    <td>
                        管理操作
                    </td>
                </tr>
                <c:forEach var="emp" items="${emps}" varStatus="vs">
                    <tr <c:if test="${vs.index%2==0}">class="row1"</c:if><c:if test="${vs.index%2==1}">class="row2"</c:if>>
                        <td>
                                ${emp.id}
                        </td>
                        <td>
                                ${emp.name}
                        </td>
                        <td>
                                ${emp.salary}
                        </td>
                        <td>
                                ${emp.age}
                        </td>
                        <td>
                            <a onclick="isDels()">删除员工</a>&nbsp;
                            <script>
                                function isDels(){
                                    if(confirm("删除该员工吗？")){
                                        location.href = "${pageContext.request.contextPath}/emp/delete?id=${emp.id}";
                                    }
                                }
                            </script>
                            <a href="${pageContext.request.contextPath}/emp/findOne?id=${emp.id}">更新员工</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <p>
                <input type="button" class="button" value="添加员工" onclick="location='${pageContext.request.contextPath}/emp/addemp.jsp'"/>
            </p>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            知识点讨论：3040257@qq.com
        </div>
    </div>
</div>
</body>
</html>