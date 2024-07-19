# Movable

Предположим, что у нас есть набор объектов с некоторым общим поведением: они могут двигаться вверх, вниз, влево или вправо. 
Конкретная реализация поведения (например, как двигаться и как далеко двигаться) зависит от самих объектов. 
Один из распространенных способов реализации данных методов поведения - это определить интерфейс с именем Movable 
с абстрактными методами moveUp(), moveDown(), moveLeft() и moveRight(). 
Классы, которые реализуют интерфейс Movable, обеспечат фактическую реализацию этих абстрактных методов.

Реализуйте два конкретных класса - Movable.MovablePoint и Movable.MovableCircle, которые реализуют интерфейс Movable.

![Диаграмма1](/diagram1.png)
 
Для класса Movable.MovablePoint объявите переменные экземпляра x, y, xSpeed и ySpeed с доступом к пакету, как показано с помощью «~» на диаграмме классов (т.е. классы в одном пакете могут обращаться к этим переменным напрямую). Для класса Movable.MovableCircle используйте Movable.MovablePoint для обозначения его центра (который содержит четыре переменные x, y, xSpeed и ySpeed). Другими словами, Movable.MovableCircle составляет Movable.MovablePoint + радиус.
public class Movable.MovablePoint implements Movable { // saved as "Movable.MovablePoint.java"
```
    // instance variables
    int x, y, xSpeed, ySpeed;     // package access

    // Constructor
    public Movable.MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        //...
    }
    //...

    // Implement abstract methods declared in the interface Movable
    @Override
    public void moveUp() {
        y -= ySpeed;   // y-axis pointing down for 2D graphics
    }
    //...
}

```
```
public class Movable.MovableCircle implements Movable { // saved as "Movable.MovableCircle.java"
    // instance variables
    private Movable.MovablePoint center;   // can use center.x, center.y directly
    //  because they are package accessible
    private int radius;

    // Constructor
    public Movable.MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        // Call the Movable.MovablePoint's constructor to allocate the center instance.
        center = new Movable.MovablePoint(x, y, xSpeed, ySpeed);
        //...
    }
    //...

    // Implement abstract methods declared in the interface Movable
    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }
    //...
}

```

Напишите тестовую программу и попробуйте проверить следующий код:

```
Movable m1 = new Movable.MovablePoint(5, 6, 10, 15);     // upcast
System.out.println(m1);
m1.moveLeft();
System.out.println(m1);

Movable m2 = new Movable.MovableCircle(1, 2, 3, 4, 20);  // upcast
System.out.println(m2);
m2.moveRight();
System.out.println(m2);
```

Реализуйте ещё один класс с именем MovableRectangle, который состоит из двух 
MovablePoints (представляющих верхний левый и нижний правый углы) и реализующих Movable Interface. 
Убедитесь, что две точки имеют одинаковую скорость.

![Диаграмма2](/diagram2.png)
 
