## Currency-rates-service

## Описание 

Серверное приложение, написанное на Java 17 с использованием Spring, предоставляющее API для получения истории изменения курса валют USD, EUR и RUB к тенге за 10 дней.

## Пользование

Для пользования данным приложением локально, необходимо чтобы были установлены:
    1)IDE(IntelliJ и тд)
    2)Git
    3)JDK 17
    4)Postman

## Инструкция

1. Cклонируйте проект на свой локальный репозиторий c помощью команды git clone https://github.com/Code4LW/currency-rates-service.git
2. Откройте и соберите проект в вашем IDE
3. Исходный код проекта использует сторонний API для получения информации о курсе валют. Чтобы иметь доступ к данному API со своего устройства, необходимо получить секретный ключ на данном сайте: https://currencyapi.com/
4. Перейдя на данный сайт, нажмите на GET FREE API KEY и пройдите регистрацию, следуя инструкциям.
5. После регистрации и получения ключа, необходимо сохранить ключ в качетсве переменной среды в вашей IDE под именем API_KEY.
6. Запустите приложение
7. Для вызова API по получению курса валют, небоходимо открыть Postman и отправить GET запрос со следующим URL: http://localhost:8080/api/v1/currency-rates/history. В ответе вы получите данные о курсе валют USD, EUR и RUB к тенге за последние 10 дней
8. При успешном вызове, вся информация должна появится в следующем виде:

## Возможные улучшения
Для улучшения производительности приложения при частых запросах, можно добавить кэширование с помощью таких технологий, как Redis. Это поможет сократить количество запросов к внешнему API и ускорить получение данных.


    