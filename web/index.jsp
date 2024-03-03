<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script src="./scripts/htmx.min.js"></script>
    <link rel="stylesheet" href="./styles/bootstrap.min.css" />
    <script src="./scripts/bootstrap.bundle.min.js"></script>
    <script src="./scripts/htmx.min.js"></script>
    <title>CAWA</title>
  </head>
  <body>
    <header>
        <nav class="navbar bg-body-secondary shadow-sm">
            <div class="container d-flex justify-content-between">
                <a href="/" class="navbar-brand">TP CAWA</a>
                <a href="/login.jsp" class="btn btn-success">Login</a>
            </div>
        </nav>
    </header>
      <main class="container mt-4">
          <div>
                <h1>Forme pour afficher le tableau:</h1>
                <form action="/SecondServlet">
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">Nombre de lignes :</span>
                        <input type="number" required name="lignes" class="form-control" placeholder="nombre de lignes" min="1" aria-label="nombre" aria-describedby="basic-addon1">
                    </div>
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">Nmbr de colonnes :</span>
                        <input type="number" required class="form-control" name="colonnes" placeholder="Nombre de colonnes" min="1" aria-label="nombre" aria-describedby="basic-addon1">
                    </div>
                    <button type="submit" class="btn btn-success">Générer le tableau</button>
                </form>
          </div>
          <div class="mt-4">
                <h1>Calculatrice</h1>
                <form hx-post="/CalcServlet" hx-target="#result" hx-swap="innerHTML">
                    <div class="form-group mb-3">
                        <label for="num1">Numéro 1:</label>
                        <input type="number" class="form-control" required id="num1" name="num1">
                    </div>
                    <div class="form-group mb-3">
                        <label for="num2">Numéro 2:</label>
                        <input type="number" class="form-control" required id="num2" name="num2">
                    </div>
                    <div class="form-group mb-3">
                        <label for="operation">Opération à faire:</label>
                        <select class="form-control" id="operation" name="operation">
                            <option value="addition">Addition</option>
                            <option value="soustraction">Soustraction</option>
                            <option value="multiplication">Multiplication</option>
                            <option value="division">Division</option>
                        </select>
                    </div>
                    <button type="submit" class="btn btn-success">Calculer</button>
                </form>
                <h2 id="result"></h2>
            </div>
      </main>

  </body>
</html>
