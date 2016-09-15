# Maven multi-module project to experiment with classloader behavior when the same fully qualified class name exists in two different jars.

1. What happens when jar1 loads first?
1. What happens when jar2 loads first?
1. What happens when a class is referenced by reflection?

* ClassNotFoundException
* NoClassDefFoundError
