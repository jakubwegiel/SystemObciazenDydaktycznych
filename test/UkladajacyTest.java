/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jakub
 */
public class UkladajacyTest {
    UkladajacyJFrame u= new UkladajacyJFrame();
    ArrayList<String> hWyklad=new ArrayList<String>();
    ArrayList<String> gWyklad=new ArrayList<String>();
    ArrayList<String> hCwiczenia=new ArrayList<String>();
    ArrayList<String> gCwiczenia=new ArrayList<String>();
    ArrayList<String> hLaboratoria=new ArrayList<String>();
    ArrayList<String> gLaboratoria=new ArrayList<String>();
    ArrayList<String> hProjekt=new ArrayList<String>();
    ArrayList<String> gProjekt=new ArrayList<String>();
    public UkladajacyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testLiczbaGodzin(){
        hWyklad.add("15");
        gWyklad.add("1");
        hCwiczenia.add("30");
        gCwiczenia.add("1");
        hLaboratoria.add("15");
        gLaboratoria.add("1");
        hProjekt.add("30");
        gProjekt.add("1");
        hWyklad.add("30");
        gWyklad.add("1");
        hCwiczenia.add("15");
        gCwiczenia.add("1");
        hLaboratoria.add("30");
        gLaboratoria.add("1");
        hProjekt.add("16");
        gProjekt.add("1");
        assertEquals(181, u.liczbaGodzin(hWyklad,gWyklad,hCwiczenia,gCwiczenia,hLaboratoria,gLaboratoria,hProjekt,gProjekt));
    }
    
    @Test
    public void testSprawdzHaslo1(){
        String haslo1="haslo123!@#";
        assertTrue(u.sprawdzHaslo(haslo1));
    }
    
    @Test
    public void testSprawdzHaslo2(){
        String haslo2="h1!";
        assertFalse(u.sprawdzHaslo(haslo2));
    }
    
    @Test
    public void testSprawdzHaslo3(){
        String haslo3="haslo123456";
        assertFalse(u.sprawdzHaslo(haslo3));
    }
    
    @Test
    public void testSprawdzHaslo4(){
        String haslo4="haslo!@#$%^";
        assertFalse(u.sprawdzHaslo(haslo4));
    }
    
    @Test
    public void testSprawdzLiczbaGrup1(){
        int lDzialPg=20;
        int lDzialP=8;
        String liczbaDzial="4";
        int lDzialBaza=3;
        assertTrue(u.sprawdzLiczbaGrup(lDzialPg,lDzialP,liczbaDzial,lDzialBaza));
    }
    
    @Test
    public void testSprawdzLiczbaGrup2(){
        int lDzialPg=20;
        int lDzialP=18;
        String liczbaDzial="5";
        int lDzialBaza=3;
        assertTrue(u.sprawdzLiczbaGrup(lDzialPg,lDzialP,liczbaDzial,lDzialBaza));
    }
    
    @Test
    public void testSprawdzLiczbaGrup3(){
        int lDzialPg=10;
        int lDzialP=4;
        String liczbaDzial="8";
        int lDzialBaza=1;
        assertFalse(u.sprawdzLiczbaGrup(lDzialPg,lDzialP,liczbaDzial,lDzialBaza));
    }
}
