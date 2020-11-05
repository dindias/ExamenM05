/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_daniel_indias_corral;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author dic117
 */
@RunWith(Parameterized.class)
public class AvaluadorTest_Mitjana {
    
    private Avaluador instance;
    
    @Parameterized.Parameter(0)
    public Estudiant estudiant0;
    @Parameterized.Parameter(1)
    public double mitjana;
    
    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        
        Object[][] data = new Object[][]{
            {new Estudiant("Pepito",9,7,8), 8},
            {new Estudiant("Satán",6,6,6), 6},
            {new Estudiant("Jesús",10,10,10), 10},
            {new Estudiant("Clown",6,9,0), 5},
            {new Estudiant("Oscar",5,5,5), 5},
            {new Estudiant("Manuel",6,5,6), 5.66},
            {new Estudiant("Lucia",3,4,5), 4},
            {new Estudiant("Alba",7,5,7), 6.33},
            {new Estudiant("Hussain",6,8,9), 7.66},
            {new Estudiant("Antonio",4,5,8), 5.66},
            {new Estudiant("Oriol",7,6,7), 6.66},
            {new Estudiant("Juan",8,7,8), 7.66},
            {new Estudiant("Martí",9,8,9), 8.66},
            {new Estudiant("Gerard",8,9,9), 8.66},
            {new Estudiant("Victor",7,6,5.5), 6.16},
        };
    
        return Arrays.asList(data);
    }
    
    public AvaluadorTest_Mitjana() {
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
     * Test of mitjana method, of class Avaluador.
     */
    
    @Test
    public void testMitjana() throws Exception {
        instance = new Avaluador();
        assertEquals(mitjana, instance.mitjana(estudiant0), 1.0E-2);
    }
}
