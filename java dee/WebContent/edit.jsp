<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <title>Справочник контактов</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/common.css" rel="stylesheet">
    <script type="text/javascript" src="js/modality.js"></script>
</head>
<body>
<div id="modal-background" style="display: none; height: 0px; width: 0px;"></div>
<div id="wrap">
    <div class="container">
        <div class="page-header">
            <h2>Добавление нового контакта</h2>
        </div>
        <div class="well">
        	<a href="index.html"><button class="btn" type="submit">Вернуться к списку</button></a>
        </div>
        <div class = "well">
            <form action="" method="post">
            	<img src="img/no-avatar.png" class="img-photo pull-left" alt="Изменить...">
	            <label>
	            	<span class="search-tip">Фамилия*: </span>
	            	<input type="text" class="form-control input-small" placeholder="Фамилия">
	            </label>
	            <label>
	            	<span class="search-tip">Имя*: </span>
	            	<input type="text" class="form-control input-small" placeholder="Имя">
	            </label>
	            <label>
	            	<span class="search-tip">Отчество: </span>
	            	<input type="text" class="form-control input-small" placeholder="Отчество">
	            </label>
	            <label>
		            <span class="search-tip">Дата рождения: </span>
		            <input type="date" class="form-control input-small" placeholder="Дата рождения">
	            </label>
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
                <label>
                    <span class="search-tip">Веб-сайт: </span>
                    <input type="text" class="form-control input-small" placeholder="Веб-сайт">
                </label>
                <label>
                    <span class="search-tip">Email: </span>
                    <input type="text" class="form-control input-small" placeholder="Email">
                </label>
                <label>
                    <span class="search-tip">Место работы: </span>
                    <input type="text" class="form-control input-small" placeholder="Место работы">
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
                <label>
                    <span class="search-tip">Email: </span>
                    <input type="text" class="form-control input-small" placeholder="Email">
                </label>
                <span class="search-tip">Список контактных телефонов: </span>
				<div class="pull-right">
					<a class="btn" href="#!" onclick="show('phone-list-container', 'modal-background')">Создать</a>
                    <a class="btn btn-danger" href="#!" onclick="easyOff('phone-list-container')">Удалить</a>
				</div>
				<table class="table">
					<thead>
						<tr>
							<th></th>
							<th>Номер</th>
							<th>Описание</th>
							<th>Комментарий</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="checkbox" checked="checked"></td>
							<td>+375 29 1234567</td>
							<td>Мобильный</td>
							<td>-</td>
						</tr>
					</tbody>
				</table>
				<span class="search-tip">Список присоединений: </span>
				<div class="pull-right">
					<a class="btn" href="#!" onclick="show('attachment-container', 'modal-background')">Создать</a>
					<a class="btn btn-danger" href="#!" onclick="easyOff('attachment-container')">Удалить</a>
				</div>
				<table class="table">
					<thead>
						<tr>
							<th></th>
							<th>Имя файла</th>
							<th>Дата загрузки</th>
							<th>Комментарий</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="checkbox" checked="checked"></td>
							<td>Картинка1.jpg</td>
							<td>12-01-2001</td>
							<td>-</td>
						</tr>
					</tbody>
				</table>
                <button class="btn btn-success" type="submit">Сохранить</button>
	        </form>
        </div>
        
        <!--
		First modal - phone editor
		-->
		
		<div id="phone-list-container" class="well modal" style="display: none">
		    <a href="javascript:void(0);" class="close" onclick="hide('phone-list-container', 'modal-background')">X</a>
			<label>
                <span class="search-tip">Код страны: </span>
                <input type="text" class="form-control input-small" placeholder="Код страны">
            </label>
			<label>
                <span class="search-tip">Код оператора: </span>
                <input type="text" class="form-control input-small" placeholder="Код оператора">
            </label>
			<label>
                <span class="search-tip">Номер: </span>
                <input type="text" class="form-control input-small" placeholder="Номер">
            </label>
			<label>
                <span class="search-tip">Тип телефона: </span>
                <input type="text" class="form-control input-small" placeholder="Тип телефона">
            </label>
			<label>
                <span class="search-tip">Комментарий: </span>
                <input type="text" class="form-control input-small" placeholder="Комментарий">
            </label>
			<a class="btn btn-success" href="#!">Сохранить</a>
			<a class="btn btn-danger" href="#!" onclick="hide('phone-list-container', 'modal-background')">Отменить</a>
		</div>
		
		<!--
		Second modal - attachment editor
		-->
		
		<div id="attachment-container" class="well modal" style="display: none">
		    <a href="javascript:void(0);" class="close" onclick="hide('attachment-container', 'modal-background')">X</a>
			<label>
                <span class="search-tip">Файл:</span>
                <input type="file" class="form-control input-small">
            </label>
			<label>
                <span class="search-tip">Комментарий:</span>
                <textarea rows="10" class="input-medium" name="mailing-text"></textarea>
            </label>
			<a class="btn btn-success" href="#!">Сохранить</a>
			<a class="btn btn-danger" href="#!" onclick="hide('attachment-container', 'modal-background')">Отменить</a>
		</div>
        
    </div>
</div>
</body>
</html>