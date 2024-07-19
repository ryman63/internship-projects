package ru.ds.education.fishing.api;

/**
 * Интерфейс продукции для рыбалки
 * Вся продукция наследуется от этого интерфейса для дальнейшей реализации фабрик и поставщиков
 *
 */
public interface Product {
    ProductName name();
}