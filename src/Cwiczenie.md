# JavaPodstawy-PierwszaKlasa
Pierwsza klasa dla początkujących. 

# TREŚĆ ZADANIA:
1) Załóż konto na Github'ie (to prostsze niż założenie konta na Facebook'u) [Github](https://github.com/)
2) Stwórz repozytorium o nazwie `MojaPierwszaKlasa` [Jak Stworzyć Repozytorium](https://help.github.com/articles/creating-a-new-repository/)
3) Stwórz swój pierwszy plik, czyli swoją pierwszą klasę w Javie o nazwie `Przelew.java` lub `WireTransfer.java` (angielski dominuje w programowaniu). 
[Przykład klasy Rower](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)

# MATERIAŁY:
Materiały na YouTube'ie. Wszystkie lekcje, ale przede wszystkim: [Jak Zostać Programistą Java - lekcja 5: Typy Proste (Prymitywne)](https://www.youtube.com/watch?v=6JPRtoGIaeE)
Twoim największym przyjacielem jest Google. Jeśli czegoś nie wiesz to zapytaj Google. Przydatne hasła: 
  * "Metody w Javie", 
  * "Jak stworzyc klasę w Javie"
  * "Pola w klasie"
  * "Typ danych String"

# O KLASIE:
Będzie to klasa o nazwie `Przelew` lub `WireTransfer`.

# O POLACH KLASY:
Wejdź na stronę banku, z którego robisz przelewy i zobacz jakie dane znajdują się w formularzu przelewu.
Każde pole, które znajdziesz w formularzu przelewu np. kwota, tytuł przelew, etc. musi się również znaleźć jako pole w twojej klasie.

# O METODACH KLASY:
W ramach ćwiczenia stwórz metodę o nazwie `wypiszDanePrzelewu()` lub `printWireTransfer()`, która podobnie jak w przypadku pierwszego programu 
`HelloWorldApp` wypisze coś w konsoli.

Szablon dla twojej klasy:
```java
public class Przelew {

    // miejsce na pola klasy
    
    // miejsce na konstruktor
    
    // miejsce na metodę
}
```

# JAK PRZETESTOWAĆ MOJĄ KLASĘ
Stwórz drugą klasę o nazwie Test tylko z metodą `main` i wewnątrz tej klasy utwórz obiekt swojej klasy oraz wywołaj metodę `wypiszDanePrzelewu()`


```java
public class Test {
    public static void main(String[] args) {
        double amount = 199;
        String title = "Przelew do ZUSu";
        Przelew przelew = new Przelew(title, amount); // dodaj więcej pól do konstruktora
        przelew.wypiszDanePrzelewu();
    }
}
```
