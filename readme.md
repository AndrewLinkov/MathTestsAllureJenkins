https://www.youtube.com/watch?v=-7B7TaYnwQY&t=1081s

1. Посмотреть как ведет себя джоба, будет ли она статична? или каждый раз ее обновлять

__________________________________________________________
1. Для формирования Allure отчета, необходимо
1.1 Подключить библиотеки Allure  и плагины
1.2 Настроить проперти 
1.3 В классе BaseTest прописать строку: SelenideLogger.addListener("AllureSelenide", new AllureSelenide()); 
1.4 Алгоритм запуска отчета:
- Запустить тесты
- Allure:report - сформировать отчет
- Allure:serve - отобразить отчет
__________________________________________________________
2. Для запуска тестов по тегам Реализован класс TestRun.
__________________________________________________________
3. Параллельный запуск тестов осуществляется:
__________________________________________________________
4. 