package cesur.unidad6.pila;

import cesur.unidad6.Node;

public class PilaResuelta implements Pila {

    Node end;
    int size;

    public PilaResuelta() {
        this.end = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(Object o) {
        // Creo un nuevo elemento
        Node new_node = new Node(o);

        // verifico si ya hay algun elemento
        if (end == null)
            //No hay elemento, asigno como último elemento el nuevo nodo generado
            end = new_node;
        else {
            // ya hay elemento en la pila,
            // actualizo el siguiente elemento del nuevo elemento, por elemento que ya estaba. lo apilo
            new_node.setNext(end);
            // y defino como ultimo elemento el nuevo elemento
            end = new_node;
        }
        // actualizo el contado de elementos
        size++;
    }

    @Override
    public Object pop() throws PilaVaciaException {
        // verificar que no sea null
        if (end == null) throw new PilaVaciaException();

        // recuperar el el ultimo elemento para devolverlo
        Object o = end.getElem();

        // actualizar el nuevo ultimo elemento (quitar el ultimo elemento de la "lista")
        end = end.getNext();

        // reducir el tamaño
        size--;

        // devolver el ultimo elemento
        return o;
    }

    @Override
    public Object top() throws PilaVaciaException {
        if (end == null) throw new PilaVaciaException();
        else return end.getElem();
    }
}
