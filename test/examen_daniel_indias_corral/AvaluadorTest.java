/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_daniel_indias_corral;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author dic117
 */
public class AvaluadorTest {
    
    private Avaluador instance;
    
    public AvaluadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizando tests...");
    }
    
    @Before
    public void setUp() throws Exception {
        //instance = new Avaluador();
        //instance.mitjana(new Estudiant("Pepito", 5, 5, 5));
        //instance.mitjana(new Estudiant("Maria", 6, 8, 7));
        //instance.mitjana(new Estudiant("Lucia", 4, 4, 3));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
    
    @Test
    public void testMitjanaSiSupera() throws Exception {
        instance = new Avaluador();
        assertEquals(5, instance.mitjanaSiSupera(new Estudiant("Pepito", 5,5,5)), 1.0E-3);
    }

    /**
     * Test of mitjana method, of class Avaluador.
     */
    
    @Test
    public void testMitjana() throws Exception {
        instance = new Avaluador();
        assertEquals(5, instance.mitjana(new Estudiant("Pepito", 5,5,5)), 1.0E-3);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
        instance = new Avaluador();
        Estudiant[] millor = new Estudiant[3];
        millor [1] = new Estudiant("Pepito", 5, 5, 5);
        millor [2] = new Estudiant("Maria", 6, 8, 7);
        assertEquals(millor[2], instance.millorEstudiantPerNotaMitjana(millor));
    }
    
}
