package com.tecnicasdisenio.tp0;


public class Cola implements Queue
{

	private Elemento primerElemento;
	private Elemento ultimoElemento;

    public boolean isEmpty()
	{
		return (primerElemento==null);
	}
	public int size()
	{
		Elemento current = primerElemento;
		int cantidadDeElementos = 0;
		while(current != null)
		{
			cantidadDeElementos++;
		}
		return cantidadDeElementos;
	}
	public void add(Object item)
	{
		ultimoElemento.setNext(item);
		ultimoElemento = ultimoElemento.getNextElement();
	}
	public Object top()
	{
		return primerElemento.getCurrentObject();
	}
	public void remove()
	{
		primerElemento = primerElemento.getNextElement();
	}
}