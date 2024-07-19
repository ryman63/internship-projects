package ru.ds.education.fishing.api;

import java.util.List;

/**
 * интерфейс фабрики товаров для рыбалки
 */
public interface FishingGoodFactory {
    /**
     * Создает и выпускает паллет с продукцией
     *
     * @param size - кол-во продукции в паллете
     * @return
     */
    List<Product> getPallet(int size);

    /**
     * Возвращает наименование продукции, которую выпускает фабрика
     *
     * @return
     */
    ProductName productName();

}