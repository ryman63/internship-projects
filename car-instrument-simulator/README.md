# Одометр
В этом задании вы разработаете набор классов, которые будут работать вместе для имитации датчика топлива и одометра автомобиля. 
Классы, которые вы разработаете, следующие:
* Класс FuelGauge, класс который будет имитировать указатель уровня топлива. Задачи который он решает:
    + Фиксировать текущее количество топлива в машине, в литрах.
    +	Возвращать текущее количество топлива в автомобиле, в литрах.
    +	Увеличивать количества топлива на 1 литр, имитируя заправку автомобиля. (Автомобиль может вместить максимум 50 литров.)
    +	Уменьшать количество топлива на 1 литр, если количество топлива больше 0. Это расход топлива во время движения автомобиля.
* Класс Odometer этот класс будет имитировать одометр автомобиля. Задачи который он решает:
    +	Фиксировать текущий пробег автомобиля. 
    +	Возвращать текущий пробег автомобиля. 
    +	Увеличивать текущий пробег на 1 км. Максимальный пробег, который может хранить одометр, составляет 999 999 км. Когда эта сумма превышена, одометр сбрасывает текущий пробег до 0.
    +	Обеспечивать взаимодействие с классом FuelGauge. При этом взаимодействии должно уменьшаться текущее количество топлива объекта FuelGauge на 10 литров на каждые 100 км пройденного пути. Расход топлива 10 л на 100 км.


Продемонстрируйте работу классов, создав экземпляры каждого из них. Смоделируйте заполнение автомобиля топливом, а затем запустите цикл, который увеличивает одометр, пока в автомобиле не кончится топливо. Во время каждой итерации цикла выведите текущий пробег автомобиля и количество топлива.