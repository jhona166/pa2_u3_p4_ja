package com.example.demo.funcional;
@FunctionalInterface
public interface IPersonaUnaryFunction<T> {
	public T aplicar(T arg);
}
