package tema6;

import java.util.*;

public class ListaEnlazada<E> implements List<E> {

    private Nodo<E> primerElemento;
    private Nodo<E> ultimoElemento;
    private int numElementos;

    public ListaEnlazada() {
        this.numElementos = 0;
    }

    @Override
    public int size() {
        return numElementos;
    }

    @Override
    public boolean isEmpty() {

        return numElementos == 0;
    }

    @Override
    public boolean contains(Object o) {
        return this.indexOf(o) != -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListaEnlazadaIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {

        Nodo<E> nuevoNodo = new Nodo<E>(e);
        if (this.isEmpty()) {
            primerElemento = nuevoNodo;
        } else {
            ultimoElemento.setSigueinte(nuevoNodo);
            nuevoNodo.setAnterior(ultimoElemento);
        }
        ultimoElemento = nuevoNodo;
        numElementos++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int posicionElemento = this.indexOf(o);
        if (posicionElemento != -1) {
            Nodo<E> nodoActual = primerElemento;

            for (int i = 0; i <= posicionElemento; i++) {
                if (i == posicionElemento) {

                    if (nodoActual.getAnterior() != null) {
                        nodoActual.getAnterior().setSigueinte(nodoActual.getSigueinte());

                    } else {
                        nodoActual.getSigueinte().setAnterior(null);
                        primerElemento = nodoActual.getSigueinte();
                    }
                    if (nodoActual.getSigueinte() != null) {
                        nodoActual.getSigueinte().setAnterior(nodoActual.getAnterior());

                    } else {
                        nodoActual.getAnterior().setSigueinte(null);
                        ultimoElemento = nodoActual.getAnterior();
                    }
                    numElementos--;
                } else {
                    nodoActual = nodoActual.getSigueinte();
                }
            }
        }
        return posicionElemento != -1;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return getNodo(index).getElemento();
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {
        if (index > 0 && index <= numElementos) {
            if (index == numElementos) {
                add(element);
            }
        } else {
            Nodo<E> nuevoNodo = new Nodo<E>(element);
            Nodo<E> nodoPosicion = getNodo(index);
            // Referenciamos el nuevo nodo indicando la posicion anterior de nodoPosicion
            nuevoNodo.setAnterior(nodoPosicion.getAnterior());
            // Referenciamos el nuevo nodo indicando la posicion de nodoPosicion
            nuevoNodo.setSigueinte(nodoPosicion);
            // El nodo no es el primero.
            if (nodoPosicion.getAnterior() != null) {
                nodoPosicion.getAnterior().setSigueinte(nuevoNodo);
            } else {
                primerElemento = nuevoNodo;
            }
            nodoPosicion.setAnterior(nuevoNodo);
            numElementos++;
        }
    }

    @Override
    public E remove(int index) {
        return null;
    }
    /**
     * Devuelve la posicion del nodo
     * @param o element to search for
     * @return
     */
    @Override
    public int indexOf(Object o) {
        int indice = -1; // Devolver el indice (-1) -> es devolver que no se encuentra el elemento
        int indiceActual = 0;
        Nodo<E> nodoActual = primerElemento;
        // Mientras que haya nodos y no haya encontrado, se ejecuta el while.
        while (nodoActual != null && indice == -1) {
            if (nodoActual.getElemento() == null) {
                if (o == null) {
                    indice = indiceActual;
                }
                // Si el elemento guardado en el nodoactual es igual al que busca.
            } else if (nodoActual.getElemento().equals(o)) {
                indice = indiceActual;
            }
            nodoActual = nodoActual.getSigueinte();
            indiceActual++;

        }
        return indice;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    private Nodo<E> getNodo(int index) {
        Nodo<E> NodoActual;

        if (index >=0 && index < numElementos) {

            if (index < (numElementos >> 1)) {
                NodoActual = primerElemento;
                for (int i = 0; i < index; i++) {
                    NodoActual = NodoActual.getSigueinte();
                }
            } else {
                NodoActual = ultimoElemento;
                for (int i = (numElementos - 1); i > index; i--) {
                    NodoActual = NodoActual.getAnterior();
                }
            }
        } else {
            throw new IndexOutOfBoundsException("Invalid");
        }
        return NodoActual;
    }
    protected class ListaEnlazadaIterator implements Iterator<E> {

        Nodo<E> ultimoNodoDevuelto;
        int numElementsDevueltos;
        public ListaEnlazadaIterator() {
            // llama al primer eñemento de la clase listaEnlazada
            // por si hubiese un atributo en la clase
            // lista enlazada iterator que se llame
            // igual que otro la clase global lista enlazada
            // nodoIterator = listaEnlazada.this.primerElemento;
            numElementsDevueltos = 0;
        }

        /**
         *
         * @return
         */
        @Override
        public boolean hasNext() {
            return  numElementsDevueltos < numElementos;
        }
            /**
             *  if (ultimoNodoDevuelto == null) {
             *                 return  primerElemento != null;
             *             } else {
             *                 return ultimoNodoDevuelto.getSigueinte() != null;
             *             }
             *         }
              */

        @Override
        public E next() {
            if (ultimoNodoDevuelto == null) {
                ultimoNodoDevuelto = primerElemento;
            } else {
                ultimoNodoDevuelto = ultimoNodoDevuelto.getSigueinte();
            }
            if(ultimoNodoDevuelto == null) {
                throw new NoSuchElementException("No hay siguiente element");
            }
            numElementsDevueltos++;
            return ultimoNodoDevuelto.getElemento();
        }
    }
}
