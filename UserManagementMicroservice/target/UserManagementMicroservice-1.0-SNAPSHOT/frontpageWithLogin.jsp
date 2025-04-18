<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Welcome, <%= session.getAttribute("username") %>!</h2>
    <form action="LogoutServlet" method="post">
        <button type="submit">Logout</button>
    </form>
</body>
</html>
