public class ContadorSync {
    int i = 0;
    int valor = 0;
    public synchronized void incrementarSync () //solo un hilo puede acceder a la vez
        {
            i ++;
        }

        public void incrementarBloque()
        {
            synchronized(this)
            {
                valor ++;
            }
        }
}
