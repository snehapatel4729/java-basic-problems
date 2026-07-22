package MethodRefernce;
@FunctionalInterface
public interface Creator<T> {
 T create(String name);
}
