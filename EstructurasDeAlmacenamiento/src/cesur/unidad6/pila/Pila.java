package cesur.unidad6.pila;

public interface Pila {

    /**
     * Verificar tamaño
     */
    public int size();

    /**
     * verificar is está vacía
     */
    public boolean isEmpty();

    /**
     * Insertar un objeto en la pila
     */
    public void push(Object o);

    /**
     * Recuperar un objeto de la pila
     * @return object
     * @throws PilaVaciaException
     */
    public Object pop() throws PilaVaciaException;

    /**
     * Obtener el objeto de la cima
     * @return object
     * @throws PilaVaciaException
     */
    public Object top() throws PilaVaciaException;

}
