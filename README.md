В этом проекте четко соблюдены принципы S.O.L.I.D.

Single Responsibility Principle (SRP): Order теперь только содержит данные о заказе, работу с базой данных я перенес в класс OrderRepository, который теперь реализует интерфейс iOrderRepository.
Что уменьшает связь между конкретными реализациями и завязан исключительно на интерфейсе.

Open/Closed Principle (OCP): Интерфейс iOrderRepository позволяет нам легко расширять функциональность, не изменяя класс OrderService.

Liskov Substitution Principle (LSP): Класс OrderService теперь может работать с любыми реализациями iOrderRepository, что делает код гибким и совместимым с расширениями.

Interface Segregation Principle (ISP): Интерфейс iOrderRepository разделяет логику работы с базой данных от других классов, не заставляя их реализовывать ненужные методы.

Dependency Inversion Principle (DIP): Зависимость от базы данных инжектируется в класс OrderService через конструктор, что делает класс независимым от конкретной реализации базы данных.

Также я разбил свои классы и интерфейсы по пакетам, что позволяет лучше ориентироваться в коде.

**(Для перехода к некорректной реализации задачи, используйте коммиты гита).**
