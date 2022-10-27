package ProvaQ05;

public abstract class UfalBluetooth
{
    public UfalBluetooth()
    {
        AbrirConexão();
        ProcessarDados();
        FecharConexão();
    }
    public void AbrirConexão() 
    {
        System.out.println("Conetando -> Ufal Bluetooth");
    }
    public abstract void ProcessarDados();
    public void FecharConexão() 
    {
        System.out.println("Ufal Bluetooth encerrada!");
    }
}
