package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class ContaBancariaTest {
        ContaBancaria cb = new ContaBancaria("Matheus",123);
        @Test
        public void testeGetTitular(){
            assertEquals("Matheus",cb.getTitular());
        }

        @Test
        public void testeDepositar(){
            cb.depositar(1.2);
            assertEquals(1.2, cb.getSaldo());
        }

        @Test
        public void testeDepositar1000(){
            cb.depositar(1000);
            assertEquals(1000, cb.getSaldo());
        }

        @Test
        public void testeDepositarZero(){
            cb.depositar(100);
            cb.depositar(0);
            assertEquals(100.0,cb.getSaldo());
        }

        @Test
        public void testeDepositarNegativo(){
            cb.depositar(-5.2);
            assertEquals(0.0, cb.getSaldo());
        }

        @Test
        public void testSacar(){
            cb.depositar(10);
            cb.sacar(5);
            assertEquals(5, cb.getSaldo());
        }
}
