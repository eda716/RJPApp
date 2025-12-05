<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>好きな映画</title>
</head>
<body>
    <h1>好きな映画</h1>
    <form method="post" action="./movieservlet">
        ユーザー名<input type="text" name="name"><br>
        好きな映画<input type="text" name="movie"><br>
        <input type="submit" value="送信" />
    </form>
</body>
</html>