package ru.ds.edu.decorator.impl;


import java.sql.Timestamp;
import ru.ds.edu.decorator.Printable;
import ru.ds.edu.decorator.dec.AbstractPrintableDecorator;

public class TimeStampPrintable extends AbstractPrintableDecorator
{
    public TimeStampPrintable(Printable obj) {
        super(obj);
    }

    @Override
    public void updateMessage(String text) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String lastUpdateTimeStamp = "[" + timestamp + "]";
        super.updateMessage(lastUpdateTimeStamp + text);
    }
}
