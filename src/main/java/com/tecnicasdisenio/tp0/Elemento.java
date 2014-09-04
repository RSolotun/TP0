package com.tecnicasdisenio.tp0;


public class Elemento
{
	private Elemento next;
	private Object current;
	
	public Elemento(Object elemento)
	{
		this.next = null;
		this.current = elemento;
	}
	
	public Elemento setNext(Object elemento)
	{
		this.next = new Elemento(elemento);
		return this.next;
	}
	
	public Elemento getNextElement()
	{
		return this.next;
	}
	
	public Object getCurrentObject()
	{
		return this.current;
	}
	
}