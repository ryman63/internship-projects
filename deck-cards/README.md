# Колода карт

Реализуйте классы Card, Rank, Suit и Deck.

Класс Card представляет из себя игральную карту и должен обладать следующими характеристиками:
* При создании должны задаваться масть и номинал карты;
* Должен возвращать номинал карты;
* Должен возвращать масть карты;
* Должен возвращать строку с номиналом и мастью карты в наиболее понятном и лаконичном формате;
* Номинал и масть должны быть неизменяемыми.

Rank - номинал карты, от двойки до туза.

Suit - это масти игральных карт (бубны, трефы, червы, пики).

Deck - это карточная колода карт. Класс должен обладать следующими характеристиками:
* При создании колоды необходимо указать формат колоды: полная (52 карты - от двоек до тузов), 36 карт (сокращенная колода, от шестёрок до тузов). Колода создается в упорядоченном порядке.
* Возможность перетасовать колоду в случайном порядке;
* Возможность снова упорядочить колоду. 
* Метод возвращающий строку, содержащую текущую последовательность колоды в понятном и лаконичном формате.

Также необходимо реализовать программу демонстрирующую все описанные выше возможности.