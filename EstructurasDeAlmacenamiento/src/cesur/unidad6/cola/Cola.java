package cesur.unidad6.cola;

public interface Cola {
    /**
     * Verificar tamaño
     */
    public int size();

    /**
     * verificar is está vacía
     */
    public boolean isEmpty();

    /**
     * Encolar
     * @param o
     */
    public void enqueue(Object o);

    /**
     * Sacar objecto de cola
     * @return objecto
     * @throws ColaVaciaException
     */
    public Object dequeue() throws ColaVaciaException;

    /**
     * Obtener el primer elemento de la cola
     * @return
     * @throws ColaVaciaException
     */
    public Object first() throws ColaVaciaException;
}
