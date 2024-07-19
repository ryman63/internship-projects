package ru.ds.edu.decorator;

import ru.ds.edu.decorator.impl.DetailedErrorPrintable;
import ru.ds.edu.decorator.impl.SnakeCasePrintable;
import ru.ds.edu.decorator.impl.SimplePrintable;
import ru.ds.edu.decorator.impl.TimeStampPrintable;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final int DEFAULT_BUFFER_SIZE = 10;

    public static void main(String[] args) {
        PrintableObjectsBuffer buffer = new PrintableObjectsBuffer(DEFAULT_BUFFER_SIZE);
        Map<String, String> map = new HashMap<>();

        Printable mapPrintable = new DetailedErrorPrintable(map, "Hello World!");
        Printable simplePrintable = new SimplePrintable("Всё идёт по плану");

        addPrintablesToBuffer(buffer, simplePrintable, mapPrintable);

        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");

        String[] forPrint = buffer.printObjects();
        for (String print: forPrint) {
            System.out.println(print);
        }

        map.put("four", "4");
        Printable t = buffer.get(0); //get map printable
        t.updateMessage("    Превышен рекомендованный размер.\r\n");

        forPrint = buffer.printObjects();
        for (String print: forPrint) {
            System.out.println(print);
        }

        // Необходимо добавить в буффер объекты Printable так,
        // чтобы при вызове метода printObject перед выводом getMessage в квадратных скобках выводился timestamp,
        // в который производился последний вызов метода Printable#updateMessage
        // [2024-03-13 14:01:01.813]Всё идёт по плану - пример
        // Реализовать ниже и для DetailedErrorPrintable и для SimplePrintable
        // TODO:

        TimeStampPrintable simpleTimeStampPrintable = new TimeStampPrintable(simplePrintable);
        TimeStampPrintable detailedTimeStampPrintable = new TimeStampPrintable(mapPrintable);

        simpleTimeStampPrintable.updateMessage("Обновление сообщения SimplePrintable");
        detailedTimeStampPrintable.updateMessage("Обновление сообщения DetailedErrorPrintable");

        if(!buffer.isFull())
            addPrintablesToBuffer(buffer, simpleTimeStampPrintable, detailedTimeStampPrintable);

        // Необходимо добавить в буффер объекты Printable так,
        // чтобы при вызове метода getMessage CamelCase был заменен на SnakeCase
        // Пример:
        // Error happened with object: java.util.HashMap@{one=1, two=2, three=3} : ->
        // Error happened with object: java.util.hash_map@{one=1, two=2, three=3} :
        // Реализовать ниже и для DetailedErrorPrintable и для SimplePrintable
        // TODO:

        SnakeCasePrintable detailedPrintableSnakeCase = new SnakeCasePrintable(mapPrintable);
        SnakeCasePrintable simplePrintableSnakeCase = new SnakeCasePrintable(simplePrintable);

        if(!buffer.isFull())
            addPrintablesToBuffer(buffer, simplePrintableSnakeCase, detailedPrintableSnakeCase);

        // Необходимо добавить в буффер объекты Printable, результаты выполнения которых совмещают обе предыдущие
        // модификации
        // TODO:

        SnakeCasePrintable detailedPrintableSnakeCaseWithTimeStamp = new SnakeCasePrintable(detailedTimeStampPrintable);
        SnakeCasePrintable simplePrintableSnakeCaseWithTimeStamp = new SnakeCasePrintable(simpleTimeStampPrintable);

        if(!buffer.isFull())
            addPrintablesToBuffer(buffer, simplePrintableSnakeCaseWithTimeStamp, detailedPrintableSnakeCaseWithTimeStamp);


        forPrint = buffer.printObjects();
        for (String print: forPrint) {
            System.out.println(print);
        }
    }

    private static void addPrintablesToBuffer(PrintableObjectsBuffer buff, Printable... printables) {
        for (Printable p: printables) {
            buff.add(p);
        }
    }
}
