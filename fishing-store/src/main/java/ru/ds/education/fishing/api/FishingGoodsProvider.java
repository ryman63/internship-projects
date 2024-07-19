package ru.ds.education.fishing.api;

import java.util.List;


/**
 * Интерфейс поставщика товаров для рыбалки
 * <p>
 * Реализация должна хранить в себе набор фабрик продукций, по наименованию продукта
 * определять фабрику и получать необходимый продукт
 */
public interface FishingGoodsProvider {

    /**
     * Выполняет роль делегата.
     * <p>
     * Возвращает паллету с запрашиваемой продукцией
     *
     * @param productName - наименование необходимого продукта
     * @param size        - кол-во запрашиваемой продукции
     * @return
     */
    List<Product> orderProduct(ProductName productName, int size);
}