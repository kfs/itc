<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>Справочник контактов</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/common.css" rel="stylesheet">
</head>
<body>
<div id="wrap">
    <div class="container container-small">
        <div class="page-header">
            <h2>Поиск контактов</h2>
        </div>
        <div class = "well">
        	<form action="" method="post">
	            <label>
	            	<span class="search-tip">Фамилия: </span>
	            	<input type="text" class="form-control input-small" placeholder="Фамилия">
	            </label>
	            <label>
	            	<span class="search-tip">Имя: </span>
	            	<input type="text" class="form-control input-small" placeholder="Имя">
	            </label>
	            <label>
	            	<span class="search-tip">Отчество: </span>
	            	<input type="text" class="form-control input-small" placeholder="Отчество">
	            </label>
	            <span class="search-tip">Дата рождения: </span>
	            <label><input type="radio" name="birth-behaviour" value="concrete-date" checked="checked"> Точная дата</label>
	            <label><input type="radio" name="birth-behaviour" value="up-date"> Младше</label>
	            <label><input type="radio" name="birth-behaviour" value="down-date"> Старше</label>
	            <input type="date" class="form-control input-small" placeholder="Дата рождения">
	            
	            <label>
	            	<span class="search-tip">Пол: </span>
	            	<select name="gender" class="select-small">
                        <option value="gender-not-selected">Выберите</option>
                        <option value="gender-male">Мужской</option>
                        <option value="gender-female">Женский</option>
	            	</select>
	            </label>
	            <label>
                    <span class="search-tip">Семейное положение: </span>
                    <select name="marital" class="select-small">
                        <option value="marital-not-selected">Выберите</option>
                        <option value="marital-yes">Состоит в браке</option>
                        <option value="marital-no">Не состоит в браке</option>
                    </select>
                </label>
                <label>
                    <span class="search-tip">Гражданство: </span>
                    <input type="text" class="form-control input-small" placeholder="Гражданство">
                </label>
                <span class="search-tip">Адрес </span>
                <label>
	            	<span class="search-tip">Страна: </span>
	            	<input type="text" class="form-control input-small" placeholder="Страна">
	            </label>
				<label>
	            	<span class="search-tip">Город: </span>
	            	<input type="text" class="form-control input-small" placeholder="Город">
	            </label>
				<label>
	            	<span class="search-tip">Улица: </span>
	            	<input type="text" class="form-control input-small" placeholder="Улица">
	            </label>
				<label>
	            	<span class="search-tip">Номер дома: </span>
	            	<input type="text" class="form-control input-small" placeholder="Номер дома">
	            </label>
                <label>
	            	<span class="search-tip">Номер квартиры: </span>
	            	<input type="text" class="form-control input-small" placeholder="Номер квартиры">
	            </label>
				<label>
	            	<span class="search-tip">Индекс: </span>
	            	<input type="text" class="form-control input-small" placeholder="Индекс">
	            </label>                
                <button class="btn btn-success" type="submit">Поиск</button>
	        </form>
        </div>
    </div>
</div>
</body>
</html>