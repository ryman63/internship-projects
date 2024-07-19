package ru.ds.edu.filecounter.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileCounter implements FileCounterService
{

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
    @Override
    public List<FileExtensionCount> countGroupByExtension(String rootPath) throws FileCounterException
    {
        File directory = new File(rootPath);
        if (!directory.isDirectory()) {
            throw new FileCounterException("Данный путь не является каталогом.");
        }

        List<FileExtensionCount> fileCountByExtension = new ArrayList<>();
        countFiles(directory, fileCountByExtension);

        return fileCountByExtension;

    }

    private void countFiles(File directory, List<FileExtensionCount> fileCountByExtension) {
        File[] directoryFiles = directory.listFiles();
        if (directoryFiles != null) { //для предотвращения NullPointerException
            for (File file : directoryFiles) {
                if (file.isDirectory()) {
                    countFiles(file, fileCountByExtension);
                } else {
                    String extension = FileCounterUtils.fileExtension(file.getName());
                    FileCounterUtils.writeExtensionCount(new FileExtensionCount(extension, 1), fileCountByExtension);
                }
            }
        }
    }

}
