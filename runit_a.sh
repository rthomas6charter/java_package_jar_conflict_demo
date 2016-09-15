#!/bin/sh

CP=./jar1/target/Jardemo-JAR1-1.0-SNAPSHOT.jar
CP=$CP:./jar2/target/Jardemo-JAR2-1.0-SNAPSHOT.jar
CP=$CP:./clientapp/target/Jardemo-CLIENTAPP-1.0-SNAPSHOT.jar

export JAVA_HOME=`/usr/libexec/java_home -v 1.7`

echo CLASSPATH=$CP

$JAVA_HOME/bin/java -version

$JAVA_HOME/bin/java -cp $CP org.example.jardemo.clientapp.ClientApp
