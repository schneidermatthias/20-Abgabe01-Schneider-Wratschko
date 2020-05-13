# Software Configuration Managment

#### Exercise "Testing" (Assignment 01)

Projectmembers:

- [Matthias (BSD 2)](https://github.com/schneidermatthias)
- [Vinzenz Wratschko (BSD 1)](https://github.com/vinziw)

## Drinks Project

The goal of this project is the introduction of software versioning, testing and test automation. The tools, which we are using is java and JUnit 5.

The point of this project is to make various Drinks. In our template we have the abstract class ```Drink```. This class consists of just a ```name``` and the methods ```getVolume() getAlcoholPercent()```, which both return a double value and ```isAlcoholic()```, which returns a boolean. The subclass ```SimpleDrink``` extends ```Drinks``` and contains a name and an Object of the class ```Liquid```. The class ```Liquid``` features a name and values of volume and alcoholPercent. In addition to those given classes, we had to create our own subclass from ```Drinks```.

## Further Implementation

For our subclass, we chose to make a ```Cocktail```class, which extends ```Drinks```. Cocktails are very complex drinks with a wide varierty of different ingredients and liquids. So we decided to add these ingredients and liquids into an ArrayList ```ingredients``` and ```liquid```. It is also important if the cocktail is a big or small Cocktail, so we gave it a boolean ```bigCockatil```. Last but not least, we wanted to let the user decide between "stirred or shaken" - like James Bond and set a boolean ```shaken```.

Here you can see a code snippet of our JamesBondException:

![](https://66.media.tumblr.com/c8cffd82517856d1a7f7fe1874ab62ce/tumblr_mxw6z8bRXU1rw29kqo1_500.gifv)

```java
/**
 * @param shakenNotStirred method, which asks the user, if is a fan of James Bond
 * @throws JamesBondException if not shaken
 */
public void shakenNotStirred(boolean shaken) throws JamesBondException{
	try {
		if(!shaken){
			throw new JamesBondException("Mr. Bond wouldn't be satisfied");
		}
		else{
			System.out.println("Like the good old Mr. Bond");

		}

	}
	catch (JamesBondException ignored){

	}

}
```
