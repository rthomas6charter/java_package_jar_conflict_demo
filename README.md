Maven project to experiment with classloader behavior when the same fully
qualified class name exists in two different jars.

# What happens when jar1 loads first?
# What happens when jar2 loads first?
# What happens when a class is referenced by reflection?

* ClassNotFoundException
* NoClassDefFoundError
