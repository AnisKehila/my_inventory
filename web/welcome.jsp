<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <link rel="stylesheet" href="./styles/bootstrap.min.css" />
</head>
<body>
    <div class="container mt-5">
        <h2>Welcome <%= request.getAttribute("username") %>!</h2>
    </div>
</body>
</html>

