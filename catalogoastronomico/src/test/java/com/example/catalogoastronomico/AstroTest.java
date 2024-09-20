package com.example.catalogoastronomico;


import org.junit.Test;
import static org.junit.Assert.*;
    public class AstroTest {
        @Test
        public void crear_objeto_y_getters() {
            Astro a = new Astro("nombre", 1.1, 2.2 ); assertEquals("nombre", a.getNombre()); assertEquals(1.1, a.getBrillo(), 1E-10);
            assertEquals(2.2, a.getDistancia(), 1E-10);
        }
        @Test
        public void constructor_por_defecto() {
            Astro a = new Astro(); assertEquals("Sirius", a.getNombre()); assertEquals(-1.42, a.getBrillo(), 1E-10);
            assertEquals(8.7, a.getDistancia(), 1E-10);
        }
        @Test
        public void setters() { Astro a = new Astro(); a.setNombre("nuevo");
            a.setBrillo(-2.6); a.setDistancia(4.5); assertEquals("nuevo", a.getNombre());
            assertEquals(-2.6, a.getBrillo(), 1E-10); assertEquals(4.5, a.getDistancia(), 1E-10); }
        @Test
        public void equals_esCorrecto() {
            Astro a = new Astro(); Astro b = new Astro("Sirius", -1.42, 8.7);
            Astro c = new Astro("Sirius", -1.42, 8.8);
            assertEquals(a, b);
            assertNotEquals(a, c);
        }


}
