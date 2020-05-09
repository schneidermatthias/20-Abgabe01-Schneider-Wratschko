# Software Configuration Managment

#### Exercise "Testing" (Assignment 01)

Projectmembers:

- [Matthias (BSD 2)](https://github.com/schneidermatthias)
- [Vinzenz Wratschko (BSD 1)](https://github.com/vinziw)

## Drinks Project

The goal of this project is the introduction of software versioning, testing and test automation. The tools, which we are using is java and JUnit 5.

The point of this project is to make various Drinks. In our template we have the abstract class ```Drink```. This class consists of just a ```name``` and the methods ```getVolume() getAlcoholPercent()```, which both return a double value and ```isAlcoholic()```, which returns a boolean. The subclass ```SimpleDrink``` extends ```Drinks``` and contains a name and an Object of the class ```Liquid```. The class ```Liquid``` features a name and values of volume and alcoholPercent. In addition to those given classes, we had to create our own subclass from ```Drinks```.

## Further Implemantation

For our subclass, we chose to make a ```Cocktail```class, which extends ```Drinks```. Cocktails are very complex drinks with a wide varierty of different ingredients. So we decided to add these ingredients into an ArrayList ```ìngredients```. It is also important if the cocktail is alcolic or non-alcohloic, so we gave it a boolean ```alcoholic```. Last but not least, we wanted to let the user decide between "stirred or shaken" - like James Bond.

