# Автор

На uml диаграмме представлен класс Author (UML диаграмма должна быть вам знакома, но если нет, то про нее можно прочитать <code>[здесь](https://prog-cpp.ru/uml-classes/)
</code> и <code>[здесь](https://intuit.ru/studies/courses/1007/229/lecture/5954?page=2)</code>).
 
![Диаграмма1](/uml1.png)

Класс Author должен быть реализован согласно диаграмме классов. 
Он содержит:
*	Три приватные переменные: name (String), email (String) и gender(char 'м' или 'ж') - вы также можете использовать логическую переменную isMale со значением true или false).
*	Конструктор для инициализации имени, адреса электронной почты и пола с заданными значениями.
*	Public геттеры/сеттеры: getName (), getEmail (), setEmail() и getGender().
*	Метод toString (), который возвращает «name (gender) email», например «Ivan Ivanov Teck (m) i.ivanov@somewhere.com».

Далее вам необходимо реализовать класс Book.
 
Давайте реализуем класс Book. Предположим, что книга написана одним (и ровно одним) автором. 

![Диаграмма2](/uml2.png)

Класс Book (как показано на диаграмме классов) содержит следующие члены:
*	Четыре private переменных-члена: name (String), author (экземпляр класса Author, который мы только что создали, при условии, что у каждой книги ровно один автор), price (double) и qty(int).
*	Открытые методы получения и установки: getName(), getAuthor(), getPrice(), setPrice(), getQty(), setQty().
*	ToString(), которая возвращает "\"book name\" от author-name (gender) email".
