package ru.ds.edu.filecounter.file;

import java.util.List;

/**
 * Сервис подсчета файлов.
 */
public interface FileCounterService {

    /**
     * Подсчитывает кол-во файлов, в переданной директории,
     * включая файлы, во всех вложенных директориях на всех уровнях.
     * <p>
     * Возвращает кол-во файлов, сгруппированных по типу (расширению)
     *
     * @param rootPath - путь к корневой директории.
     * @throws FileCounterException - выкидывает исключение,
     *                                     если на вход передана не директория
     */
    List<FileExtensionCount> countGroupByExtension(String rootPath) throws FileCounterException;
}
