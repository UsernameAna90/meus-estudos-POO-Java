package biblioteca;

public interface Publicacao {
    
    //DECLARANDO MÉTODOS ABSTRATOS
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int num);
    public abstract void avancarPag();
    public abstract void voltarPag();
}
