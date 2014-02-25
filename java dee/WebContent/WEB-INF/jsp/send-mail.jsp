<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>Справочник контактов</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/common.css" rel="stylesheet">
</head>
<body>
<div id="wrap">
    <div class="container container-medium">
        <div class="page-header">
            <h2>Отправка письма</h2>
        </div>
        <div class = "well">
            <form action="" method="post">
	            <label>
	                <span class="search-tip">Кому: </span>
	                <input type="text" class="form-control input-medium">
	            </label>
	            <label>
	                <span class="search-tip">Тема: </span>
	                <input type="text" class="form-control input-medium">
	            </label>
	            <label>
	                <span class="search-tip">Шаблон письма: </span>
	                <select name="template" class="select-medium">
	                    <option value="template-default">Вручную</option>
	                    <option value="template-first">Первый шаблон</option>
	                    <option value="template-second">Второй шаблон</option>
	                </select>
	            </label>
	            <label>
	                <span class="search-tip">Текст: </span>
	                <textarea rows="10" class="input-medium" name="mailing-text"></textarea>
	            </label>
	            <button class="btn btn-success" type="submit">Отправить</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>