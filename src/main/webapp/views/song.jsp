
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

</head>
<body>
    <h1>create song</h1>
    <form action="/song/post" method="post" modelAttribute="newSong">
        <div class="container-fluid">
            <div class="mb-3">
                <label>Song id</label>
                <input type="text" class="form-control"/>
            </div>
            <div class="mb-3">
                <label>Song title</label>
                <input type="text" class="form-control"/>
            </div>
            <div class="mb-3">
                <label>Song link</label>
                <input type="text" class="form-control"/>
            </div>
            <div class="mb-3">
                <label>Song author</label>
                <input type="text" class="form-control">
            </div>
            <div class="mb-3">
                <label>Song desc</label>
                <textarea type="textarea" class="form-control"></textarea>
            </div>
            <button type="submit"  class="btn btn-primary">test form</button>
        </div>
    </form>
</body>
</html>