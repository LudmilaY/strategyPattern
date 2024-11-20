/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package padraostrategy;
import padraostrategy.Produto;

import junit.framework.TestCase;

/**
 *
 * @author user
 */
public class PadraoStrategyTest extends TestCase {
    
    Produto produto1;
    Produto produto2;
    Produto produto3;
    
    public PadraoStrategyTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        produto1 = new TV();
        produto2 = new Celular();
        produto3 = new Camera();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
//(produto1.getTipoImpressao()+produto1.getNome()+ " na promoção "+produto1.getPromocao()+
    //" com desconto de "+produto1.desconto()+"%");
    public void testGetEstado_TV(){
        assertEquals("Impressora>>", produto1.getTipoImpressao());
        assertEquals("TV", produto1.getNome());
        assertEquals("Queima de Estoque", produto1.getPromocao());
        assertEquals(20, produto1.desconto());
    }
    
    public void testGetEstado_Celular(){
        assertEquals("PDF>>", produto2.getTipoImpressao());
        assertEquals("Celular", produto2.getNome());
        assertEquals("Natal", produto2.getPromocao());
        assertEquals(15, produto2.desconto());
    }
    
    public void testGetEstado_Camera(){
        assertEquals("PDF>>", produto3.getTipoImpressao());
        assertEquals("Camera", produto3.getNome());
        assertEquals("Dia das Mães", produto3.getPromocao());
        assertEquals(10, produto3.desconto());
    }
    
}
