<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <script src="./scripts/bootstrap.bundle.min.js"></script>
    <script src="./scripts/htmx.min.js"></script>
    <link rel="stylesheet" href="./styles/bootstrap.min.css" />
    <title>Login</title>
</head>
<body>
    <div class="container w-50 mt-5">
        <h2>Login to CAWA TP</h2>
        <form action="/LoginServlet" method="post">
            <div class="form-group mt-4">
                <label for="username">Username:</label>
                <input type="text" required class="form-control" id="username" name="username">
            </div>
            <div class="form-group mt-4">
                <label for="password">Password:</label>
                <input type="password" required class="form-control" id="password" name="password">
            </div>
            <div id="err" class="mt-2">
                <%= (request.getAttribute("err") != null) ? request.getAttribute("err") : "" %>
            </div>
            <button type="submit" class="mt-4 w-100 btn btn-success">Login</button>
        </form>
    </div>
</body>

</html>
