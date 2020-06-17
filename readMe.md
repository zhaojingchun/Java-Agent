
## https://juejin.im/post/5e1423b45188253aae7d86c7 demo code
### 工程目录下执行
```java
java -javaagent:./agent/target/java-agent-jar-with-dependencies.jar -cp ./example01/target/example01-1.0-SNAPSHOT.jar  cn.jpsite.learning.Main
```
[Java Agent入门实战（一）](https://juejin.im/post/5e0acd425188253a8a7d352c)  
[Java Agent入门实战（二）](https://juejin.im/post/5e0acd425188253a8a7d352c)  
[Java Agent入门实战（三）](https://juejin.im/post/5e0acd425188253a8a7d352c)
```shell

java -javaagent:./agent/target/java-agent-jar-with-dependencies.jar -cp ./example01/target/example01-jar-with-dependencies.jar cn.jpsite.learning.Main

java -javaagent:./agent/target/java-agent-jar-with-dependencies.jar -cp ./example01/target/example01-jar-with-dependencies.jar cn.jpsite.learning.WhileMain

java -cp ./example01/target/example01-jar-with-dependencies.jar cn.jpsite.learning.WhileMain

```
先运行
```shell
1、java -cp ./example01/target/example01-jar-with-dependencies.jar cn.jpsite.learning.WhileMain
2、查看对应pid
3、jps -l
4、修改 cn.jpsite.learning.javaagent01.AttachThread 类的attach ID
5、执行main方法
```