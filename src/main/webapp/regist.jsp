<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="now" class="java.util.Date" />
<!DOCTYPE html>
<html>
<head>
    <title>regist-用户注册</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    <fmt:formatDate value="${now}" pattern="yyyy-MM-dd" />
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
                用户注册
            </h1>
            <form action="${pageContext.request.contextPath}/user/regist" method="post">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            用户名:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="username" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            真实姓名:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="realname" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            密码:
                        </td>
                        <td valign="middle" align="left">
                            <input type="password" class="inputgri" name="password" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            性别:
                        </td>
                        <td valign="middle" align="left">
                            男
                            <input type="radio" class="inputgri" name="gender" value="男" checked="checked"/>
                            女
                            <input type="radio" class="inputgri" name="gender" value="女"/>
                        </td>
                    </tr>

                    <tr>
                        <td valign="middle" align="right">
                            验证码:
                            <img id="num" src="${pageContext.request.contextPath}/user/getImage" />
                            <a href="javascript:;" onclick="document.getElementById('num').src = '${pageContext.request.contextPath}/user/getImage?'+(new Date()).getTime()">换一张</a>
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="code" />
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="submit" class="button" value="完成注册 &raquo;"/>
                </p>
            </form>
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