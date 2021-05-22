package com.tipsandtricks;

public class SingleGenericHolder<T> {
    // Generics in JAVA = Create a JAVA Class with any type you want as parameter.
    T obj;

    public SingleGenericHolder(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        SingleGenericHolder<Integer> integerSingleGenericHolder = new SingleGenericHolder<Integer>(10);
        System.out.println(integerSingleGenericHolder.getObj());

        SingleGenericHolder<String> stringSingleGenericHolder = new SingleGenericHolder<String>("Simple code");
        System.out.println(stringSingleGenericHolder.getObj());
    }
}