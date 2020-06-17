package cn.jpsite.learning.javaagent01;

import cn.jpsite.learning.Dog;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

public class JpAgent {
    public static void premain(String agentArgs, Instrumentation instrumentation)  {

        /*转换发生在 premain 函数执行之后，main 函数执行之前，这时每装载一个类，transform 方法就会执行一次，看看是否需要转换，
        所以，在 transform（Transformer 类中）方法中，程序用 className.equals("TransClass") 来判断当前的类是否需要转换。*/
        // 方式一：
        instrumentation.addTransformer(new JpClassFileTransformerDemo());
        System.out.println("我是两个参数的 Java Agent premain");
    }
    public static void premain(String agentArgs){
        System.out.println("我是一个参数的 Java Agent premain");
    }


    public static void agentmain (String agentArgs, Instrumentation inst) throws UnmodifiableClassException {
        System.out.println("insert");
        inst.addTransformer(new JpClassFileTransformerDemo(), true);
        // retransformClasses 是 Java SE 6 里面的新方法，它跟 redefineClasses 一样，可以批量转换类定义
        System.out.println("insert2");
        inst.retransformClasses(Dog.class);
        System.out.println("我是两个参数的 Java Agent agentmain");

    }
    public static void agentmain (String agentArgs){
        System.out.println("我是一个参数的 Java Agent agentmain");
    }



}
