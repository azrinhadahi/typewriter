How to execute

1. Compile all java files<br>
javac *.java<br>

2. Invoke rmic<br>
rmic heavyjobImplementationJava<br>

3. Start RMI registry <br>
rmiregistry 8888<br>

4. Start server in another terminal<br>
java heavyjobserver<br>

5. Start the client application in another terminal<br>
java heavyjobclient<br>

