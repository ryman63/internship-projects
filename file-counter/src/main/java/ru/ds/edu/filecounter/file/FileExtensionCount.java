package ru.ds.edu.filecounter.file;

/**
 * Модель, для группировки кол-ва файлов по расширению
 */
public final class FileExtensionCount {

    /**
     * Расширение файла
     */
    private String extension;

    /**
     * Кол-во файлов
     */
    private int count;

    /**
     * @param extension - расширение файла
     * @param count     - кол-во файлов
     * @throws FileCounterException - выкидывает исключение,
     *                              если передано некорректное расширение
     */
    public FileExtensionCount(String extension, int count) {

        if (extension == null || extension.trim().equals("")) {
            throw new FileCounterException("Расширение не должно быть пустым или 'null'");
        }

        this.extension = extension;
        this.count = count;
    }

    public String getExtension() {
        return this.extension;
    }

    public int getCount() {
        return this.count;
    }

    /**
     * Увеличивает счетчик файлов, на переданное число.
     *
     * @param count - кол-во, на которое необходимо увеличить
     */
    public void increaseCount(int count) {
        this.count = this.count + count;
    }
}
