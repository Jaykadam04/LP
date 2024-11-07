javac MathOperations.java
javac TestMathOperations.java
javac -h . MathOperations.java

g++ -shared -fPIC -o libMathOperations.so -I"path to include folder" -I"path to linux folder" MathOperations.cpp

java -Djava.library.path=. TestMathOperations
