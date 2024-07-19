package ru.ds.education.fishing.api;

import java.util.List;

/**
 * Интерфейс рыболовного магазина
 */
public interface FishingStore {

    /**
     * Получает на вход паллету с продукцией и увеличивает остатки данной продукции
     *
     * @param pallet - паллета с продукцией
     */
    void receiveProduct(List<Product> pallet);

    /**
     * Возвращает остаток продукции по наименованию
     *
     * @param productName - наименование продукции
     * @return
     */
    int getBalance(ProductName productName);

    /**
     * Купить продукт
     * Должен вернуть продукт и уменьшить баланс по продукту
     *
     * @param productName - наименование продукции
     * @return
     */
    Product buy(ProductName productName);

}