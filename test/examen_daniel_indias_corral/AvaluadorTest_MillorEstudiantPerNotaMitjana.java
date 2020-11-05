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
import org.junit.Assert;
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
public class AvaluadorTest_MillorEstudiantPerNotaMitjana {
    
    private Avaluador instance;
    
    @Parameterized.Parameter(0)
    public Estudiant estudiant0;
    @Parameterized.Parameter(1)
    public Estudiant estudiant1;
    @Parameterized.Parameter(2)
    public Estudiant estudiantmillor;
    
    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        
        Object[][] data = new Object[][]{
            
            {
                new Estudiant("Pepito",9,7,8),
                new Estudiant("Maria",8,7,8), 
                new Estudiant("Pepito",9,7,8) 
            },
            {
                new Estudiant("Satán",6,6,6), 
                new Estudiant("Lucifer",6,9,6), 
                new Estudiant("Lucifer",6,9,6)
            },
            {
                new Estudiant("Jesús",10,10,10), 
                new Estudiant("Gabriel",6,7,7), 
                new Estudiant("Jesús",10,10,10)
            },
            {
                new Estudiant("Lucia",9,7,8),
                new Estudiant("Carmen",8,7,8), 
                new Estudiant("Lucia",9,7,8) 
            },
            {
                new Estudiant("Juan",7,7,7), 
                new Estudiant("Andrés",6,8,6), 
                new Estudiant("Juan",7,7,7)
            },
            {
                new Estudiant("Toni",10,10,10), 
                new Estudiant("Cristian",6,7,7), 
                new Estudiant("Toni",10,10,10)
            },
            {
                new Estudiant("Pere",7,7,8),
                new Estudiant("Jepeto",6,7,8), 
                new Estudiant("Pere",7,7,8) 
            },
            {
                new Estudiant("Pablo",6,5,6), 
                new Estudiant("Lucas",6,7,6), 
                new Estudiant("Lucas",6,7,6)
            },
            {
                new Estudiant("Oriol",10,10,10), 
                new Estudiant("Gabriel",6,7,7), 
                new Estudiant("Oriol",10,10,10)
            },
            {
                new Estudiant("Gerard",9,7,8),
                new Estudiant("Juanma",8,7,8), 
                new Estudiant("Gerard",9,7,8) 
            },
            {
                new Estudiant("Oscar",6,6,6), 
                new Estudiant("Liam",6,9,6), 
                new Estudiant("Liam",6,9,6)
            },
            {
                new Estudiant("Angel",10,10,10), 
                new Estudiant("Ana",6,7,7), 
                new Estudiant("Angel",10,10,10)
            },
            {
                new Estudiant("Ailin",9,7,8),
                new Estudiant("Pepa",8,7,8), 
                new Estudiant("Ailin",9,7,8) 
            },
            {
                new Estudiant("Paula",6,6,6), 
                new Estudiant("Petalo",6,9,6), 
                new Estudiant("Petalo",6,9,6)
            },
            {
                new Estudiant("Dani",10,10,10), 
                new Estudiant("Hugo",6,7,7), 
                new Estudiant("Dani",10,10,10)
            },
        };
    
        return Arrays.asList(data);
    }
    
    public AvaluadorTest_MillorEstudiantPerNotaMitjana() {
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
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
        instance = new Avaluador();
        Estudiant[] millor = new Estudiant[3];
        millor [0] = estudiant0;
        millor [1] = estudiant1;
        assertEquals(estudiantmillor, instance.millorEstudiantPerNotaMitjana(millor));
    }
    
}
