
package Modelo;


public interface Iequipo {
    public boolean AlineDefensa(Futbolista f);
    public boolean AlineaCentroCampista(Futbolista f);
    public boolean AlineaDelantero(Futbolista f);
    public boolean AlienaPortero(Portero p);
    public int CalculaMedia();
   public boolean equipolleno();
}
