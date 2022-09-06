# Android OAuth с помощью библиотеки AppAuth

Разработан в качестве материала к статье: https://habr.com/ru/company/kts/blog/654029/

Доклад Android Broadcast: https://www.youtube.com/watch?v=PFZ3cwxn9Wk

Функционал:
- AppAuth
- chrome custom tabs
- логин
- логаут
- обновление токена (пример, не работает на сервисе github)

**Важно**: это не production-ready приложение, пример разработан исключительно для демонстрации работы с библиотекой AppAuth. Разбиение на слои, архитекрурные сущности проведено условно. Пример необходимо адаптировать к приложению индивидуально.

Чтобы протестировать приложение:
- [зарегистрируйте](https://docs.github.com/en/developers/apps/building-oauth-apps/creating-an-oauth-app) OAuth-приложение в github
- заполните поля CLIENT_ID, CLIENT_SECRET, CALLBACK_URL внутри [AppAuth](app/src/main/java/com/kts/github/data/auth/AppAuth.kt) в соотвествии с параметрами зарегистрированного приложения
