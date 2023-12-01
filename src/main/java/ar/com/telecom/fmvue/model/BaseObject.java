package ar.com.telecom.fmvue.model;

public interface BaseObject<T, U> {
    T getId();
    void setId(T id);

    U getUsuarioCreacion();
    void setUsuarioCreacion(U usuarioCreacion);

    U getUsuarioUltMod();
    void setUsuarioUltMod(U usuarioUltMod);
}
