package com.tecnicasdisenio.tp0;


public interface Queue 
{
	public boolean isEmpty();
	public int size();
	public void add(Object item); // agregar un item
	public Object top(); // retornar el primer item, lanzar exception si esta vacío.
	public void remove(); // remover el primer item, lanzar exception si esta vacío.
}