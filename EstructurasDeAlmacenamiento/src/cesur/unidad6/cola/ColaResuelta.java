package cesur.unidad6.cola;

import cesur.unidad6.Node;

public class ColaResuelta implements Cola {

    private Node first;
    private Node end;
    private int size;


    public ColaResuelta() {
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
    public void enqueue(Object o) {
        Node newNode = new Node(o);
        // defino como ultimo elemento el nuevo elemento generado
        end = newNode;

        if (first == null) {
            // si no hay elementos, defino el nuevo elemento como primero
            first = newNode;
        } else {
            // defino en el ultimo elemento cual es el siguiente
            end.setNext(newNode);
        }
        // Actualizo el tamaño
        size++;
    }

    @Override
    public Object dequeue() throws ColaVaciaException {
        if (first == null) throw new ColaVaciaException();

        // Recuperamos el primer elemento
        Object o = first.getElem();

        // Actualizamos el primer elemento por el siguiente
        first = first.getNext();

        // Reducimos el tamaño
        size--;

        //Devolvemos el elemento
        return o;
    }

    @Override
    public Object first() throws ColaVaciaException {
        if (first == null) throw new ColaVaciaException();
        else return first.getElem();
    }

}
