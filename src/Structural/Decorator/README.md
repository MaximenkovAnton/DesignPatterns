# Decorator
Attach additional responsibilities to an object dynamically keeping the same interface. Decorators provide a flexible
alternative to subclassing for extending functionality.

Let's imagine, that we need to create a soft that will sell ice-creams with different flavours. Can you imagine the 
amount of classes we will need to create an inherited classes of ice-creams with different flavours just to count its
price? And what will you do, if something (for-example nuts) will change it's price? How much classes you should change
to make everything works correctly

* Let's create a `Product`. It will be an abstract class, a parent of all of our products. 
* We will also need a `Flavor` class, that will be a parent for all the flavors in our shop.
* Let's create a simple classes for 2 types of ice-creams and 2 type of flavours (as an example).
* `Flavor` should have a link on the previous `product` to find out, what is it and how much does it cost.

P.s. It's not a perfect implementation for that pattern. It could become better if to use a Factory pattern (or Builder
pattern)with it, but I wanted to show the idea here. Hope you will understand how to combine them. If not - write me, I
will make an example of this combining as well.