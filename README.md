# TestTaskConsultingResearchGroup
Тестовое задание от компании Consulting Research Group

Нужно написать HTTP API с использованием Spring Boot для работы с "сферичексими" клиентами и их заказами. Данные должны сохраняться в встаиваемую (embedded) БД
Сущность Клиент связана с сущьностю Заказ как один ко многим

Свойства сущности Клиент:
Название
ИНН
Телефон
Адрес
- код региона
- название района
- название населенного пункта
- название улицы
- номер дома
- номер корпуса
- номер офиса\помещения

Свойста сущности Заказ
- Номер
- Дата создания
- Свободное описание приобретаемых товаров и услуг
- Сумма



API должно позволять
- создавать записи по клиентам в БД
- выдавать единичные записи по клиенту из БД
- обновлять единичные записи по клиенту в БД
- выдавать список клиентов из БД
- удалять единичные записи по клиенту из БД, вместе со всеми записями заказов этого клиента

- создавать записи заказов у клиента
- выдавать единичные записи заказа у клиента
- обновлять единичные записи заказа у клиента
- выдавать список всех заказов по клиенту
- удалять единичные записи закза у клиента


API по работае с сущностью Клиент, должно быть покрыто функциональными тестами для защиты от регрессий
