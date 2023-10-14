package cap13;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MegasenaUtilitarioTest {

    private static Aluno aluno;

    @BeforeAll
    static void iniciarAntesDeTodosTestes() {
        //System.out.println("BeforeAll: Iniciar Antes De Todos Testes ");
        aluno = new Aluno("Ana", 39, 'F', 12365875, "10/01/1191", 158f, "Programacao");
    }

    @BeforeEach
    void iniciarAntesDeCadaTestes() {
        //System.out.println("BeforeEach: Iniciar Antes De Cada Teste ");
    }

    @AfterAll
    static void executaAntesDeTodosTestes() {
        //System.out.println("AfterAll: Executa Antes De Todos Testes");
    }

    @AfterEach
    void executaAntesDeCadaTeste() {
        //System.out.println("AfterEach: Executa Antes De Cada Teste");
    }

    @Test
    @Order(2)
    void valorMenorZeroTest() {
        int numero = MegasenaUtilitario.sortearNumero(60);
        assertFalse(numero <= 0);
        assertFalse(numero > 60);
        assertTrue(numero > 0 && numero <= 60);
    }

    @Test
    @DisplayName("Teste Lista de Numeros")
    @Order(1)
    void listaDeNumerosMegasenaTest() {
        int max = 1000;
        for (int i = 0; i < max; i++) {
            int numero = MegasenaUtilitario.sortearNumero(max);
            System.out.print(numero + " ");
            assertTrue(numero > 0 && numero <= max);
        }
    }

    @Test
    @Order(3)
    void verificarAluno() {
        assertNotNull(aluno);
        assertEquals(aluno.getCurso(), "Programacao");
        System.out.println();
        System.out.println(aluno);
        System.out.println(aluno.hashCode());
    }

    @Test
    @Order(4)
    void verificarIntanciacaoDoAluno() {
        System.out.println(aluno);
        System.out.println(aluno.hashCode());
    }

    @Test
    @Order(5)
    void verificarMegasena() {
        int[] array = MegasenaUtilitario.numerosSorteadosMegasena();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i!= j && array[i] == array[j]){
                    Assertions.fail("Valor ja existente");
                }
            }
            System.out.println(array[i]);
        }
    }
}
