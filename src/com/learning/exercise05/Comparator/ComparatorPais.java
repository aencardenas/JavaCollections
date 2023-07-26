package com.learning.exercise05.Comparator;

import com.learning.exercise05.Entity.Pais;

import java.util.Comparator;

public class ComparatorPais {

    public static Comparator<Pais> ordenarAlfabeticamente = Comparator.comparing(Pais::getNombre);

}
