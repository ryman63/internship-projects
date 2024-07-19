package ru.ds.edu.filecounter.file;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Утилитный класс, содержащий вспомогательные функции
 * для реализации {@link FileCounterService}
 */
public final class FileCounterUtils {

    private static FileExtensionCount count;

    /**
     * Возвращает расширение файла.
     * <p>
     * Если у файла отсутствует расширение,
     * то возвращает - "no-ext"
     *
     * @param fileName - наименование файла
     * @return
     */
    public static String fileExtension(String fileName)
    {
        int dotIndex = fileName.lastIndexOf(".");

        return (dotIndex == -1) ? "no-ext" : fileName.substring(dotIndex + 1);
    }


    /**
     * Находит в списке writable необходимую группу -
     * (сравнение происходит по {@link FileExtensionCount#getExtension()})
     * и прибавляет к ней кол-во, переданное в item.
     * <p>
     * Если в списке отсутствует группа, то в список добавляется новый элемент с соответствующими параметрам
     *
     * @param item     - элемент, который нужно просуммировать в списке writable или добавить новый,
     *                 если в списке отсутствует такая группа.
     * @param writable - список, содержащий сгруппированное по расширению кол-во файлов
     */
    public static void writeExtensionCount(FileExtensionCount item, List<FileExtensionCount> writable) {

        for (FileExtensionCount count : writable) {
            if (count.getExtension().equals(item.getExtension())) {
                count.increaseCount(item.getCount());
                return;
            }
        }
        writable.add(item);

    }
}
